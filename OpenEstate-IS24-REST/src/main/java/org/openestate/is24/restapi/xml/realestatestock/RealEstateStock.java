
package org.openestate.is24.restapi.xml.realestatestock;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="4">
 *         &lt;element ref="{http://rest.immobilienscout24.de/schema/offer/realestatestock/1.0}priceRegionRealEstateStock"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "priceRegionRealEstateStock"
})
@XmlRootElement(name = "realEstateStock")
public class RealEstateStock
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected List<PriceRegionRealEstateStock> priceRegionRealEstateStock;

    /**
     * Gets the value of the priceRegionRealEstateStock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceRegionRealEstateStock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceRegionRealEstateStock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceRegionRealEstateStock }
     * 
     * 
     */
    public List<PriceRegionRealEstateStock> getPriceRegionRealEstateStock() {
        if (priceRegionRealEstateStock == null) {
            priceRegionRealEstateStock = new ArrayList<PriceRegionRealEstateStock>();
        }
        return this.priceRegionRealEstateStock;
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
            List<PriceRegionRealEstateStock> thePriceRegionRealEstateStock;
            thePriceRegionRealEstateStock = (((this.priceRegionRealEstateStock!= null)&&(!this.priceRegionRealEstateStock.isEmpty()))?this.getPriceRegionRealEstateStock():null);
            strategy.appendField(locator, this, "priceRegionRealEstateStock", buffer, thePriceRegionRealEstateStock);
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
        if (draftCopy instanceof RealEstateStock) {
            final RealEstateStock copy = ((RealEstateStock) draftCopy);
            if ((this.priceRegionRealEstateStock!= null)&&(!this.priceRegionRealEstateStock.isEmpty())) {
                List<PriceRegionRealEstateStock> sourcePriceRegionRealEstateStock;
                sourcePriceRegionRealEstateStock = (((this.priceRegionRealEstateStock!= null)&&(!this.priceRegionRealEstateStock.isEmpty()))?this.getPriceRegionRealEstateStock():null);
                @SuppressWarnings("unchecked")
                List<PriceRegionRealEstateStock> copyPriceRegionRealEstateStock = ((List<PriceRegionRealEstateStock> ) strategy.copy(LocatorUtils.property(locator, "priceRegionRealEstateStock", sourcePriceRegionRealEstateStock), sourcePriceRegionRealEstateStock));
                copy.priceRegionRealEstateStock = null;
                if (copyPriceRegionRealEstateStock!= null) {
                    List<PriceRegionRealEstateStock> uniquePriceRegionRealEstateStockl = copy.getPriceRegionRealEstateStock();
                    uniquePriceRegionRealEstateStockl.addAll(copyPriceRegionRealEstateStock);
                }
            } else {
                copy.priceRegionRealEstateStock = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RealEstateStock();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RealEstateStock)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RealEstateStock that = ((RealEstateStock) object);
        {
            List<PriceRegionRealEstateStock> lhsPriceRegionRealEstateStock;
            lhsPriceRegionRealEstateStock = (((this.priceRegionRealEstateStock!= null)&&(!this.priceRegionRealEstateStock.isEmpty()))?this.getPriceRegionRealEstateStock():null);
            List<PriceRegionRealEstateStock> rhsPriceRegionRealEstateStock;
            rhsPriceRegionRealEstateStock = (((that.priceRegionRealEstateStock!= null)&&(!that.priceRegionRealEstateStock.isEmpty()))?that.getPriceRegionRealEstateStock():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceRegionRealEstateStock", lhsPriceRegionRealEstateStock), LocatorUtils.property(thatLocator, "priceRegionRealEstateStock", rhsPriceRegionRealEstateStock), lhsPriceRegionRealEstateStock, rhsPriceRegionRealEstateStock)) {
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
