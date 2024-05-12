package com.demo.integration.service;

import jakarta.xml.soap.SOAPException;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface LoginService {
    String executeLogin() throws IOException, SOAPException;

//    String pruebaToken() throws FileNotFoundException;
}
