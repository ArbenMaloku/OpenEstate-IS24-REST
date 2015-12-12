
package org.openestate.is24.restapi.xml.realestates;

import java.math.BigDecimal;
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
import org.openestate.is24.restapi.xml.Adapter1;
import org.openestate.is24.restapi.xml.Adapter5;
import org.openestate.is24.restapi.xml.common.CommercializationType;
import org.openestate.is24.restapi.xml.common.CourtageInfo;
import org.openestate.is24.restapi.xml.common.LeaseIntervalType;
import org.openestate.is24.restapi.xml.common.Price;
import org.openestate.is24.restapi.xml.common.SiteConstructibleType;
import org.openestate.is24.restapi.xml.common.SiteDevelopmentType;
import org.openestate.is24.restapi.xml.common.SiteRecommendedUseForTradeTypes;
import org.openestate.is24.restapi.xml.common.UtilizationTradeSite;


/**
 * Eigenschaften f\u00fcr den Immobilientyp "Grundstueck-Gewerbe"
 * 
 * <p>Java class for TradeSite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeSite"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedTradeSiteGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeSite", propOrder = {
    "commercializationType",
    "recommendedUseTypes",
    "utilizationTradeSite",
    "tenancy",
    "price",
    "plotArea",
    "minDivisible",
    "courtage",
    "freeFrom",
    "shortTermConstructible",
    "buildingPermission",
    "demolition",
    "siteDevelopmentType",
    "siteConstructibleType",
    "grz",
    "gfz",
    "leaseInterval"
})
public class TradeSite
    extends RealEstate
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CommercializationType commercializationType;
    protected SiteRecommendedUseForTradeTypes recommendedUseTypes;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected UtilizationTradeSite utilizationTradeSite;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long tenancy;
    @XmlElement(required = true)
    protected Price price;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal plotArea;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal minDivisible;
    @XmlElement(required = true)
    protected CourtageInfo courtage;
    protected String freeFrom;
    protected Boolean shortTermConstructible;
    protected Boolean buildingPermission;
    protected Boolean demolition;
    @XmlSchemaType(name = "string")
    protected SiteDevelopmentType siteDevelopmentType;
    @XmlSchemaType(name = "string")
    protected SiteConstructibleType siteConstructibleType;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal grz;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal gfz;
    @XmlSchemaType(name = "string")
    protected LeaseIntervalType leaseInterval;

    /**
     * Gets the value of the commercializationType property.
     * 
     * @return
     *     possible object is
     *     {@link CommercializationType }
     *     
     */
    public CommercializationType getCommercializationType() {
        return commercializationType;
    }

    /**
     * Sets the value of the commercializationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercializationType }
     *     
     */
    public void setCommercializationType(CommercializationType value) {
        this.commercializationType = value;
    }

    /**
     * Gets the value of the recommendedUseTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SiteRecommendedUseForTradeTypes }
     *     
     */
    public SiteRecommendedUseForTradeTypes getRecommendedUseTypes() {
        return recommendedUseTypes;
    }

    /**
     * Sets the value of the recommendedUseTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteRecommendedUseForTradeTypes }
     *     
     */
    public void setRecommendedUseTypes(SiteRecommendedUseForTradeTypes value) {
        this.recommendedUseTypes = value;
    }

    /**
     * Gets the value of the utilizationTradeSite property.
     * 
     * @return
     *     possible object is
     *     {@link UtilizationTradeSite }
     *     
     */
    public UtilizationTradeSite getUtilizationTradeSite() {
        return utilizationTradeSite;
    }

    /**
     * Sets the value of the utilizationTradeSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilizationTradeSite }
     *     
     */
    public void setUtilizationTradeSite(UtilizationTradeSite value) {
        this.utilizationTradeSite = value;
    }

    /**
     * Gets the value of the tenancy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTenancy() {
        return tenancy;
    }

    /**
     * Sets the value of the tenancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenancy(Long value) {
        this.tenancy = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the plotArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getPlotArea() {
        return plotArea;
    }

    /**
     * Sets the value of the plotArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlotArea(BigDecimal value) {
        this.plotArea = value;
    }

    /**
     * Gets the value of the minDivisible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMinDivisible() {
        return minDivisible;
    }

    /**
     * Sets the value of the minDivisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinDivisible(BigDecimal value) {
        this.minDivisible = value;
    }

    /**
     * Gets the value of the courtage property.
     * 
     * @return
     *     possible object is
     *     {@link CourtageInfo }
     *     
     */
    public CourtageInfo getCourtage() {
        return courtage;
    }

    /**
     * Sets the value of the courtage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourtageInfo }
     *     
     */
    public void setCourtage(CourtageInfo value) {
        this.courtage = value;
    }

    /**
     * Gets the value of the freeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeFrom() {
        return freeFrom;
    }

    /**
     * Sets the value of the freeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeFrom(String value) {
        this.freeFrom = value;
    }

    /**
     * Gets the value of the shortTermConstructible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShortTermConstructible() {
        return shortTermConstructible;
    }

    /**
     * Sets the value of the shortTermConstructible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShortTermConstructible(Boolean value) {
        this.shortTermConstructible = value;
    }

    /**
     * Gets the value of the buildingPermission property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuildingPermission() {
        return buildingPermission;
    }

    /**
     * Sets the value of the buildingPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuildingPermission(Boolean value) {
        this.buildingPermission = value;
    }

    /**
     * Gets the value of the demolition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDemolition() {
        return demolition;
    }

    /**
     * Sets the value of the demolition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDemolition(Boolean value) {
        this.demolition = value;
    }

    /**
     * Gets the value of the siteDevelopmentType property.
     * 
     * @return
     *     possible object is
     *     {@link SiteDevelopmentType }
     *     
     */
    public SiteDevelopmentType getSiteDevelopmentType() {
        return siteDevelopmentType;
    }

    /**
     * Sets the value of the siteDevelopmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteDevelopmentType }
     *     
     */
    public void setSiteDevelopmentType(SiteDevelopmentType value) {
        this.siteDevelopmentType = value;
    }

    /**
     * Gets the value of the siteConstructibleType property.
     * 
     * @return
     *     possible object is
     *     {@link SiteConstructibleType }
     *     
     */
    public SiteConstructibleType getSiteConstructibleType() {
        return siteConstructibleType;
    }

    /**
     * Sets the value of the siteConstructibleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteConstructibleType }
     *     
     */
    public void setSiteConstructibleType(SiteConstructibleType value) {
        this.siteConstructibleType = value;
    }

    /**
     * Gets the value of the grz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getGrz() {
        return grz;
    }

    /**
     * Sets the value of the grz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrz(BigDecimal value) {
        this.grz = value;
    }

    /**
     * Gets the value of the gfz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getGfz() {
        return gfz;
    }

    /**
     * Sets the value of the gfz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGfz(BigDecimal value) {
        this.gfz = value;
    }

    /**
     * Gets the value of the leaseInterval property.
     * 
     * @return
     *     possible object is
     *     {@link LeaseIntervalType }
     *     
     */
    public LeaseIntervalType getLeaseInterval() {
        return leaseInterval;
    }

    /**
     * Sets the value of the leaseInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaseIntervalType }
     *     
     */
    public void setLeaseInterval(LeaseIntervalType value) {
        this.leaseInterval = value;
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
            CommercializationType theCommercializationType;
            theCommercializationType = this.getCommercializationType();
            strategy.appendField(locator, this, "commercializationType", buffer, theCommercializationType);
        }
        {
            SiteRecommendedUseForTradeTypes theRecommendedUseTypes;
            theRecommendedUseTypes = this.getRecommendedUseTypes();
            strategy.appendField(locator, this, "recommendedUseTypes", buffer, theRecommendedUseTypes);
        }
        {
            UtilizationTradeSite theUtilizationTradeSite;
            theUtilizationTradeSite = this.getUtilizationTradeSite();
            strategy.appendField(locator, this, "utilizationTradeSite", buffer, theUtilizationTradeSite);
        }
        {
            Long theTenancy;
            theTenancy = this.getTenancy();
            strategy.appendField(locator, this, "tenancy", buffer, theTenancy);
        }
        {
            Price thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice);
        }
        {
            BigDecimal thePlotArea;
            thePlotArea = this.getPlotArea();
            strategy.appendField(locator, this, "plotArea", buffer, thePlotArea);
        }
        {
            BigDecimal theMinDivisible;
            theMinDivisible = this.getMinDivisible();
            strategy.appendField(locator, this, "minDivisible", buffer, theMinDivisible);
        }
        {
            CourtageInfo theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage);
        }
        {
            String theFreeFrom;
            theFreeFrom = this.getFreeFrom();
            strategy.appendField(locator, this, "freeFrom", buffer, theFreeFrom);
        }
        {
            Boolean theShortTermConstructible;
            theShortTermConstructible = this.isShortTermConstructible();
            strategy.appendField(locator, this, "shortTermConstructible", buffer, theShortTermConstructible);
        }
        {
            Boolean theBuildingPermission;
            theBuildingPermission = this.isBuildingPermission();
            strategy.appendField(locator, this, "buildingPermission", buffer, theBuildingPermission);
        }
        {
            Boolean theDemolition;
            theDemolition = this.isDemolition();
            strategy.appendField(locator, this, "demolition", buffer, theDemolition);
        }
        {
            SiteDevelopmentType theSiteDevelopmentType;
            theSiteDevelopmentType = this.getSiteDevelopmentType();
            strategy.appendField(locator, this, "siteDevelopmentType", buffer, theSiteDevelopmentType);
        }
        {
            SiteConstructibleType theSiteConstructibleType;
            theSiteConstructibleType = this.getSiteConstructibleType();
            strategy.appendField(locator, this, "siteConstructibleType", buffer, theSiteConstructibleType);
        }
        {
            BigDecimal theGrz;
            theGrz = this.getGrz();
            strategy.appendField(locator, this, "grz", buffer, theGrz);
        }
        {
            BigDecimal theGfz;
            theGfz = this.getGfz();
            strategy.appendField(locator, this, "gfz", buffer, theGfz);
        }
        {
            LeaseIntervalType theLeaseInterval;
            theLeaseInterval = this.getLeaseInterval();
            strategy.appendField(locator, this, "leaseInterval", buffer, theLeaseInterval);
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
        if (draftCopy instanceof TradeSite) {
            final TradeSite copy = ((TradeSite) draftCopy);
            if (this.commercializationType!= null) {
                CommercializationType sourceCommercializationType;
                sourceCommercializationType = this.getCommercializationType();
                CommercializationType copyCommercializationType = ((CommercializationType) strategy.copy(LocatorUtils.property(locator, "commercializationType", sourceCommercializationType), sourceCommercializationType));
                copy.setCommercializationType(copyCommercializationType);
            } else {
                copy.commercializationType = null;
            }
            if (this.recommendedUseTypes!= null) {
                SiteRecommendedUseForTradeTypes sourceRecommendedUseTypes;
                sourceRecommendedUseTypes = this.getRecommendedUseTypes();
                SiteRecommendedUseForTradeTypes copyRecommendedUseTypes = ((SiteRecommendedUseForTradeTypes) strategy.copy(LocatorUtils.property(locator, "recommendedUseTypes", sourceRecommendedUseTypes), sourceRecommendedUseTypes));
                copy.setRecommendedUseTypes(copyRecommendedUseTypes);
            } else {
                copy.recommendedUseTypes = null;
            }
            if (this.utilizationTradeSite!= null) {
                UtilizationTradeSite sourceUtilizationTradeSite;
                sourceUtilizationTradeSite = this.getUtilizationTradeSite();
                UtilizationTradeSite copyUtilizationTradeSite = ((UtilizationTradeSite) strategy.copy(LocatorUtils.property(locator, "utilizationTradeSite", sourceUtilizationTradeSite), sourceUtilizationTradeSite));
                copy.setUtilizationTradeSite(copyUtilizationTradeSite);
            } else {
                copy.utilizationTradeSite = null;
            }
            if (this.tenancy!= null) {
                Long sourceTenancy;
                sourceTenancy = this.getTenancy();
                Long copyTenancy = ((Long) strategy.copy(LocatorUtils.property(locator, "tenancy", sourceTenancy), sourceTenancy));
                copy.setTenancy(copyTenancy);
            } else {
                copy.tenancy = null;
            }
            if (this.price!= null) {
                Price sourcePrice;
                sourcePrice = this.getPrice();
                Price copyPrice = ((Price) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice));
                copy.setPrice(copyPrice);
            } else {
                copy.price = null;
            }
            if (this.plotArea!= null) {
                BigDecimal sourcePlotArea;
                sourcePlotArea = this.getPlotArea();
                BigDecimal copyPlotArea = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "plotArea", sourcePlotArea), sourcePlotArea));
                copy.setPlotArea(copyPlotArea);
            } else {
                copy.plotArea = null;
            }
            if (this.minDivisible!= null) {
                BigDecimal sourceMinDivisible;
                sourceMinDivisible = this.getMinDivisible();
                BigDecimal copyMinDivisible = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "minDivisible", sourceMinDivisible), sourceMinDivisible));
                copy.setMinDivisible(copyMinDivisible);
            } else {
                copy.minDivisible = null;
            }
            if (this.courtage!= null) {
                CourtageInfo sourceCourtage;
                sourceCourtage = this.getCourtage();
                CourtageInfo copyCourtage = ((CourtageInfo) strategy.copy(LocatorUtils.property(locator, "courtage", sourceCourtage), sourceCourtage));
                copy.setCourtage(copyCourtage);
            } else {
                copy.courtage = null;
            }
            if (this.freeFrom!= null) {
                String sourceFreeFrom;
                sourceFreeFrom = this.getFreeFrom();
                String copyFreeFrom = ((String) strategy.copy(LocatorUtils.property(locator, "freeFrom", sourceFreeFrom), sourceFreeFrom));
                copy.setFreeFrom(copyFreeFrom);
            } else {
                copy.freeFrom = null;
            }
            if (this.shortTermConstructible!= null) {
                Boolean sourceShortTermConstructible;
                sourceShortTermConstructible = this.isShortTermConstructible();
                Boolean copyShortTermConstructible = ((Boolean) strategy.copy(LocatorUtils.property(locator, "shortTermConstructible", sourceShortTermConstructible), sourceShortTermConstructible));
                copy.setShortTermConstructible(copyShortTermConstructible);
            } else {
                copy.shortTermConstructible = null;
            }
            if (this.buildingPermission!= null) {
                Boolean sourceBuildingPermission;
                sourceBuildingPermission = this.isBuildingPermission();
                Boolean copyBuildingPermission = ((Boolean) strategy.copy(LocatorUtils.property(locator, "buildingPermission", sourceBuildingPermission), sourceBuildingPermission));
                copy.setBuildingPermission(copyBuildingPermission);
            } else {
                copy.buildingPermission = null;
            }
            if (this.demolition!= null) {
                Boolean sourceDemolition;
                sourceDemolition = this.isDemolition();
                Boolean copyDemolition = ((Boolean) strategy.copy(LocatorUtils.property(locator, "demolition", sourceDemolition), sourceDemolition));
                copy.setDemolition(copyDemolition);
            } else {
                copy.demolition = null;
            }
            if (this.siteDevelopmentType!= null) {
                SiteDevelopmentType sourceSiteDevelopmentType;
                sourceSiteDevelopmentType = this.getSiteDevelopmentType();
                SiteDevelopmentType copySiteDevelopmentType = ((SiteDevelopmentType) strategy.copy(LocatorUtils.property(locator, "siteDevelopmentType", sourceSiteDevelopmentType), sourceSiteDevelopmentType));
                copy.setSiteDevelopmentType(copySiteDevelopmentType);
            } else {
                copy.siteDevelopmentType = null;
            }
            if (this.siteConstructibleType!= null) {
                SiteConstructibleType sourceSiteConstructibleType;
                sourceSiteConstructibleType = this.getSiteConstructibleType();
                SiteConstructibleType copySiteConstructibleType = ((SiteConstructibleType) strategy.copy(LocatorUtils.property(locator, "siteConstructibleType", sourceSiteConstructibleType), sourceSiteConstructibleType));
                copy.setSiteConstructibleType(copySiteConstructibleType);
            } else {
                copy.siteConstructibleType = null;
            }
            if (this.grz!= null) {
                BigDecimal sourceGrz;
                sourceGrz = this.getGrz();
                BigDecimal copyGrz = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "grz", sourceGrz), sourceGrz));
                copy.setGrz(copyGrz);
            } else {
                copy.grz = null;
            }
            if (this.gfz!= null) {
                BigDecimal sourceGfz;
                sourceGfz = this.getGfz();
                BigDecimal copyGfz = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "gfz", sourceGfz), sourceGfz));
                copy.setGfz(copyGfz);
            } else {
                copy.gfz = null;
            }
            if (this.leaseInterval!= null) {
                LeaseIntervalType sourceLeaseInterval;
                sourceLeaseInterval = this.getLeaseInterval();
                LeaseIntervalType copyLeaseInterval = ((LeaseIntervalType) strategy.copy(LocatorUtils.property(locator, "leaseInterval", sourceLeaseInterval), sourceLeaseInterval));
                copy.setLeaseInterval(copyLeaseInterval);
            } else {
                copy.leaseInterval = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TradeSite();
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
        final TradeSite that = ((TradeSite) object);
        {
            CommercializationType lhsCommercializationType;
            lhsCommercializationType = this.getCommercializationType();
            CommercializationType rhsCommercializationType;
            rhsCommercializationType = that.getCommercializationType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commercializationType", lhsCommercializationType), LocatorUtils.property(thatLocator, "commercializationType", rhsCommercializationType), lhsCommercializationType, rhsCommercializationType)) {
                return false;
            }
        }
        {
            SiteRecommendedUseForTradeTypes lhsRecommendedUseTypes;
            lhsRecommendedUseTypes = this.getRecommendedUseTypes();
            SiteRecommendedUseForTradeTypes rhsRecommendedUseTypes;
            rhsRecommendedUseTypes = that.getRecommendedUseTypes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recommendedUseTypes", lhsRecommendedUseTypes), LocatorUtils.property(thatLocator, "recommendedUseTypes", rhsRecommendedUseTypes), lhsRecommendedUseTypes, rhsRecommendedUseTypes)) {
                return false;
            }
        }
        {
            UtilizationTradeSite lhsUtilizationTradeSite;
            lhsUtilizationTradeSite = this.getUtilizationTradeSite();
            UtilizationTradeSite rhsUtilizationTradeSite;
            rhsUtilizationTradeSite = that.getUtilizationTradeSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "utilizationTradeSite", lhsUtilizationTradeSite), LocatorUtils.property(thatLocator, "utilizationTradeSite", rhsUtilizationTradeSite), lhsUtilizationTradeSite, rhsUtilizationTradeSite)) {
                return false;
            }
        }
        {
            Long lhsTenancy;
            lhsTenancy = this.getTenancy();
            Long rhsTenancy;
            rhsTenancy = that.getTenancy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenancy", lhsTenancy), LocatorUtils.property(thatLocator, "tenancy", rhsTenancy), lhsTenancy, rhsTenancy)) {
                return false;
            }
        }
        {
            Price lhsPrice;
            lhsPrice = this.getPrice();
            Price rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice)) {
                return false;
            }
        }
        {
            BigDecimal lhsPlotArea;
            lhsPlotArea = this.getPlotArea();
            BigDecimal rhsPlotArea;
            rhsPlotArea = that.getPlotArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plotArea", lhsPlotArea), LocatorUtils.property(thatLocator, "plotArea", rhsPlotArea), lhsPlotArea, rhsPlotArea)) {
                return false;
            }
        }
        {
            BigDecimal lhsMinDivisible;
            lhsMinDivisible = this.getMinDivisible();
            BigDecimal rhsMinDivisible;
            rhsMinDivisible = that.getMinDivisible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minDivisible", lhsMinDivisible), LocatorUtils.property(thatLocator, "minDivisible", rhsMinDivisible), lhsMinDivisible, rhsMinDivisible)) {
                return false;
            }
        }
        {
            CourtageInfo lhsCourtage;
            lhsCourtage = this.getCourtage();
            CourtageInfo rhsCourtage;
            rhsCourtage = that.getCourtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "courtage", lhsCourtage), LocatorUtils.property(thatLocator, "courtage", rhsCourtage), lhsCourtage, rhsCourtage)) {
                return false;
            }
        }
        {
            String lhsFreeFrom;
            lhsFreeFrom = this.getFreeFrom();
            String rhsFreeFrom;
            rhsFreeFrom = that.getFreeFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freeFrom", lhsFreeFrom), LocatorUtils.property(thatLocator, "freeFrom", rhsFreeFrom), lhsFreeFrom, rhsFreeFrom)) {
                return false;
            }
        }
        {
            Boolean lhsShortTermConstructible;
            lhsShortTermConstructible = this.isShortTermConstructible();
            Boolean rhsShortTermConstructible;
            rhsShortTermConstructible = that.isShortTermConstructible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shortTermConstructible", lhsShortTermConstructible), LocatorUtils.property(thatLocator, "shortTermConstructible", rhsShortTermConstructible), lhsShortTermConstructible, rhsShortTermConstructible)) {
                return false;
            }
        }
        {
            Boolean lhsBuildingPermission;
            lhsBuildingPermission = this.isBuildingPermission();
            Boolean rhsBuildingPermission;
            rhsBuildingPermission = that.isBuildingPermission();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingPermission", lhsBuildingPermission), LocatorUtils.property(thatLocator, "buildingPermission", rhsBuildingPermission), lhsBuildingPermission, rhsBuildingPermission)) {
                return false;
            }
        }
        {
            Boolean lhsDemolition;
            lhsDemolition = this.isDemolition();
            Boolean rhsDemolition;
            rhsDemolition = that.isDemolition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "demolition", lhsDemolition), LocatorUtils.property(thatLocator, "demolition", rhsDemolition), lhsDemolition, rhsDemolition)) {
                return false;
            }
        }
        {
            SiteDevelopmentType lhsSiteDevelopmentType;
            lhsSiteDevelopmentType = this.getSiteDevelopmentType();
            SiteDevelopmentType rhsSiteDevelopmentType;
            rhsSiteDevelopmentType = that.getSiteDevelopmentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "siteDevelopmentType", lhsSiteDevelopmentType), LocatorUtils.property(thatLocator, "siteDevelopmentType", rhsSiteDevelopmentType), lhsSiteDevelopmentType, rhsSiteDevelopmentType)) {
                return false;
            }
        }
        {
            SiteConstructibleType lhsSiteConstructibleType;
            lhsSiteConstructibleType = this.getSiteConstructibleType();
            SiteConstructibleType rhsSiteConstructibleType;
            rhsSiteConstructibleType = that.getSiteConstructibleType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "siteConstructibleType", lhsSiteConstructibleType), LocatorUtils.property(thatLocator, "siteConstructibleType", rhsSiteConstructibleType), lhsSiteConstructibleType, rhsSiteConstructibleType)) {
                return false;
            }
        }
        {
            BigDecimal lhsGrz;
            lhsGrz = this.getGrz();
            BigDecimal rhsGrz;
            rhsGrz = that.getGrz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grz", lhsGrz), LocatorUtils.property(thatLocator, "grz", rhsGrz), lhsGrz, rhsGrz)) {
                return false;
            }
        }
        {
            BigDecimal lhsGfz;
            lhsGfz = this.getGfz();
            BigDecimal rhsGfz;
            rhsGfz = that.getGfz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gfz", lhsGfz), LocatorUtils.property(thatLocator, "gfz", rhsGfz), lhsGfz, rhsGfz)) {
                return false;
            }
        }
        {
            LeaseIntervalType lhsLeaseInterval;
            lhsLeaseInterval = this.getLeaseInterval();
            LeaseIntervalType rhsLeaseInterval;
            rhsLeaseInterval = that.getLeaseInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leaseInterval", lhsLeaseInterval), LocatorUtils.property(thatLocator, "leaseInterval", rhsLeaseInterval), lhsLeaseInterval, rhsLeaseInterval)) {
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
