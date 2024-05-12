//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.11.05 a las 07:03:32 PM CET 
//


package com.bs.proteo.soa.shared.data.v2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://proteo.bs.com/soa/shared/data/v2/}sessionId" minOccurs="0"/>
 *         &lt;element ref="{http://proteo.bs.com/soa/shared/data/v2/}authorizationId" minOccurs="0"/>
 *         &lt;element ref="{http://proteo.bs.com/soa/shared/data/v2/}complianceId" minOccurs="0"/>
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
    "sessionId",
    "authorizationId",
    "complianceId"
})
@XmlRootElement(name = "HostRequest")
public class HostRequest {

    protected String sessionId;
    protected Integer authorizationId;
    protected String complianceId;

    /**
     * Obtiene el valor de la propiedad sessionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Define el valor de la propiedad sessionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Obtiene el valor de la propiedad authorizationId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuthorizationId() {
        return authorizationId;
    }

    /**
     * Define el valor de la propiedad authorizationId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuthorizationId(Integer value) {
        this.authorizationId = value;
    }

    /**
     * Obtiene el valor de la propiedad complianceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplianceId() {
        return complianceId;
    }

    /**
     * Define el valor de la propiedad complianceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplianceId(String value) {
        this.complianceId = value;
    }

}
