//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.28 at 05:24:58 PM CET 
//


package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlatMateGenderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlatMateGenderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MALE_OR_FEMALE"/>
 *     &lt;enumeration value="MALE"/>
 *     &lt;enumeration value="FEMALE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlatMateGenderType")
@XmlEnum
public enum FlatMateGenderType {


    /**
     * M\u00e4nnlich oder weiblich
     * 
     */
    MALE_OR_FEMALE,

    /**
     * M\u00e4nnlich
     * 
     */
    MALE,

    /**
     * Weiblich
     * 
     */
    FEMALE;

    public String value() {
        return name();
    }

    public static FlatMateGenderType fromValue(String v) {
        return valueOf(v);
    }

}
