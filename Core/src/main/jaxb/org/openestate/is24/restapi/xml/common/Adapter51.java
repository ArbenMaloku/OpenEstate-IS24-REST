
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter51
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parsePhoneNumberAreaCode(value));
    }

    public String marshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printPhoneNumberAreaCode(value));
    }

}
