//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.11.05 a las 07:03:32 PM CET 
//


package com.bs.proteo.soa.shared.data.v2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://proteo.bs.com/soa/shared/data/v2/}trackingId"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{http://proteo.bs.com/soa/shared/data/v2/}HostResponse" minOccurs="0"/>
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
    "trackingId",
    "status",
    "hostResponse"
})
@XmlRootElement(name = "HeaderResponse")
public class HeaderResponse {

    @XmlElement(required = true)
    protected String trackingId;
    protected int status;
    @XmlElement(name = "HostResponse")
    protected HostResponse hostResponse;

    /**
     * Obtiene el valor de la propiedad trackingId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingId() {
        return trackingId;
    }

    /**
     * Define el valor de la propiedad trackingId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingId(String value) {
        this.trackingId = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad hostResponse.
     * 
     * @return
     *     possible object is
     *     {@link HostResponse }
     *     
     */
    public HostResponse getHostResponse() {
        return hostResponse;
    }

    /**
     * Define el valor de la propiedad hostResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link HostResponse }
     *     
     */
    public void setHostResponse(HostResponse value) {
        this.hostResponse = value;
    }

}
