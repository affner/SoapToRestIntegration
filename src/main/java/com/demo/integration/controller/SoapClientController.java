package com.demo.integration.controller;


import com.bs.proteo.soa.service.mainframe.consultatin.domain.message.Operation01Request;
import com.bs.proteo.soa.service.mainframe.consultatin.domain.message.Operation01Response;
import com.demo.integration.message.request.Input;
import com.demo.integration.message.response.Output;
import com.demo.integration.service.TibcoService;
import com.demo.integration.util.AppConstants;
import com.demo.integration.util.SoapRequestUtils;
import es.play.tic.exposed.ws_consulta_response.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import jakarta.xml.soap.SOAPException;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

@RestController
@RequestMapping("/rest")
public class SoapClientController {

    private static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(SoapClientController.class);


    @Autowired
    private SoapRequestUtils utils;

    @Autowired
    private TibcoService tibcoService;

    @PostMapping(path = "/consultatitularidadServices", produces = "application/json")
    public ResponseEntity<?> titularidad(@RequestBody Input input) throws JAXBException, SOAPException, FileNotFoundException, ParserConfigurationException {
        Operation01Request request = textToObject(input.getDocument());

        String operation = null;
        try {
            Operation01Response response = tibcoService.envioTibco(request);

            JAXBContext context = JAXBContext.newInstance(Document.class);
            Marshaller marshaller = context.createMarshaller();
            StringWriter sw = new StringWriter();
            marshaller.marshal(response, sw);
            operation = sw.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String encoded = utils.stringToBase64Conversion(operation);
        Output output = new Output();
        output.setStatus(AppConstants.IBP200);
        output.setDocument(encoded);
        return ResponseEntity.ok(output);
    }


    private Operation01Request textToObject(String bytes) throws JAXBException, SOAPException {

        String decodedString = utils.base64ToStringConversion(bytes);
        JAXBContext contextUn = JAXBContext.newInstance(Operation01Request.class);
        Unmarshaller um = contextUn.createUnmarshaller();
        Reader reader = new StringReader(decodedString);
        Operation01Request output = (Operation01Request) um.unmarshal(reader);

        return output;
    }

}
