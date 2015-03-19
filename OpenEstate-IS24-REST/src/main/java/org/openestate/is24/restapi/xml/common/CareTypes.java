
package org.openestate.is24.restapi.xml.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * Pflegeplatztypen
 * 
 * <p>Java class for CareTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CareTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="careType" type="{http://rest.immobilienscout24.de/schema/common/1.0}CareType" maxOccurs="4"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CareTypes", propOrder = {
    "careType"
})
public class CareTypes
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected List<CareType> careType;

    /**
     * Gets the value of the careType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the careType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCareType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CareType }
     * 
     * 
     */
    public List<CareType> getCareType() {
        if (careType == null) {
            careType = new ArrayList<CareType>();
        }
        return this.careType;
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
            List<CareType> theCareType;
            theCareType = (((this.careType!= null)&&(!this.careType.isEmpty()))?this.getCareType():null);
            strategy.appendField(locator, this, "careType", buffer, theCareType);
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
        if (draftCopy instanceof CareTypes) {
            final CareTypes copy = ((CareTypes) draftCopy);
            if ((this.careType!= null)&&(!this.careType.isEmpty())) {
                List<CareType> sourceCareType;
                sourceCareType = (((this.careType!= null)&&(!this.careType.isEmpty()))?this.getCareType():null);
                @SuppressWarnings("unchecked")
                List<CareType> copyCareType = ((List<CareType> ) strategy.copy(LocatorUtils.property(locator, "careType", sourceCareType), sourceCareType));
                copy.careType = null;
                if (copyCareType!= null) {
                    List<CareType> uniqueCareTypel = copy.getCareType();
                    uniqueCareTypel.addAll(copyCareType);
                }
            } else {
                copy.careType = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CareTypes();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CareTypes)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CareTypes that = ((CareTypes) object);
        {
            List<CareType> lhsCareType;
            lhsCareType = (((this.careType!= null)&&(!this.careType.isEmpty()))?this.getCareType():null);
            List<CareType> rhsCareType;
            rhsCareType = (((that.careType!= null)&&(!that.careType.isEmpty()))?that.getCareType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "careType", lhsCareType), LocatorUtils.property(thatLocator, "careType", rhsCareType), lhsCareType, rhsCareType)) {
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
