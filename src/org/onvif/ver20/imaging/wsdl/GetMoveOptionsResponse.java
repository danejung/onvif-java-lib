//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2014.04.25 um 04:22:13 PM CEST 
//


package org.onvif.ver20.imaging.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.MoveOptions20;


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
 *         &lt;element name="MoveOptions" type="{http://www.onvif.org/ver10/schema}MoveOptions20"/>
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
    "moveOptions"
})
@XmlRootElement(name = "GetMoveOptionsResponse")
public class GetMoveOptionsResponse {

    @XmlElement(name = "MoveOptions", required = true)
    protected MoveOptions20 moveOptions;

    /**
     * Ruft den Wert der moveOptions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MoveOptions20 }
     *     
     */
    public MoveOptions20 getMoveOptions() {
        return moveOptions;
    }

    /**
     * Legt den Wert der moveOptions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MoveOptions20 }
     *     
     */
    public void setMoveOptions(MoveOptions20 value) {
        this.moveOptions = value;
    }

}
