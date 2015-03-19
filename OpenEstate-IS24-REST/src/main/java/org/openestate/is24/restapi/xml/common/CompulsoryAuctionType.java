
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompulsoryAuctionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompulsoryAuctionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FREEHOLD_FLAT"/>
 *     &lt;enumeration value="FAMILY_HOUSE"/>
 *     &lt;enumeration value="BUSINESS_AND_YIELD"/>
 *     &lt;enumeration value="LOT"/>
 *     &lt;enumeration value="GARAGE_AND_OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompulsoryAuctionType")
@XmlEnum
public enum CompulsoryAuctionType {


    /**
     * Eigentumswohnungen
     * 
     */
    FREEHOLD_FLAT,

    /**
     *  1+2 Familienh\u00e4user
     * 
     */
    FAMILY_HOUSE,

    /**
     * Gewerbe + Rendite
     * 
     */
    BUSINESS_AND_YIELD,

    /**
     * Grundst\u00fccke
     * 
     */
    LOT,

    /**
     * Garagen + Sonstiges
     * 
     */
    GARAGE_AND_OTHER;

    public String value() {
        return name();
    }

    public static CompulsoryAuctionType fromValue(String v) {
        return valueOf(v);
    }

}
