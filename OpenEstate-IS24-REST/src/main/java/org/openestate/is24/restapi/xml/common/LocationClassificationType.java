//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.14 at 12:30:43 AM CET 
//


package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationClassificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationClassificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="CLASSIFICATION_A"/>
 *     &lt;enumeration value="CLASSIFICATION_B"/>
 *     &lt;enumeration value="SHOPPING_CENTRE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationClassificationType")
@XmlEnum
public enum LocationClassificationType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * A-Lage
     * 
     */
    CLASSIFICATION_A,

    /**
     * B-Lage
     * 
     */
    CLASSIFICATION_B,

    /**
     * im Schoppingcenter
     * 
     */
    SHOPPING_CENTRE;

    public String value() {
        return name();
    }

    public static LocationClassificationType fromValue(String v) {
        return valueOf(v);
    }

}
