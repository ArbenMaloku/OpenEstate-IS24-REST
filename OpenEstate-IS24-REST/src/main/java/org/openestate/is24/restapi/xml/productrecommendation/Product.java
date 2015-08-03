
package org.openestate.is24.restapi.xml.productrecommendation;

import java.math.BigDecimal;
import java.math.BigInteger;
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


/**
 * <p>Java class for product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="product"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="articleNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="priceRegion" type="{http://rest.immobilienscout24.de/schema/offer/productrecommondation/1.0}priceRegion"/&gt;
 *         &lt;element name="maxRealEstates" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product", propOrder = {
    "articleNumber",
    "price",
    "priceRegion",
    "maxRealEstates"
})
public class Product
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected String articleNumber;
    @XmlElement(required = true)
    protected BigDecimal price;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PriceRegion priceRegion;
    @XmlElement(required = true)
    protected BigInteger maxRealEstates;

    /**
     * Gets the value of the articleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleNumber() {
        return articleNumber;
    }

    /**
     * Sets the value of the articleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleNumber(String value) {
        this.articleNumber = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the priceRegion property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRegion }
     *     
     */
    public PriceRegion getPriceRegion() {
        return priceRegion;
    }

    /**
     * Sets the value of the priceRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRegion }
     *     
     */
    public void setPriceRegion(PriceRegion value) {
        this.priceRegion = value;
    }

    /**
     * Gets the value of the maxRealEstates property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxRealEstates() {
        return maxRealEstates;
    }

    /**
     * Sets the value of the maxRealEstates property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxRealEstates(BigInteger value) {
        this.maxRealEstates = value;
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
            String theArticleNumber;
            theArticleNumber = this.getArticleNumber();
            strategy.appendField(locator, this, "articleNumber", buffer, theArticleNumber);
        }
        {
            BigDecimal thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice);
        }
        {
            PriceRegion thePriceRegion;
            thePriceRegion = this.getPriceRegion();
            strategy.appendField(locator, this, "priceRegion", buffer, thePriceRegion);
        }
        {
            BigInteger theMaxRealEstates;
            theMaxRealEstates = this.getMaxRealEstates();
            strategy.appendField(locator, this, "maxRealEstates", buffer, theMaxRealEstates);
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
        if (draftCopy instanceof Product) {
            final Product copy = ((Product) draftCopy);
            if (this.articleNumber!= null) {
                String sourceArticleNumber;
                sourceArticleNumber = this.getArticleNumber();
                String copyArticleNumber = ((String) strategy.copy(LocatorUtils.property(locator, "articleNumber", sourceArticleNumber), sourceArticleNumber));
                copy.setArticleNumber(copyArticleNumber);
            } else {
                copy.articleNumber = null;
            }
            if (this.price!= null) {
                BigDecimal sourcePrice;
                sourcePrice = this.getPrice();
                BigDecimal copyPrice = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice));
                copy.setPrice(copyPrice);
            } else {
                copy.price = null;
            }
            if (this.priceRegion!= null) {
                PriceRegion sourcePriceRegion;
                sourcePriceRegion = this.getPriceRegion();
                PriceRegion copyPriceRegion = ((PriceRegion) strategy.copy(LocatorUtils.property(locator, "priceRegion", sourcePriceRegion), sourcePriceRegion));
                copy.setPriceRegion(copyPriceRegion);
            } else {
                copy.priceRegion = null;
            }
            if (this.maxRealEstates!= null) {
                BigInteger sourceMaxRealEstates;
                sourceMaxRealEstates = this.getMaxRealEstates();
                BigInteger copyMaxRealEstates = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "maxRealEstates", sourceMaxRealEstates), sourceMaxRealEstates));
                copy.setMaxRealEstates(copyMaxRealEstates);
            } else {
                copy.maxRealEstates = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Product();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Product)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Product that = ((Product) object);
        {
            String lhsArticleNumber;
            lhsArticleNumber = this.getArticleNumber();
            String rhsArticleNumber;
            rhsArticleNumber = that.getArticleNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "articleNumber", lhsArticleNumber), LocatorUtils.property(thatLocator, "articleNumber", rhsArticleNumber), lhsArticleNumber, rhsArticleNumber)) {
                return false;
            }
        }
        {
            BigDecimal lhsPrice;
            lhsPrice = this.getPrice();
            BigDecimal rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice)) {
                return false;
            }
        }
        {
            PriceRegion lhsPriceRegion;
            lhsPriceRegion = this.getPriceRegion();
            PriceRegion rhsPriceRegion;
            rhsPriceRegion = that.getPriceRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceRegion", lhsPriceRegion), LocatorUtils.property(thatLocator, "priceRegion", rhsPriceRegion), lhsPriceRegion, rhsPriceRegion)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxRealEstates;
            lhsMaxRealEstates = this.getMaxRealEstates();
            BigInteger rhsMaxRealEstates;
            rhsMaxRealEstates = that.getMaxRealEstates();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxRealEstates", lhsMaxRealEstates), LocatorUtils.property(thatLocator, "maxRealEstates", rhsMaxRealEstates), lhsMaxRealEstates, rhsMaxRealEstates)) {
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
