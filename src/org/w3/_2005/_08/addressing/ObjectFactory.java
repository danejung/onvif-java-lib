//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.w3._2005._08.addressing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the org.w3._2005._08.addressing package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema
 * derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this
 * class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _EndpointReference_QNAME = new QName("http://www.w3.org/2005/08/addressing", "EndpointReference");
	private final static QName _ProblemHeaderQName_QNAME = new QName("http://www.w3.org/2005/08/addressing", "ProblemHeaderQName");
	private final static QName _RetryAfter_QNAME = new QName("http://www.w3.org/2005/08/addressing", "RetryAfter");
	private final static QName _To_QNAME = new QName("http://www.w3.org/2005/08/addressing", "To");
	private final static QName _ProblemHeader_QNAME = new QName("http://www.w3.org/2005/08/addressing", "ProblemHeader");
	private final static QName _Metadata_QNAME = new QName("http://www.w3.org/2005/08/addressing", "Metadata");
	private final static QName _MessageID_QNAME = new QName("http://www.w3.org/2005/08/addressing", "MessageID");
	private final static QName _ProblemIRI_QNAME = new QName("http://www.w3.org/2005/08/addressing", "ProblemIRI");
	private final static QName _From_QNAME = new QName("http://www.w3.org/2005/08/addressing", "From");
	private final static QName _ReplyTo_QNAME = new QName("http://www.w3.org/2005/08/addressing", "ReplyTo");
	private final static QName _Action_QNAME = new QName("http://www.w3.org/2005/08/addressing", "Action");
	private final static QName _FaultTo_QNAME = new QName("http://www.w3.org/2005/08/addressing", "FaultTo");
	private final static QName _ProblemAction_QNAME = new QName("http://www.w3.org/2005/08/addressing", "ProblemAction");
	private final static QName _RelatesTo_QNAME = new QName("http://www.w3.org/2005/08/addressing", "RelatesTo");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.w3._2005._08.addressing
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link EndpointReferenceType }
	 * 
	 */
	public EndpointReferenceType createEndpointReferenceType() {
		return new EndpointReferenceType();
	}

	/**
	 * Create an instance of {@link ProblemActionType }
	 * 
	 */
	public ProblemActionType createProblemActionType() {
		return new ProblemActionType();
	}

	/**
	 * Create an instance of {@link AttributedAnyType }
	 * 
	 */
	public AttributedAnyType createAttributedAnyType() {
		return new AttributedAnyType();
	}

	/**
	 * Create an instance of {@link AttributedURIType }
	 * 
	 */
	public AttributedURIType createAttributedURIType() {
		return new AttributedURIType();
	}

	/**
	 * Create an instance of {@link AttributedQNameType }
	 * 
	 */
	public AttributedQNameType createAttributedQNameType() {
		return new AttributedQNameType();
	}

	/**
	 * Create an instance of {@link AttributedUnsignedLongType }
	 * 
	 */
	public AttributedUnsignedLongType createAttributedUnsignedLongType() {
		return new AttributedUnsignedLongType();
	}

	/**
	 * Create an instance of {@link MetadataType }
	 * 
	 */
	public MetadataType createMetadataType() {
		return new MetadataType();
	}

	/**
	 * Create an instance of {@link RelatesToType }
	 * 
	 */
	public RelatesToType createRelatesToType() {
		return new RelatesToType();
	}

	/**
	 * Create an instance of {@link ReferenceParametersType }
	 * 
	 */
	public ReferenceParametersType createReferenceParametersType() {
		return new ReferenceParametersType();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "EndpointReference")
	public JAXBElement<EndpointReferenceType> createEndpointReference(EndpointReferenceType value) {
		return new JAXBElement<EndpointReferenceType>(_EndpointReference_QNAME, EndpointReferenceType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AttributedQNameType }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "ProblemHeaderQName")
	public JAXBElement<AttributedQNameType> createProblemHeaderQName(AttributedQNameType value) {
		return new JAXBElement<AttributedQNameType>(_ProblemHeaderQName_QNAME, AttributedQNameType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AttributedUnsignedLongType }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "RetryAfter")
	public JAXBElement<AttributedUnsignedLongType> createRetryAfter(AttributedUnsignedLongType value) {
		return new JAXBElement<AttributedUnsignedLongType>(_RetryAfter_QNAME, AttributedUnsignedLongType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AttributedURIType }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "To")
	public JAXBElement<AttributedURIType> createTo(AttributedURIType value) {
		return new JAXBElement<AttributedURIType>(_To_QNAME, AttributedURIType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AttributedAnyType }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "ProblemHeader")
	public JAXBElement<AttributedAnyType> createProblemHeader(AttributedAnyType value) {
		return new JAXBElement<AttributedAnyType>(_ProblemHeader_QNAME, AttributedAnyType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MetadataType }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "Metadata")
	public JAXBElement<MetadataType> createMetadata(MetadataType value) {
		return new JAXBElement<MetadataType>(_Metadata_QNAME, MetadataType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AttributedURIType }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "MessageID")
	public JAXBElement<AttributedURIType> createMessageID(AttributedURIType value) {
		return new JAXBElement<AttributedURIType>(_MessageID_QNAME, AttributedURIType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AttributedURIType }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "ProblemIRI")
	public JAXBElement<AttributedURIType> createProblemIRI(AttributedURIType value) {
		return new JAXBElement<AttributedURIType>(_ProblemIRI_QNAME, AttributedURIType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "From")
	public JAXBElement<EndpointReferenceType> createFrom(EndpointReferenceType value) {
		return new JAXBElement<EndpointReferenceType>(_From_QNAME, EndpointReferenceType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "ReplyTo")
	public JAXBElement<EndpointReferenceType> createReplyTo(EndpointReferenceType value) {
		return new JAXBElement<EndpointReferenceType>(_ReplyTo_QNAME, EndpointReferenceType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AttributedURIType }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "Action")
	public JAXBElement<AttributedURIType> createAction(AttributedURIType value) {
		return new JAXBElement<AttributedURIType>(_Action_QNAME, AttributedURIType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "FaultTo")
	public JAXBElement<EndpointReferenceType> createFaultTo(EndpointReferenceType value) {
		return new JAXBElement<EndpointReferenceType>(_FaultTo_QNAME, EndpointReferenceType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ProblemActionType }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "ProblemAction")
	public JAXBElement<ProblemActionType> createProblemAction(ProblemActionType value) {
		return new JAXBElement<ProblemActionType>(_ProblemAction_QNAME, ProblemActionType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link RelatesToType }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "RelatesTo")
	public JAXBElement<RelatesToType> createRelatesTo(RelatesToType value) {
		return new JAXBElement<RelatesToType>(_RelatesTo_QNAME, RelatesToType.class, null, value);
	}

}
