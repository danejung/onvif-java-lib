//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2014.02.19 um 02:35:56 PM CET 
//

package org.onvif.ver10.media.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.VideoEncoderConfiguration;

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
 *         <element name="Configuration" type="{http://www.onvif.org/ver10/schema}VideoEncoderConfiguration"/>
 *         <element name="ForcePersistence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "configuration", "forcePersistence" })
@XmlRootElement(name = "SetVideoEncoderConfiguration")
public class SetVideoEncoderConfiguration {

	@XmlElement(name = "Configuration", required = true)
	protected VideoEncoderConfiguration configuration;
	@XmlElement(name = "ForcePersistence")
	protected boolean forcePersistence;

	/**
	 * Ruft den Wert der configuration-Eigenschaft ab.
	 * 
	 * @return possible object is {@link VideoEncoderConfiguration }
	 * 
	 */
	public VideoEncoderConfiguration getConfiguration() {
		return configuration;
	}

	/**
	 * Legt den Wert der configuration-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link VideoEncoderConfiguration }
	 * 
	 */
	public void setConfiguration(VideoEncoderConfiguration value) {
		this.configuration = value;
	}

	/**
	 * Ruft den Wert der forcePersistence-Eigenschaft ab.
	 * 
	 */
	public boolean isForcePersistence() {
		return forcePersistence;
	}

	/**
	 * Legt den Wert der forcePersistence-Eigenschaft fest.
	 * 
	 */
	public void setForcePersistence(boolean value) {
		this.forcePersistence = value;
	}

}
