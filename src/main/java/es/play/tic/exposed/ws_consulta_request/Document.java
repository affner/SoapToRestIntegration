//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.11.24 a las 02:41:10 PM CET 
//


package es.play.tic.exposed.ws_consulta_request;

import jakarta.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Document complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreDtTm" type="{http://tic.play.es/exposed/WS_CONSULTA_REQUEST}ISODateTime"/>
 *         &lt;element name="Referencia" type="{http://tic.play.es/exposed/WS_CONSULTA_REQUEST}Max35Text"/>
 *         &lt;element name="Id_Cuenta" type="{http://tic.play.es/exposed/WS_CONSULTA_REQUEST}IdCuentaType"/>
 *         &lt;element name="Id_Titular_Cta" type="{http://tic.play.es/exposed/WS_CONSULTA_REQUEST}Max9Text"/>
 *         &lt;element name="Titular" type="{http://tic.play.es/exposed/WS_CONSULTA_REQUEST}Max72Text"/>
 *         &lt;element name="Fecha_Solicitud" type="{http://tic.play.es/exposed/WS_CONSULTA_REQUEST}ISODate"/>
 *         &lt;element name="IBAN_Cuenta_Sol" type="{http://tic.play.es/exposed/WS_CONSULTA_REQUEST}IBAN2007Identifier"/>
 *         &lt;element name="BIC_Directo_Sol" type="{http://tic.play.es/exposed/WS_CONSULTA_REQUEST}BICIdentifier"/>
 *         &lt;element name="BIC_Solicitante" type="{http://tic.play.es/exposed/WS_CONSULTA_REQUEST}BICIdentifier"/>
 *         &lt;element name="IBAN_Cuenta_Des" type="{http://tic.play.es/exposed/WS_CONSULTA_REQUEST}IBAN2007Identifier"/>
 *         &lt;element name="BIC_Directo_Des" type="{http://tic.play.es/exposed/WS_CONSULTA_REQUEST}BICIdentifier"/>
 *         &lt;element name="BIC_Destinatario" type="{http://tic.play.es/exposed/WS_CONSULTA_REQUEST}BICIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "creDtTm",
    "referencia",
    "idCuenta",
    "idTitularCta",
    "titular",
    "fechaSolicitud",
    "ibanCuentaSol",
    "bicDirectoSol",
    "bicSolicitante",
    "ibanCuentaDes",
    "bicDirectoDes",
    "bicDestinatario"
})
@XmlRootElement(name = "Document", namespace = "http://tic.play.es/exposed/WS_ENVIO_SOL")
public class Document {

    @XmlElement(name = "CreDtTm", namespace = "http://tic.play.es/exposed/WS_ENVIO_SOL", required = true)
    protected String creDtTm;
    @XmlElement(name = "Referencia",namespace = "http://tic.play.es/exposed/WS_ENVIO_SOL", required = true)
    protected String referencia;
    @XmlElement(name = "Id_Cuenta",namespace = "http://tic.play.es/exposed/WS_ENVIO_SOL", required = true)
    protected String idCuenta;
    @XmlElement(name = "Id_Titular_Cta",namespace = "http://tic.play.es/exposed/WS_ENVIO_SOL", required = true)
    protected String idTitularCta;
    @XmlElement(name = "Titular",namespace = "http://tic.play.es/exposed/WS_ENVIO_SOL", required = true)
    protected String titular;
    @XmlElement(name = "Fecha_Solicitud",namespace = "http://tic.play.es/exposed/WS_ENVIO_SOL", required = true)
    protected String fechaSolicitud;
    @XmlElement(name = "IBAN_Cuenta_Sol",namespace = "http://tic.play.es/exposed/WS_ENVIO_SOL", required = true)
    protected String ibanCuentaSol;
    @XmlElement(name = "BIC_Directo_Sol",namespace = "http://tic.play.es/exposed/WS_ENVIO_SOL", required = true)
    protected String bicDirectoSol;
    @XmlElement(name = "BIC_Solicitante",namespace = "http://tic.play.es/exposed/WS_ENVIO_SOL", required = true)
    protected String bicSolicitante;
    @XmlElement(name = "IBAN_Cuenta_Des",namespace = "http://tic.play.es/exposed/WS_ENVIO_SOL", required = true)
    protected String ibanCuentaDes;
    @XmlElement(name = "BIC_Directo_Des",namespace = "http://tic.play.es/exposed/WS_ENVIO_SOL", required = true)
    protected String bicDirectoDes;
    @XmlElement(name = "BIC_Destinatario",namespace = "http://tic.play.es/exposed/WS_ENVIO_SOL", required = true)
    protected String bicDestinatario;

    /**
     * Obtiene el valor de la propiedad creDtTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getCreDtTm() {
        return creDtTm;
    }

    /**
     * Define el valor de la propiedad creDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDtTm(String value) {
        this.creDtTm = value;
    }

    /**
     * Obtiene el valor de la propiedad referencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Define el valor de la propiedad referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

    /**
     * Obtiene el valor de la propiedad idCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCuenta() {
        return idCuenta;
    }

    /**
     * Define el valor de la propiedad idCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCuenta(String value) {
        this.idCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad idTitularCta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTitularCta() {
        return idTitularCta;
    }

    /**
     * Define el valor de la propiedad idTitularCta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTitularCta(String value) {
        this.idTitularCta = value;
    }

    /**
     * Obtiene el valor de la propiedad titular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Define el valor de la propiedad titular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitular(String value) {
        this.titular = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSolicitud.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    /**
     * Define el valor de la propiedad fechaSolicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaSolicitud(String value) {
        this.fechaSolicitud = value;
    }

    /**
     * Obtiene el valor de la propiedad ibanCuentaSol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBANCuentaSol() {
        return ibanCuentaSol;
    }

    /**
     * Define el valor de la propiedad ibanCuentaSol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBANCuentaSol(String value) {
        this.ibanCuentaSol = value;
    }

    /**
     * Obtiene el valor de la propiedad bicDirectoSol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICDirectoSol() {
        return bicDirectoSol;
    }

    /**
     * Define el valor de la propiedad bicDirectoSol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICDirectoSol(String value) {
        this.bicDirectoSol = value;
    }

    /**
     * Obtiene el valor de la propiedad bicSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICSolicitante() {
        return bicSolicitante;
    }

    /**
     * Define el valor de la propiedad bicSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICSolicitante(String value) {
        this.bicSolicitante = value;
    }

    /**
     * Obtiene el valor de la propiedad ibanCuentaDes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBANCuentaDes() {
        return ibanCuentaDes;
    }

    /**
     * Define el valor de la propiedad ibanCuentaDes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBANCuentaDes(String value) {
        this.ibanCuentaDes = value;
    }

    /**
     * Obtiene el valor de la propiedad bicDirectoDes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICDirectoDes() {
        return bicDirectoDes;
    }

    /**
     * Define el valor de la propiedad bicDirectoDes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICDirectoDes(String value) {
        this.bicDirectoDes = value;
    }

    /**
     * Obtiene el valor de la propiedad bicDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICDestinatario() {
        return bicDestinatario;
    }

    /**
     * Define el valor de la propiedad bicDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICDestinatario(String value) {
        this.bicDestinatario = value;
    }

}
