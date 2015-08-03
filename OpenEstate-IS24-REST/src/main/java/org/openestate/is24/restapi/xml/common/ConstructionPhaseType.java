
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstructionPhaseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstructionPhaseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PROJECTED"/&gt;
 *     &lt;enumeration value="UNDER_CONSTRUCTION"/&gt;
 *     &lt;enumeration value="COMPLETED"/&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConstructionPhaseType")
@XmlEnum
public enum ConstructionPhaseType {


    /**
     * Haus in Planung
     * 
     */
    PROJECTED,

    /**
     * Haus in Bau
     * 
     */
    UNDER_CONSTRUCTION,

    /**
     * Haus fertig gestellt
     * 
     */
    COMPLETED,

    /**
     * keine genaue Angabe zur Bauphase
     * 
     */
    NO_INFORMATION;

    public String value() {
        return name();
    }

    public static ConstructionPhaseType fromValue(String v) {
        return valueOf(v);
    }

}
