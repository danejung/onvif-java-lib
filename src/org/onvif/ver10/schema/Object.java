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

/**
 * <p>
 * Java-Klasse fr Object complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="Object">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}ObjectId">
 *       <sequence>
 *         <element name="Appearance" type="{http://www.onvif.org/ver10/schema}Appearance" minOccurs="0"/>
 *         <element name="Behaviour" type="{http://www.onvif.org/ver10/schema}Behaviour" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ObjectExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Object", propOrder = { "appearance", "behaviour", "extension" })
public class Object extends ObjectId {

	@XmlElement(name = "Appearance")
	protected Appearance appearance;
	@XmlElement(name = "Behaviour")
	protected Behaviour behaviour;
	@XmlElement(name = "Extension")
	protected ObjectExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der appearance-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Appearance }
	 * 
	 */
	public Appearance getAppearance() {
		return appearance;
	}

	/**
	 * Legt den Wert der appearance-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Appearance }
	 * 
	 */
	public void setAppearance(Appearance value) {
		this.appearance = value;
	}

	/**
	 * Ruft den Wert der behaviour-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Behaviour }
	 * 
	 */
	public Behaviour getBehaviour() {
		return behaviour;
	}

	/**
	 * Legt den Wert der behaviour-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Behaviour }
	 * 
	 */
	public void setBehaviour(Behaviour value) {
		this.behaviour = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ObjectExtension }
	 * 
	 */
	public ObjectExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ObjectExtension }
	 * 
	 */
	public void setExtension(ObjectExtension value) {
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
