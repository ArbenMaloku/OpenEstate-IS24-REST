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
 * <p>Java class for HouseTypeConstructionMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HouseTypeConstructionMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNSPECIFIED"/>
 *     &lt;enumeration value="PREFABRICATED"/>
 *     &lt;enumeration value="WOOD_PREFABRICATED"/>
 *     &lt;enumeration value="SOLID"/>
 *     &lt;enumeration value="SOLID_PREFABRICATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HouseTypeConstructionMethodType")
@XmlEnum
public enum HouseTypeConstructionMethodType {


    /**
     * nicht spezifiziert
     * 
     */
    UNSPECIFIED,

    /**
     * Fertigteilhaus
     * 
     */
    PREFABRICATED,

    /**
     * Fertigteilhaus aus Holz
     * 
     */
    WOOD_PREFABRICATED,

    /**
     * Massivhaus
     * 
     */
    SOLID,

    /**
     * Fertigteilhaus Massiv
     * 
     */
    SOLID_PREFABRICATED;

    public String value() {
        return name();
    }

    public static HouseTypeConstructionMethodType fromValue(String v) {
        return valueOf(v);
    }

}
