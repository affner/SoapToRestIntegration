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
 *         &lt;element ref="{http://proteo.bs.com/soa/shared/data/v2/}ClientInfo" minOccurs="0"/>
 *         &lt;element ref="{http://proteo.bs.com/soa/shared/data/v2/}HostRequest" minOccurs="0"/>
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
    "clientInfo",
    "hostRequest"
})
@XmlRootElement(name = "HeaderRequest")
public class HeaderRequest {

    @XmlElement(required = true)
    protected String trackingId;
    @XmlElement(name = "ClientInfo")
    protected ClientInfo clientInfo;
    @XmlElement(name = "HostRequest")
    protected HostRequest hostRequest;

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
     * Obtiene el valor de la propiedad clientInfo.
     * 
     * @return
     *     possible object is
     *     {@link ClientInfo }
     *     
     */
    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    /**
     * Define el valor de la propiedad clientInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientInfo }
     *     
     */
    public void setClientInfo(ClientInfo value) {
        this.clientInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad hostRequest.
     * 
     * @return
     *     possible object is
     *     {@link HostRequest }
     *     
     */
    public HostRequest getHostRequest() {
        return hostRequest;
    }

    /**
     * Define el valor de la propiedad hostRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link HostRequest }
     *     
     */
    public void setHostRequest(HostRequest value) {
        this.hostRequest = value;
    }

}
