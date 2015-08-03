
package org.openestate.is24.restapi.xml.bookingoverview;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="productBooking" type="{ttp://rest.immobilienscout24.de/schema/offer/productbookingoverview/1.0}productBooking"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "productBooking"
})
@XmlRootElement(name = "productBookingOverview")
public class ProductBookingOverview
    implements Cloneable, CopyTo, Equals, ToString
{

    protected List<ProductBooking> productBooking;

    /**
     * Gets the value of the productBooking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productBooking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductBooking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductBooking }
     * 
     * 
     */
    public List<ProductBooking> getProductBooking() {
        if (productBooking == null) {
            productBooking = new ArrayList<ProductBooking>();
        }
        return this.productBooking;
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
            List<ProductBooking> theProductBooking;
            theProductBooking = (((this.productBooking!= null)&&(!this.productBooking.isEmpty()))?this.getProductBooking():null);
            strategy.appendField(locator, this, "productBooking", buffer, theProductBooking);
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
        if (draftCopy instanceof ProductBookingOverview) {
            final ProductBookingOverview copy = ((ProductBookingOverview) draftCopy);
            if ((this.productBooking!= null)&&(!this.productBooking.isEmpty())) {
                List<ProductBooking> sourceProductBooking;
                sourceProductBooking = (((this.productBooking!= null)&&(!this.productBooking.isEmpty()))?this.getProductBooking():null);
                @SuppressWarnings("unchecked")
                List<ProductBooking> copyProductBooking = ((List<ProductBooking> ) strategy.copy(LocatorUtils.property(locator, "productBooking", sourceProductBooking), sourceProductBooking));
                copy.productBooking = null;
                if (copyProductBooking!= null) {
                    List<ProductBooking> uniqueProductBookingl = copy.getProductBooking();
                    uniqueProductBookingl.addAll(copyProductBooking);
                }
            } else {
                copy.productBooking = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ProductBookingOverview();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ProductBookingOverview)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ProductBookingOverview that = ((ProductBookingOverview) object);
        {
            List<ProductBooking> lhsProductBooking;
            lhsProductBooking = (((this.productBooking!= null)&&(!this.productBooking.isEmpty()))?this.getProductBooking():null);
            List<ProductBooking> rhsProductBooking;
            rhsProductBooking = (((that.productBooking!= null)&&(!that.productBooking.isEmpty()))?that.getProductBooking():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productBooking", lhsProductBooking), LocatorUtils.property(thatLocator, "productBooking", rhsProductBooking), lhsProductBooking, rhsProductBooking)) {
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
