package com.demo.integration.util;

import com.jcabi.xml.XML;
import com.jcabi.xml.XMLDocument;
import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
import org.w3c.dom.Document;

import jakarta.xml.bind.*;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.soap.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.nio.charset.Charset;
import java.util.GregorianCalendar;

@Component
public class SoapRequestUtils {

    private static final org.apache.logging.log4j.Logger LOG = org.apache.logging.log4j.LogManager.getLogger(SoapRequestUtils.class);


    public <T> String genericMarshall(T data) throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(data.getClass());
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        StringWriter stringWriter = new StringWriter();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(data, stringWriter);
        return stringWriter.toString();

    }

    public <T> T genericUnmarshall(String xml, Class<T> clazz){

        return JAXB.unmarshal(new StringReader(xml), clazz);
    }


    public String base64ToStringConversion(String bytes) {
        return new String(Base64.decodeBase64(bytes));
    }

    public String stringToBase64Conversion(String text) {
        Base64 base64 = new Base64();
        return new String(base64.encode(text.getBytes()));

    }

    public String getTodayDatexml() {
        try {

            XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
            return date.toString();

        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

        return null;
    }

    public XMLGregorianCalendar getDatexml() throws DatatypeConfigurationException {


        XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
        return date;

    }


    public XML getXmlByName(String fileName) throws FileNotFoundException {
        LOG.info(fileName);
        File file = ResourceUtils.getFile(fileName);
        try {

            return new XMLDocument(file);
        } catch (FileNotFoundException e) {
            LOG.error(e.getMessage());
        }
        return null;

    }

    public SOAPMessage getSoapMessageFromXml(XML xml) throws SOAPException, IOException {
        String xmlText = xml.toString();
        MessageFactory factory = MessageFactory.newInstance();
        MimeHeaders header = new MimeHeaders();
        header.setHeader("soapAction", "operation1");
        SOAPMessage soapMessage = factory.createMessage(header, new ByteArrayInputStream(xmlText.getBytes(Charset.forName("UTF-8"))));
        return soapMessage;

    }

    public SOAPMessage sendSoapMessage(SOAPMessage request, String url) throws SOAPException {

        SOAPConnectionFactory soapConnectionFactory = null;

        soapConnectionFactory = SOAPConnectionFactory.newInstance();

        SOAPConnection soapConnection = soapConnectionFactory.createConnection();

        SOAPMessage soapResponse = soapConnection.call(request, url);

        return soapResponse;

    }

    public String getValueFromResponseBody(SOAPMessage soapMessage, String tagName) {
        try {
            return soapMessage.getSOAPPart().getEnvelope()
                    .getBody().getElementsByTagName(tagName).item(0)
                    .getTextContent();
        } catch (Exception e) {
            return null;
        }

    }

    public XML setValueFromXml(XML xml, String name, String value) {
        org.w3c.dom.Node node = xml.node();
        Document doc = (Document) node;
        doc.getDocumentElement().normalize();
        org.w3c.dom.Node nodVal = doc.getElementsByTagName(name).item(0);
        nodVal.setTextContent(value);
        xml = new XMLDocument(doc);
        return xml;
    }

    public SOAPMessage setSoapMessageFromXml(SOAPMessage request, XML xml) {

        SOAPBody soapBody = null;
        try {
            soapBody = request.getSOAPBody();
            soapBody.removeContents();
            soapBody.addDocument((Document) xml.node());
            return request;
        } catch (SOAPException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getValueFromXml(XML xml, String tagName) {
        org.w3c.dom.Node node = xml.node();
        Document doc = (Document) node;
        doc.getDocumentElement().normalize();
        org.w3c.dom.Node nodVal = doc.getElementsByTagName(tagName).item(0);
        String value = nodVal.getFirstChild().getTextContent();
        return value;
    }

    public String nodeToString(org.w3c.dom.Node node) throws Exception {
        StringWriter sw = new StringWriter();

        Transformer t = TransformerFactory.newInstance().newTransformer();
        t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        t.setOutputProperty(OutputKeys.INDENT, "yes");
        t.transform(new DOMSource(node), new StreamResult(sw));

        return sw.toString();
    }

    public String convertToString(SOAPMessage message) throws IOException, SOAPException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        message.writeTo(out);

        String strMsg = new String(out.toByteArray());
        return strMsg;
    }
}
