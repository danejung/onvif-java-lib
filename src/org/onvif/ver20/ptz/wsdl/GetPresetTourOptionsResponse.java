//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2014.02.17 um 11:33:29 AM CET 
//

package org.onvif.ver20.ptz.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.PTZPresetTourOptions;

/**
 * <p>
 * Java-Klasse fr anonymous complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Options" type="{http://www.onvif.org/ver10/schema}PTZPresetTourOptions"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "options" })
@XmlRootElement(name = "GetPresetTourOptionsResponse")
public class GetPresetTourOptionsResponse {

	@XmlElement(name = "Options", required = true)
	protected PTZPresetTourOptions options;

	/**
	 * Ruft den Wert der options-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZPresetTourOptions }
	 * 
	 */
	public PTZPresetTourOptions getOptions() {
		return options;
	}

	/**
	 * Legt den Wert der options-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZPresetTourOptions }
	 * 
	 */
	public void setOptions(PTZPresetTourOptions value) {
		this.options = value;
	}

}
