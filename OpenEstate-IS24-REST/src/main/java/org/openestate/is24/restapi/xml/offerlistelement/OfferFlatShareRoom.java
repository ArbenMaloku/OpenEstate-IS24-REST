//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.03 at 08:04:31 PM CEST 
//


package org.openestate.is24.restapi.xml.offerlistelement;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.openestate.is24.restapi.xml.common.CourtageInfo;
import org.openestate.is24.restapi.xml.common.Price;
import org.openestate.is24.restapi.xml.Adapter3;


/**
 * Elemente f\u00fcr WG-Zimmer.
 * 
 * <p>Java class for OfferFlatShareRoom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferFlatShareRoom">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}OfferRealEstateForList">
 *       &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}BaseFlatShareRoomGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferFlatShareRoom", propOrder = {
    "price",
    "roomSize",
    "startRentalDate",
    "courtage"
})
public class OfferFlatShareRoom
    extends OfferRealEstateForList
{

    @XmlElement(required = true)
    protected Price price;
    protected double roomSize;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    protected Calendar startRentalDate;
    @XmlElement(required = true)
    protected CourtageInfo courtage;

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
     * Gets the value of the roomSize property.
     * 
     */
    public double getRoomSize() {
        return roomSize;
    }

    /**
     * Sets the value of the roomSize property.
     * 
     */
    public void setRoomSize(double value) {
        this.roomSize = value;
    }

    /**
     * Gets the value of the startRentalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartRentalDate() {
        return startRentalDate;
    }

    /**
     * Sets the value of the startRentalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartRentalDate(Calendar value) {
        this.startRentalDate = value;
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

}
