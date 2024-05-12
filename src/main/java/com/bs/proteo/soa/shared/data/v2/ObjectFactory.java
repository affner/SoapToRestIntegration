//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.11.05 a las 07:03:32 PM CET 
//


package com.bs.proteo.soa.shared.data.v2;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bs.proteo.soa.shared.data.v2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SessionId_QNAME = new QName("http://proteo.bs.com/soa/shared/data/v2/", "sessionId");
    private final static QName _TrackingId_QNAME = new QName("http://proteo.bs.com/soa/shared/data/v2/", "trackingId");
    private final static QName _ComplianceId_QNAME = new QName("http://proteo.bs.com/soa/shared/data/v2/", "complianceId");
    private final static QName _AuthorizationId_QNAME = new QName("http://proteo.bs.com/soa/shared/data/v2/", "authorizationId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bs.proteo.soa.shared.data.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultInfo }
     * 
     */
    public FaultInfo createFaultInfo() {
        return new FaultInfo();
    }

    /**
     * Create an instance of {@link HeaderResponse }
     * 
     */
    public HeaderResponse createHeaderResponse() {
        return new HeaderResponse();
    }

    /**
     * Create an instance of {@link HostResponse }
     * 
     */
    public HostResponse createHostResponse() {
        return new HostResponse();
    }

    /**
     * Create an instance of {@link HostMessage }
     * 
     */
    public HostMessage createHostMessage() {
        return new HostMessage();
    }

    /**
     * Create an instance of {@link FaultDetail }
     * 
     */
    public FaultDetail createFaultDetail() {
        return new FaultDetail();
    }

    /**
     * Create an instance of {@link NativeFaultDetail }
     * 
     */
    public NativeFaultDetail createNativeFaultDetail() {
        return new NativeFaultDetail();
    }

    /**
     * Create an instance of {@link HeaderRequest }
     * 
     */
    public HeaderRequest createHeaderRequest() {
        return new HeaderRequest();
    }

    /**
     * Create an instance of {@link ClientInfo }
     * 
     */
    public ClientInfo createClientInfo() {
        return new ClientInfo();
    }

    /**
     * Create an instance of {@link HostRequest }
     * 
     */
    public HostRequest createHostRequest() {
        return new HostRequest();
    }

    /**
     * Create an instance of {@link HostAuthorizationAction }
     * 
     */
    public HostAuthorizationAction createHostAuthorizationAction() {
        return new HostAuthorizationAction();
    }

    /**
     * Create an instance of {@link HostError }
     * 
     */
    public HostError createHostError() {
        return new HostError();
    }

    /**
     * Create an instance of {@link HostAuthorizationError }
     * 
     */
    public HostAuthorizationError createHostAuthorizationError() {
        return new HostAuthorizationError();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://proteo.bs.com/soa/shared/data/v2/", name = "sessionId")
    public JAXBElement<String> createSessionId(String value) {
        return new JAXBElement<String>(_SessionId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://proteo.bs.com/soa/shared/data/v2/", name = "trackingId")
    public JAXBElement<String> createTrackingId(String value) {
        return new JAXBElement<String>(_TrackingId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://proteo.bs.com/soa/shared/data/v2/", name = "complianceId")
    public JAXBElement<String> createComplianceId(String value) {
        return new JAXBElement<String>(_ComplianceId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://proteo.bs.com/soa/shared/data/v2/", name = "authorizationId")
    public JAXBElement<Integer> createAuthorizationId(Integer value) {
        return new JAXBElement<Integer>(_AuthorizationId_QNAME, Integer.class, null, value);
    }

}
