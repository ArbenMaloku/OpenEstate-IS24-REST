//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.03 at 08:04:31 PM CEST 
//


package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RentScopeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RentScopeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NET_RENT"/>
 *     &lt;enumeration value="GROSS_RENT"/>
 *     &lt;enumeration value="INCONSISTENT_WARM_RENT"/>
 *     &lt;enumeration value="WARM_RENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RentScopeType")
@XmlEnum
public enum RentScopeType {


    /**
     * Netto Kaltmiete ohne irgendwelche Betriebskosten
     *           
     * 
     */
    NET_RENT,

    /**
     * Netto Kaltmiete plus Betriebskosten Kalt
     * 
     */
    GROSS_RENT,

    /**
     * Netto Kaltmiete plus Betriebskosten Kalt und Warm, mit
     *             Inkonsistenzen
     *           
     * 
     */
    INCONSISTENT_WARM_RENT,

    /**
     * Netto Kaltmiete plus Betriebskosten Kalt und Warm
     *           
     * 
     */
    WARM_RENT;

    public String value() {
        return name();
    }

    public static RentScopeType fromValue(String v) {
        return valueOf(v);
    }

}
