
package org.openestate.is24.restapi.xml.common;

import java.net.URL;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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


/**
 * To be done
 * 
 * <p>Java class for StrictEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrictEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wgs84Coordinate" type="{http://rest.immobilienscout24.de/schema/common/1.0}Wgs84Coordinate"/&gt;
 *         &lt;element name="preciseHouseNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="publishedAfterRequestedDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://rest.immobilienscout24.de/schema/common/1.0}Reference"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrictEntry", propOrder = {
    "wgs84Coordinate",
    "preciseHouseNumber",
    "publishedAfterRequestedDate"
})
public class StrictEntry
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected Wgs84Coordinate wgs84Coordinate;
    protected Boolean preciseHouseNumber;
    protected Boolean publishedAfterRequestedDate;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "anyURI")
    protected URL href;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "label")
    protected String label;
    @XmlAttribute(name = "modification")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar modification;
    @XmlAttribute(name = "creation")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar creation;
    @XmlAttribute(name = "publishDate")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar publishDate;

    /**
     * Gets the value of the wgs84Coordinate property.
     * 
     * @return
     *     possible object is
     *     {@link Wgs84Coordinate }
     *     
     */
    public Wgs84Coordinate getWgs84Coordinate() {
        return wgs84Coordinate;
    }

    /**
     * Sets the value of the wgs84Coordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wgs84Coordinate }
     *     
     */
    public void setWgs84Coordinate(Wgs84Coordinate value) {
        this.wgs84Coordinate = value;
    }

    /**
     * Gets the value of the preciseHouseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreciseHouseNumber() {
        return preciseHouseNumber;
    }

    /**
     * Sets the value of the preciseHouseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreciseHouseNumber(Boolean value) {
        this.preciseHouseNumber = value;
    }

    /**
     * Gets the value of the publishedAfterRequestedDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublishedAfterRequestedDate() {
        return publishedAfterRequestedDate;
    }

    /**
     * Sets the value of the publishedAfterRequestedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublishedAfterRequestedDate(Boolean value) {
        this.publishedAfterRequestedDate = value;
    }

    /**
     * Link zum Element.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URL getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(URL value) {
        this.href = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModification(Calendar value) {
        this.modification = value;
    }

    /**
     * Gets the value of the creation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCreation() {
        return creation;
    }

    /**
     * Sets the value of the creation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreation(Calendar value) {
        this.creation = value;
    }

    /**
     * Gets the value of the publishDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPublishDate() {
        return publishDate;
    }

    /**
     * Sets the value of the publishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishDate(Calendar value) {
        this.publishDate = value;
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
            Wgs84Coordinate theWgs84Coordinate;
            theWgs84Coordinate = this.getWgs84Coordinate();
            strategy.appendField(locator, this, "wgs84Coordinate", buffer, theWgs84Coordinate);
        }
        {
            Boolean thePreciseHouseNumber;
            thePreciseHouseNumber = this.isPreciseHouseNumber();
            strategy.appendField(locator, this, "preciseHouseNumber", buffer, thePreciseHouseNumber);
        }
        {
            Boolean thePublishedAfterRequestedDate;
            thePublishedAfterRequestedDate = this.isPublishedAfterRequestedDate();
            strategy.appendField(locator, this, "publishedAfterRequestedDate", buffer, thePublishedAfterRequestedDate);
        }
        {
            URL theHref;
            theHref = this.getHref();
            strategy.appendField(locator, this, "href", buffer, theHref);
        }
        {
            Long theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            Calendar theModification;
            theModification = this.getModification();
            strategy.appendField(locator, this, "modification", buffer, theModification);
        }
        {
            Calendar theCreation;
            theCreation = this.getCreation();
            strategy.appendField(locator, this, "creation", buffer, theCreation);
        }
        {
            Calendar thePublishDate;
            thePublishDate = this.getPublishDate();
            strategy.appendField(locator, this, "publishDate", buffer, thePublishDate);
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
        if (draftCopy instanceof StrictEntry) {
            final StrictEntry copy = ((StrictEntry) draftCopy);
            if (this.wgs84Coordinate!= null) {
                Wgs84Coordinate sourceWgs84Coordinate;
                sourceWgs84Coordinate = this.getWgs84Coordinate();
                Wgs84Coordinate copyWgs84Coordinate = ((Wgs84Coordinate) strategy.copy(LocatorUtils.property(locator, "wgs84Coordinate", sourceWgs84Coordinate), sourceWgs84Coordinate));
                copy.setWgs84Coordinate(copyWgs84Coordinate);
            } else {
                copy.wgs84Coordinate = null;
            }
            if (this.preciseHouseNumber!= null) {
                Boolean sourcePreciseHouseNumber;
                sourcePreciseHouseNumber = this.isPreciseHouseNumber();
                Boolean copyPreciseHouseNumber = ((Boolean) strategy.copy(LocatorUtils.property(locator, "preciseHouseNumber", sourcePreciseHouseNumber), sourcePreciseHouseNumber));
                copy.setPreciseHouseNumber(copyPreciseHouseNumber);
            } else {
                copy.preciseHouseNumber = null;
            }
            if (this.publishedAfterRequestedDate!= null) {
                Boolean sourcePublishedAfterRequestedDate;
                sourcePublishedAfterRequestedDate = this.isPublishedAfterRequestedDate();
                Boolean copyPublishedAfterRequestedDate = ((Boolean) strategy.copy(LocatorUtils.property(locator, "publishedAfterRequestedDate", sourcePublishedAfterRequestedDate), sourcePublishedAfterRequestedDate));
                copy.setPublishedAfterRequestedDate(copyPublishedAfterRequestedDate);
            } else {
                copy.publishedAfterRequestedDate = null;
            }
            if (this.href!= null) {
                URL sourceHref;
                sourceHref = this.getHref();
                URL copyHref = ((URL) strategy.copy(LocatorUtils.property(locator, "href", sourceHref), sourceHref));
                copy.setHref(copyHref);
            } else {
                copy.href = null;
            }
            if (this.id!= null) {
                Long sourceId;
                sourceId = this.getId();
                Long copyId = ((Long) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId));
                copy.setId(copyId);
            } else {
                copy.id = null;
            }
            if (this.label!= null) {
                String sourceLabel;
                sourceLabel = this.getLabel();
                String copyLabel = ((String) strategy.copy(LocatorUtils.property(locator, "label", sourceLabel), sourceLabel));
                copy.setLabel(copyLabel);
            } else {
                copy.label = null;
            }
            if (this.modification!= null) {
                Calendar sourceModification;
                sourceModification = this.getModification();
                Calendar copyModification = ((Calendar) strategy.copy(LocatorUtils.property(locator, "modification", sourceModification), sourceModification));
                copy.setModification(copyModification);
            } else {
                copy.modification = null;
            }
            if (this.creation!= null) {
                Calendar sourceCreation;
                sourceCreation = this.getCreation();
                Calendar copyCreation = ((Calendar) strategy.copy(LocatorUtils.property(locator, "creation", sourceCreation), sourceCreation));
                copy.setCreation(copyCreation);
            } else {
                copy.creation = null;
            }
            if (this.publishDate!= null) {
                Calendar sourcePublishDate;
                sourcePublishDate = this.getPublishDate();
                Calendar copyPublishDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "publishDate", sourcePublishDate), sourcePublishDate));
                copy.setPublishDate(copyPublishDate);
            } else {
                copy.publishDate = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new StrictEntry();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StrictEntry)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final StrictEntry that = ((StrictEntry) object);
        {
            Wgs84Coordinate lhsWgs84Coordinate;
            lhsWgs84Coordinate = this.getWgs84Coordinate();
            Wgs84Coordinate rhsWgs84Coordinate;
            rhsWgs84Coordinate = that.getWgs84Coordinate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wgs84Coordinate", lhsWgs84Coordinate), LocatorUtils.property(thatLocator, "wgs84Coordinate", rhsWgs84Coordinate), lhsWgs84Coordinate, rhsWgs84Coordinate)) {
                return false;
            }
        }
        {
            Boolean lhsPreciseHouseNumber;
            lhsPreciseHouseNumber = this.isPreciseHouseNumber();
            Boolean rhsPreciseHouseNumber;
            rhsPreciseHouseNumber = that.isPreciseHouseNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preciseHouseNumber", lhsPreciseHouseNumber), LocatorUtils.property(thatLocator, "preciseHouseNumber", rhsPreciseHouseNumber), lhsPreciseHouseNumber, rhsPreciseHouseNumber)) {
                return false;
            }
        }
        {
            Boolean lhsPublishedAfterRequestedDate;
            lhsPublishedAfterRequestedDate = this.isPublishedAfterRequestedDate();
            Boolean rhsPublishedAfterRequestedDate;
            rhsPublishedAfterRequestedDate = that.isPublishedAfterRequestedDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publishedAfterRequestedDate", lhsPublishedAfterRequestedDate), LocatorUtils.property(thatLocator, "publishedAfterRequestedDate", rhsPublishedAfterRequestedDate), lhsPublishedAfterRequestedDate, rhsPublishedAfterRequestedDate)) {
                return false;
            }
        }
        {
            URL lhsHref;
            lhsHref = this.getHref();
            URL rhsHref;
            rhsHref = that.getHref();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "href", lhsHref), LocatorUtils.property(thatLocator, "href", rhsHref), lhsHref, rhsHref)) {
                return false;
            }
        }
        {
            Long lhsId;
            lhsId = this.getId();
            Long rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel)) {
                return false;
            }
        }
        {
            Calendar lhsModification;
            lhsModification = this.getModification();
            Calendar rhsModification;
            rhsModification = that.getModification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modification", lhsModification), LocatorUtils.property(thatLocator, "modification", rhsModification), lhsModification, rhsModification)) {
                return false;
            }
        }
        {
            Calendar lhsCreation;
            lhsCreation = this.getCreation();
            Calendar rhsCreation;
            rhsCreation = that.getCreation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creation", lhsCreation), LocatorUtils.property(thatLocator, "creation", rhsCreation), lhsCreation, rhsCreation)) {
                return false;
            }
        }
        {
            Calendar lhsPublishDate;
            lhsPublishDate = this.getPublishDate();
            Calendar rhsPublishDate;
            rhsPublishDate = that.getPublishDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publishDate", lhsPublishDate), LocatorUtils.property(thatLocator, "publishDate", rhsPublishDate), lhsPublishDate, rhsPublishDate)) {
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
