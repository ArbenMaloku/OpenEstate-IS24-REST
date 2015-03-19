
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Double>
{


    public Double unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parseDouble8_2(value));
    }

    public String marshal(Double value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printDouble8_2(value));
    }

}
