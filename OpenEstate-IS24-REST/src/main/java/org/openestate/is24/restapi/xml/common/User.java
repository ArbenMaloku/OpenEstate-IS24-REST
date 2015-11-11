
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactDetails" type="{http://rest.immobilienscout24.de/schema/common/1.0}ContactDetails"/&gt;
 *         &lt;element name="password" type="{http://rest.immobilienscout24.de/schema/common/1.0}Password"/&gt;
 *         &lt;element name="sharedShortlistGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" /&gt;
 *       &lt;attribute name="peid" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "contactDetails",
    "password",
    "sharedShortlistGroupId"
})
public class User
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected ContactDetails contactDetails;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected String password;
    protected Long sharedShortlistGroupId;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "peid")
    protected Long peid;

    /**
     * Gets the value of the contactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails }
     *     
     */
    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails }
     *     
     */
    public void setContactDetails(ContactDetails value) {
        this.contactDetails = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the sharedShortlistGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSharedShortlistGroupId() {
        return sharedShortlistGroupId;
    }

    /**
     * Sets the value of the sharedShortlistGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSharedShortlistGroupId(Long value) {
        this.sharedShortlistGroupId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the peid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeid() {
        return peid;
    }

    /**
     * Sets the value of the peid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeid(Long value) {
        this.peid = value;
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
            ContactDetails theContactDetails;
            theContactDetails = this.getContactDetails();
            strategy.appendField(locator, this, "contactDetails", buffer, theContactDetails);
        }
        {
            String thePassword;
            thePassword = this.getPassword();
            strategy.appendField(locator, this, "password", buffer, thePassword);
        }
        {
            Long theSharedShortlistGroupId;
            theSharedShortlistGroupId = this.getSharedShortlistGroupId();
            strategy.appendField(locator, this, "sharedShortlistGroupId", buffer, theSharedShortlistGroupId);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            Long thePeid;
            thePeid = this.getPeid();
            strategy.appendField(locator, this, "peid", buffer, thePeid);
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
        if (draftCopy instanceof User) {
            final User copy = ((User) draftCopy);
            if (this.contactDetails!= null) {
                ContactDetails sourceContactDetails;
                sourceContactDetails = this.getContactDetails();
                ContactDetails copyContactDetails = ((ContactDetails) strategy.copy(LocatorUtils.property(locator, "contactDetails", sourceContactDetails), sourceContactDetails));
                copy.setContactDetails(copyContactDetails);
            } else {
                copy.contactDetails = null;
            }
            if (this.password!= null) {
                String sourcePassword;
                sourcePassword = this.getPassword();
                String copyPassword = ((String) strategy.copy(LocatorUtils.property(locator, "password", sourcePassword), sourcePassword));
                copy.setPassword(copyPassword);
            } else {
                copy.password = null;
            }
            if (this.sharedShortlistGroupId!= null) {
                Long sourceSharedShortlistGroupId;
                sourceSharedShortlistGroupId = this.getSharedShortlistGroupId();
                Long copySharedShortlistGroupId = ((Long) strategy.copy(LocatorUtils.property(locator, "sharedShortlistGroupId", sourceSharedShortlistGroupId), sourceSharedShortlistGroupId));
                copy.setSharedShortlistGroupId(copySharedShortlistGroupId);
            } else {
                copy.sharedShortlistGroupId = null;
            }
            if (this.id!= null) {
                String sourceId;
                sourceId = this.getId();
                String copyId = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId));
                copy.setId(copyId);
            } else {
                copy.id = null;
            }
            if (this.peid!= null) {
                Long sourcePeid;
                sourcePeid = this.getPeid();
                Long copyPeid = ((Long) strategy.copy(LocatorUtils.property(locator, "peid", sourcePeid), sourcePeid));
                copy.setPeid(copyPeid);
            } else {
                copy.peid = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new User();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof User)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final User that = ((User) object);
        {
            ContactDetails lhsContactDetails;
            lhsContactDetails = this.getContactDetails();
            ContactDetails rhsContactDetails;
            rhsContactDetails = that.getContactDetails();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactDetails", lhsContactDetails), LocatorUtils.property(thatLocator, "contactDetails", rhsContactDetails), lhsContactDetails, rhsContactDetails)) {
                return false;
            }
        }
        {
            String lhsPassword;
            lhsPassword = this.getPassword();
            String rhsPassword;
            rhsPassword = that.getPassword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "password", lhsPassword), LocatorUtils.property(thatLocator, "password", rhsPassword), lhsPassword, rhsPassword)) {
                return false;
            }
        }
        {
            Long lhsSharedShortlistGroupId;
            lhsSharedShortlistGroupId = this.getSharedShortlistGroupId();
            Long rhsSharedShortlistGroupId;
            rhsSharedShortlistGroupId = that.getSharedShortlistGroupId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sharedShortlistGroupId", lhsSharedShortlistGroupId), LocatorUtils.property(thatLocator, "sharedShortlistGroupId", rhsSharedShortlistGroupId), lhsSharedShortlistGroupId, rhsSharedShortlistGroupId)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            Long lhsPeid;
            lhsPeid = this.getPeid();
            Long rhsPeid;
            rhsPeid = that.getPeid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "peid", lhsPeid), LocatorUtils.property(thatLocator, "peid", rhsPeid), lhsPeid, rhsPeid)) {
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
