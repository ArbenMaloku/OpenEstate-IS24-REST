
package org.openestate.is24.restapi.xml.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * Empfohlene Nutzungsarten eines Gewerbegrundstuecks
 * 
 * <p>Java class for SiteRecommendedUseForTradeTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteRecommendedUseForTradeTypes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="siteRecommendedUseForTradeType" type="{http://rest.immobilienscout24.de/schema/common/1.0}SiteRecommendedUseForTradeType" maxOccurs="22" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteRecommendedUseForTradeTypes", propOrder = {
    "siteRecommendedUseForTradeType"
})
public class SiteRecommendedUseForTradeTypes
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlSchemaType(name = "string")
    protected List<SiteRecommendedUseForTradeType> siteRecommendedUseForTradeType;

    /**
     * Gets the value of the siteRecommendedUseForTradeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siteRecommendedUseForTradeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiteRecommendedUseForTradeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteRecommendedUseForTradeType }
     * 
     * 
     */
    public List<SiteRecommendedUseForTradeType> getSiteRecommendedUseForTradeType() {
        if (siteRecommendedUseForTradeType == null) {
            siteRecommendedUseForTradeType = new ArrayList<SiteRecommendedUseForTradeType>();
        }
        return this.siteRecommendedUseForTradeType;
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
            List<SiteRecommendedUseForTradeType> theSiteRecommendedUseForTradeType;
            theSiteRecommendedUseForTradeType = (((this.siteRecommendedUseForTradeType!= null)&&(!this.siteRecommendedUseForTradeType.isEmpty()))?this.getSiteRecommendedUseForTradeType():null);
            strategy.appendField(locator, this, "siteRecommendedUseForTradeType", buffer, theSiteRecommendedUseForTradeType);
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
        if (draftCopy instanceof SiteRecommendedUseForTradeTypes) {
            final SiteRecommendedUseForTradeTypes copy = ((SiteRecommendedUseForTradeTypes) draftCopy);
            if ((this.siteRecommendedUseForTradeType!= null)&&(!this.siteRecommendedUseForTradeType.isEmpty())) {
                List<SiteRecommendedUseForTradeType> sourceSiteRecommendedUseForTradeType;
                sourceSiteRecommendedUseForTradeType = (((this.siteRecommendedUseForTradeType!= null)&&(!this.siteRecommendedUseForTradeType.isEmpty()))?this.getSiteRecommendedUseForTradeType():null);
                @SuppressWarnings("unchecked")
                List<SiteRecommendedUseForTradeType> copySiteRecommendedUseForTradeType = ((List<SiteRecommendedUseForTradeType> ) strategy.copy(LocatorUtils.property(locator, "siteRecommendedUseForTradeType", sourceSiteRecommendedUseForTradeType), sourceSiteRecommendedUseForTradeType));
                copy.siteRecommendedUseForTradeType = null;
                if (copySiteRecommendedUseForTradeType!= null) {
                    List<SiteRecommendedUseForTradeType> uniqueSiteRecommendedUseForTradeTypel = copy.getSiteRecommendedUseForTradeType();
                    uniqueSiteRecommendedUseForTradeTypel.addAll(copySiteRecommendedUseForTradeType);
                }
            } else {
                copy.siteRecommendedUseForTradeType = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SiteRecommendedUseForTradeTypes();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SiteRecommendedUseForTradeTypes that = ((SiteRecommendedUseForTradeTypes) object);
        {
            List<SiteRecommendedUseForTradeType> lhsSiteRecommendedUseForTradeType;
            lhsSiteRecommendedUseForTradeType = (((this.siteRecommendedUseForTradeType!= null)&&(!this.siteRecommendedUseForTradeType.isEmpty()))?this.getSiteRecommendedUseForTradeType():null);
            List<SiteRecommendedUseForTradeType> rhsSiteRecommendedUseForTradeType;
            rhsSiteRecommendedUseForTradeType = (((that.siteRecommendedUseForTradeType!= null)&&(!that.siteRecommendedUseForTradeType.isEmpty()))?that.getSiteRecommendedUseForTradeType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "siteRecommendedUseForTradeType", lhsSiteRecommendedUseForTradeType), LocatorUtils.property(thatLocator, "siteRecommendedUseForTradeType", rhsSiteRecommendedUseForTradeType), lhsSiteRecommendedUseForTradeType, rhsSiteRecommendedUseForTradeType)) {
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
