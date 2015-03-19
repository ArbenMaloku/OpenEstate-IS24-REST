
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LeaseIntervalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LeaseIntervalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DAY"/>
 *     &lt;enumeration value="WEEK"/>
 *     &lt;enumeration value="MONTH"/>
 *     &lt;enumeration value="YEAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LeaseIntervalType")
@XmlEnum
public enum LeaseIntervalType {


    /**
     * Tag
     * 
     */
    DAY,

    /**
     * Woche
     * 
     */
    WEEK,

    /**
     * Monat
     * 
     */
    MONTH,

    /**
     * Jahr
     * 
     */
    YEAR;

    public String value() {
        return name();
    }

    public static LeaseIntervalType fromValue(String v) {
        return valueOf(v);
    }

}
