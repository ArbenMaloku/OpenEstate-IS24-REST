
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForwardTrackingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForwardTrackingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DIRECT"/&gt;
 *     &lt;enumeration value="LATER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForwardTrackingType")
@XmlEnum
public enum ForwardTrackingType {


    /**
     * Indicates that the customer was forwarded to us by a
     *             partner/affiliate within the current session.
     *           
     * 
     */
    DIRECT,

    /**
     * Indicates that the customer was forwarded to us by a
     *             partner/affiliate previously and has now returned independently of the partner/affiliate.
     *           
     * 
     */
    LATER;

    public String value() {
        return name();
    }

    public static ForwardTrackingType fromValue(String v) {
        return valueOf(v);
    }

}