
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingSituationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingSituationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="GOOD"/>
 *     &lt;enumeration value="BAD"/>
 *     &lt;enumeration value="RESIDENT_PARKING"/>
 *     &lt;enumeration value="OWN_PARKING_SPACE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParkingSituationType")
@XmlEnum
public enum ParkingSituationType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Gut
     * 
     */
    GOOD,

    /**
     * schlecht
     * 
     */
    BAD,

    /**
     * Anwohnerparkplatz verf\u00fcgbar
     * 
     */
    RESIDENT_PARKING,

    /**
     * eigener Parkplatz verf\u00fcgbar
     * 
     */
    OWN_PARKING_SPACE;

    public String value() {
        return name();
    }

    public static ParkingSituationType fromValue(String v) {
        return valueOf(v);
    }

}
