
package org.openestate.is24.restapi.xml.common;

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
 * Erm\u00f6glicht die seitenweise Iteration \u00fcber Daten(1-basiert).
 *       
 * 
 * <p>Java class for Paging complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Paging">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="next" type="{http://rest.immobilienscout24.de/schema/common/1.0}ReferenceLink" minOccurs="0"/>
 *         &lt;element name="previous" type="{http://rest.immobilienscout24.de/schema/common/1.0}ReferenceLink" minOccurs="0"/>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfHits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Paging", propOrder = {
    "next",
    "previous",
    "pageNumber",
    "pageSize",
    "numberOfPages",
    "numberOfHits"
})
public class Paging
    implements Cloneable, CopyTo, Equals, ToString
{

    protected ReferenceLink next;
    protected ReferenceLink previous;
    protected Integer pageNumber;
    protected Integer pageSize;
    protected Integer numberOfPages;
    @XmlElement(defaultValue = "0")
    protected int numberOfHits;

    /**
     * Gets the value of the next property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLink }
     *     
     */
    public ReferenceLink getNext() {
        return next;
    }

    /**
     * Sets the value of the next property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLink }
     *     
     */
    public void setNext(ReferenceLink value) {
        this.next = value;
    }

    /**
     * Gets the value of the previous property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLink }
     *     
     */
    public ReferenceLink getPrevious() {
        return previous;
    }

    /**
     * Sets the value of the previous property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLink }
     *     
     */
    public void setPrevious(ReferenceLink value) {
        this.previous = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the numberOfPages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Sets the value of the numberOfPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfPages(Integer value) {
        this.numberOfPages = value;
    }

    /**
     * Gets the value of the numberOfHits property.
     * 
     */
    public int getNumberOfHits() {
        return numberOfHits;
    }

    /**
     * Sets the value of the numberOfHits property.
     * 
     */
    public void setNumberOfHits(int value) {
        this.numberOfHits = value;
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
            ReferenceLink theNext;
            theNext = this.getNext();
            strategy.appendField(locator, this, "next", buffer, theNext);
        }
        {
            ReferenceLink thePrevious;
            thePrevious = this.getPrevious();
            strategy.appendField(locator, this, "previous", buffer, thePrevious);
        }
        {
            Integer thePageNumber;
            thePageNumber = this.getPageNumber();
            strategy.appendField(locator, this, "pageNumber", buffer, thePageNumber);
        }
        {
            Integer thePageSize;
            thePageSize = this.getPageSize();
            strategy.appendField(locator, this, "pageSize", buffer, thePageSize);
        }
        {
            Integer theNumberOfPages;
            theNumberOfPages = this.getNumberOfPages();
            strategy.appendField(locator, this, "numberOfPages", buffer, theNumberOfPages);
        }
        {
            int theNumberOfHits;
            theNumberOfHits = this.getNumberOfHits();
            strategy.appendField(locator, this, "numberOfHits", buffer, theNumberOfHits);
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
        if (draftCopy instanceof Paging) {
            final Paging copy = ((Paging) draftCopy);
            if (this.next!= null) {
                ReferenceLink sourceNext;
                sourceNext = this.getNext();
                ReferenceLink copyNext = ((ReferenceLink) strategy.copy(LocatorUtils.property(locator, "next", sourceNext), sourceNext));
                copy.setNext(copyNext);
            } else {
                copy.next = null;
            }
            if (this.previous!= null) {
                ReferenceLink sourcePrevious;
                sourcePrevious = this.getPrevious();
                ReferenceLink copyPrevious = ((ReferenceLink) strategy.copy(LocatorUtils.property(locator, "previous", sourcePrevious), sourcePrevious));
                copy.setPrevious(copyPrevious);
            } else {
                copy.previous = null;
            }
            if (this.pageNumber!= null) {
                Integer sourcePageNumber;
                sourcePageNumber = this.getPageNumber();
                Integer copyPageNumber = ((Integer) strategy.copy(LocatorUtils.property(locator, "pageNumber", sourcePageNumber), sourcePageNumber));
                copy.setPageNumber(copyPageNumber);
            } else {
                copy.pageNumber = null;
            }
            if (this.pageSize!= null) {
                Integer sourcePageSize;
                sourcePageSize = this.getPageSize();
                Integer copyPageSize = ((Integer) strategy.copy(LocatorUtils.property(locator, "pageSize", sourcePageSize), sourcePageSize));
                copy.setPageSize(copyPageSize);
            } else {
                copy.pageSize = null;
            }
            if (this.numberOfPages!= null) {
                Integer sourceNumberOfPages;
                sourceNumberOfPages = this.getNumberOfPages();
                Integer copyNumberOfPages = ((Integer) strategy.copy(LocatorUtils.property(locator, "numberOfPages", sourceNumberOfPages), sourceNumberOfPages));
                copy.setNumberOfPages(copyNumberOfPages);
            } else {
                copy.numberOfPages = null;
            }
            {
                int sourceNumberOfHits;
                sourceNumberOfHits = this.getNumberOfHits();
                int copyNumberOfHits = strategy.copy(LocatorUtils.property(locator, "numberOfHits", sourceNumberOfHits), sourceNumberOfHits);
                copy.setNumberOfHits(copyNumberOfHits);
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Paging();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Paging)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Paging that = ((Paging) object);
        {
            ReferenceLink lhsNext;
            lhsNext = this.getNext();
            ReferenceLink rhsNext;
            rhsNext = that.getNext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "next", lhsNext), LocatorUtils.property(thatLocator, "next", rhsNext), lhsNext, rhsNext)) {
                return false;
            }
        }
        {
            ReferenceLink lhsPrevious;
            lhsPrevious = this.getPrevious();
            ReferenceLink rhsPrevious;
            rhsPrevious = that.getPrevious();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previous", lhsPrevious), LocatorUtils.property(thatLocator, "previous", rhsPrevious), lhsPrevious, rhsPrevious)) {
                return false;
            }
        }
        {
            Integer lhsPageNumber;
            lhsPageNumber = this.getPageNumber();
            Integer rhsPageNumber;
            rhsPageNumber = that.getPageNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pageNumber", lhsPageNumber), LocatorUtils.property(thatLocator, "pageNumber", rhsPageNumber), lhsPageNumber, rhsPageNumber)) {
                return false;
            }
        }
        {
            Integer lhsPageSize;
            lhsPageSize = this.getPageSize();
            Integer rhsPageSize;
            rhsPageSize = that.getPageSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pageSize", lhsPageSize), LocatorUtils.property(thatLocator, "pageSize", rhsPageSize), lhsPageSize, rhsPageSize)) {
                return false;
            }
        }
        {
            Integer lhsNumberOfPages;
            lhsNumberOfPages = this.getNumberOfPages();
            Integer rhsNumberOfPages;
            rhsNumberOfPages = that.getNumberOfPages();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfPages", lhsNumberOfPages), LocatorUtils.property(thatLocator, "numberOfPages", rhsNumberOfPages), lhsNumberOfPages, rhsNumberOfPages)) {
                return false;
            }
        }
        {
            int lhsNumberOfHits;
            lhsNumberOfHits = this.getNumberOfHits();
            int rhsNumberOfHits;
            rhsNumberOfHits = that.getNumberOfHits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfHits", lhsNumberOfHits), LocatorUtils.property(thatLocator, "numberOfHits", rhsNumberOfHits), lhsNumberOfHits, rhsNumberOfHits)) {
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
