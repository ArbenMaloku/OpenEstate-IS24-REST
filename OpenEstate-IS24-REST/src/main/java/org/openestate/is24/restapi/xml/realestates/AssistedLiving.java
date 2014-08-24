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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.openestate.is24.restapi.xml.common.Adapter1;
import org.openestate.is24.restapi.xml.common.BalconyAvailableType;
import org.openestate.is24.restapi.xml.common.BuildingEnergyRatingType;
import org.openestate.is24.restapi.xml.common.EnergyPerformanceCertificate;
import org.openestate.is24.restapi.xml.common.EnergySourcesEnev2014;
import org.openestate.is24.restapi.xml.common.FacilityType;
import org.openestate.is24.restapi.xml.common.HeatingTypeEnev2014;
import org.openestate.is24.restapi.xml.common.MarketingType;
import org.openestate.is24.restapi.xml.common.PetsAllowedType;
import org.openestate.is24.restapi.xml.common.Price;
import org.openestate.is24.restapi.xml.common.YesNotApplicableType;


/**
 * Eigenschaften f\u00fcr den Immobilientyp "Seniorenwohnen"
 * 
 * <p>Java class for AssistedLiving complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssistedLiving">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate">
 *       &lt;sequence>
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedAssistedLivingGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssistedLiving", propOrder = {
    "shortDescription",
    "petsAllowed",
    "trialLivingPossible",
    "marketingType",
    "facilityType",
    "minBaseRent",
    "minPurchasePrice",
    "constructionYear",
    "constructionYearUnknown",
    "roomAvailableFrom",
    "roomAvailableTo",
    "cookingPossibilty",
    "parkingAvailable",
    "commonRoomsAvailable",
    "gardenAvailable",
    "fitnessAvailable",
    "poolAvailable",
    "publicTransportationAvailable",
    "ambulantNursingServiceAvailable",
    "emergencyCallInRoomAvailable",
    "receptionManned",
    "medicalAssistanceAvailable",
    "homeHelpAvailable",
    "counselingAvailable",
    "loansAvailable",
    "numberOfRoomsFrom",
    "numberOfRoomsTo",
    "energyCertificate",
    "heatingTypeEnev2014",
    "energySourcesEnev2014",
    "buildingEnergyRatingType",
    "thermalCharacteristic",
    "energyConsumptionContainsWarmWater",
    "barrierFree",
    "numberOfLookedAfterApartments",
    "numberOfNursingPlaces",
    "livingSpaceFrom",
    "livingSpaceTo",
    "handicappedAccessible",
    "guestApartmentsAvailable",
    "restaurantAvailable",
    "cookingFacilitiesAvailable",
    "ownFurniturePossible",
    "cleaningServiceAvailable",
    "shoppingFacilitiesAvailable",
    "security24Hours",
    "culturalProgramAvailable",
    "leisureActivitiesAvailable",
    "religiousOfferingsAvailable",
    "balconyAvailable",
    "branchEntry"
})
public class AssistedLiving
    extends RealEstate
{

    protected String shortDescription;
    @XmlElement(required = true)
    protected PetsAllowedType petsAllowed;
    @XmlElement(required = true)
    protected YesNotApplicableType trialLivingPossible;
    @XmlElement(required = true)
    protected MarketingType marketingType;
    @XmlElement(required = true)
    protected FacilityType facilityType;
    protected Price minBaseRent;
    protected Price minPurchasePrice;
    protected Integer constructionYear;
    protected Boolean constructionYearUnknown;
    @Deprecated
    protected Double roomAvailableFrom;
    @Deprecated
    protected Double roomAvailableTo;
    @Deprecated
    protected YesNotApplicableType cookingPossibilty;
    protected YesNotApplicableType parkingAvailable;
    protected YesNotApplicableType commonRoomsAvailable;
    protected YesNotApplicableType gardenAvailable;
    protected YesNotApplicableType fitnessAvailable;
    protected YesNotApplicableType poolAvailable;
    protected YesNotApplicableType publicTransportationAvailable;
    protected YesNotApplicableType ambulantNursingServiceAvailable;
    protected YesNotApplicableType emergencyCallInRoomAvailable;
    protected YesNotApplicableType receptionManned;
    protected YesNotApplicableType medicalAssistanceAvailable;
    protected YesNotApplicableType homeHelpAvailable;
    protected YesNotApplicableType counselingAvailable;
    protected YesNotApplicableType loansAvailable;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Double numberOfRoomsFrom;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Double numberOfRoomsTo;
    protected EnergyPerformanceCertificate energyCertificate;
    protected HeatingTypeEnev2014 heatingTypeEnev2014;
    protected EnergySourcesEnev2014 energySourcesEnev2014;
    protected BuildingEnergyRatingType buildingEnergyRatingType;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter9 .class)
    protected Double thermalCharacteristic;
    protected YesNotApplicableType energyConsumptionContainsWarmWater;
    protected YesNotApplicableType barrierFree;
    protected Integer numberOfLookedAfterApartments;
    protected Integer numberOfNursingPlaces;
    protected Double livingSpaceFrom;
    protected Double livingSpaceTo;
    protected YesNotApplicableType handicappedAccessible;
    protected YesNotApplicableType guestApartmentsAvailable;
    protected YesNotApplicableType restaurantAvailable;
    protected YesNotApplicableType cookingFacilitiesAvailable;
    protected YesNotApplicableType ownFurniturePossible;
    protected YesNotApplicableType cleaningServiceAvailable;
    protected YesNotApplicableType shoppingFacilitiesAvailable;
    protected YesNotApplicableType security24Hours;
    protected YesNotApplicableType culturalProgramAvailable;
    protected YesNotApplicableType leisureActivitiesAvailable;
    protected YesNotApplicableType religiousOfferingsAvailable;
    protected BalconyAvailableType balconyAvailable;
    @XmlElement(defaultValue = "false")
    protected Boolean branchEntry;

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
     * Gets the value of the minBaseRent property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getMinBaseRent() {
        return minBaseRent;
    }

    /**
     * Sets the value of the minBaseRent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setMinBaseRent(Price value) {
        this.minBaseRent = value;
    }

    /**
     * Gets the value of the minPurchasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getMinPurchasePrice() {
        return minPurchasePrice;
    }

    /**
     * Sets the value of the minPurchasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setMinPurchasePrice(Price value) {
        this.minPurchasePrice = value;
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
     * Gets the value of the roomAvailableFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @Deprecated
    public Double getRoomAvailableFrom() {
        return roomAvailableFrom;
    }

    /**
     * Sets the value of the roomAvailableFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    @Deprecated
    public void setRoomAvailableFrom(Double value) {
        this.roomAvailableFrom = value;
    }

    /**
     * Gets the value of the roomAvailableTo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @Deprecated
    public Double getRoomAvailableTo() {
        return roomAvailableTo;
    }

    /**
     * Sets the value of the roomAvailableTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    @Deprecated
    public void setRoomAvailableTo(Double value) {
        this.roomAvailableTo = value;
    }

    /**
     * Gets the value of the cookingPossibilty property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Deprecated
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
    @Deprecated
    public void setCookingPossibilty(YesNotApplicableType value) {
        this.cookingPossibilty = value;
    }

    /**
     * Gets the value of the parkingAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getParkingAvailable() {
        return parkingAvailable;
    }

    /**
     * Sets the value of the parkingAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setParkingAvailable(YesNotApplicableType value) {
        this.parkingAvailable = value;
    }

    /**
     * Gets the value of the commonRoomsAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCommonRoomsAvailable() {
        return commonRoomsAvailable;
    }

    /**
     * Sets the value of the commonRoomsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCommonRoomsAvailable(YesNotApplicableType value) {
        this.commonRoomsAvailable = value;
    }

    /**
     * Gets the value of the gardenAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getGardenAvailable() {
        return gardenAvailable;
    }

    /**
     * Sets the value of the gardenAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setGardenAvailable(YesNotApplicableType value) {
        this.gardenAvailable = value;
    }

    /**
     * Gets the value of the fitnessAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getFitnessAvailable() {
        return fitnessAvailable;
    }

    /**
     * Sets the value of the fitnessAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setFitnessAvailable(YesNotApplicableType value) {
        this.fitnessAvailable = value;
    }

    /**
     * Gets the value of the poolAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getPoolAvailable() {
        return poolAvailable;
    }

    /**
     * Sets the value of the poolAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setPoolAvailable(YesNotApplicableType value) {
        this.poolAvailable = value;
    }

    /**
     * Gets the value of the publicTransportationAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getPublicTransportationAvailable() {
        return publicTransportationAvailable;
    }

    /**
     * Sets the value of the publicTransportationAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setPublicTransportationAvailable(YesNotApplicableType value) {
        this.publicTransportationAvailable = value;
    }

    /**
     * Gets the value of the ambulantNursingServiceAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getAmbulantNursingServiceAvailable() {
        return ambulantNursingServiceAvailable;
    }

    /**
     * Sets the value of the ambulantNursingServiceAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setAmbulantNursingServiceAvailable(YesNotApplicableType value) {
        this.ambulantNursingServiceAvailable = value;
    }

    /**
     * Gets the value of the emergencyCallInRoomAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getEmergencyCallInRoomAvailable() {
        return emergencyCallInRoomAvailable;
    }

    /**
     * Sets the value of the emergencyCallInRoomAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setEmergencyCallInRoomAvailable(YesNotApplicableType value) {
        this.emergencyCallInRoomAvailable = value;
    }

    /**
     * Gets the value of the receptionManned property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getReceptionManned() {
        return receptionManned;
    }

    /**
     * Sets the value of the receptionManned property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setReceptionManned(YesNotApplicableType value) {
        this.receptionManned = value;
    }

    /**
     * Gets the value of the medicalAssistanceAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getMedicalAssistanceAvailable() {
        return medicalAssistanceAvailable;
    }

    /**
     * Sets the value of the medicalAssistanceAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setMedicalAssistanceAvailable(YesNotApplicableType value) {
        this.medicalAssistanceAvailable = value;
    }

    /**
     * Gets the value of the homeHelpAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getHomeHelpAvailable() {
        return homeHelpAvailable;
    }

    /**
     * Sets the value of the homeHelpAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setHomeHelpAvailable(YesNotApplicableType value) {
        this.homeHelpAvailable = value;
    }

    /**
     * Gets the value of the counselingAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCounselingAvailable() {
        return counselingAvailable;
    }

    /**
     * Sets the value of the counselingAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCounselingAvailable(YesNotApplicableType value) {
        this.counselingAvailable = value;
    }

    /**
     * Gets the value of the loansAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getLoansAvailable() {
        return loansAvailable;
    }

    /**
     * Sets the value of the loansAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setLoansAvailable(YesNotApplicableType value) {
        this.loansAvailable = value;
    }

    /**
     * Gets the value of the numberOfRoomsFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getNumberOfRoomsFrom() {
        return numberOfRoomsFrom;
    }

    /**
     * Sets the value of the numberOfRoomsFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfRoomsFrom(Double value) {
        this.numberOfRoomsFrom = value;
    }

    /**
     * Gets the value of the numberOfRoomsTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getNumberOfRoomsTo() {
        return numberOfRoomsTo;
    }

    /**
     * Sets the value of the numberOfRoomsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfRoomsTo(Double value) {
        this.numberOfRoomsTo = value;
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
     * Gets the value of the barrierFree property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getBarrierFree() {
        return barrierFree;
    }

    /**
     * Sets the value of the barrierFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setBarrierFree(YesNotApplicableType value) {
        this.barrierFree = value;
    }

    /**
     * Gets the value of the numberOfLookedAfterApartments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfLookedAfterApartments() {
        return numberOfLookedAfterApartments;
    }

    /**
     * Sets the value of the numberOfLookedAfterApartments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfLookedAfterApartments(Integer value) {
        this.numberOfLookedAfterApartments = value;
    }

    /**
     * Gets the value of the numberOfNursingPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfNursingPlaces() {
        return numberOfNursingPlaces;
    }

    /**
     * Sets the value of the numberOfNursingPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfNursingPlaces(Integer value) {
        this.numberOfNursingPlaces = value;
    }

    /**
     * Gets the value of the livingSpaceFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLivingSpaceFrom() {
        return livingSpaceFrom;
    }

    /**
     * Sets the value of the livingSpaceFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLivingSpaceFrom(Double value) {
        this.livingSpaceFrom = value;
    }

    /**
     * Gets the value of the livingSpaceTo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLivingSpaceTo() {
        return livingSpaceTo;
    }

    /**
     * Sets the value of the livingSpaceTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLivingSpaceTo(Double value) {
        this.livingSpaceTo = value;
    }

    /**
     * Gets the value of the handicappedAccessible property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getHandicappedAccessible() {
        return handicappedAccessible;
    }

    /**
     * Sets the value of the handicappedAccessible property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setHandicappedAccessible(YesNotApplicableType value) {
        this.handicappedAccessible = value;
    }

    /**
     * Gets the value of the guestApartmentsAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getGuestApartmentsAvailable() {
        return guestApartmentsAvailable;
    }

    /**
     * Sets the value of the guestApartmentsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setGuestApartmentsAvailable(YesNotApplicableType value) {
        this.guestApartmentsAvailable = value;
    }

    /**
     * Gets the value of the restaurantAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getRestaurantAvailable() {
        return restaurantAvailable;
    }

    /**
     * Sets the value of the restaurantAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setRestaurantAvailable(YesNotApplicableType value) {
        this.restaurantAvailable = value;
    }

    /**
     * Gets the value of the cookingFacilitiesAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCookingFacilitiesAvailable() {
        return cookingFacilitiesAvailable;
    }

    /**
     * Sets the value of the cookingFacilitiesAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCookingFacilitiesAvailable(YesNotApplicableType value) {
        this.cookingFacilitiesAvailable = value;
    }

    /**
     * Gets the value of the ownFurniturePossible property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getOwnFurniturePossible() {
        return ownFurniturePossible;
    }

    /**
     * Sets the value of the ownFurniturePossible property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setOwnFurniturePossible(YesNotApplicableType value) {
        this.ownFurniturePossible = value;
    }

    /**
     * Gets the value of the cleaningServiceAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCleaningServiceAvailable() {
        return cleaningServiceAvailable;
    }

    /**
     * Sets the value of the cleaningServiceAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCleaningServiceAvailable(YesNotApplicableType value) {
        this.cleaningServiceAvailable = value;
    }

    /**
     * Gets the value of the shoppingFacilitiesAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getShoppingFacilitiesAvailable() {
        return shoppingFacilitiesAvailable;
    }

    /**
     * Sets the value of the shoppingFacilitiesAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setShoppingFacilitiesAvailable(YesNotApplicableType value) {
        this.shoppingFacilitiesAvailable = value;
    }

    /**
     * Gets the value of the security24Hours property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getSecurity24Hours() {
        return security24Hours;
    }

    /**
     * Sets the value of the security24Hours property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setSecurity24Hours(YesNotApplicableType value) {
        this.security24Hours = value;
    }

    /**
     * Gets the value of the culturalProgramAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCulturalProgramAvailable() {
        return culturalProgramAvailable;
    }

    /**
     * Sets the value of the culturalProgramAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCulturalProgramAvailable(YesNotApplicableType value) {
        this.culturalProgramAvailable = value;
    }

    /**
     * Gets the value of the leisureActivitiesAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getLeisureActivitiesAvailable() {
        return leisureActivitiesAvailable;
    }

    /**
     * Sets the value of the leisureActivitiesAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setLeisureActivitiesAvailable(YesNotApplicableType value) {
        this.leisureActivitiesAvailable = value;
    }

    /**
     * Gets the value of the religiousOfferingsAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getReligiousOfferingsAvailable() {
        return religiousOfferingsAvailable;
    }

    /**
     * Sets the value of the religiousOfferingsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setReligiousOfferingsAvailable(YesNotApplicableType value) {
        this.religiousOfferingsAvailable = value;
    }

    /**
     * Gets the value of the balconyAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link BalconyAvailableType }
     *     
     */
    public BalconyAvailableType getBalconyAvailable() {
        return balconyAvailable;
    }

    /**
     * Sets the value of the balconyAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalconyAvailableType }
     *     
     */
    public void setBalconyAvailable(BalconyAvailableType value) {
        this.balconyAvailable = value;
    }

    /**
     * Gets the value of the branchEntry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBranchEntry() {
        return branchEntry;
    }

    /**
     * Sets the value of the branchEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBranchEntry(Boolean value) {
        this.branchEntry = value;
    }

}
