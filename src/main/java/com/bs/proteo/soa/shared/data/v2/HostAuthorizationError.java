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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HostAuthorizationError complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HostAuthorizationError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://proteo.bs.com/soa/shared/data/v2/}authorizationId"/>
 *         &lt;element name="authorizationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="actions" type="{http://proteo.bs.com/soa/shared/data/v2/}HostAuthorizationAction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostAuthorizationError", propOrder = {
    "authorizationId",
    "authorizationType",
    "actions"
})
public class HostAuthorizationError {

    protected int authorizationId;
    protected int authorizationType;
    protected List<HostAuthorizationAction> actions;

    /**
     * Obtiene el valor de la propiedad authorizationId.
     * 
     */
    public int getAuthorizationId() {
        return authorizationId;
    }

    /**
     * Define el valor de la propiedad authorizationId.
     * 
     */
    public void setAuthorizationId(int value) {
        this.authorizationId = value;
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
     * Gets the value of the actions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostAuthorizationAction }
     * 
     * 
     */
    public List<HostAuthorizationAction> getActions() {
        if (actions == null) {
            actions = new ArrayList<HostAuthorizationAction>();
        }
        return this.actions;
    }

}
