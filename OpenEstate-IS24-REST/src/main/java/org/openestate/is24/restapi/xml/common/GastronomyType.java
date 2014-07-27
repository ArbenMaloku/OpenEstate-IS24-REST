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
 * <p>Java class for GastronomyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GastronomyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BAR_LOUNGE"/>
 *     &lt;enumeration value="CAFE"/>
 *     &lt;enumeration value="CLUB_DISCO"/>
 *     &lt;enumeration value="GUESTS_HOUSE"/>
 *     &lt;enumeration value="TAVERN"/>
 *     &lt;enumeration value="HOTEL"/>
 *     &lt;enumeration value="HOTEL_RESIDENCE"/>
 *     &lt;enumeration value="HOTEL_GARNI"/>
 *     &lt;enumeration value="PENSION"/>
 *     &lt;enumeration value="RESTAURANT"/>
 *     &lt;enumeration value="BUNGALOW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GastronomyType")
@XmlEnum
public enum GastronomyType {


    /**
     * Barbetrieb/Lounge
     * 
     */
    BAR_LOUNGE,

    /**
     * Cafe
     * 
     */
    CAFE,

    /**
     * Club/Diskothek
     * 
     */
    CLUB_DISCO,

    /**
     * G\u00e4stehaus
     * 
     */
    GUESTS_HOUSE,

    /**
     * Gastst\u00e4tte
     * 
     */
    TAVERN,

    /**
     * Hotel
     * 
     */
    HOTEL,

    /**
     * Hotelanwesen
     * 
     */
    HOTEL_RESIDENCE,

    /**
     * Hotel garni (Ein Hotel, dass nur Fr\u00fchst\u00fcck anbietet /Tageshotel)
     *           
     * 
     */
    HOTEL_GARNI,

    /**
     * Pension
     * 
     */
    PENSION,

    /**
     * Restaurant
     * 
     */
    RESTAURANT,

    /**
     * Ferienbungalows
     * 
     */
    BUNGALOW;

    public String value() {
        return name();
    }

    public static GastronomyType fromValue(String v) {
        return valueOf(v);
    }

}
