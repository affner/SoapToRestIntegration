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
 *         &lt;element ref="{http://proteo.bs.com/soa/shared/data/v2/}HeaderResponse"/>
 *         &lt;element name="CommonFault" type="{http://proteo.bs.com/soa/shared/data/v2/}FaultDetail"/>
 *         &lt;element name="NativeFault" type="{http://proteo.bs.com/soa/shared/data/v2/}NativeFaultDetail"/>
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
    "commonFault",
    "nativeFault"
})
@XmlRootElement(name = "FaultInfo")
public class FaultInfo {

    @XmlElement(name = "HeaderResponse", required = true)
    protected HeaderResponse headerResponse;
    @XmlElement(name = "CommonFault", required = true)
    protected FaultDetail commonFault;
    @XmlElement(name = "NativeFault", required = true)
    protected NativeFaultDetail nativeFault;

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
     * Obtiene el valor de la propiedad commonFault.
     * 
     * @return
     *     possible object is
     *     {@link FaultDetail }
     *     
     */
    public FaultDetail getCommonFault() {
        return commonFault;
    }

    /**
     * Define el valor de la propiedad commonFault.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultDetail }
     *     
     */
    public void setCommonFault(FaultDetail value) {
        this.commonFault = value;
    }

    /**
     * Obtiene el valor de la propiedad nativeFault.
     * 
     * @return
     *     possible object is
     *     {@link NativeFaultDetail }
     *     
     */
    public NativeFaultDetail getNativeFault() {
        return nativeFault;
    }

    /**
     * Define el valor de la propiedad nativeFault.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeFaultDetail }
     *     
     */
    public void setNativeFault(NativeFaultDetail value) {
        this.nativeFault = value;
    }

}
