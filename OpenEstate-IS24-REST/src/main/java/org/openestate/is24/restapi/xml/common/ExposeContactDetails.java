
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.net.URL;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
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
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
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
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            URL theRealtorLogo;
            theRealtorLogo = this.getRealtorLogo();
            strategy.appendField(locator, this, "realtorLogo", buffer, theRealtorLogo, (this.realtorLogo!= null));
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof ExposeContactDetails) {
            final ExposeContactDetails copy = ((ExposeContactDetails) draftCopy);
            {
                Boolean realtorLogoShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realtorLogo!= null));
                if (realtorLogoShouldBeCopiedAndSet == Boolean.TRUE) {
                    URL sourceRealtorLogo;
                    sourceRealtorLogo = this.getRealtorLogo();
                    URL copyRealtorLogo = ((URL) strategy.copy(LocatorUtils.property(locator, "realtorLogo", sourceRealtorLogo), sourceRealtorLogo, (this.realtorLogo!= null)));
                    copy.setRealtorLogo(copyRealtorLogo);
                } else {
                    if (realtorLogoShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realtorLogo = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ExposeContactDetails();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realtorLogo", lhsRealtorLogo), LocatorUtils.property(thatLocator, "realtorLogo", rhsRealtorLogo), lhsRealtorLogo, rhsRealtorLogo, (this.realtorLogo!= null), (that.realtorLogo!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
