
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YesNotApplicableType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="YesNotApplicableType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YES"/&gt;
 *     &lt;enumeration value="NOT_APPLICABLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "YesNotApplicableType")
@XmlEnum
public enum YesNotApplicableType {


    /**
     * Ja
     * 
     */
    YES,

    /**
     * keine Angabe
     * 
     */
    NOT_APPLICABLE;

    public String value() {
        return name();
    }

    public static YesNotApplicableType fromValue(String v) {
        return valueOf(v);
    }

}
