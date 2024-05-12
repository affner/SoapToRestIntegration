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
 * <p>Clase Java para operation01RequestInputData complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="operation01RequestInputData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PE7537I-CREDTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537I-REFER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537I-ID-CUENTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537I-ID-TITULAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537I-TITULAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537I-FEC-SOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537I-IBAN-SOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537I-BIC-DIR-SOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537I-BIC-SOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537I-IBAN-DES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537I-BIC-DIR-DES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE7537I-BIC-DES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operation01RequestInputData", propOrder = {
        "pe7537ICREDTM",
        "pe7537IREFER",
        "pe7537IIDCUENTA",
        "pe7537IIDTITULAR",
        "pe7537ITITULAR",
        "pe7537IFECSOL",
        "pe7537IIBANSOL",
        "pe7537IBICDIRSOL",
        "pe7537IBICSOL",
        "pe7537IIBANDES",
        "pe7537IBICDIRDES",
        "pe7537IBICDES"
})
public class Operation01RequestInputData {

    @XmlElement(name = "PE7537I-CREDTM")
    protected String pe7537ICREDTM = "";
    @XmlElement(name = "PE7537I-REFER")
    protected String pe7537IREFER = "";
    @XmlElement(name = "PE7537I-ID-CUENTA")
    protected String pe7537IIDCUENTA = "";
    @XmlElement(name = "PE7537I-ID-TITULAR")
    protected String pe7537IIDTITULAR = "";
    @XmlElement(name = "PE7537I-TITULAR")
    protected String pe7537ITITULAR = "";
    @XmlElement(name = "PE7537I-FEC-SOL")
    protected String pe7537IFECSOL = "";
    @XmlElement(name = "PE7537I-IBAN-SOL")
    protected String pe7537IIBANSOL = "";
    @XmlElement(name = "PE7537I-BIC-DIR-SOL")
    protected String pe7537IBICDIRSOL = "";
    @XmlElement(name = "PE7537I-BIC-SOL")
    protected String pe7537IBICSOL = "";
    @XmlElement(name = "PE7537I-IBAN-DES")
    protected String pe7537IIBANDES = "";
    @XmlElement(name = "PE7537I-BIC-DIR-DES")
    protected String pe7537IBICDIRDES = "";
    @XmlElement(name = "PE7537I-BIC-DES")
    protected String pe7537IBICDES = "";

    /**
     * Obtiene el valor de la propiedad pe7537ICREDTM.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPE7537ICREDTM() {
        return pe7537ICREDTM;
    }

    /**
     * Define el valor de la propiedad pe7537ICREDTM.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPE7537ICREDTM(String value) {
        this.pe7537ICREDTM = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537IREFER.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPE7537IREFER() {
        return pe7537IREFER;
    }

    /**
     * Define el valor de la propiedad pe7537IREFER.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPE7537IREFER(String value) {
        this.pe7537IREFER = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537IIDCUENTA.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPE7537IIDCUENTA() {
        return pe7537IIDCUENTA;
    }

    /**
     * Define el valor de la propiedad pe7537IIDCUENTA.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPE7537IIDCUENTA(String value) {
        this.pe7537IIDCUENTA = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537IIDTITULAR.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPE7537IIDTITULAR() {
        return pe7537IIDTITULAR;
    }

    /**
     * Define el valor de la propiedad pe7537IIDTITULAR.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPE7537IIDTITULAR(String value) {
        this.pe7537IIDTITULAR = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537ITITULAR.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPE7537ITITULAR() {
        return pe7537ITITULAR;
    }

    /**
     * Define el valor de la propiedad pe7537ITITULAR.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPE7537ITITULAR(String value) {
        this.pe7537ITITULAR = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537IFECSOL.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPE7537IFECSOL() {
        return pe7537IFECSOL;
    }

    /**
     * Define el valor de la propiedad pe7537IFECSOL.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPE7537IFECSOL(String value) {
        this.pe7537IFECSOL = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537IIBANSOL.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPE7537IIBANSOL() {
        return pe7537IIBANSOL;
    }

    /**
     * Define el valor de la propiedad pe7537IIBANSOL.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPE7537IIBANSOL(String value) {
        this.pe7537IIBANSOL = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537IBICDIRSOL.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPE7537IBICDIRSOL() {
        return pe7537IBICDIRSOL;
    }

    /**
     * Define el valor de la propiedad pe7537IBICDIRSOL.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPE7537IBICDIRSOL(String value) {
        this.pe7537IBICDIRSOL = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537IBICSOL.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPE7537IBICSOL() {
        return pe7537IBICSOL;
    }

    /**
     * Define el valor de la propiedad pe7537IBICSOL.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPE7537IBICSOL(String value) {
        this.pe7537IBICSOL = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537IIBANDES.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPE7537IIBANDES() {
        return pe7537IIBANDES;
    }

    /**
     * Define el valor de la propiedad pe7537IIBANDES.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPE7537IIBANDES(String value) {
        this.pe7537IIBANDES = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537IBICDIRDES.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPE7537IBICDIRDES() {
        return pe7537IBICDIRDES;
    }

    /**
     * Define el valor de la propiedad pe7537IBICDIRDES.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPE7537IBICDIRDES(String value) {
        this.pe7537IBICDIRDES = value;
    }

    /**
     * Obtiene el valor de la propiedad pe7537IBICDES.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPE7537IBICDES() {
        return pe7537IBICDES;
    }

    /**
     * Define el valor de la propiedad pe7537IBICDES.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPE7537IBICDES(String value) {
        this.pe7537IBICDES = value;
    }

}
