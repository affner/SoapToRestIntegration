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
 * <p>Clase Java para NativeFaultDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NativeFaultDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://proteo.bs.com/soa/shared/data/v2/}FaultDetail">
 *       &lt;sequence>
 *         &lt;element name="HostFault" type="{http://proteo.bs.com/soa/shared/data/v2/}HostError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NativeFaultDetail", propOrder = {
    "hostFault"
})
public class NativeFaultDetail
    extends FaultDetail
{

    @XmlElement(name = "HostFault")
    protected HostError hostFault;

    /**
     * Obtiene el valor de la propiedad hostFault.
     * 
     * @return
     *     possible object is
     *     {@link HostError }
     *     
     */
    public HostError getHostFault() {
        return hostFault;
    }

    /**
     * Define el valor de la propiedad hostFault.
     * 
     * @param value
     *     allowed object is
     *     {@link HostError }
     *     
     */
    public void setHostFault(HostError value) {
        this.hostFault = value;
    }

}
