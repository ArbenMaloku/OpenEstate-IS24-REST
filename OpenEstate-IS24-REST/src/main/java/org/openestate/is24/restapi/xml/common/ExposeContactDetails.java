
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
import org.openestate.is24.restapi.xml.Adapter4;


/**
 * Die Kontaktdaten eines Exposes
 * 
 * <p>Java class for ExposeContactDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExposeContactDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}ContactDetails"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="realtorLogo" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExposeContactDetails", propOrder = {
    "realtorLogo"
})
public class ExposeContactDetails
    extends ContactDetails
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    protected URL realtorLogo;

    /**
     * Gets the value of the realtorLogo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URL getRealtorLogo() {
        return realtorLogo;
    }

    /**
     * Sets the value of the realtorLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealtorLogo(URL value) {
        this.realtorLogo = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            URL theRealtorLogo;
            theRealtorLogo = this.getRealtorLogo();
            strategy.appendField(locator, this, "realtorLogo", buffer, theRealtorLogo);
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof ExposeContactDetails) {
            final ExposeContactDetails copy = ((ExposeContactDetails) draftCopy);
            if (this.realtorLogo!= null) {
                URL sourceRealtorLogo;
                sourceRealtorLogo = this.getRealtorLogo();
                URL copyRealtorLogo = ((URL) strategy.copy(LocatorUtils.property(locator, "realtorLogo", sourceRealtorLogo), sourceRealtorLogo));
                copy.setRealtorLogo(copyRealtorLogo);
            } else {
                copy.realtorLogo = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ExposeContactDetails();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ExposeContactDetails that = ((ExposeContactDetails) object);
        {
            URL lhsRealtorLogo;
            lhsRealtorLogo = this.getRealtorLogo();
            URL rhsRealtorLogo;
            rhsRealtorLogo = that.getRealtorLogo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realtorLogo", lhsRealtorLogo), LocatorUtils.property(thatLocator, "realtorLogo", rhsRealtorLogo), lhsRealtorLogo, rhsRealtorLogo)) {
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
