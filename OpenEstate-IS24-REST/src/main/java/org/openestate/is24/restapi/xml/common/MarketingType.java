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
 * <p>Java class for MarketingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PURCHASE"/>
 *     &lt;enumeration value="PURCHASE_PER_SQM"/>
 *     &lt;enumeration value="RENT"/>
 *     &lt;enumeration value="RENT_PER_SQM"/>
 *     &lt;enumeration value="LEASE"/>
 *     &lt;enumeration value="LEASEHOLD"/>
 *     &lt;enumeration value="BUDGET_RENT"/>
 *     &lt;enumeration value="RENT_AND_BUY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MarketingType")
@XmlEnum
public enum MarketingType {


    /**
     * Kauf
     * 
     */
    PURCHASE,

    /**
     * Kauf pro Quadratmeter
     * 
     */
    PURCHASE_PER_SQM,

    /**
     * Miete
     * 
     */
    RENT,

    /**
     * Miete pro Quadratmeter
     * 
     */
    RENT_PER_SQM,

    /**
     * Pacht
     * 
     */
    LEASE,

    /**
     * Erbpacht
     * 
     */
    LEASEHOLD,

    /**
     * Gesamtmiete aus allen verf\u00fcgbaren Miet-Informationen zum
     *             Vergleich zu einem gegebenen Monatsbudget
     *           
     * 
     */
    BUDGET_RENT,

    /**
     * Miete und Kauf
     * 
     */
    RENT_AND_BUY;

    public String value() {
        return name();
    }

    public static MarketingType fromValue(String v) {
        return valueOf(v);
    }

}
