//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.14 at 12:30:43 AM CET 
//


package org.openestate.is24.restapi.xml.common;

import java.awt.Color;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter8
    extends XmlAdapter<String, Color>
{


    public Color unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parseColor(value));
    }

    public String marshal(Color value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printColor(value));
    }

}
