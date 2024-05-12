//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.11.05 a las 07:03:32 PM CET 
//


package com.bs.proteo.soa.service.mainframe.consultatin.domain.message;

import com.bs.proteo.soa.service.mainframe.consultatin.domain.Operation01RequestInputData;
import com.bs.proteo.soa.shared.data.v2.HeaderRequest;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://proteo.bs.com/soa/shared/data/v2/}HeaderRequest"/>
 *         &lt;element name="InputData" type="{http://proteo.bs.com/soa/service/mainframe/consultatitularidad/domain}operation01RequestInputData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "headerRequest",
    "inputData"
})
@XmlRootElement(name = "operation01Request")
public class Operation01Request {

    @XmlElement(name = "HeaderRequest", namespace = "http://proteo.bs.com/soa/shared/data/v2/", required = true)
    protected HeaderRequest headerRequest;
    @XmlElement(name = "InputData", required = true)
    protected Operation01RequestInputData inputData;

    /**
     * Obtiene el valor de la propiedad headerRequest.
     * 
     * @return
     *     possible object is
     *     {@link HeaderRequest }
     *     
     */
    public HeaderRequest getHeaderRequest() {
        return headerRequest;
    }

    /**
     * Define el valor de la propiedad headerRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderRequest }
     *     
     */
    public void setHeaderRequest(HeaderRequest value) {
        this.headerRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad inputData.
     * 
     * @return
     *     possible object is
     *     {@link Operation01RequestInputData }
     *     
     */
    public Operation01RequestInputData getInputData() {
        return inputData;
    }

    /**
     * Define el valor de la propiedad inputData.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation01RequestInputData }
     *     
     */
    public void setInputData(Operation01RequestInputData value) {
        this.inputData = value;
    }

}
