//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.24 at 03:30:52 PM CEST 
//


package org.openestate.is24.restapi.xml.realestates;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openestate.is24.restapi.xml.common.BuildingEnergyRatingType;
import org.openestate.is24.restapi.xml.common.CommercializationType;
import org.openestate.is24.restapi.xml.common.CourtageInfo;
import org.openestate.is24.restapi.xml.common.EnergyPerformanceCertificate;
import org.openestate.is24.restapi.xml.common.EnergySourcesEnev2014;
import org.openestate.is24.restapi.xml.common.FiringTypes;
import org.openestate.is24.restapi.xml.common.FlooringType;
import org.openestate.is24.restapi.xml.common.HeatingType;
import org.openestate.is24.restapi.xml.common.HeatingTypeEnev2014;
import org.openestate.is24.restapi.xml.common.IndustryType;
import org.openestate.is24.restapi.xml.common.InteriorQuality;
import org.openestate.is24.restapi.xml.common.Price;
import org.openestate.is24.restapi.xml.common.RealEstateCondition;
import org.openestate.is24.restapi.xml.common.YesNotApplicableType;


/**
 * Eigenschaften f\u00fcr den Immobilientyp Industrie (Hallen/Produktion)
 * 
 * <p>Java class for Industry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Industry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate">
 *       &lt;sequence>
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedIndustryGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Industry", propOrder = {
    "industryType",
    "areaDivisibleFrom",
    "plotArea",
    "hallHeight",
    "flooringType",
    "ramp",
    "lift",
    "autoLift",
    "goodsLift",
    "goodsLiftLoad",
    "craneRunway",
    "craneRunwayLoad",
    "floorLoad",
    "connectedLoad",
    "deposit",
    "energyCertificate",
    "commercializationType",
    "price",
    "calculatedPrice",
    "totalFloorSpace",
    "netFloorSpace",
    "minDivisible",
    "courtage",
    "distanceToMRS",
    "distanceToFM",
    "distanceToPT",
    "distanceToAirport",
    "condition",
    "numberOfParkingSpaces",
    "parkingSpacePrice",
    "lastRefurbishment",
    "interiorQuality",
    "constructionYear",
    "constructionYearUnknown",
    "freeFrom",
    "heatingType",
    "heatingTypeEnev2014",
    "firingTypes",
    "energySourcesEnev2014",
    "thermalCharacteristic",
    "energyConsumptionContainsWarmWater",
    "buildingEnergyRatingType",
    "additionalArea",
    "numberOfFloors",
    "additionalCosts"
})
public class Industry
    extends RealEstate
{

    @XmlElement(required = true)
    protected IndustryType industryType;
    @Deprecated
    protected Double areaDivisibleFrom;
    protected Double plotArea;
    protected Double hallHeight;
    protected FlooringType flooringType;
    protected YesNotApplicableType ramp;
    protected YesNotApplicableType lift;
    protected YesNotApplicableType autoLift;
    protected YesNotApplicableType goodsLift;
    protected Double goodsLiftLoad;
    protected YesNotApplicableType craneRunway;
    protected Double craneRunwayLoad;
    protected Double floorLoad;
    protected Integer connectedLoad;
    protected String deposit;
    protected EnergyPerformanceCertificate energyCertificate;
    @XmlElement(required = true)
    protected CommercializationType commercializationType;
    @XmlElement(required = true)
    protected Price price;
    protected Price calculatedPrice;
    protected Double totalFloorSpace;
    protected Double netFloorSpace;
    protected Double minDivisible;
    @XmlElement(required = true)
    protected CourtageInfo courtage;
    protected Integer distanceToMRS;
    protected Integer distanceToFM;
    protected Integer distanceToPT;
    protected Integer distanceToAirport;
    protected RealEstateCondition condition;
    protected Integer numberOfParkingSpaces;
    protected Double parkingSpacePrice;
    protected Integer lastRefurbishment;
    protected InteriorQuality interiorQuality;
    protected Integer constructionYear;
    protected Boolean constructionYearUnknown;
    protected String freeFrom;
    @Deprecated
    protected HeatingType heatingType;
    protected HeatingTypeEnev2014 heatingTypeEnev2014;
    @Deprecated
    protected FiringTypes firingTypes;
    protected EnergySourcesEnev2014 energySourcesEnev2014;
    protected Double thermalCharacteristic;
    protected YesNotApplicableType energyConsumptionContainsWarmWater;
    protected BuildingEnergyRatingType buildingEnergyRatingType;
    protected Double additionalArea;
    protected String numberOfFloors;
    protected Price additionalCosts;

    /**
     * Gets the value of the industryType property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryType }
     *     
     */
    public IndustryType getIndustryType() {
        return industryType;
    }

    /**
     * Sets the value of the industryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryType }
     *     
     */
    public void setIndustryType(IndustryType value) {
        this.industryType = value;
    }

    /**
     * Gets the value of the areaDivisibleFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @Deprecated
    public Double getAreaDivisibleFrom() {
        return areaDivisibleFrom;
    }

    /**
     * Sets the value of the areaDivisibleFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    @Deprecated
    public void setAreaDivisibleFrom(Double value) {
        this.areaDivisibleFrom = value;
    }

    /**
     * Gets the value of the plotArea property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPlotArea() {
        return plotArea;
    }

    /**
     * Sets the value of the plotArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPlotArea(Double value) {
        this.plotArea = value;
    }

    /**
     * Gets the value of the hallHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHallHeight() {
        return hallHeight;
    }

    /**
     * Sets the value of the hallHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHallHeight(Double value) {
        this.hallHeight = value;
    }

    /**
     * Gets the value of the flooringType property.
     * 
     * @return
     *     possible object is
     *     {@link FlooringType }
     *     
     */
    public FlooringType getFlooringType() {
        return flooringType;
    }

    /**
     * Sets the value of the flooringType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlooringType }
     *     
     */
    public void setFlooringType(FlooringType value) {
        this.flooringType = value;
    }

    /**
     * Gets the value of the ramp property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getRamp() {
        return ramp;
    }

    /**
     * Sets the value of the ramp property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setRamp(YesNotApplicableType value) {
        this.ramp = value;
    }

    /**
     * Gets the value of the lift property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getLift() {
        return lift;
    }

    /**
     * Sets the value of the lift property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setLift(YesNotApplicableType value) {
        this.lift = value;
    }

    /**
     * Gets the value of the autoLift property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getAutoLift() {
        return autoLift;
    }

    /**
     * Sets the value of the autoLift property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setAutoLift(YesNotApplicableType value) {
        this.autoLift = value;
    }

    /**
     * Gets the value of the goodsLift property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getGoodsLift() {
        return goodsLift;
    }

    /**
     * Sets the value of the goodsLift property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setGoodsLift(YesNotApplicableType value) {
        this.goodsLift = value;
    }

    /**
     * Gets the value of the goodsLiftLoad property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGoodsLiftLoad() {
        return goodsLiftLoad;
    }

    /**
     * Sets the value of the goodsLiftLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGoodsLiftLoad(Double value) {
        this.goodsLiftLoad = value;
    }

    /**
     * Gets the value of the craneRunway property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCraneRunway() {
        return craneRunway;
    }

    /**
     * Sets the value of the craneRunway property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCraneRunway(YesNotApplicableType value) {
        this.craneRunway = value;
    }

    /**
     * Gets the value of the craneRunwayLoad property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCraneRunwayLoad() {
        return craneRunwayLoad;
    }

    /**
     * Sets the value of the craneRunwayLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCraneRunwayLoad(Double value) {
        this.craneRunwayLoad = value;
    }

    /**
     * Gets the value of the floorLoad property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFloorLoad() {
        return floorLoad;
    }

    /**
     * Sets the value of the floorLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFloorLoad(Double value) {
        this.floorLoad = value;
    }

    /**
     * Gets the value of the connectedLoad property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedLoad() {
        return connectedLoad;
    }

    /**
     * Sets the value of the connectedLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedLoad(Integer value) {
        this.connectedLoad = value;
    }

    /**
     * Gets the value of the deposit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeposit() {
        return deposit;
    }

    /**
     * Sets the value of the deposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeposit(String value) {
        this.deposit = value;
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
     * Gets the value of the calculatedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getCalculatedPrice() {
        return calculatedPrice;
    }

    /**
     * Sets the value of the calculatedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setCalculatedPrice(Price value) {
        this.calculatedPrice = value;
    }

    /**
     * Gets the value of the totalFloorSpace property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalFloorSpace() {
        return totalFloorSpace;
    }

    /**
     * Sets the value of the totalFloorSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalFloorSpace(Double value) {
        this.totalFloorSpace = value;
    }

    /**
     * Gets the value of the netFloorSpace property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetFloorSpace() {
        return netFloorSpace;
    }

    /**
     * Sets the value of the netFloorSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetFloorSpace(Double value) {
        this.netFloorSpace = value;
    }

    /**
     * Gets the value of the minDivisible property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinDivisible() {
        return minDivisible;
    }

    /**
     * Sets the value of the minDivisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinDivisible(Double value) {
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
     * Gets the value of the distanceToMRS property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistanceToMRS() {
        return distanceToMRS;
    }

    /**
     * Sets the value of the distanceToMRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistanceToMRS(Integer value) {
        this.distanceToMRS = value;
    }

    /**
     * Gets the value of the distanceToFM property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistanceToFM() {
        return distanceToFM;
    }

    /**
     * Sets the value of the distanceToFM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistanceToFM(Integer value) {
        this.distanceToFM = value;
    }

    /**
     * Gets the value of the distanceToPT property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistanceToPT() {
        return distanceToPT;
    }

    /**
     * Sets the value of the distanceToPT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistanceToPT(Integer value) {
        this.distanceToPT = value;
    }

    /**
     * Gets the value of the distanceToAirport property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistanceToAirport() {
        return distanceToAirport;
    }

    /**
     * Sets the value of the distanceToAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistanceToAirport(Integer value) {
        this.distanceToAirport = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateCondition }
     *     
     */
    public RealEstateCondition getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateCondition }
     *     
     */
    public void setCondition(RealEstateCondition value) {
        this.condition = value;
    }

    /**
     * Gets the value of the numberOfParkingSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfParkingSpaces() {
        return numberOfParkingSpaces;
    }

    /**
     * Sets the value of the numberOfParkingSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfParkingSpaces(Integer value) {
        this.numberOfParkingSpaces = value;
    }

    /**
     * Gets the value of the parkingSpacePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getParkingSpacePrice() {
        return parkingSpacePrice;
    }

    /**
     * Sets the value of the parkingSpacePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setParkingSpacePrice(Double value) {
        this.parkingSpacePrice = value;
    }

    /**
     * Gets the value of the lastRefurbishment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastRefurbishment() {
        return lastRefurbishment;
    }

    /**
     * Sets the value of the lastRefurbishment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastRefurbishment(Integer value) {
        this.lastRefurbishment = value;
    }

    /**
     * Gets the value of the interiorQuality property.
     * 
     * @return
     *     possible object is
     *     {@link InteriorQuality }
     *     
     */
    public InteriorQuality getInteriorQuality() {
        return interiorQuality;
    }

    /**
     * Sets the value of the interiorQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteriorQuality }
     *     
     */
    public void setInteriorQuality(InteriorQuality value) {
        this.interiorQuality = value;
    }

    /**
     * Gets the value of the constructionYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
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
     *     {@link Integer }
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
     * Gets the value of the heatingType property.
     * 
     * @return
     *     possible object is
     *     {@link HeatingType }
     *     
     */
    @Deprecated
    public HeatingType getHeatingType() {
        return heatingType;
    }

    /**
     * Sets the value of the heatingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatingType }
     *     
     */
    @Deprecated
    public void setHeatingType(HeatingType value) {
        this.heatingType = value;
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
     * Gets the value of the firingTypes property.
     * 
     * @return
     *     possible object is
     *     {@link FiringTypes }
     *     
     */
    @Deprecated
    public FiringTypes getFiringTypes() {
        return firingTypes;
    }

    /**
     * Sets the value of the firingTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiringTypes }
     *     
     */
    @Deprecated
    public void setFiringTypes(FiringTypes value) {
        this.firingTypes = value;
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
     * Gets the value of the thermalCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
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
     *     {@link Double }
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
     * Gets the value of the additionalArea property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdditionalArea() {
        return additionalArea;
    }

    /**
     * Sets the value of the additionalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdditionalArea(Double value) {
        this.additionalArea = value;
    }

    /**
     * Gets the value of the numberOfFloors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    /**
     * Sets the value of the numberOfFloors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfFloors(String value) {
        this.numberOfFloors = value;
    }

    /**
     * Gets the value of the additionalCosts property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getAdditionalCosts() {
        return additionalCosts;
    }

    /**
     * Sets the value of the additionalCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setAdditionalCosts(Price value) {
        this.additionalCosts = value;
    }

}
