
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingSpaceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingSpaceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *     &lt;enumeration value="GARAGE"/&gt;
 *     &lt;enumeration value="OUTSIDE"/&gt;
 *     &lt;enumeration value="CARPORT"/&gt;
 *     &lt;enumeration value="DUPLEX"/&gt;
 *     &lt;enumeration value="CAR_PARK"/&gt;
 *     &lt;enumeration value="UNDERGROUND_GARAGE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
