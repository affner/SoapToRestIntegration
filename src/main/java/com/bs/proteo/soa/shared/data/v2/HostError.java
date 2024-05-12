//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.11.05 a las 07:03:32 PM CET 
//


package com.bs.proteo.soa.shared.data.v2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HostError complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HostError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messages" type="{http://proteo.bs.com/soa/shared/data/v2/}HostMessage" maxOccurs="unbounded"/>
 *         &lt;element name="authorizationError" type="{http://proteo.bs.com/soa/shared/data/v2/}HostAuthorizationError" minOccurs="0"/>
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
@XmlType(name = "HostError", propOrder = {
    "messages",
    "authorizationError",
    "complianceId"
})
public class HostError {

    @XmlElement(required = true)
    protected List<HostMessage> messages;
    protected HostAuthorizationError authorizationError;
    protected String complianceId;

    /**
     * Gets the value of the messages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostMessage }
     * 
     * 
     */
    public List<HostMessage> getMessages() {
        if (messages == null) {
            messages = new ArrayList<HostMessage>();
        }
        return this.messages;
    }

    /**
     * Obtiene el valor de la propiedad authorizationError.
     * 
     * @return
     *     possible object is
     *     {@link HostAuthorizationError }
     *     
     */
    public HostAuthorizationError getAuthorizationError() {
        return authorizationError;
    }

    /**
     * Define el valor de la propiedad authorizationError.
     * 
     * @param value
     *     allowed object is
     *     {@link HostAuthorizationError }
     *     
     */
    public void setAuthorizationError(HostAuthorizationError value) {
        this.authorizationError = value;
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
