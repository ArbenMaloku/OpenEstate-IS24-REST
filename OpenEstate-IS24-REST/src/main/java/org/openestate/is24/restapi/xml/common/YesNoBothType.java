
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YesNoBothType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="YesNoBothType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YES"/&gt;
 *     &lt;enumeration value="NO"/&gt;
 *     &lt;enumeration value="BOTH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "YesNoBothType")
@XmlEnum
public enum YesNoBothType {


    /**
     * Ja
     * 
     */
    YES,

    /**
     * Nein
     * 
     */
    NO,

    /**
     * beide
     * 
     */
    BOTH;

    public String value() {
        return name();
    }

    public static YesNoBothType fromValue(String v) {
        return valueOf(v);
    }

}
