//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.03 at 08:04:31 PM CEST 
//


package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Definiert eine Region mit allen verf\u00fcgbaren Informationen.
 *       
 * 
 * <p>Java class for GeoHierarchyElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoHierarchyElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geoCodeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fullGeoCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statistics" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoHierarchyStatistics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoHierarchyElement", propOrder = {
    "name",
    "geoCodeId",
    "fullGeoCodeId",
    "statistics"
})
@XmlSeeAlso({
    Neighbourhood.class,
    Country.class,
    City.class,
    Continent.class,
    Region.class,
    Quarter.class
})
public class GeoHierarchyElement {

    protected String name;
    protected long geoCodeId;
    protected String fullGeoCodeId;
    protected GeoHierarchyStatistics statistics;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the geoCodeId property.
     * 
     */
    public long getGeoCodeId() {
        return geoCodeId;
    }

    /**
     * Sets the value of the geoCodeId property.
     * 
     */
    public void setGeoCodeId(long value) {
        this.geoCodeId = value;
    }

    /**
     * Gets the value of the fullGeoCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullGeoCodeId() {
        return fullGeoCodeId;
    }

    /**
     * Sets the value of the fullGeoCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullGeoCodeId(String value) {
        this.fullGeoCodeId = value;
    }

    /**
     * Gets the value of the statistics property.
     * 
     * @return
     *     possible object is
     *     {@link GeoHierarchyStatistics }
     *     
     */
    public GeoHierarchyStatistics getStatistics() {
        return statistics;
    }

    /**
     * Sets the value of the statistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoHierarchyStatistics }
     *     
     */
    public void setStatistics(GeoHierarchyStatistics value) {
        this.statistics = value;
    }

}
