package com.demo.integration.service;

import com.bs.proteo.soa.service.mainframe.consultatin.domain.Operation01RequestInputData;
import com.bs.proteo.soa.service.mainframe.consultatin.domain.message.Operation01Request;
import com.bs.proteo.soa.service.mainframe.consultatin.domain.message.Operation01Response;
import com.bs.proteo.soa.shared.data.v2.ClientInfo;
import com.bs.proteo.soa.shared.data.v2.HeaderRequest;
import com.bs.proteo.soa.shared.data.v2.HostRequest;
import com.demo.integration.message.request.Input;
import com.demo.integration.util.AppConstants;
import com.demo.integration.util.SoapRequestUtils;
import com.demo.integration.util.TokenSingleton;
import com.jcabi.xml.XML;
import com.jcabi.xml.XMLDocument;
import com.demo.integration.exception.WrongTokenExcetion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import jakarta.xml.soap.MessageFactory;
import jakarta.xml.soap.MimeHeaders;
import jakarta.xml.soap.SOAPException;
import jakarta.xml.soap.SOAPMessage;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

@Service
//@PropertySource(value = "file:${INTEGRACION_HOME}/properties/soap.properties", ignoreResourceNotFound = true)
public class TibcoServiceImp implements TibcoService {

    private static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(TibcoServiceImp.class);

    @Value("${play.ejecutar.tibco.url}")
    private String endpoint;

    @Autowired
    SoapRequestUtils soapUtils;

    @Autowired
    LoginService loginService;

    public static final String XML_OUT = "<Output xmlns=\"http://tic.play.es/consumed/WS_RECEP_SOL\"><Status>test</Status><Document>test</Document></Output>";

    @Override
    public Source envioTitularidad(Input input) throws JAXBException, SOAPException, IOException, ParserConfigurationException {


        String decodedString = soapUtils.base64ToStringConversion(input.getDocument());
        logger.info("Decoded String before Unmarshal: {}",decodedString);
        es.play.tic.exposed.ws_consulta_request.Document request = soapUtils.genericUnmarshall(decodedString, es.play.tic.exposed.ws_consulta_request.Document.class);

        Operation01Request operation01Request = new Operation01Request();

        Operation01RequestInputData data = new Operation01RequestInputData();
        data.setPE7537IBICDES(request.getBICDestinatario());
        data.setPE7537IBICDIRDES(request.getBICDirectoDes());
        data.setPE7537IBICDIRSOL(request.getBICDirectoSol());
        data.setPE7537IBICSOL(request.getBICSolicitante());
        data.setPE7537ICREDTM(request.getCreDtTm());
        data.setPE7537IFECSOL(request.getFechaSolicitud());
        data.setPE7537IIBANDES(request.getIBANCuentaDes());
        data.setPE7537IIBANSOL(request.getIBANCuentaSol());
        data.setPE7537IIDCUENTA(request.getIdCuenta());
        data.setPE7537IIDTITULAR(request.getIdTitularCta());
        data.setPE7537IREFER(request.getReferencia());
        data.setPE7537ITITULAR(request.getTitular());

        HeaderRequest header = new HeaderRequest();
        header.setTrackingId("1");
        ClientInfo clientInfo = new ClientInfo();
        clientInfo.setApplicationId("1");
        clientInfo.setLanguage("1");
        header.setClientInfo(clientInfo);
        HostRequest hostRequest = new HostRequest();
        hostRequest.setAuthorizationId(1);
        hostRequest.setComplianceId("1");
        header.setHostRequest(hostRequest);
        operation01Request.setHeaderRequest(header);
        operation01Request.setInputData(data);
        Operation01Response response = envioTibco(operation01Request);

        es.play.tic.exposed.ws_consulta_response.Document responseDoc = new es.play.tic.exposed.ws_consulta_response.Document();
        if (response.getOutputData().getPE7537OCREDTM() != null && !response.getOutputData().getPE7537OCREDTM().trim().isEmpty()) {
            responseDoc.setCreDtTm(response.getOutputData().getPE7537OCREDTM().trim());
        }
        if (response.getOutputData().getPE7537OREFER() != null && !response.getOutputData().getPE7537OREFER().trim().isEmpty()) {
            responseDoc.setReferencia(response.getOutputData().getPE7537OREFER().trim());
        }
        if (response.getOutputData().getPE7537OIDCUENTA() != null && !response.getOutputData().getPE7537OIDCUENTA().trim().isEmpty()) {
            responseDoc.setIdCuenta(response.getOutputData().getPE7537OIDCUENTA().trim());
        }
        if (response.getOutputData().getPE7537OIDTITULAR() != null && !response.getOutputData().getPE7537OIDTITULAR().trim().isEmpty()) {
            responseDoc.setIdTitularCta(response.getOutputData().getPE7537OIDTITULAR().trim());
        }
        if (response.getOutputData().getPE7537OTITULAR() != null && !response.getOutputData().getPE7537OTITULAR().trim().isEmpty()) {
            responseDoc.setTitular(response.getOutputData().getPE7537OTITULAR().trim());
        }
        if (response.getOutputData().getPE7537OCODRES() != null && !response.getOutputData().getPE7537OCODRES().trim().isEmpty()) {
            responseDoc.setCodigoResp(response.getOutputData().getPE7537OCODRES());
        }
        if (response.getOutputData().getPE7537OMOTRECH() != null && !response.getOutputData().getPE7537OMOTRECH().trim().isEmpty()) {
            responseDoc.setMotivoRech(response.getOutputData().getPE7537OMOTRECH().trim());
        }
        String operation = soapUtils.genericMarshall(responseDoc);

        XML output = new XMLDocument(XML_OUT);
        String encoded = soapUtils.stringToBase64Conversion(operation);

        output = soapUtils.setValueFromXml(output, "Status", AppConstants.IBP200);
        output = soapUtils.setValueFromXml(output, "Document", encoded);
        StreamSource ou = new StreamSource(new StringReader(output.toString()));


        return ou;
    }


    @Override
    public Operation01Response envioTibco(Operation01Request request) throws IOException, SOAPException, JAXBException, ParserConfigurationException {
        Operation01Response response = null;
        String sessionId;
        if (TokenSingleton.getValue() != null) {
            sessionId = TokenSingleton.getValue();
        } else {
            TokenSingleton.setNewInstance(loginService.executeLogin());
            sessionId = TokenSingleton.getValue();
        }
        //3 intentos de envio
        for (int i = 1; i <= 3; i = i++) {

            //seteo inicial de idSesion
            request.getHeaderRequest().getHostRequest().setSessionId(sessionId);

            SOAPMessage requestComplete = marshaller(Operation01Request.class, request);

            try {
                logger.info("REQUEST---:  ");
                logger.info(soapUtils.convertToString(requestComplete));
                response = sendEvaluateResponse(requestComplete);
                return response;
            } catch (WrongTokenExcetion e) {
                TokenSingleton.setNewInstance(loginService.executeLogin());
                sessionId = TokenSingleton.getValue();
                i++;
            }
        }

        return response;
    }


    private Operation01Response sendEvaluateResponse(SOAPMessage soapMessage) throws WrongTokenExcetion, JAXBException, SOAPException, IOException {

        SOAPMessage response = soapUtils.sendSoapMessage(soapMessage, endpoint);
        // codigo para simular pruebas de response

//        XML xml = new XMLDocument("<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\"><SOAP-ENV:Body><SOAP-ENV:Fault><faultcode xmlns:tibpfx1=\"http://schemas.xmlsoap.org/soap/envelope/\">tibpfx1:Server</faultcode><faultstring>\"SOAP-ENV:Server\"</faultstring><faultactor>DefaultRole</faultactor><detail><ns2:FaultInfo xmlns:ns2=\"http://proteo.bs.com/soa/shared/data/v2/\"><ns2:HeaderResponse><ns2:trackingId>1</ns2:trackingId><ns2:status>-2</ns2:status></ns2:HeaderResponse><ns0:CommonFault xmlns:jms1=\"http://www.tibco.com/namespaces/tnt/plugins/jms\" xmlns:ns0=\"http://proteo.bs.com/soa/shared/data/v2/\"><ns0:faultCode>C-FUNC</ns0:faultCode><ns0:faultDescription>Error funcional de mainframe</ns0:faultDescription></ns0:CommonFault><ns0:NativeFault xmlns:jms1=\"http://www.tibco.com/namespaces/tnt/plugins/jms\" xmlns:ns0=\"http://proteo.bs.com/soa/shared/data/v2/\"><ns0:faultCode>19849</ns0:faultCode><ns0:faultDescription>SesionID no encontrada</ns0:faultDescription><ns0:HostFault><ns0:messages><ns0:id>19849</ns0:id><ns0:severity>8</ns0:severity><ns0:description>SesionID no encontrada</ns0:description></ns0:messages><ns0:complianceId>1       </ns0:complianceId></ns0:HostFault></ns0:NativeFault></ns2:FaultInfo></detail></SOAP-ENV:Fault></SOAP-ENV:Body></SOAP-ENV:Envelope>");
//        SOAPMessage response = soapUtils.getSoapMessageFromXml(xml);

        logger.info("RESPONSE---:  ");
        logger.info(soapUtils.convertToString(response));
        String prue = soapUtils.getValueFromResponseBody(response, "faultcode");
        if (prue != null) {
            throw new WrongTokenExcetion();
        }
        //unmarshalling
        Operation01Response output = SoapMessageToObject(response);
        return output;
    }


    private Operation01Response SoapMessageToObject(SOAPMessage response) throws JAXBException, SOAPException {
        JAXBContext contextUn = JAXBContext.newInstance(Operation01Response.class);
        Unmarshaller um = contextUn.createUnmarshaller();
        Operation01Response output;
        //NOTA
        //por alguna razon necesita hacer el getFirstChild() la primera vez para poder extraer el documento sin lanzar excepciones.
        try {
            response.getSOAPBody().getFirstChild();
        } catch (Exception e) {
            //no se hace nada al cachar la excepcion ya que es un error esperado y controlado.
        }
        Node doc = response.getSOAPBody().extractContentAsDocument();
        output = (Operation01Response) um.unmarshal(doc);
        return output;
    }

    private SOAPMessage marshaller(Class<?> classClas, Operation01Request request) throws ParserConfigurationException, JAXBException, SOAPException, IOException {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        JAXBContext context = JAXBContext.newInstance(classClas);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(request, document);
        SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("soapAction", "operation01");

        soapMessage.getSOAPBody().addDocument(document);
        soapMessage.saveChanges();

        return soapMessage;
    }
}
