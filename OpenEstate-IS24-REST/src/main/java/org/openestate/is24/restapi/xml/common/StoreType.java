
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StoreType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SHOWROOM_SPACE"/>
 *     &lt;enumeration value="SHOPPING_CENTRE"/>
 *     &lt;enumeration value="FACTORY_OUTLET"/>
 *     &lt;enumeration value="DEPARTMENT_STORE"/>
 *     &lt;enumeration value="KIOSK"/>
 *     &lt;enumeration value="STORE"/>
 *     &lt;enumeration value="SELF_SERVICE_MARKET"/>
 *     &lt;enumeration value="SALES_AREA"/>
 *     &lt;enumeration value="SALES_HALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StoreType")
@XmlEnum
public enum StoreType {


    /**
     * Ausstellungsfl\u00e4che
     * 
     */
    SHOWROOM_SPACE,

    /**
     * Einkaufszentrum
     * 
     */
    SHOPPING_CENTRE,

    /**
     * Factory Outlet
     * 
     */
    FACTORY_OUTLET,

    /**
     * Kaufhaus
     * 
     */
    DEPARTMENT_STORE,

    /**
     * Kiosk
     * 
     */
    KIOSK,

    /**
     * Laden
     * 
     */
    STORE,

    /**
     * SB-Markt
     * 
     */
    SELF_SERVICE_MARKET,

    /**
     * Verkaufsfl\u00e4che
     * 
     */
    SALES_AREA,

    /**
     * Verkaufshalle
     * 
     */
    SALES_HALL;

    public String value() {
        return name();
    }

    public static StoreType fromValue(String v) {
        return valueOf(v);
    }

}
