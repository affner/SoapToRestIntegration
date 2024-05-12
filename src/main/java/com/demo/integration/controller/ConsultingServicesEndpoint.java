package com.demo.integration.controller;

import com.demo.integration.message.request.Input;
import com.demo.integration.service.TibcoService;
import com.demo.integration.util.AppConstants;
import com.demo.integration.util.SoapRequestUtils;
import com.jcabi.xml.XML;
import com.jcabi.xml.XMLDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import jakarta.xml.bind.DataBindingException;
import jakarta.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import jakarta.xml.soap.SOAPException;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.*;


@Endpoint
public class ConsultingServicesEndpoint {

    private static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(ConsultingServicesEndpoint.class);

    @Autowired
    private TibcoService tibcoService;

    @Autowired
    SoapRequestUtils soapUtils;

    public static final String WS_RECEP_SOL = "http://tic.play.es/consumed/WS_RECEP_SOL";

    public static final String XML = "<Output xmlns=\"http://tic.play.es/consumed/WS_RECEP_SOL\"><Status>test</Status></Output>";

    @PayloadRoot(namespace = WS_RECEP_SOL, localPart = "Input")
    @ResponsePayload
    public Source processPrueba(@RequestPayload Input input)  {

        Source output = null;

        try {
            output = tibcoService.envioTitularidad(input);
        } catch (IOException | SOAPException | ParserConfigurationException e) {
            output = procesoError(e, AppConstants.IBP500);

        } catch (DataBindingException | JAXBException e) {
            output = procesoError(e, AppConstants.IBP450);

        } catch (Exception e) {
            output = procesoError(e, AppConstants.IBP500);

        }


        return output;
    }


    private Source procesoError(Exception e, String ipb) {
        XML xml;
        logger.error("ERROR: ");
        logger.error("Clase: {}", e.getStackTrace()[0].getClassName());
        logger.error("Linea: {}", e.getStackTrace()[0].getLineNumber());
        Writer buffer = new StringWriter();
        PrintWriter pw = new PrintWriter(buffer);
        e.printStackTrace(pw);
        logger.error(buffer.toString());
        xml = new XMLDocument(XML);
        xml = soapUtils.setValueFromXml(xml, "Status", ipb);
        return new StreamSource(new StringReader(xml.toString()));
    }

}
