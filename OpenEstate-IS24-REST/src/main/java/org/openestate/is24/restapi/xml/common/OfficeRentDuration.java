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
 * <p>Java class for OfficeRentDuration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfficeRentDuration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WEEKLY"/>
 *     &lt;enumeration value="MONTHLY"/>
 *     &lt;enumeration value="YEARLY"/>
 *     &lt;enumeration value="LONG_TERM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OfficeRentDuration")
@XmlEnum
public enum OfficeRentDuration {


    /**
     * wochenweise
     * 
     */
    WEEKLY,

    /**
     * monatsweise
     * 
     */
    MONTHLY,

    /**
     *  1 bis 2 Jahre
     * 
     */
    YEARLY,

    /**
     * langfristig
     * 
     */
    LONG_TERM;

    public String value() {
        return name();
    }

    public static OfficeRentDuration fromValue(String v) {
        return valueOf(v);
    }

}
