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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HostAuthorizationAction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HostAuthorizationAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="authorizationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errorDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="moreInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostAuthorizationAction", propOrder = {
    "resourceType",
    "authorizationType",
    "errorCode",
    "errorDescription",
    "moreInfo"
})
public class HostAuthorizationAction {

    protected int resourceType;
    protected int authorizationType;
    protected int errorCode;
    @XmlElement(required = true)
    protected String errorDescription;
    @XmlElement(required = true)
    protected String moreInfo;

    /**
     * Obtiene el valor de la propiedad resourceType.
     * 
     */
    public int getResourceType() {
        return resourceType;
    }

    /**
     * Define el valor de la propiedad resourceType.
     * 
     */
    public void setResourceType(int value) {
        this.resourceType = value;
    }

    /**
     * Obtiene el valor de la propiedad authorizationType.
     * 
     */
    public int getAuthorizationType() {
        return authorizationType;
    }

    /**
     * Define el valor de la propiedad authorizationType.
     * 
     */
    public void setAuthorizationType(int value) {
        this.authorizationType = value;
    }

    /**
     * Obtiene el valor de la propiedad errorCode.
     * 
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Define el valor de la propiedad errorCode.
     * 
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad errorDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Define el valor de la propiedad errorDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad moreInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreInfo() {
        return moreInfo;
    }

    /**
     * Define el valor de la propiedad moreInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreInfo(String value) {
        this.moreInfo = value;
    }

}
