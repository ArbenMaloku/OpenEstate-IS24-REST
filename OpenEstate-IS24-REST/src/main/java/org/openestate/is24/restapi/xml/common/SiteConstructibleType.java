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
 * <p>Java class for SiteConstructibleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteConstructibleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONSTRUCTIONPLAN"/>
 *     &lt;enumeration value="NEIGHBOURCONSTRUCTION"/>
 *     &lt;enumeration value="EXTERNALAREA"/>
 *     &lt;enumeration value="NO_INFORMATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiteConstructibleType")
@XmlEnum
public enum SiteConstructibleType {


    /**
     * Bebauungsplan
     * 
     */
    CONSTRUCTIONPLAN,

    /**
     * wie Nachbarbebauung
     * 
     */
    NEIGHBOURCONSTRUCTION,

    /**
     * Aussengebiet
     * 
     */
    EXTERNALAREA,

    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION;

    public String value() {
        return name();
    }

    public static SiteConstructibleType fromValue(String v) {
        return valueOf(v);
    }

}
