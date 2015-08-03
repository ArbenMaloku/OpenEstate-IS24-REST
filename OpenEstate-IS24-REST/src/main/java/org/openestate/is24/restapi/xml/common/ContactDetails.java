
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
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


/**
 * Die Kontaktdaten.
 * 
 * <p>Java class for ContactDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}BaseContactDetails"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="officeHours" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="1000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactDetails", propOrder = {
    "officeHours"
})
@XmlSeeAlso({
    RealtorContactDetails.class,
    ExposeContactDetails.class
})
public class ContactDetails
    extends BaseContactDetails
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlJavaTypeAdapter(Adapter57 .class)
    protected String officeHours;
    @XmlAttribute(name = "id")
    protected Long id;

    /**
     * Gets the value of the officeHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeHours() {
        return officeHours;
    }

    /**
     * Sets the value of the officeHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeHours(String value) {
        this.officeHours = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
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
            String theOfficeHours;
            theOfficeHours = this.getOfficeHours();
            strategy.appendField(locator, this, "officeHours", buffer, theOfficeHours);
        }
        {
            Long theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
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
        if (draftCopy instanceof ContactDetails) {
            final ContactDetails copy = ((ContactDetails) draftCopy);
            if (this.officeHours!= null) {
                String sourceOfficeHours;
                sourceOfficeHours = this.getOfficeHours();
                String copyOfficeHours = ((String) strategy.copy(LocatorUtils.property(locator, "officeHours", sourceOfficeHours), sourceOfficeHours));
                copy.setOfficeHours(copyOfficeHours);
            } else {
                copy.officeHours = null;
            }
            if (this.id!= null) {
                Long sourceId;
                sourceId = this.getId();
                Long copyId = ((Long) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId));
                copy.setId(copyId);
            } else {
                copy.id = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ContactDetails();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ContactDetails)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ContactDetails that = ((ContactDetails) object);
        {
            String lhsOfficeHours;
            lhsOfficeHours = this.getOfficeHours();
            String rhsOfficeHours;
            rhsOfficeHours = that.getOfficeHours();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "officeHours", lhsOfficeHours), LocatorUtils.property(thatLocator, "officeHours", rhsOfficeHours), lhsOfficeHours, rhsOfficeHours)) {
                return false;
            }
        }
        {
            Long lhsId;
            lhsId = this.getId();
            Long rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
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
