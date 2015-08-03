
package org.openestate.is24.restapi.xml.offerlistelement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
import org.openestate.is24.restapi.xml.common.FacilityType;
import org.openestate.is24.restapi.xml.common.MarketingType;
import org.openestate.is24.restapi.xml.common.PetsAllowedType;
import org.openestate.is24.restapi.xml.common.YesNotApplicableType;


/**
 * Seniorenwohnen
 * 
 * <p>Java class for OfferAssistedLiving complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferAssistedLiving"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}OfferRealEstateForList"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}BaseAssistedLivingGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferAssistedLiving", propOrder = {
    "shortDescription",
    "petsAllowed",
    "trialLivingPossible",
    "cookingPossibilty",
    "marketingType",
    "facilityType",
    "balcony"
})
public class OfferAssistedLiving
    extends OfferRealEstateForList
    implements Cloneable, CopyTo, Equals, ToString
{

    protected String shortDescription;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PetsAllowedType petsAllowed;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType trialLivingPossible;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType cookingPossibilty;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MarketingType marketingType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FacilityType facilityType;
    protected boolean balcony;

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the petsAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link PetsAllowedType }
     *     
     */
    public PetsAllowedType getPetsAllowed() {
        return petsAllowed;
    }

    /**
     * Sets the value of the petsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PetsAllowedType }
     *     
     */
    public void setPetsAllowed(PetsAllowedType value) {
        this.petsAllowed = value;
    }

    /**
     * Gets the value of the trialLivingPossible property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getTrialLivingPossible() {
        return trialLivingPossible;
    }

    /**
     * Sets the value of the trialLivingPossible property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setTrialLivingPossible(YesNotApplicableType value) {
        this.trialLivingPossible = value;
    }

    /**
     * Gets the value of the cookingPossibilty property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCookingPossibilty() {
        return cookingPossibilty;
    }

    /**
     * Sets the value of the cookingPossibilty property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCookingPossibilty(YesNotApplicableType value) {
        this.cookingPossibilty = value;
    }

    /**
     * Gets the value of the marketingType property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingType }
     *     
     */
    public MarketingType getMarketingType() {
        return marketingType;
    }

    /**
     * Sets the value of the marketingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingType }
     *     
     */
    public void setMarketingType(MarketingType value) {
        this.marketingType = value;
    }

    /**
     * Gets the value of the facilityType property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityType }
     *     
     */
    public FacilityType getFacilityType() {
        return facilityType;
    }

    /**
     * Sets the value of the facilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityType }
     *     
     */
    public void setFacilityType(FacilityType value) {
        this.facilityType = value;
    }

    /**
     * Gets the value of the balcony property.
     * 
     */
    public boolean isBalcony() {
        return balcony;
    }

    /**
     * Sets the value of the balcony property.
     * 
     */
    public void setBalcony(boolean value) {
        this.balcony = value;
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
            String theShortDescription;
            theShortDescription = this.getShortDescription();
            strategy.appendField(locator, this, "shortDescription", buffer, theShortDescription);
        }
        {
            PetsAllowedType thePetsAllowed;
            thePetsAllowed = this.getPetsAllowed();
            strategy.appendField(locator, this, "petsAllowed", buffer, thePetsAllowed);
        }
        {
            YesNotApplicableType theTrialLivingPossible;
            theTrialLivingPossible = this.getTrialLivingPossible();
            strategy.appendField(locator, this, "trialLivingPossible", buffer, theTrialLivingPossible);
        }
        {
            YesNotApplicableType theCookingPossibilty;
            theCookingPossibilty = this.getCookingPossibilty();
            strategy.appendField(locator, this, "cookingPossibilty", buffer, theCookingPossibilty);
        }
        {
            MarketingType theMarketingType;
            theMarketingType = this.getMarketingType();
            strategy.appendField(locator, this, "marketingType", buffer, theMarketingType);
        }
        {
            FacilityType theFacilityType;
            theFacilityType = this.getFacilityType();
            strategy.appendField(locator, this, "facilityType", buffer, theFacilityType);
        }
        {
            boolean theBalcony;
            theBalcony = this.isBalcony();
            strategy.appendField(locator, this, "balcony", buffer, theBalcony);
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
        if (draftCopy instanceof OfferAssistedLiving) {
            final OfferAssistedLiving copy = ((OfferAssistedLiving) draftCopy);
            if (this.shortDescription!= null) {
                String sourceShortDescription;
                sourceShortDescription = this.getShortDescription();
                String copyShortDescription = ((String) strategy.copy(LocatorUtils.property(locator, "shortDescription", sourceShortDescription), sourceShortDescription));
                copy.setShortDescription(copyShortDescription);
            } else {
                copy.shortDescription = null;
            }
            if (this.petsAllowed!= null) {
                PetsAllowedType sourcePetsAllowed;
                sourcePetsAllowed = this.getPetsAllowed();
                PetsAllowedType copyPetsAllowed = ((PetsAllowedType) strategy.copy(LocatorUtils.property(locator, "petsAllowed", sourcePetsAllowed), sourcePetsAllowed));
                copy.setPetsAllowed(copyPetsAllowed);
            } else {
                copy.petsAllowed = null;
            }
            if (this.trialLivingPossible!= null) {
                YesNotApplicableType sourceTrialLivingPossible;
                sourceTrialLivingPossible = this.getTrialLivingPossible();
                YesNotApplicableType copyTrialLivingPossible = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "trialLivingPossible", sourceTrialLivingPossible), sourceTrialLivingPossible));
                copy.setTrialLivingPossible(copyTrialLivingPossible);
            } else {
                copy.trialLivingPossible = null;
            }
            if (this.cookingPossibilty!= null) {
                YesNotApplicableType sourceCookingPossibilty;
                sourceCookingPossibilty = this.getCookingPossibilty();
                YesNotApplicableType copyCookingPossibilty = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "cookingPossibilty", sourceCookingPossibilty), sourceCookingPossibilty));
                copy.setCookingPossibilty(copyCookingPossibilty);
            } else {
                copy.cookingPossibilty = null;
            }
            if (this.marketingType!= null) {
                MarketingType sourceMarketingType;
                sourceMarketingType = this.getMarketingType();
                MarketingType copyMarketingType = ((MarketingType) strategy.copy(LocatorUtils.property(locator, "marketingType", sourceMarketingType), sourceMarketingType));
                copy.setMarketingType(copyMarketingType);
            } else {
                copy.marketingType = null;
            }
            if (this.facilityType!= null) {
                FacilityType sourceFacilityType;
                sourceFacilityType = this.getFacilityType();
                FacilityType copyFacilityType = ((FacilityType) strategy.copy(LocatorUtils.property(locator, "facilityType", sourceFacilityType), sourceFacilityType));
                copy.setFacilityType(copyFacilityType);
            } else {
                copy.facilityType = null;
            }
            {
                boolean sourceBalcony;
                sourceBalcony = this.isBalcony();
                boolean copyBalcony = strategy.copy(LocatorUtils.property(locator, "balcony", sourceBalcony), sourceBalcony);
                copy.setBalcony(copyBalcony);
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new OfferAssistedLiving();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OfferAssistedLiving)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final OfferAssistedLiving that = ((OfferAssistedLiving) object);
        {
            String lhsShortDescription;
            lhsShortDescription = this.getShortDescription();
            String rhsShortDescription;
            rhsShortDescription = that.getShortDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shortDescription", lhsShortDescription), LocatorUtils.property(thatLocator, "shortDescription", rhsShortDescription), lhsShortDescription, rhsShortDescription)) {
                return false;
            }
        }
        {
            PetsAllowedType lhsPetsAllowed;
            lhsPetsAllowed = this.getPetsAllowed();
            PetsAllowedType rhsPetsAllowed;
            rhsPetsAllowed = that.getPetsAllowed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "petsAllowed", lhsPetsAllowed), LocatorUtils.property(thatLocator, "petsAllowed", rhsPetsAllowed), lhsPetsAllowed, rhsPetsAllowed)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsTrialLivingPossible;
            lhsTrialLivingPossible = this.getTrialLivingPossible();
            YesNotApplicableType rhsTrialLivingPossible;
            rhsTrialLivingPossible = that.getTrialLivingPossible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trialLivingPossible", lhsTrialLivingPossible), LocatorUtils.property(thatLocator, "trialLivingPossible", rhsTrialLivingPossible), lhsTrialLivingPossible, rhsTrialLivingPossible)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCookingPossibilty;
            lhsCookingPossibilty = this.getCookingPossibilty();
            YesNotApplicableType rhsCookingPossibilty;
            rhsCookingPossibilty = that.getCookingPossibilty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cookingPossibilty", lhsCookingPossibilty), LocatorUtils.property(thatLocator, "cookingPossibilty", rhsCookingPossibilty), lhsCookingPossibilty, rhsCookingPossibilty)) {
                return false;
            }
        }
        {
            MarketingType lhsMarketingType;
            lhsMarketingType = this.getMarketingType();
            MarketingType rhsMarketingType;
            rhsMarketingType = that.getMarketingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "marketingType", lhsMarketingType), LocatorUtils.property(thatLocator, "marketingType", rhsMarketingType), lhsMarketingType, rhsMarketingType)) {
                return false;
            }
        }
        {
            FacilityType lhsFacilityType;
            lhsFacilityType = this.getFacilityType();
            FacilityType rhsFacilityType;
            rhsFacilityType = that.getFacilityType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "facilityType", lhsFacilityType), LocatorUtils.property(thatLocator, "facilityType", rhsFacilityType), lhsFacilityType, rhsFacilityType)) {
                return false;
            }
        }
        {
            boolean lhsBalcony;
            lhsBalcony = this.isBalcony();
            boolean rhsBalcony;
            rhsBalcony = that.isBalcony();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balcony", lhsBalcony), LocatorUtils.property(thatLocator, "balcony", rhsBalcony), lhsBalcony, rhsBalcony)) {
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
