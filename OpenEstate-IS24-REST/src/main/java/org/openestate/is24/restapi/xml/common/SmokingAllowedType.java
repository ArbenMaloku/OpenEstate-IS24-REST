
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmokingAllowedType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SmokingAllowedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="ALLOWED"/>
 *     &lt;enumeration value="UNWANTED"/>
 *     &lt;enumeration value="OWN_ROOM_ONLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SmokingAllowedType")
@XmlEnum
public enum SmokingAllowedType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Erlaubt
     * 
     */
    ALLOWED,

    /**
     * Unerw\u00fcnscht
     * 
     */
    UNWANTED,

    /**
     * Nur im eigenem Zimmer
     * 
     */
    OWN_ROOM_ONLY;

    public String value() {
        return name();
    }

    public static SmokingAllowedType fromValue(String v) {
        return valueOf(v);
    }

}
