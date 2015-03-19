
package org.openestate.is24.restapi.xml.realestateproject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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


/**
 * Eintrag in Realestate-Project
 * 
 * <p>Java class for RealEstateProjectEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealEstateProjectEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="realEstateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="realEstateExternalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealEstateProjectEntry", propOrder = {
    "realEstateId",
    "realEstateExternalId"
})
public class RealEstateProjectEntry
    implements Cloneable, CopyTo, Equals, ToString
{

    protected Long realEstateId;
    protected String realEstateExternalId;
    @XmlAttribute(name = "id")
    protected Long id;

    /**
     * Gets the value of the realEstateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRealEstateId() {
        return realEstateId;
    }

    /**
     * Sets the value of the realEstateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRealEstateId(Long value) {
        this.realEstateId = value;
    }

    /**
     * Gets the value of the realEstateExternalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealEstateExternalId() {
        return realEstateExternalId;
    }

    /**
     * Sets the value of the realEstateExternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealEstateExternalId(String value) {
        this.realEstateExternalId = value;
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
        {
            Long theRealEstateId;
            theRealEstateId = this.getRealEstateId();
            strategy.appendField(locator, this, "realEstateId", buffer, theRealEstateId);
        }
        {
            String theRealEstateExternalId;
            theRealEstateExternalId = this.getRealEstateExternalId();
            strategy.appendField(locator, this, "realEstateExternalId", buffer, theRealEstateExternalId);
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
        if (draftCopy instanceof RealEstateProjectEntry) {
            final RealEstateProjectEntry copy = ((RealEstateProjectEntry) draftCopy);
            if (this.realEstateId!= null) {
                Long sourceRealEstateId;
                sourceRealEstateId = this.getRealEstateId();
                Long copyRealEstateId = ((Long) strategy.copy(LocatorUtils.property(locator, "realEstateId", sourceRealEstateId), sourceRealEstateId));
                copy.setRealEstateId(copyRealEstateId);
            } else {
                copy.realEstateId = null;
            }
            if (this.realEstateExternalId!= null) {
                String sourceRealEstateExternalId;
                sourceRealEstateExternalId = this.getRealEstateExternalId();
                String copyRealEstateExternalId = ((String) strategy.copy(LocatorUtils.property(locator, "realEstateExternalId", sourceRealEstateExternalId), sourceRealEstateExternalId));
                copy.setRealEstateExternalId(copyRealEstateExternalId);
            } else {
                copy.realEstateExternalId = null;
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
        return new RealEstateProjectEntry();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RealEstateProjectEntry)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RealEstateProjectEntry that = ((RealEstateProjectEntry) object);
        {
            Long lhsRealEstateId;
            lhsRealEstateId = this.getRealEstateId();
            Long rhsRealEstateId;
            rhsRealEstateId = that.getRealEstateId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateId", lhsRealEstateId), LocatorUtils.property(thatLocator, "realEstateId", rhsRealEstateId), lhsRealEstateId, rhsRealEstateId)) {
                return false;
            }
        }
        {
            String lhsRealEstateExternalId;
            lhsRealEstateExternalId = this.getRealEstateExternalId();
            String rhsRealEstateExternalId;
            rhsRealEstateExternalId = that.getRealEstateExternalId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateExternalId", lhsRealEstateExternalId), LocatorUtils.property(thatLocator, "realEstateExternalId", rhsRealEstateExternalId), lhsRealEstateExternalId, rhsRealEstateExternalId)) {
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
