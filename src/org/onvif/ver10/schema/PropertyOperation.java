//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse fr PropertyOperation.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * <simpleType name="PropertyOperation">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Initialized"/>
 *     <enumeration value="Deleted"/>
 *     <enumeration value="Changed"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PropertyOperation")
@XmlEnum
public enum PropertyOperation {

	@XmlEnumValue("Initialized")
	INITIALIZED("Initialized"), @XmlEnumValue("Deleted")
	DELETED("Deleted"), @XmlEnumValue("Changed")
	CHANGED("Changed");
	private final String value;

	PropertyOperation(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static PropertyOperation fromValue(String v) {
		for (PropertyOperation c : PropertyOperation.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
