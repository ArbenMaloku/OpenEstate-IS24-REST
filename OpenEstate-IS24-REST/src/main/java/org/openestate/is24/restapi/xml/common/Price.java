
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * Basistyp f\u00fcr Preise.
 * 
 * <p>Java class for Price complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Price"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="currency" type="{http://rest.immobilienscout24.de/schema/common/1.0}Currency"/&gt;
 *         &lt;element name="marketingType" type="{http://rest.immobilienscout24.de/schema/common/1.0}MarketingType" minOccurs="0"/&gt;
 *         &lt;element name="priceIntervalType" type="{http://rest.immobilienscout24.de/schema/common/1.0}PriceIntervalType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price", propOrder = {
    "value",
    "currency",
    "marketingType",
    "priceIntervalType"
})
@XmlSeeAlso({
    BudgetPrice.class
})
public class Price
    implements Cloneable, CopyTo, Equals, ToString
{

    protected double value;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Currency currency;
    @XmlSchemaType(name = "string")
    protected MarketingType marketingType;
    @XmlSchemaType(name = "string")
    protected PriceIntervalType priceIntervalType;

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
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
     * Gets the value of the priceIntervalType property.
     * 
     * @return
     *     possible object is
     *     {@link PriceIntervalType }
     *     
     */
    public PriceIntervalType getPriceIntervalType() {
        return priceIntervalType;
    }

    /**
     * Sets the value of the priceIntervalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceIntervalType }
     *     
     */
    public void setPriceIntervalType(PriceIntervalType value) {
        this.priceIntervalType = value;
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
            double theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            Currency theCurrency;
            theCurrency = this.getCurrency();
            strategy.appendField(locator, this, "currency", buffer, theCurrency);
        }
        {
            MarketingType theMarketingType;
            theMarketingType = this.getMarketingType();
            strategy.appendField(locator, this, "marketingType", buffer, theMarketingType);
        }
        {
            PriceIntervalType thePriceIntervalType;
            thePriceIntervalType = this.getPriceIntervalType();
            strategy.appendField(locator, this, "priceIntervalType", buffer, thePriceIntervalType);
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
        if (draftCopy instanceof Price) {
            final Price copy = ((Price) draftCopy);
            {
                double sourceValue;
                sourceValue = this.getValue();
                double copyValue = strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue);
                copy.setValue(copyValue);
            }
            if (this.currency!= null) {
                Currency sourceCurrency;
                sourceCurrency = this.getCurrency();
                Currency copyCurrency = ((Currency) strategy.copy(LocatorUtils.property(locator, "currency", sourceCurrency), sourceCurrency));
                copy.setCurrency(copyCurrency);
            } else {
                copy.currency = null;
            }
            if (this.marketingType!= null) {
                MarketingType sourceMarketingType;
                sourceMarketingType = this.getMarketingType();
                MarketingType copyMarketingType = ((MarketingType) strategy.copy(LocatorUtils.property(locator, "marketingType", sourceMarketingType), sourceMarketingType));
                copy.setMarketingType(copyMarketingType);
            } else {
                copy.marketingType = null;
            }
            if (this.priceIntervalType!= null) {
                PriceIntervalType sourcePriceIntervalType;
                sourcePriceIntervalType = this.getPriceIntervalType();
                PriceIntervalType copyPriceIntervalType = ((PriceIntervalType) strategy.copy(LocatorUtils.property(locator, "priceIntervalType", sourcePriceIntervalType), sourcePriceIntervalType));
                copy.setPriceIntervalType(copyPriceIntervalType);
            } else {
                copy.priceIntervalType = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Price();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Price)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Price that = ((Price) object);
        {
            double lhsValue;
            lhsValue = this.getValue();
            double rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            Currency lhsCurrency;
            lhsCurrency = this.getCurrency();
            Currency rhsCurrency;
            rhsCurrency = that.getCurrency();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currency", lhsCurrency), LocatorUtils.property(thatLocator, "currency", rhsCurrency), lhsCurrency, rhsCurrency)) {
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
            PriceIntervalType lhsPriceIntervalType;
            lhsPriceIntervalType = this.getPriceIntervalType();
            PriceIntervalType rhsPriceIntervalType;
            rhsPriceIntervalType = that.getPriceIntervalType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceIntervalType", lhsPriceIntervalType), LocatorUtils.property(thatLocator, "priceIntervalType", rhsPriceIntervalType), lhsPriceIntervalType, rhsPriceIntervalType)) {
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
