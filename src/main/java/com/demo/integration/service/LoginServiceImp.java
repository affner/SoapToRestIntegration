package com.demo.integration.service;

import com.demo.integration.util.SoapRequestUtils;
import com.jcabi.xml.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import jakarta.xml.soap.SOAPException;
import jakarta.xml.soap.SOAPMessage;

import java.io.IOException;

@Service
//@PropertySource(value = "file:${INTEGRACION_HOME}/properties/soap.properties", ignoreResourceNotFound = true)
public class LoginServiceImp implements LoginService {

    private static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(LoginServiceImp.class);


    @Value("${play.ejecutar.login.url}")
    private String urlLogin;

    @Value("${play.ejecutar.login.xml}")
    private String xmlFile;

    // se descomenta esta propiedad si se necesita que se carguen desde rutas externas al proyecto.
  //  @Value("${play.ejecutar.login.dir}")
    private String xmlDir;

    @Autowired
    private SoapRequestUtils soapUtils;

    @Override
    public String executeLogin() throws IOException, SOAPException {
        SOAPMessage request = null;
        SOAPMessage response = null;

        XML xml = soapUtils.getXmlByName(xmlFile);
        request = soapUtils.getSoapMessageFromXml(xml);
        logger.info("Login request:--" + urlLogin);
        logger.info(soapUtils.convertToString(request));
        response = soapUtils.sendSoapMessage(request, urlLogin);
        logger.info("Loging Response:--");
        logger.info(soapUtils.convertToString(response));
        String sessionId = soapUtils.getValueFromResponseBody(response, "ns2:sessionId");
        return sessionId;

    }




}
