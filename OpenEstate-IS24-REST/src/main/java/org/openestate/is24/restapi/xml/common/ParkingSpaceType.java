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
 * <p>Java class for ParkingSpaceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingSpaceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="GARAGE"/>
 *     &lt;enumeration value="OUTSIDE"/>
 *     &lt;enumeration value="CARPORT"/>
 *     &lt;enumeration value="DUPLEX"/>
 *     &lt;enumeration value="CAR_PARK"/>
 *     &lt;enumeration value="UNDERGROUND_GARAGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParkingSpaceType")
@XmlEnum
public enum ParkingSpaceType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Garage
     * 
     */
    GARAGE,

    /**
     * Au\u00dfenstellplatz
     * 
     */
    OUTSIDE,

    /**
     * Carport
     * 
     */
    CARPORT,

    /**
     * Duplex
     * 
     */
    DUPLEX,

    /**
     * Parkhaus
     * 
     */
    CAR_PARK,

    /**
     * Tiefgarage
     * 
     */
    UNDERGROUND_GARAGE;

    public String value() {
        return name();
    }

    public static ParkingSpaceType fromValue(String v) {
        return valueOf(v);
    }

}
