
package org.openestate.is24.restapi.xml.common;

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
 *       &lt;sequence&gt;
 *         &lt;element name="realtorContactDetails" type="{http://rest.immobilienscout24.de/schema/common/1.0}RealtorContactDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "realtorContactDetails"
})
@XmlRootElement(name = "realtorContactDetailsList")
public class RealtorContactDetailsList
    implements Cloneable, CopyTo, Equals, ToString
{

    protected List<RealtorContactDetails> realtorContactDetails;

    /**
     * Gets the value of the realtorContactDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realtorContactDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealtorContactDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RealtorContactDetails }
     * 
     * 
     */
    public List<RealtorContactDetails> getRealtorContactDetails() {
        if (realtorContactDetails == null) {
            realtorContactDetails = new ArrayList<RealtorContactDetails>();
        }
        return this.realtorContactDetails;
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
            List<RealtorContactDetails> theRealtorContactDetails;
            theRealtorContactDetails = (((this.realtorContactDetails!= null)&&(!this.realtorContactDetails.isEmpty()))?this.getRealtorContactDetails():null);
            strategy.appendField(locator, this, "realtorContactDetails", buffer, theRealtorContactDetails);
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
        if (draftCopy instanceof RealtorContactDetailsList) {
            final RealtorContactDetailsList copy = ((RealtorContactDetailsList) draftCopy);
            if ((this.realtorContactDetails!= null)&&(!this.realtorContactDetails.isEmpty())) {
                List<RealtorContactDetails> sourceRealtorContactDetails;
                sourceRealtorContactDetails = (((this.realtorContactDetails!= null)&&(!this.realtorContactDetails.isEmpty()))?this.getRealtorContactDetails():null);
                @SuppressWarnings("unchecked")
                List<RealtorContactDetails> copyRealtorContactDetails = ((List<RealtorContactDetails> ) strategy.copy(LocatorUtils.property(locator, "realtorContactDetails", sourceRealtorContactDetails), sourceRealtorContactDetails));
                copy.realtorContactDetails = null;
                if (copyRealtorContactDetails!= null) {
                    List<RealtorContactDetails> uniqueRealtorContactDetailsl = copy.getRealtorContactDetails();
                    uniqueRealtorContactDetailsl.addAll(copyRealtorContactDetails);
                }
            } else {
                copy.realtorContactDetails = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RealtorContactDetailsList();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RealtorContactDetailsList)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RealtorContactDetailsList that = ((RealtorContactDetailsList) object);
        {
            List<RealtorContactDetails> lhsRealtorContactDetails;
            lhsRealtorContactDetails = (((this.realtorContactDetails!= null)&&(!this.realtorContactDetails.isEmpty()))?this.getRealtorContactDetails():null);
            List<RealtorContactDetails> rhsRealtorContactDetails;
            rhsRealtorContactDetails = (((that.realtorContactDetails!= null)&&(!that.realtorContactDetails.isEmpty()))?that.getRealtorContactDetails():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realtorContactDetails", lhsRealtorContactDetails), LocatorUtils.property(thatLocator, "realtorContactDetails", rhsRealtorContactDetails), lhsRealtorContactDetails, rhsRealtorContactDetails)) {
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
