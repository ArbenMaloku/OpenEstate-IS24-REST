
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FacilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FacilityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASSISTED_LIVING"/&gt;
 *     &lt;enumeration value="RESIDENCE"/&gt;
 *     &lt;enumeration value="SENIOR_PARK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FacilityType")
@XmlEnum
public enum FacilityType {


    /**
     * Seniorenwohnen
     * 
     */
    ASSISTED_LIVING,

    /**
     * Residenz
     * 
     */
    RESIDENCE,

    /**
     * Seniorenwohnpark
     * 
     */
    SENIOR_PARK;

    public String value() {
        return name();
    }

    public static FacilityType fromValue(String v) {
        return valueOf(v);
    }

}