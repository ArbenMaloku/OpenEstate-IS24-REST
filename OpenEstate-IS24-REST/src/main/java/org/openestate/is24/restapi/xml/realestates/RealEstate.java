
package org.openestate.is24.restapi.xml.realestates;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
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
import org.openestate.is24.restapi.xml.common.AbstractRealEstate;
import org.openestate.is24.restapi.xml.common.PublishChannels;


/**
 * Allgemeine Elemente f\u00fcr
 *         alle Immobilienarten.
 * 
 * <p>Java class for RealEstate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealEstate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}AbstractRealEstate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="showAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="contact" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *                 &lt;attribute name="externalId" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://rest.immobilienscout24.de/schema/common/1.0}publishChannels" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealEstate", propOrder = {
    "showAddress",
    "contact",
    "publishChannels"
})
@XmlSeeAlso({
    HouseBuy.class,
    HouseRent.class,
    GarageRent.class,
    GarageBuy.class,
    SeniorCare.class,
    AssistedLiving.class,
    ApartmentRent.class,
    ApartmentBuy.class,
    CompulsoryAuction.class,
    ShortTermAccommodation.class,
    Investment.class,
    Office.class,
    Store.class,
    Gastronomy.class,
    Industry.class,
    SpecialPurpose.class,
    LivingBuySite.class,
    LivingRentSite.class,
    TradeSite.class,
    HouseType.class,
    FlatShareRoom.class
})
public abstract class RealEstate
    extends AbstractRealEstate
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(defaultValue = "false")
    protected boolean showAddress;
    protected RealEstate.Contact contact;
    @XmlElement(namespace = "http://rest.immobilienscout24.de/schema/common/1.0")
    protected PublishChannels publishChannels;

    /**
     * Gets the value of the showAddress property.
     * 
     */
    public boolean isShowAddress() {
        return showAddress;
    }

    /**
     * Sets the value of the showAddress property.
     * 
     */
    public void setShowAddress(boolean value) {
        this.showAddress = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstate.Contact }
     *     
     */
    public RealEstate.Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstate.Contact }
     *     
     */
    public void setContact(RealEstate.Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the publishChannels property.
     * 
     * @return
     *     possible object is
     *     {@link PublishChannels }
     *     
     */
    public PublishChannels getPublishChannels() {
        return publishChannels;
    }

    /**
     * Sets the value of the publishChannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublishChannels }
     *     
     */
    public void setPublishChannels(PublishChannels value) {
        this.publishChannels = value;
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
            boolean theShowAddress;
            theShowAddress = this.isShowAddress();
            strategy.appendField(locator, this, "showAddress", buffer, theShowAddress);
        }
        {
            RealEstate.Contact theContact;
            theContact = this.getContact();
            strategy.appendField(locator, this, "contact", buffer, theContact);
        }
        {
            PublishChannels thePublishChannels;
            thePublishChannels = this.getPublishChannels();
            strategy.appendField(locator, this, "publishChannels", buffer, thePublishChannels);
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof RealEstate) {
            final RealEstate copy = ((RealEstate) target);
            {
                boolean sourceShowAddress;
                sourceShowAddress = this.isShowAddress();
                boolean copyShowAddress = strategy.copy(LocatorUtils.property(locator, "showAddress", sourceShowAddress), sourceShowAddress);
                copy.setShowAddress(copyShowAddress);
            }
            if (this.contact!= null) {
                RealEstate.Contact sourceContact;
                sourceContact = this.getContact();
                RealEstate.Contact copyContact = ((RealEstate.Contact) strategy.copy(LocatorUtils.property(locator, "contact", sourceContact), sourceContact));
                copy.setContact(copyContact);
            } else {
                copy.contact = null;
            }
            if (this.publishChannels!= null) {
                PublishChannels sourcePublishChannels;
                sourcePublishChannels = this.getPublishChannels();
                PublishChannels copyPublishChannels = ((PublishChannels) strategy.copy(LocatorUtils.property(locator, "publishChannels", sourcePublishChannels), sourcePublishChannels));
                copy.setPublishChannels(copyPublishChannels);
            } else {
                copy.publishChannels = null;
            }
        }
        return target;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RealEstate)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RealEstate that = ((RealEstate) object);
        {
            boolean lhsShowAddress;
            lhsShowAddress = this.isShowAddress();
            boolean rhsShowAddress;
            rhsShowAddress = that.isShowAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showAddress", lhsShowAddress), LocatorUtils.property(thatLocator, "showAddress", rhsShowAddress), lhsShowAddress, rhsShowAddress)) {
                return false;
            }
        }
        {
            RealEstate.Contact lhsContact;
            lhsContact = this.getContact();
            RealEstate.Contact rhsContact;
            rhsContact = that.getContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contact", lhsContact), LocatorUtils.property(thatLocator, "contact", rhsContact), lhsContact, rhsContact)) {
                return false;
            }
        }
        {
            PublishChannels lhsPublishChannels;
            lhsPublishChannels = this.getPublishChannels();
            PublishChannels rhsPublishChannels;
            rhsPublishChannels = that.getPublishChannels();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publishChannels", lhsPublishChannels), LocatorUtils.property(thatLocator, "publishChannels", rhsPublishChannels), lhsPublishChannels, rhsPublishChannels)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * Verweis auf einen Anbieterkontakt.
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
     *       &lt;attribute name="externalId" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Contact
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlAttribute(name = "id")
        protected Long id;
        @XmlAttribute(name = "externalId")
        protected String externalId;

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

        /**
         * Gets the value of the externalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalId() {
            return externalId;
        }

        /**
         * Sets the value of the externalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalId(String value) {
            this.externalId = value;
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
                Long theId;
                theId = this.getId();
                strategy.appendField(locator, this, "id", buffer, theId);
            }
            {
                String theExternalId;
                theExternalId = this.getExternalId();
                strategy.appendField(locator, this, "externalId", buffer, theExternalId);
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
            if (draftCopy instanceof RealEstate.Contact) {
                final RealEstate.Contact copy = ((RealEstate.Contact) draftCopy);
                if (this.id!= null) {
                    Long sourceId;
                    sourceId = this.getId();
                    Long copyId = ((Long) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId));
                    copy.setId(copyId);
                } else {
                    copy.id = null;
                }
                if (this.externalId!= null) {
                    String sourceExternalId;
                    sourceExternalId = this.getExternalId();
                    String copyExternalId = ((String) strategy.copy(LocatorUtils.property(locator, "externalId", sourceExternalId), sourceExternalId));
                    copy.setExternalId(copyExternalId);
                } else {
                    copy.externalId = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new RealEstate.Contact();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof RealEstate.Contact)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final RealEstate.Contact that = ((RealEstate.Contact) object);
            {
                Long lhsId;
                lhsId = this.getId();
                Long rhsId;
                rhsId = that.getId();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                    return false;
                }
            }
            {
                String lhsExternalId;
                lhsExternalId = this.getExternalId();
                String rhsExternalId;
                rhsExternalId = that.getExternalId();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "externalId", lhsExternalId), LocatorUtils.property(thatLocator, "externalId", rhsExternalId), lhsExternalId, rhsExternalId)) {
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

}
