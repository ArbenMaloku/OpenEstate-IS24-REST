
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RENT_PER_MONTH"/>
 *     &lt;enumeration value="RENT_PER_SQM"/>
 *     &lt;enumeration value="PURCHASE_PRICE"/>
 *     &lt;enumeration value="LEASE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriceType")
@XmlEnum
public enum PriceType {


    /**
     * Miete pro Monat
     * 
     */
    RENT_PER_MONTH,

    /**
     * Miete pro Quadratmeter
     * 
     */
    RENT_PER_SQM,

    /**
     * Kaufpreis
     * 
     */
    PURCHASE_PRICE,

    /**
     * Pacht
     * 
     */
    LEASE;

    public String value() {
        return name();
    }

    public static PriceType fromValue(String v) {
        return valueOf(v);
    }

}
