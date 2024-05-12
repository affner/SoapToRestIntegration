//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.11.05 a las 07:03:32 PM CET 
//


package com.bs.proteo.soa.service.mainframe.consultatin.domain.message;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.bs.proteo.soa.service.mainframe.consultatin.domain.Operation01ResponseOutputData;
import com.bs.proteo.soa.shared.data.v2.HeaderResponse;


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
 *         &lt;element ref="{http://proteo.bs.com/soa/shared/data/v2/}HeaderResponse"/>
 *         &lt;element name="OutputData" type="{http://proteo.bs.com/soa/service/mainframe/consultatitularidad/domain}operation01ResponseOutputData"/>
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
    "headerResponse",
    "outputData"
})
@XmlRootElement(name = "operation01Response")
public class Operation01Response {

    @XmlElement(name = "HeaderResponse", namespace = "http://proteo.bs.com/soa/shared/data/v2/", required = true)
    protected HeaderResponse headerResponse;
    @XmlElement(name = "OutputData", required = true)
    protected Operation01ResponseOutputData outputData;

    /**
     * Obtiene el valor de la propiedad headerResponse.
     * 
     * @return
     *     possible object is
     *     {@link HeaderResponse }
     *     
     */
    public HeaderResponse getHeaderResponse() {
        return headerResponse;
    }

    /**
     * Define el valor de la propiedad headerResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderResponse }
     *     
     */
    public void setHeaderResponse(HeaderResponse value) {
        this.headerResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad outputData.
     * 
     * @return
     *     possible object is
     *     {@link Operation01ResponseOutputData }
     *     
     */
    public Operation01ResponseOutputData getOutputData() {
        return outputData;
    }

    /**
     * Define el valor de la propiedad outputData.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation01ResponseOutputData }
     *     
     */
    public void setOutputData(Operation01ResponseOutputData value) {
        this.outputData = value;
    }

}
