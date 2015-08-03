
package org.openestate.is24.restapi.xml.common;

import java.net.URL;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import org.openestate.is24.restapi.xml.Adapter3;


/**
 * <p>Java class for RealtorLogo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealtorLogo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="realtorLogoUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealtorLogo", propOrder = {
    "realtorLogoUrl"
})
public class RealtorLogo
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "anyURI")
    protected URL realtorLogoUrl;

    /**
     * Gets the value of the realtorLogoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URL getRealtorLogoUrl() {
        return realtorLogoUrl;
    }

    /**
     * Sets the value of the realtorLogoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealtorLogoUrl(URL value) {
        this.realtorLogoUrl = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            URL theRealtorLogoUrl;
            theRealtorLogoUrl = this.getRealtorLogoUrl();
            strategy.appendField(locator, this, "realtorLogoUrl", buffer, theRealtorLogoUrl);
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof RealtorLogo) {
            final RealtorLogo copy = ((RealtorLogo) draftCopy);
            if (this.realtorLogoUrl!= null) {
                URL sourceRealtorLogoUrl;
                sourceRealtorLogoUrl = this.getRealtorLogoUrl();
                URL copyRealtorLogoUrl = ((URL) strategy.copy(LocatorUtils.property(locator, "realtorLogoUrl", sourceRealtorLogoUrl), sourceRealtorLogoUrl));
                copy.setRealtorLogoUrl(copyRealtorLogoUrl);
            } else {
                copy.realtorLogoUrl = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RealtorLogo();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RealtorLogo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RealtorLogo that = ((RealtorLogo) object);
        {
            URL lhsRealtorLogoUrl;
            lhsRealtorLogoUrl = this.getRealtorLogoUrl();
            URL rhsRealtorLogoUrl;
            rhsRealtorLogoUrl = that.getRealtorLogoUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realtorLogoUrl", lhsRealtorLogoUrl), LocatorUtils.property(thatLocator, "realtorLogoUrl", rhsRealtorLogoUrl), lhsRealtorLogoUrl, rhsRealtorLogoUrl)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
