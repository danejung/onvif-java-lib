//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2016.02.05 um 06:25:30 PM CET 
//


package org.onvif.ver20.media.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.MetadataConfigurationOptions;


/**
 * <p>Java-Klasse fr anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Options" type="{http://www.onvif.org/ver10/schema}MetadataConfigurationOptions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "options"
})
@XmlRootElement(name = "GetMetadataConfigurationOptionsResponse")
public class GetMetadataConfigurationOptionsResponse {

    @XmlElement(name = "Options", required = true)
    protected MetadataConfigurationOptions options;

    /**
     * Ruft den Wert der options-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataConfigurationOptions }
     *     
     */
    public MetadataConfigurationOptions getOptions() {
        return options;
    }

    /**
     * Legt den Wert der options-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataConfigurationOptions }
     *     
     */
    public void setOptions(MetadataConfigurationOptions value) {
        this.options = value;
    }

}
