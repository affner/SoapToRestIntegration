//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.11.05 a las 07:03:32 PM CET 
//


package com.bs.proteo.soa.service.mainframe.consultatin.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para operation01ResponseOutputData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="operation01ResponseOutputData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PE7537O-CREDTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537O-REFER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537O-ID-CUENTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537O-ID-TITULAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537O-TITULAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537O-FEC-SOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537O-IBAN-SOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537O-BIC-DIR-SOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537O-BIC-SOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537O-IBAN-DES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537O-BIC-DIR-DES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537O-BIC-DES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537O-FEC-RES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537O-COD-RES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537O-MOT-RECH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operation01ResponseOutputData", propOrder = {
    "pe7537OCREDTM",
    "pe7537OREFER",
    "pe7537OIDCUENTA",
    "pe7537OIDTITULAR",
    "pe7537OTITULAR",
    "pe7537OFECSOL",
    "pe7537OIBANSOL",
    "pe7537OBICDIRSOL",
    "pe7537OBICSOL",
    "pe7537OIBANDES",
    "pe7537OBICDIRDES",
    "pe7537OBICDES",
    "pe7537OFECRES",
    "pe7537OCODRES",
    "pe7537OMOTRECH"
})
public class Operation01ResponseOutputData {

    @XmlElement(name = "PE7537O-CREDTM")
    protected String pe7537OCREDTM;
    @XmlElement(name = "PE7537O-REFER")
    protected String pe7537OREFER;
    @XmlElement(name = "PE7537O-ID-CUENTA")
    protected String pe7537OIDCUENTA;
    @XmlElement(name = "PE7537O-ID-TITULAR")
    protected String pe7537OIDTITULAR;
    @XmlElement(name = "PE7537O-TITULAR")
    protected String pe7537OTITULAR;
    @XmlElement(name = "PE7537O-FEC-SOL")
    protected String pe7537OFECSOL;
    @XmlElement(name = "PE7537O-IBAN-SOL")
    protected String pe7537OIBANSOL;
    @XmlElement(name = "PE7537O-BIC-DIR-SOL")
    protected String pe7537OBICDIRSOL;
    @XmlElement(name = "PE7537O-BIC-SOL")
    protected String pe7537OBICSOL;
    @XmlElement(name = "PE7537O-IBAN-DES")
    protected String pe7537OIBANDES;
    @XmlElement(name = "PE7537O-BIC-DIR-DES")
    protected String pe7537OBICDIRDES;
    @XmlElement(name = "PE7537O-BIC-DES")
    protected String pe7537OBICDES;
    @XmlElement(name = "PE7537O-FEC-RES")
    protected String pe7537OFECRES;
    @XmlElement(name = "PE7537O-COD-RES")
    protected String pe7537OCODRES;
    @XmlElement(name = "PE7537O-MOT-RECH")
    protected String pe7537OMOTRECH;

    /**
     * Obtiene el valor de la propiedad pe7537OCREDTM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE7537OCREDTM() {
        return pe7537OCREDTM;
    }

    /**
     * Define el valor de la propiedad pe7537OCREDTM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE7537OCREDTM(String value) {
        this.pe7537OCREDTM = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537OREFER.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE7537OREFER() {
        return pe7537OREFER;
    }

    /**
     * Define el valor de la propiedad pe7537OREFER.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE7537OREFER(String value) {
        this.pe7537OREFER = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537OIDCUENTA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE7537OIDCUENTA() {
        return pe7537OIDCUENTA;
    }

    /**
     * Define el valor de la propiedad pe7537OIDCUENTA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE7537OIDCUENTA(String value) {
        this.pe7537OIDCUENTA = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537OIDTITULAR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE7537OIDTITULAR() {
        return pe7537OIDTITULAR;
    }

    /**
     * Define el valor de la propiedad pe7537OIDTITULAR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE7537OIDTITULAR(String value) {
        this.pe7537OIDTITULAR = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537OTITULAR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE7537OTITULAR() {
        return pe7537OTITULAR;
    }

    /**
     * Define el valor de la propiedad pe7537OTITULAR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE7537OTITULAR(String value) {
        this.pe7537OTITULAR = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537OFECSOL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE7537OFECSOL() {
        return pe7537OFECSOL;
    }

    /**
     * Define el valor de la propiedad pe7537OFECSOL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE7537OFECSOL(String value) {
        this.pe7537OFECSOL = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537OIBANSOL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE7537OIBANSOL() {
        return pe7537OIBANSOL;
    }

    /**
     * Define el valor de la propiedad pe7537OIBANSOL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE7537OIBANSOL(String value) {
        this.pe7537OIBANSOL = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537OBICDIRSOL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE7537OBICDIRSOL() {
        return pe7537OBICDIRSOL;
    }

    /**
     * Define el valor de la propiedad pe7537OBICDIRSOL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE7537OBICDIRSOL(String value) {
        this.pe7537OBICDIRSOL = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537OBICSOL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE7537OBICSOL() {
        return pe7537OBICSOL;
    }

    /**
     * Define el valor de la propiedad pe7537OBICSOL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE7537OBICSOL(String value) {
        this.pe7537OBICSOL = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537OIBANDES.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE7537OIBANDES() {
        return pe7537OIBANDES;
    }

    /**
     * Define el valor de la propiedad pe7537OIBANDES.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE7537OIBANDES(String value) {
        this.pe7537OIBANDES = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537OBICDIRDES.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE7537OBICDIRDES() {
        return pe7537OBICDIRDES;
    }

    /**
     * Define el valor de la propiedad pe7537OBICDIRDES.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE7537OBICDIRDES(String value) {
        this.pe7537OBICDIRDES = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537OBICDES.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE7537OBICDES() {
        return pe7537OBICDES;
    }

    /**
     * Define el valor de la propiedad pe7537OBICDES.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE7537OBICDES(String value) {
        this.pe7537OBICDES = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537OFECRES.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE7537OFECRES() {
        return pe7537OFECRES;
    }

    /**
     * Define el valor de la propiedad pe7537OFECRES.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE7537OFECRES(String value) {
        this.pe7537OFECRES = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537OCODRES.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE7537OCODRES() {
        return pe7537OCODRES;
    }

    /**
     * Define el valor de la propiedad pe7537OCODRES.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE7537OCODRES(String value) {
        this.pe7537OCODRES = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537OMOTRECH.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE7537OMOTRECH() {
        return pe7537OMOTRECH;
    }

    /**
     * Define el valor de la propiedad pe7537OMOTRECH.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE7537OMOTRECH(String value) {
        this.pe7537OMOTRECH = value;
    }

}
