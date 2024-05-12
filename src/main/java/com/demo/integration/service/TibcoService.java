package com.demo.integration.service;

import com.bs.proteo.soa.service.mainframe.consultatin.domain.message.Operation01Request;
import com.bs.proteo.soa.service.mainframe.consultatin.domain.message.Operation01Response;
import com.demo.integration.message.request.Input;

import jakarta.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import jakarta.xml.soap.SOAPException;
import javax.xml.transform.Source;
import java.io.IOException;

public interface TibcoService {

    Source envioTitularidad(Input input) throws JAXBException, SOAPException, IOException, ParserConfigurationException;

    Operation01Response envioTibco(Operation01Request request) throws JAXBException, IOException, SOAPException, ParserConfigurationException;
}
