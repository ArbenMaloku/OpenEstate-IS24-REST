
package org.openestate.is24.restapi.xml.offerlistelement;

import java.math.BigDecimal;
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
import org.openestate.is24.restapi.xml.Adapter1;
import org.openestate.is24.restapi.xml.Adapter3;
import org.openestate.is24.restapi.xml.common.CourtageInfo;
import org.openestate.is24.restapi.xml.common.Price;


/**
 * Elemente f\u00fcr WG-Zimmer.
 * 
 * <p>Java class for OfferFlatShareRoom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferFlatShareRoom"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}OfferRealEstateForList"&gt;
 *       &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}BaseFlatShareRoomGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected Price price;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal roomSize;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getRoomSize() {
        return roomSize;
    }

    /**
     * Sets the value of the roomSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomSize(BigDecimal value) {
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
            Price thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice);
        }
        {
            BigDecimal theRoomSize;
            theRoomSize = this.getRoomSize();
            strategy.appendField(locator, this, "roomSize", buffer, theRoomSize);
        }
        {
            Calendar theStartRentalDate;
            theStartRentalDate = this.getStartRentalDate();
            strategy.appendField(locator, this, "startRentalDate", buffer, theStartRentalDate);
        }
        {
            CourtageInfo theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage);
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
        if (draftCopy instanceof OfferFlatShareRoom) {
            final OfferFlatShareRoom copy = ((OfferFlatShareRoom) draftCopy);
            if (this.price!= null) {
                Price sourcePrice;
                sourcePrice = this.getPrice();
                Price copyPrice = ((Price) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice));
                copy.setPrice(copyPrice);
            } else {
                copy.price = null;
            }
            if (this.roomSize!= null) {
                BigDecimal sourceRoomSize;
                sourceRoomSize = this.getRoomSize();
                BigDecimal copyRoomSize = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "roomSize", sourceRoomSize), sourceRoomSize));
                copy.setRoomSize(copyRoomSize);
            } else {
                copy.roomSize = null;
            }
            if (this.startRentalDate!= null) {
                Calendar sourceStartRentalDate;
                sourceStartRentalDate = this.getStartRentalDate();
                Calendar copyStartRentalDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "startRentalDate", sourceStartRentalDate), sourceStartRentalDate));
                copy.setStartRentalDate(copyStartRentalDate);
            } else {
                copy.startRentalDate = null;
            }
            if (this.courtage!= null) {
                CourtageInfo sourceCourtage;
                sourceCourtage = this.getCourtage();
                CourtageInfo copyCourtage = ((CourtageInfo) strategy.copy(LocatorUtils.property(locator, "courtage", sourceCourtage), sourceCourtage));
                copy.setCourtage(copyCourtage);
            } else {
                copy.courtage = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new OfferFlatShareRoom();
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
        final OfferFlatShareRoom that = ((OfferFlatShareRoom) object);
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
            BigDecimal lhsRoomSize;
            lhsRoomSize = this.getRoomSize();
            BigDecimal rhsRoomSize;
            rhsRoomSize = that.getRoomSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roomSize", lhsRoomSize), LocatorUtils.property(thatLocator, "roomSize", rhsRoomSize), lhsRoomSize, rhsRoomSize)) {
                return false;
            }
        }
        {
            Calendar lhsStartRentalDate;
            lhsStartRentalDate = this.getStartRentalDate();
            Calendar rhsStartRentalDate;
            rhsStartRentalDate = that.getStartRentalDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startRentalDate", lhsStartRentalDate), LocatorUtils.property(thatLocator, "startRentalDate", rhsStartRentalDate), lhsStartRentalDate, rhsStartRentalDate)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
