//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.01 at 06:07:19 AM CET 
//


package org.openestate.is24.restapi.xml;

import java.net.URL;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, URL>
{


    public URL unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parseUrl(value));
    }

    public String marshal(URL value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printUrl(value));
    }

}
