//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.01 at 06:07:19 AM CET 
//


package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UtilizationTradeSite.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UtilizationTradeSite">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LEISURE"/>
 *     &lt;enumeration value="AGRICULTURE_FORESTRY"/>
 *     &lt;enumeration value="TRADE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UtilizationTradeSite")
@XmlEnum
public enum UtilizationTradeSite {


    /**
     * Freizeit
     * 
     */
    LEISURE,

    /**
     * Land- / Forstwirtschaft
     * 
     */
    AGRICULTURE_FORESTRY,

    /**
     * Gewerbe
     * 
     */
    TRADE;

    public String value() {
        return name();
    }

    public static UtilizationTradeSite fromValue(String v) {
        return valueOf(v);
    }

}
