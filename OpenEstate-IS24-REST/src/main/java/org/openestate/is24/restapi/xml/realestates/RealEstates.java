//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.14 at 12:30:43 AM CET 
//


package org.openestate.is24.restapi.xml.realestates;

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
import org.openestate.is24.restapi.xml.common.Paging;
import org.openestate.is24.restapi.xml.offerlistelement.RealEstateList;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Paging" type="{http://rest.immobilienscout24.de/schema/common/1.0}Paging"/>
 *         &lt;element name="realEstateList" type="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}realEstateList"/>
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
    "paging",
    "realEstateList"
})
@XmlRootElement(name = "realEstates")
public class RealEstates
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "Paging", required = true)
    protected Paging paging;
    @XmlElement(required = true)
    protected RealEstateList realEstateList;

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    public void setPaging(Paging value) {
        this.paging = value;
    }

    /**
     * Gets the value of the realEstateList property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateList }
     *     
     */
    public RealEstateList getRealEstateList() {
        return realEstateList;
    }

    /**
     * Sets the value of the realEstateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateList }
     *     
     */
    public void setRealEstateList(RealEstateList value) {
        this.realEstateList = value;
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
            Paging thePaging;
            thePaging = this.getPaging();
            strategy.appendField(locator, this, "paging", buffer, thePaging);
        }
        {
            RealEstateList theRealEstateList;
            theRealEstateList = this.getRealEstateList();
            strategy.appendField(locator, this, "realEstateList", buffer, theRealEstateList);
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
        if (draftCopy instanceof RealEstates) {
            final RealEstates copy = ((RealEstates) draftCopy);
            if (this.paging!= null) {
                Paging sourcePaging;
                sourcePaging = this.getPaging();
                Paging copyPaging = ((Paging) strategy.copy(LocatorUtils.property(locator, "paging", sourcePaging), sourcePaging));
                copy.setPaging(copyPaging);
            } else {
                copy.paging = null;
            }
            if (this.realEstateList!= null) {
                RealEstateList sourceRealEstateList;
                sourceRealEstateList = this.getRealEstateList();
                RealEstateList copyRealEstateList = ((RealEstateList) strategy.copy(LocatorUtils.property(locator, "realEstateList", sourceRealEstateList), sourceRealEstateList));
                copy.setRealEstateList(copyRealEstateList);
            } else {
                copy.realEstateList = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RealEstates();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RealEstates)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RealEstates that = ((RealEstates) object);
        {
            Paging lhsPaging;
            lhsPaging = this.getPaging();
            Paging rhsPaging;
            rhsPaging = that.getPaging();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paging", lhsPaging), LocatorUtils.property(thatLocator, "paging", rhsPaging), lhsPaging, rhsPaging)) {
                return false;
            }
        }
        {
            RealEstateList lhsRealEstateList;
            lhsRealEstateList = this.getRealEstateList();
            RealEstateList rhsRealEstateList;
            rhsRealEstateList = that.getRealEstateList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateList", lhsRealEstateList), LocatorUtils.property(thatLocator, "realEstateList", rhsRealEstateList), lhsRealEstateList, rhsRealEstateList)) {
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
