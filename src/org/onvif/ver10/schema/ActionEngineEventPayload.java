//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.xmlsoap.schemas.soap.envelope.Envelope;
import org.xmlsoap.schemas.soap.envelope.Fault;

/**
 * Action Engine Event Payload data structure contains the information about the ONVIF command invocations. Since this event could be generated by other or proprietary actions, the
 * command invocation specific fields are defined as optional and additional extension mechanism is provided for future or additional action definitions.
 * 
 * <p>
 * Java-Klasse fr ActionEngineEventPayload complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="ActionEngineEventPayload">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RequestInfo" type="{http://schemas.xmlsoap.org/soap/envelope/}Envelope" minOccurs="0"/>
 *         <element name="ResponseInfo" type="{http://schemas.xmlsoap.org/soap/envelope/}Envelope" minOccurs="0"/>
 *         <element name="Fault" type="{http://schemas.xmlsoap.org/soap/envelope/}Fault" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ActionEngineEventPayloadExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionEngineEventPayload", propOrder = { "requestInfo", "responseInfo", "fault", "extension" })
public class ActionEngineEventPayload {

	@XmlElement(name = "RequestInfo")
	protected Envelope requestInfo;
	@XmlElement(name = "ResponseInfo")
	protected Envelope responseInfo;
	@XmlElement(name = "Fault")
	protected Fault fault;
	@XmlElement(name = "Extension")
	protected ActionEngineEventPayloadExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der requestInfo-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Envelope }
	 * 
	 */
	public Envelope getRequestInfo() {
		return requestInfo;
	}

	/**
	 * Legt den Wert der requestInfo-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Envelope }
	 * 
	 */
	public void setRequestInfo(Envelope value) {
		this.requestInfo = value;
	}

	/**
	 * Ruft den Wert der responseInfo-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Envelope }
	 * 
	 */
	public Envelope getResponseInfo() {
		return responseInfo;
	}

	/**
	 * Legt den Wert der responseInfo-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Envelope }
	 * 
	 */
	public void setResponseInfo(Envelope value) {
		this.responseInfo = value;
	}

	/**
	 * Ruft den Wert der fault-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Fault }
	 * 
	 */
	public Fault getFault() {
		return fault;
	}

	/**
	 * Legt den Wert der fault-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Fault }
	 * 
	 */
	public void setFault(Fault value) {
		this.fault = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ActionEngineEventPayloadExtension }
	 * 
	 */
	public ActionEngineEventPayloadExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ActionEngineEventPayloadExtension }
	 * 
	 */
	public void setExtension(ActionEngineEventPayloadExtension value) {
		this.extension = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

}
