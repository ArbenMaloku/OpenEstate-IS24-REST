
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HouseTypeStageOfCompletionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HouseTypeStageOfCompletionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNSPECIFIED"/>
 *     &lt;enumeration value="CONSTRUCTIONKIT"/>
 *     &lt;enumeration value="UPGRADING"/>
 *     &lt;enumeration value="TURNKEYWITHCELLAR"/>
 *     &lt;enumeration value="TURNKEYWITHOUTFLOORSLAP"/>
 *     &lt;enumeration value="TURNKEYWITHFLOORSLAP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HouseTypeStageOfCompletionType")
@XmlEnum
public enum HouseTypeStageOfCompletionType {


    /**
     * nicht spezifiziert
     * 
     */
    UNSPECIFIED,

    /**
     * Bausatzhaus
     * 
     */
    CONSTRUCTIONKIT,

    /**
     * Ausbauhaus
     * 
     */
    UPGRADING,

    /**
     * Schl\u00fcsselfertig mit Keller
     * 
     */
    TURNKEYWITHCELLAR,

    /**
     * Schl\u00fcsselfertig ohne Bodenplatte
     * 
     */
    TURNKEYWITHOUTFLOORSLAP,

    /**
     * Schl\u00fcsselfertig mit Bodenplatte
     * 
     */
    TURNKEYWITHFLOORSLAP;

    public String value() {
        return name();
    }

    public static HouseTypeStageOfCompletionType fromValue(String v) {
        return valueOf(v);
    }

}
