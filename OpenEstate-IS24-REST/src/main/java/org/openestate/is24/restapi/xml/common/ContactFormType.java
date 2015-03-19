
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactFormType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactFormType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="LONG"/>
 *     &lt;enumeration value="PHONE"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactFormType")
@XmlEnum
public enum ContactFormType {


    /**
     * E-Mail-Kontaktformular (Schnellkontakt)
     * 
     */
    EMAIL,

    /**
     * Ausfuehrliches Kontaktformular
     * 
     */
    LONG,

    /**
     * Telefon-Kontaktformular
     * 
     */
    PHONE,

    /**
     * Zeigt an, dass kein Kontaktformular sinnvoll angezeigt werden
     *             kann, z.B. da der Anbieter zwar Kontaktaufnahme per E-Mail wuenscht, aber selbst keine
     *             E-Mail-Adresse angegeben hat.
     *           
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static ContactFormType fromValue(String v) {
        return valueOf(v);
    }

}
