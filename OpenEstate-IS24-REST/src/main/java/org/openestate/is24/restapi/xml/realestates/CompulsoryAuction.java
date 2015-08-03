
package org.openestate.is24.restapi.xml.realestates;

import java.util.Calendar;
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
import org.openestate.is24.restapi.xml.Adapter2;
import org.openestate.is24.restapi.xml.common.BuildingEnergyRatingType;
import org.openestate.is24.restapi.xml.common.CompulsoryAuctionType;
import org.openestate.is24.restapi.xml.common.CountyCourt;
import org.openestate.is24.restapi.xml.common.EnergyPerformanceCertificate;
import org.openestate.is24.restapi.xml.common.EnergySourcesEnev2014;
import org.openestate.is24.restapi.xml.common.HeatingTypeEnev2014;
import org.openestate.is24.restapi.xml.common.Price;
import org.openestate.is24.restapi.xml.common.YesNotApplicableType;


/**
 * Eigenschaften f\u00fcr den Immobilientyp "Zwangsversteigerungsobjekte"
 * 
 * <p>Java class for CompulsoryAuction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompulsoryAuction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedCompulsoryAuctionGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompulsoryAuction", propOrder = {
    "marketValue",
    "lowestBid",
    "recurrenceAppointment",
    "dateOfAuction",
    "lastChangeDate",
    "cancellationDate",
    "recordationDate",
    "area",
    "auctionObjectType",
    "countyCourt",
    "fileReferenceAtCountyCourt",
    "numberOfFolio",
    "splittingAuction",
    "owner",
    "energyCertificate",
    "heatingTypeEnev2014",
    "energySourcesEnev2014",
    "buildingEnergyRatingType",
    "thermalCharacteristic",
    "energyConsumptionContainsWarmWater",
    "constructionYear",
    "constructionYearUnknown"
})
public class CompulsoryAuction
    extends RealEstate
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected Price marketValue;
    protected Price lowestBid;
    @XmlElement(defaultValue = "false")
    protected Boolean recurrenceAppointment;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar dateOfAuction;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar lastChangeDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar cancellationDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar recordationDate;
    protected double area;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CompulsoryAuctionType auctionObjectType;
    protected CountyCourt countyCourt;
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected String fileReferenceAtCountyCourt;
    @XmlJavaTypeAdapter(Adapter5 .class)
    protected String numberOfFolio;
    @XmlElement(defaultValue = "false")
    protected Boolean splittingAuction;
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected String owner;
    protected EnergyPerformanceCertificate energyCertificate;
    @XmlSchemaType(name = "string")
    protected HeatingTypeEnev2014 heatingTypeEnev2014;
    protected EnergySourcesEnev2014 energySourcesEnev2014;
    @XmlSchemaType(name = "string")
    protected BuildingEnergyRatingType buildingEnergyRatingType;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected Double thermalCharacteristic;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType energyConsumptionContainsWarmWater;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter8 .class)
    protected Integer constructionYear;
    protected Boolean constructionYearUnknown;

    /**
     * Gets the value of the marketValue property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getMarketValue() {
        return marketValue;
    }

    /**
     * Sets the value of the marketValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setMarketValue(Price value) {
        this.marketValue = value;
    }

    /**
     * Gets the value of the lowestBid property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getLowestBid() {
        return lowestBid;
    }

    /**
     * Sets the value of the lowestBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setLowestBid(Price value) {
        this.lowestBid = value;
    }

    /**
     * Gets the value of the recurrenceAppointment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecurrenceAppointment() {
        return recurrenceAppointment;
    }

    /**
     * Sets the value of the recurrenceAppointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecurrenceAppointment(Boolean value) {
        this.recurrenceAppointment = value;
    }

    /**
     * Gets the value of the dateOfAuction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDateOfAuction() {
        return dateOfAuction;
    }

    /**
     * Sets the value of the dateOfAuction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfAuction(Calendar value) {
        this.dateOfAuction = value;
    }

    /**
     * Gets the value of the lastChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastChangeDate() {
        return lastChangeDate;
    }

    /**
     * Sets the value of the lastChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChangeDate(Calendar value) {
        this.lastChangeDate = value;
    }

    /**
     * Gets the value of the cancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Sets the value of the cancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationDate(Calendar value) {
        this.cancellationDate = value;
    }

    /**
     * Gets the value of the recordationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getRecordationDate() {
        return recordationDate;
    }

    /**
     * Sets the value of the recordationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordationDate(Calendar value) {
        this.recordationDate = value;
    }

    /**
     * Gets the value of the area property.
     * 
     */
    public double getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     */
    public void setArea(double value) {
        this.area = value;
    }

    /**
     * Gets the value of the auctionObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link CompulsoryAuctionType }
     *     
     */
    public CompulsoryAuctionType getAuctionObjectType() {
        return auctionObjectType;
    }

    /**
     * Sets the value of the auctionObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompulsoryAuctionType }
     *     
     */
    public void setAuctionObjectType(CompulsoryAuctionType value) {
        this.auctionObjectType = value;
    }

    /**
     * Gets the value of the countyCourt property.
     * 
     * @return
     *     possible object is
     *     {@link CountyCourt }
     *     
     */
    public CountyCourt getCountyCourt() {
        return countyCourt;
    }

    /**
     * Sets the value of the countyCourt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountyCourt }
     *     
     */
    public void setCountyCourt(CountyCourt value) {
        this.countyCourt = value;
    }

    /**
     * Gets the value of the fileReferenceAtCountyCourt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileReferenceAtCountyCourt() {
        return fileReferenceAtCountyCourt;
    }

    /**
     * Sets the value of the fileReferenceAtCountyCourt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileReferenceAtCountyCourt(String value) {
        this.fileReferenceAtCountyCourt = value;
    }

    /**
     * Gets the value of the numberOfFolio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfFolio() {
        return numberOfFolio;
    }

    /**
     * Sets the value of the numberOfFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfFolio(String value) {
        this.numberOfFolio = value;
    }

    /**
     * Gets the value of the splittingAuction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSplittingAuction() {
        return splittingAuction;
    }

    /**
     * Sets the value of the splittingAuction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSplittingAuction(Boolean value) {
        this.splittingAuction = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the energyCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyPerformanceCertificate }
     *     
     */
    public EnergyPerformanceCertificate getEnergyCertificate() {
        return energyCertificate;
    }

    /**
     * Sets the value of the energyCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyPerformanceCertificate }
     *     
     */
    public void setEnergyCertificate(EnergyPerformanceCertificate value) {
        this.energyCertificate = value;
    }

    /**
     * Gets the value of the heatingTypeEnev2014 property.
     * 
     * @return
     *     possible object is
     *     {@link HeatingTypeEnev2014 }
     *     
     */
    public HeatingTypeEnev2014 getHeatingTypeEnev2014() {
        return heatingTypeEnev2014;
    }

    /**
     * Sets the value of the heatingTypeEnev2014 property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatingTypeEnev2014 }
     *     
     */
    public void setHeatingTypeEnev2014(HeatingTypeEnev2014 value) {
        this.heatingTypeEnev2014 = value;
    }

    /**
     * Gets the value of the energySourcesEnev2014 property.
     * 
     * @return
     *     possible object is
     *     {@link EnergySourcesEnev2014 }
     *     
     */
    public EnergySourcesEnev2014 getEnergySourcesEnev2014() {
        return energySourcesEnev2014;
    }

    /**
     * Sets the value of the energySourcesEnev2014 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergySourcesEnev2014 }
     *     
     */
    public void setEnergySourcesEnev2014(EnergySourcesEnev2014 value) {
        this.energySourcesEnev2014 = value;
    }

    /**
     * Gets the value of the buildingEnergyRatingType property.
     * 
     * @return
     *     possible object is
     *     {@link BuildingEnergyRatingType }
     *     
     */
    public BuildingEnergyRatingType getBuildingEnergyRatingType() {
        return buildingEnergyRatingType;
    }

    /**
     * Sets the value of the buildingEnergyRatingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingEnergyRatingType }
     *     
     */
    public void setBuildingEnergyRatingType(BuildingEnergyRatingType value) {
        this.buildingEnergyRatingType = value;
    }

    /**
     * Gets the value of the thermalCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getThermalCharacteristic() {
        return thermalCharacteristic;
    }

    /**
     * Sets the value of the thermalCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThermalCharacteristic(Double value) {
        this.thermalCharacteristic = value;
    }

    /**
     * Gets the value of the energyConsumptionContainsWarmWater property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getEnergyConsumptionContainsWarmWater() {
        return energyConsumptionContainsWarmWater;
    }

    /**
     * Sets the value of the energyConsumptionContainsWarmWater property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setEnergyConsumptionContainsWarmWater(YesNotApplicableType value) {
        this.energyConsumptionContainsWarmWater = value;
    }

    /**
     * Gets the value of the constructionYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getConstructionYear() {
        return constructionYear;
    }

    /**
     * Sets the value of the constructionYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructionYear(Integer value) {
        this.constructionYear = value;
    }

    /**
     * Gets the value of the constructionYearUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConstructionYearUnknown() {
        return constructionYearUnknown;
    }

    /**
     * Sets the value of the constructionYearUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConstructionYearUnknown(Boolean value) {
        this.constructionYearUnknown = value;
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
            Price theMarketValue;
            theMarketValue = this.getMarketValue();
            strategy.appendField(locator, this, "marketValue", buffer, theMarketValue);
        }
        {
            Price theLowestBid;
            theLowestBid = this.getLowestBid();
            strategy.appendField(locator, this, "lowestBid", buffer, theLowestBid);
        }
        {
            Boolean theRecurrenceAppointment;
            theRecurrenceAppointment = this.isRecurrenceAppointment();
            strategy.appendField(locator, this, "recurrenceAppointment", buffer, theRecurrenceAppointment);
        }
        {
            Calendar theDateOfAuction;
            theDateOfAuction = this.getDateOfAuction();
            strategy.appendField(locator, this, "dateOfAuction", buffer, theDateOfAuction);
        }
        {
            Calendar theLastChangeDate;
            theLastChangeDate = this.getLastChangeDate();
            strategy.appendField(locator, this, "lastChangeDate", buffer, theLastChangeDate);
        }
        {
            Calendar theCancellationDate;
            theCancellationDate = this.getCancellationDate();
            strategy.appendField(locator, this, "cancellationDate", buffer, theCancellationDate);
        }
        {
            Calendar theRecordationDate;
            theRecordationDate = this.getRecordationDate();
            strategy.appendField(locator, this, "recordationDate", buffer, theRecordationDate);
        }
        {
            double theArea;
            theArea = this.getArea();
            strategy.appendField(locator, this, "area", buffer, theArea);
        }
        {
            CompulsoryAuctionType theAuctionObjectType;
            theAuctionObjectType = this.getAuctionObjectType();
            strategy.appendField(locator, this, "auctionObjectType", buffer, theAuctionObjectType);
        }
        {
            CountyCourt theCountyCourt;
            theCountyCourt = this.getCountyCourt();
            strategy.appendField(locator, this, "countyCourt", buffer, theCountyCourt);
        }
        {
            String theFileReferenceAtCountyCourt;
            theFileReferenceAtCountyCourt = this.getFileReferenceAtCountyCourt();
            strategy.appendField(locator, this, "fileReferenceAtCountyCourt", buffer, theFileReferenceAtCountyCourt);
        }
        {
            String theNumberOfFolio;
            theNumberOfFolio = this.getNumberOfFolio();
            strategy.appendField(locator, this, "numberOfFolio", buffer, theNumberOfFolio);
        }
        {
            Boolean theSplittingAuction;
            theSplittingAuction = this.isSplittingAuction();
            strategy.appendField(locator, this, "splittingAuction", buffer, theSplittingAuction);
        }
        {
            String theOwner;
            theOwner = this.getOwner();
            strategy.appendField(locator, this, "owner", buffer, theOwner);
        }
        {
            EnergyPerformanceCertificate theEnergyCertificate;
            theEnergyCertificate = this.getEnergyCertificate();
            strategy.appendField(locator, this, "energyCertificate", buffer, theEnergyCertificate);
        }
        {
            HeatingTypeEnev2014 theHeatingTypeEnev2014;
            theHeatingTypeEnev2014 = this.getHeatingTypeEnev2014();
            strategy.appendField(locator, this, "heatingTypeEnev2014", buffer, theHeatingTypeEnev2014);
        }
        {
            EnergySourcesEnev2014 theEnergySourcesEnev2014;
            theEnergySourcesEnev2014 = this.getEnergySourcesEnev2014();
            strategy.appendField(locator, this, "energySourcesEnev2014", buffer, theEnergySourcesEnev2014);
        }
        {
            BuildingEnergyRatingType theBuildingEnergyRatingType;
            theBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
            strategy.appendField(locator, this, "buildingEnergyRatingType", buffer, theBuildingEnergyRatingType);
        }
        {
            Double theThermalCharacteristic;
            theThermalCharacteristic = this.getThermalCharacteristic();
            strategy.appendField(locator, this, "thermalCharacteristic", buffer, theThermalCharacteristic);
        }
        {
            YesNotApplicableType theEnergyConsumptionContainsWarmWater;
            theEnergyConsumptionContainsWarmWater = this.getEnergyConsumptionContainsWarmWater();
            strategy.appendField(locator, this, "energyConsumptionContainsWarmWater", buffer, theEnergyConsumptionContainsWarmWater);
        }
        {
            Integer theConstructionYear;
            theConstructionYear = this.getConstructionYear();
            strategy.appendField(locator, this, "constructionYear", buffer, theConstructionYear);
        }
        {
            Boolean theConstructionYearUnknown;
            theConstructionYearUnknown = this.isConstructionYearUnknown();
            strategy.appendField(locator, this, "constructionYearUnknown", buffer, theConstructionYearUnknown);
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
        if (draftCopy instanceof CompulsoryAuction) {
            final CompulsoryAuction copy = ((CompulsoryAuction) draftCopy);
            if (this.marketValue!= null) {
                Price sourceMarketValue;
                sourceMarketValue = this.getMarketValue();
                Price copyMarketValue = ((Price) strategy.copy(LocatorUtils.property(locator, "marketValue", sourceMarketValue), sourceMarketValue));
                copy.setMarketValue(copyMarketValue);
            } else {
                copy.marketValue = null;
            }
            if (this.lowestBid!= null) {
                Price sourceLowestBid;
                sourceLowestBid = this.getLowestBid();
                Price copyLowestBid = ((Price) strategy.copy(LocatorUtils.property(locator, "lowestBid", sourceLowestBid), sourceLowestBid));
                copy.setLowestBid(copyLowestBid);
            } else {
                copy.lowestBid = null;
            }
            if (this.recurrenceAppointment!= null) {
                Boolean sourceRecurrenceAppointment;
                sourceRecurrenceAppointment = this.isRecurrenceAppointment();
                Boolean copyRecurrenceAppointment = ((Boolean) strategy.copy(LocatorUtils.property(locator, "recurrenceAppointment", sourceRecurrenceAppointment), sourceRecurrenceAppointment));
                copy.setRecurrenceAppointment(copyRecurrenceAppointment);
            } else {
                copy.recurrenceAppointment = null;
            }
            if (this.dateOfAuction!= null) {
                Calendar sourceDateOfAuction;
                sourceDateOfAuction = this.getDateOfAuction();
                Calendar copyDateOfAuction = ((Calendar) strategy.copy(LocatorUtils.property(locator, "dateOfAuction", sourceDateOfAuction), sourceDateOfAuction));
                copy.setDateOfAuction(copyDateOfAuction);
            } else {
                copy.dateOfAuction = null;
            }
            if (this.lastChangeDate!= null) {
                Calendar sourceLastChangeDate;
                sourceLastChangeDate = this.getLastChangeDate();
                Calendar copyLastChangeDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "lastChangeDate", sourceLastChangeDate), sourceLastChangeDate));
                copy.setLastChangeDate(copyLastChangeDate);
            } else {
                copy.lastChangeDate = null;
            }
            if (this.cancellationDate!= null) {
                Calendar sourceCancellationDate;
                sourceCancellationDate = this.getCancellationDate();
                Calendar copyCancellationDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "cancellationDate", sourceCancellationDate), sourceCancellationDate));
                copy.setCancellationDate(copyCancellationDate);
            } else {
                copy.cancellationDate = null;
            }
            if (this.recordationDate!= null) {
                Calendar sourceRecordationDate;
                sourceRecordationDate = this.getRecordationDate();
                Calendar copyRecordationDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "recordationDate", sourceRecordationDate), sourceRecordationDate));
                copy.setRecordationDate(copyRecordationDate);
            } else {
                copy.recordationDate = null;
            }
            {
                double sourceArea;
                sourceArea = this.getArea();
                double copyArea = strategy.copy(LocatorUtils.property(locator, "area", sourceArea), sourceArea);
                copy.setArea(copyArea);
            }
            if (this.auctionObjectType!= null) {
                CompulsoryAuctionType sourceAuctionObjectType;
                sourceAuctionObjectType = this.getAuctionObjectType();
                CompulsoryAuctionType copyAuctionObjectType = ((CompulsoryAuctionType) strategy.copy(LocatorUtils.property(locator, "auctionObjectType", sourceAuctionObjectType), sourceAuctionObjectType));
                copy.setAuctionObjectType(copyAuctionObjectType);
            } else {
                copy.auctionObjectType = null;
            }
            if (this.countyCourt!= null) {
                CountyCourt sourceCountyCourt;
                sourceCountyCourt = this.getCountyCourt();
                CountyCourt copyCountyCourt = ((CountyCourt) strategy.copy(LocatorUtils.property(locator, "countyCourt", sourceCountyCourt), sourceCountyCourt));
                copy.setCountyCourt(copyCountyCourt);
            } else {
                copy.countyCourt = null;
            }
            if (this.fileReferenceAtCountyCourt!= null) {
                String sourceFileReferenceAtCountyCourt;
                sourceFileReferenceAtCountyCourt = this.getFileReferenceAtCountyCourt();
                String copyFileReferenceAtCountyCourt = ((String) strategy.copy(LocatorUtils.property(locator, "fileReferenceAtCountyCourt", sourceFileReferenceAtCountyCourt), sourceFileReferenceAtCountyCourt));
                copy.setFileReferenceAtCountyCourt(copyFileReferenceAtCountyCourt);
            } else {
                copy.fileReferenceAtCountyCourt = null;
            }
            if (this.numberOfFolio!= null) {
                String sourceNumberOfFolio;
                sourceNumberOfFolio = this.getNumberOfFolio();
                String copyNumberOfFolio = ((String) strategy.copy(LocatorUtils.property(locator, "numberOfFolio", sourceNumberOfFolio), sourceNumberOfFolio));
                copy.setNumberOfFolio(copyNumberOfFolio);
            } else {
                copy.numberOfFolio = null;
            }
            if (this.splittingAuction!= null) {
                Boolean sourceSplittingAuction;
                sourceSplittingAuction = this.isSplittingAuction();
                Boolean copySplittingAuction = ((Boolean) strategy.copy(LocatorUtils.property(locator, "splittingAuction", sourceSplittingAuction), sourceSplittingAuction));
                copy.setSplittingAuction(copySplittingAuction);
            } else {
                copy.splittingAuction = null;
            }
            if (this.owner!= null) {
                String sourceOwner;
                sourceOwner = this.getOwner();
                String copyOwner = ((String) strategy.copy(LocatorUtils.property(locator, "owner", sourceOwner), sourceOwner));
                copy.setOwner(copyOwner);
            } else {
                copy.owner = null;
            }
            if (this.energyCertificate!= null) {
                EnergyPerformanceCertificate sourceEnergyCertificate;
                sourceEnergyCertificate = this.getEnergyCertificate();
                EnergyPerformanceCertificate copyEnergyCertificate = ((EnergyPerformanceCertificate) strategy.copy(LocatorUtils.property(locator, "energyCertificate", sourceEnergyCertificate), sourceEnergyCertificate));
                copy.setEnergyCertificate(copyEnergyCertificate);
            } else {
                copy.energyCertificate = null;
            }
            if (this.heatingTypeEnev2014 != null) {
                HeatingTypeEnev2014 sourceHeatingTypeEnev2014;
                sourceHeatingTypeEnev2014 = this.getHeatingTypeEnev2014();
                HeatingTypeEnev2014 copyHeatingTypeEnev2014 = ((HeatingTypeEnev2014) strategy.copy(LocatorUtils.property(locator, "heatingTypeEnev2014", sourceHeatingTypeEnev2014), sourceHeatingTypeEnev2014));
                copy.setHeatingTypeEnev2014(copyHeatingTypeEnev2014);
            } else {
                copy.heatingTypeEnev2014 = null;
            }
            if (this.energySourcesEnev2014 != null) {
                EnergySourcesEnev2014 sourceEnergySourcesEnev2014;
                sourceEnergySourcesEnev2014 = this.getEnergySourcesEnev2014();
                EnergySourcesEnev2014 copyEnergySourcesEnev2014 = ((EnergySourcesEnev2014) strategy.copy(LocatorUtils.property(locator, "energySourcesEnev2014", sourceEnergySourcesEnev2014), sourceEnergySourcesEnev2014));
                copy.setEnergySourcesEnev2014(copyEnergySourcesEnev2014);
            } else {
                copy.energySourcesEnev2014 = null;
            }
            if (this.buildingEnergyRatingType!= null) {
                BuildingEnergyRatingType sourceBuildingEnergyRatingType;
                sourceBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
                BuildingEnergyRatingType copyBuildingEnergyRatingType = ((BuildingEnergyRatingType) strategy.copy(LocatorUtils.property(locator, "buildingEnergyRatingType", sourceBuildingEnergyRatingType), sourceBuildingEnergyRatingType));
                copy.setBuildingEnergyRatingType(copyBuildingEnergyRatingType);
            } else {
                copy.buildingEnergyRatingType = null;
            }
            if (this.thermalCharacteristic!= null) {
                Double sourceThermalCharacteristic;
                sourceThermalCharacteristic = this.getThermalCharacteristic();
                Double copyThermalCharacteristic = ((Double) strategy.copy(LocatorUtils.property(locator, "thermalCharacteristic", sourceThermalCharacteristic), sourceThermalCharacteristic));
                copy.setThermalCharacteristic(copyThermalCharacteristic);
            } else {
                copy.thermalCharacteristic = null;
            }
            if (this.energyConsumptionContainsWarmWater!= null) {
                YesNotApplicableType sourceEnergyConsumptionContainsWarmWater;
                sourceEnergyConsumptionContainsWarmWater = this.getEnergyConsumptionContainsWarmWater();
                YesNotApplicableType copyEnergyConsumptionContainsWarmWater = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "energyConsumptionContainsWarmWater", sourceEnergyConsumptionContainsWarmWater), sourceEnergyConsumptionContainsWarmWater));
                copy.setEnergyConsumptionContainsWarmWater(copyEnergyConsumptionContainsWarmWater);
            } else {
                copy.energyConsumptionContainsWarmWater = null;
            }
            if (this.constructionYear!= null) {
                Integer sourceConstructionYear;
                sourceConstructionYear = this.getConstructionYear();
                Integer copyConstructionYear = ((Integer) strategy.copy(LocatorUtils.property(locator, "constructionYear", sourceConstructionYear), sourceConstructionYear));
                copy.setConstructionYear(copyConstructionYear);
            } else {
                copy.constructionYear = null;
            }
            if (this.constructionYearUnknown!= null) {
                Boolean sourceConstructionYearUnknown;
                sourceConstructionYearUnknown = this.isConstructionYearUnknown();
                Boolean copyConstructionYearUnknown = ((Boolean) strategy.copy(LocatorUtils.property(locator, "constructionYearUnknown", sourceConstructionYearUnknown), sourceConstructionYearUnknown));
                copy.setConstructionYearUnknown(copyConstructionYearUnknown);
            } else {
                copy.constructionYearUnknown = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CompulsoryAuction();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CompulsoryAuction)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CompulsoryAuction that = ((CompulsoryAuction) object);
        {
            Price lhsMarketValue;
            lhsMarketValue = this.getMarketValue();
            Price rhsMarketValue;
            rhsMarketValue = that.getMarketValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "marketValue", lhsMarketValue), LocatorUtils.property(thatLocator, "marketValue", rhsMarketValue), lhsMarketValue, rhsMarketValue)) {
                return false;
            }
        }
        {
            Price lhsLowestBid;
            lhsLowestBid = this.getLowestBid();
            Price rhsLowestBid;
            rhsLowestBid = that.getLowestBid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lowestBid", lhsLowestBid), LocatorUtils.property(thatLocator, "lowestBid", rhsLowestBid), lhsLowestBid, rhsLowestBid)) {
                return false;
            }
        }
        {
            Boolean lhsRecurrenceAppointment;
            lhsRecurrenceAppointment = this.isRecurrenceAppointment();
            Boolean rhsRecurrenceAppointment;
            rhsRecurrenceAppointment = that.isRecurrenceAppointment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recurrenceAppointment", lhsRecurrenceAppointment), LocatorUtils.property(thatLocator, "recurrenceAppointment", rhsRecurrenceAppointment), lhsRecurrenceAppointment, rhsRecurrenceAppointment)) {
                return false;
            }
        }
        {
            Calendar lhsDateOfAuction;
            lhsDateOfAuction = this.getDateOfAuction();
            Calendar rhsDateOfAuction;
            rhsDateOfAuction = that.getDateOfAuction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateOfAuction", lhsDateOfAuction), LocatorUtils.property(thatLocator, "dateOfAuction", rhsDateOfAuction), lhsDateOfAuction, rhsDateOfAuction)) {
                return false;
            }
        }
        {
            Calendar lhsLastChangeDate;
            lhsLastChangeDate = this.getLastChangeDate();
            Calendar rhsLastChangeDate;
            rhsLastChangeDate = that.getLastChangeDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastChangeDate", lhsLastChangeDate), LocatorUtils.property(thatLocator, "lastChangeDate", rhsLastChangeDate), lhsLastChangeDate, rhsLastChangeDate)) {
                return false;
            }
        }
        {
            Calendar lhsCancellationDate;
            lhsCancellationDate = this.getCancellationDate();
            Calendar rhsCancellationDate;
            rhsCancellationDate = that.getCancellationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cancellationDate", lhsCancellationDate), LocatorUtils.property(thatLocator, "cancellationDate", rhsCancellationDate), lhsCancellationDate, rhsCancellationDate)) {
                return false;
            }
        }
        {
            Calendar lhsRecordationDate;
            lhsRecordationDate = this.getRecordationDate();
            Calendar rhsRecordationDate;
            rhsRecordationDate = that.getRecordationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recordationDate", lhsRecordationDate), LocatorUtils.property(thatLocator, "recordationDate", rhsRecordationDate), lhsRecordationDate, rhsRecordationDate)) {
                return false;
            }
        }
        {
            double lhsArea;
            lhsArea = this.getArea();
            double rhsArea;
            rhsArea = that.getArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "area", lhsArea), LocatorUtils.property(thatLocator, "area", rhsArea), lhsArea, rhsArea)) {
                return false;
            }
        }
        {
            CompulsoryAuctionType lhsAuctionObjectType;
            lhsAuctionObjectType = this.getAuctionObjectType();
            CompulsoryAuctionType rhsAuctionObjectType;
            rhsAuctionObjectType = that.getAuctionObjectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auctionObjectType", lhsAuctionObjectType), LocatorUtils.property(thatLocator, "auctionObjectType", rhsAuctionObjectType), lhsAuctionObjectType, rhsAuctionObjectType)) {
                return false;
            }
        }
        {
            CountyCourt lhsCountyCourt;
            lhsCountyCourt = this.getCountyCourt();
            CountyCourt rhsCountyCourt;
            rhsCountyCourt = that.getCountyCourt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countyCourt", lhsCountyCourt), LocatorUtils.property(thatLocator, "countyCourt", rhsCountyCourt), lhsCountyCourt, rhsCountyCourt)) {
                return false;
            }
        }
        {
            String lhsFileReferenceAtCountyCourt;
            lhsFileReferenceAtCountyCourt = this.getFileReferenceAtCountyCourt();
            String rhsFileReferenceAtCountyCourt;
            rhsFileReferenceAtCountyCourt = that.getFileReferenceAtCountyCourt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileReferenceAtCountyCourt", lhsFileReferenceAtCountyCourt), LocatorUtils.property(thatLocator, "fileReferenceAtCountyCourt", rhsFileReferenceAtCountyCourt), lhsFileReferenceAtCountyCourt, rhsFileReferenceAtCountyCourt)) {
                return false;
            }
        }
        {
            String lhsNumberOfFolio;
            lhsNumberOfFolio = this.getNumberOfFolio();
            String rhsNumberOfFolio;
            rhsNumberOfFolio = that.getNumberOfFolio();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfFolio", lhsNumberOfFolio), LocatorUtils.property(thatLocator, "numberOfFolio", rhsNumberOfFolio), lhsNumberOfFolio, rhsNumberOfFolio)) {
                return false;
            }
        }
        {
            Boolean lhsSplittingAuction;
            lhsSplittingAuction = this.isSplittingAuction();
            Boolean rhsSplittingAuction;
            rhsSplittingAuction = that.isSplittingAuction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "splittingAuction", lhsSplittingAuction), LocatorUtils.property(thatLocator, "splittingAuction", rhsSplittingAuction), lhsSplittingAuction, rhsSplittingAuction)) {
                return false;
            }
        }
        {
            String lhsOwner;
            lhsOwner = this.getOwner();
            String rhsOwner;
            rhsOwner = that.getOwner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "owner", lhsOwner), LocatorUtils.property(thatLocator, "owner", rhsOwner), lhsOwner, rhsOwner)) {
                return false;
            }
        }
        {
            EnergyPerformanceCertificate lhsEnergyCertificate;
            lhsEnergyCertificate = this.getEnergyCertificate();
            EnergyPerformanceCertificate rhsEnergyCertificate;
            rhsEnergyCertificate = that.getEnergyCertificate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyCertificate", lhsEnergyCertificate), LocatorUtils.property(thatLocator, "energyCertificate", rhsEnergyCertificate), lhsEnergyCertificate, rhsEnergyCertificate)) {
                return false;
            }
        }
        {
            HeatingTypeEnev2014 lhsHeatingTypeEnev2014;
            lhsHeatingTypeEnev2014 = this.getHeatingTypeEnev2014();
            HeatingTypeEnev2014 rhsHeatingTypeEnev2014;
            rhsHeatingTypeEnev2014 = that.getHeatingTypeEnev2014();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heatingTypeEnev2014", lhsHeatingTypeEnev2014), LocatorUtils.property(thatLocator, "heatingTypeEnev2014", rhsHeatingTypeEnev2014), lhsHeatingTypeEnev2014, rhsHeatingTypeEnev2014)) {
                return false;
            }
        }
        {
            EnergySourcesEnev2014 lhsEnergySourcesEnev2014;
            lhsEnergySourcesEnev2014 = this.getEnergySourcesEnev2014();
            EnergySourcesEnev2014 rhsEnergySourcesEnev2014;
            rhsEnergySourcesEnev2014 = that.getEnergySourcesEnev2014();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energySourcesEnev2014", lhsEnergySourcesEnev2014), LocatorUtils.property(thatLocator, "energySourcesEnev2014", rhsEnergySourcesEnev2014), lhsEnergySourcesEnev2014, rhsEnergySourcesEnev2014)) {
                return false;
            }
        }
        {
            BuildingEnergyRatingType lhsBuildingEnergyRatingType;
            lhsBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
            BuildingEnergyRatingType rhsBuildingEnergyRatingType;
            rhsBuildingEnergyRatingType = that.getBuildingEnergyRatingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingEnergyRatingType", lhsBuildingEnergyRatingType), LocatorUtils.property(thatLocator, "buildingEnergyRatingType", rhsBuildingEnergyRatingType), lhsBuildingEnergyRatingType, rhsBuildingEnergyRatingType)) {
                return false;
            }
        }
        {
            Double lhsThermalCharacteristic;
            lhsThermalCharacteristic = this.getThermalCharacteristic();
            Double rhsThermalCharacteristic;
            rhsThermalCharacteristic = that.getThermalCharacteristic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thermalCharacteristic", lhsThermalCharacteristic), LocatorUtils.property(thatLocator, "thermalCharacteristic", rhsThermalCharacteristic), lhsThermalCharacteristic, rhsThermalCharacteristic)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsEnergyConsumptionContainsWarmWater;
            lhsEnergyConsumptionContainsWarmWater = this.getEnergyConsumptionContainsWarmWater();
            YesNotApplicableType rhsEnergyConsumptionContainsWarmWater;
            rhsEnergyConsumptionContainsWarmWater = that.getEnergyConsumptionContainsWarmWater();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyConsumptionContainsWarmWater", lhsEnergyConsumptionContainsWarmWater), LocatorUtils.property(thatLocator, "energyConsumptionContainsWarmWater", rhsEnergyConsumptionContainsWarmWater), lhsEnergyConsumptionContainsWarmWater, rhsEnergyConsumptionContainsWarmWater)) {
                return false;
            }
        }
        {
            Integer lhsConstructionYear;
            lhsConstructionYear = this.getConstructionYear();
            Integer rhsConstructionYear;
            rhsConstructionYear = that.getConstructionYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constructionYear", lhsConstructionYear), LocatorUtils.property(thatLocator, "constructionYear", rhsConstructionYear), lhsConstructionYear, rhsConstructionYear)) {
                return false;
            }
        }
        {
            Boolean lhsConstructionYearUnknown;
            lhsConstructionYearUnknown = this.isConstructionYearUnknown();
            Boolean rhsConstructionYearUnknown;
            rhsConstructionYearUnknown = that.isConstructionYearUnknown();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constructionYearUnknown", lhsConstructionYearUnknown), LocatorUtils.property(thatLocator, "constructionYearUnknown", rhsConstructionYearUnknown), lhsConstructionYearUnknown, rhsConstructionYearUnknown)) {
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
