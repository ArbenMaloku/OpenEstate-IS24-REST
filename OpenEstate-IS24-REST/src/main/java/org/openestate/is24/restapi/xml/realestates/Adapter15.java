//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.28 at 05:24:58 PM CET 
//


package org.openestate.is24.restapi.xml.realestates;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter15
    extends XmlAdapter<String, Integer>
{


    public Integer unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parseFloorNr(value));
    }

    public String marshal(Integer value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printFloorNr(value));
    }

}
