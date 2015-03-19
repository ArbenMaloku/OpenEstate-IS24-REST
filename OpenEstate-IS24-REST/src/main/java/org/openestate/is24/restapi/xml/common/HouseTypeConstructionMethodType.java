
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HouseTypeConstructionMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HouseTypeConstructionMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNSPECIFIED"/>
 *     &lt;enumeration value="PREFABRICATED"/>
 *     &lt;enumeration value="WOOD_PREFABRICATED"/>
 *     &lt;enumeration value="SOLID"/>
 *     &lt;enumeration value="SOLID_PREFABRICATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HouseTypeConstructionMethodType")
@XmlEnum
public enum HouseTypeConstructionMethodType {


    /**
     * nicht spezifiziert
     * 
     */
    UNSPECIFIED,

    /**
     * Fertigteilhaus
     * 
     */
    PREFABRICATED,

    /**
     * Fertigteilhaus aus Holz
     * 
     */
    WOOD_PREFABRICATED,

    /**
     * Massivhaus
     * 
     */
    SOLID,

    /**
     * Fertigteilhaus Massiv
     * 
     */
    SOLID_PREFABRICATED;

    public String value() {
        return name();
    }

    public static HouseTypeConstructionMethodType fromValue(String v) {
        return valueOf(v);
    }

}
