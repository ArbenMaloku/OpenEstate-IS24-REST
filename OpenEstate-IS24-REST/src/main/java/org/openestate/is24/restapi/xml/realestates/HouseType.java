//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.03 at 08:04:31 PM CEST 
//


package org.openestate.is24.restapi.xml.realestates;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openestate.is24.restapi.xml.common.CourtageInfo;
import org.openestate.is24.restapi.xml.common.HouseTypeBuildingType;
import org.openestate.is24.restapi.xml.common.HouseTypeConstructionMethodType;
import org.openestate.is24.restapi.xml.common.HouseTypeEnergyStandardType;
import org.openestate.is24.restapi.xml.common.HouseTypeStageOfCompletionType;
import org.openestate.is24.restapi.xml.common.Price;


/**
 * Eigenschaften f\u00fcr den Immobilientyp "Typenh\u00e4user"
 * 
 * <p>Java class for HouseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate">
 *       &lt;sequence>
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedHouseTypeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseType", propOrder = {
    "price",
    "livingSpace",
    "totalArea",
    "baseArea",
    "numberOfRooms",
    "courtage",
    "constructionMethod",
    "buildingType",
    "stageOfCompletionType",
    "energyStandardType",
    "uValue",
    "typeInformationNote",
    "modelInformationNote",
    "contructionPriceInformationNote",
    "floorInformationNote",
    "roofInformationNote"
})
public class HouseType
    extends RealEstate
{

    @XmlElement(required = true)
    protected Price price;
    protected double livingSpace;
    protected Double totalArea;
    protected Double baseArea;
    protected Double numberOfRooms;
    protected CourtageInfo courtage;
    protected HouseTypeConstructionMethodType constructionMethod;
    @XmlElement(required = true)
    protected HouseTypeBuildingType buildingType;
    protected HouseTypeStageOfCompletionType stageOfCompletionType;
    protected HouseTypeEnergyStandardType energyStandardType;
    protected Double uValue;
    protected String typeInformationNote;
    protected String modelInformationNote;
    protected String contructionPriceInformationNote;
    protected String floorInformationNote;
    protected String roofInformationNote;

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
     * Gets the value of the livingSpace property.
     * 
     */
    public double getLivingSpace() {
        return livingSpace;
    }

    /**
     * Sets the value of the livingSpace property.
     * 
     */
    public void setLivingSpace(double value) {
        this.livingSpace = value;
    }

    /**
     * Gets the value of the totalArea property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalArea() {
        return totalArea;
    }

    /**
     * Sets the value of the totalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalArea(Double value) {
        this.totalArea = value;
    }

    /**
     * Gets the value of the baseArea property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseArea() {
        return baseArea;
    }

    /**
     * Sets the value of the baseArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseArea(Double value) {
        this.baseArea = value;
    }

    /**
     * Gets the value of the numberOfRooms property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Sets the value of the numberOfRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumberOfRooms(Double value) {
        this.numberOfRooms = value;
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
     * Gets the value of the constructionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link HouseTypeConstructionMethodType }
     *     
     */
    public HouseTypeConstructionMethodType getConstructionMethod() {
        return constructionMethod;
    }

    /**
     * Sets the value of the constructionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseTypeConstructionMethodType }
     *     
     */
    public void setConstructionMethod(HouseTypeConstructionMethodType value) {
        this.constructionMethod = value;
    }

    /**
     * Gets the value of the buildingType property.
     * 
     * @return
     *     possible object is
     *     {@link HouseTypeBuildingType }
     *     
     */
    public HouseTypeBuildingType getBuildingType() {
        return buildingType;
    }

    /**
     * Sets the value of the buildingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseTypeBuildingType }
     *     
     */
    public void setBuildingType(HouseTypeBuildingType value) {
        this.buildingType = value;
    }

    /**
     * Gets the value of the stageOfCompletionType property.
     * 
     * @return
     *     possible object is
     *     {@link HouseTypeStageOfCompletionType }
     *     
     */
    public HouseTypeStageOfCompletionType getStageOfCompletionType() {
        return stageOfCompletionType;
    }

    /**
     * Sets the value of the stageOfCompletionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseTypeStageOfCompletionType }
     *     
     */
    public void setStageOfCompletionType(HouseTypeStageOfCompletionType value) {
        this.stageOfCompletionType = value;
    }

    /**
     * Gets the value of the energyStandardType property.
     * 
     * @return
     *     possible object is
     *     {@link HouseTypeEnergyStandardType }
     *     
     */
    public HouseTypeEnergyStandardType getEnergyStandardType() {
        return energyStandardType;
    }

    /**
     * Sets the value of the energyStandardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseTypeEnergyStandardType }
     *     
     */
    public void setEnergyStandardType(HouseTypeEnergyStandardType value) {
        this.energyStandardType = value;
    }

    /**
     * Gets the value of the uValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUValue() {
        return uValue;
    }

    /**
     * Sets the value of the uValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUValue(Double value) {
        this.uValue = value;
    }

    /**
     * Gets the value of the typeInformationNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeInformationNote() {
        return typeInformationNote;
    }

    /**
     * Sets the value of the typeInformationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeInformationNote(String value) {
        this.typeInformationNote = value;
    }

    /**
     * Gets the value of the modelInformationNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelInformationNote() {
        return modelInformationNote;
    }

    /**
     * Sets the value of the modelInformationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelInformationNote(String value) {
        this.modelInformationNote = value;
    }

    /**
     * Gets the value of the contructionPriceInformationNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContructionPriceInformationNote() {
        return contructionPriceInformationNote;
    }

    /**
     * Sets the value of the contructionPriceInformationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContructionPriceInformationNote(String value) {
        this.contructionPriceInformationNote = value;
    }

    /**
     * Gets the value of the floorInformationNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorInformationNote() {
        return floorInformationNote;
    }

    /**
     * Sets the value of the floorInformationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorInformationNote(String value) {
        this.floorInformationNote = value;
    }

    /**
     * Gets the value of the roofInformationNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoofInformationNote() {
        return roofInformationNote;
    }

    /**
     * Sets the value of the roofInformationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoofInformationNote(String value) {
        this.roofInformationNote = value;
    }

}
