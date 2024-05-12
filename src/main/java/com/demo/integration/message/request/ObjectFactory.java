//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.11.23 a las 11:30:22 AM CET 
//


package com.demo.integration.message.request;

import com.demo.integration.message.response.Output;
import es.play.tic.exposed.ws_titularidad.Input;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.play.tic.exposed.WS_RECEP_SOL package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Document_QNAME = new QName("http://tic.play.es/exposed/WS_ENVIO_RESP", "Document");
    private final static QName _Output_QNAME = new QName("http://tic.play.es/exposed/WS_ENVIO_RESP", "Output");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.play.tic.exposed.WS_RECEP_SOL
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Input }
     *
     */
    public Input createInput() {
        return new Input();
    }

    /**
     * Create an instance of {@link Output }
     *
     */
    public Output createOutput() {
        return new Output();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://tic.play.es/exposed/WS_ENVIO_RESP", name = "Document")
    public JAXBElement<byte[]> createDocument(byte[] value) {
        return new JAXBElement<byte[]>(_Document_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Output }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://tic.play.es/exposed/WS_ENVIO_RESP", name = "Output")
    public JAXBElement<Output> createOutput(Output value) {
        return new JAXBElement<Output>(_Output_QNAME, Output.class, null, value);
    }

}
