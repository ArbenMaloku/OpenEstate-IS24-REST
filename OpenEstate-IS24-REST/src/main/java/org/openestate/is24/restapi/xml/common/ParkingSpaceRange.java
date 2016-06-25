
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Bereich des Parkpl\u00e4tze
 * 
 * <p>Java class for ParkingSpaceRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingSpaceRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="minimal" type="{http://rest.immobilienscout24.de/schema/common/1.0}Number4.0Type" minOccurs="0"/&gt;
 *         &lt;element name="maximal" type="{http://rest.immobilienscout24.de/schema/common/1.0}Number4.0Type" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingSpaceRange", propOrder = {

})
public class ParkingSpaceRange implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter9 .class)
    @XmlSchemaType(name = "positiveInteger")
    protected Integer minimal;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter9 .class)
    @XmlSchemaType(name = "positiveInteger")
    protected Integer maximal;

    /**
     * Gets the value of the minimal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getMinimal() {
        return minimal;
    }

    /**
     * Sets the value of the minimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimal(Integer value) {
        this.minimal = value;
    }

    /**
     * Gets the value of the maximal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getMaximal() {
        return maximal;
    }

    /**
     * Sets the value of the maximal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximal(Integer value) {
        this.maximal = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Integer theMinimal;
            theMinimal = this.getMinimal();
            strategy.appendField(locator, this, "minimal", buffer, theMinimal, (this.minimal!= null));
        }
        {
            Integer theMaximal;
            theMaximal = this.getMaximal();
            strategy.appendField(locator, this, "maximal", buffer, theMaximal, (this.maximal!= null));
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof ParkingSpaceRange) {
            final ParkingSpaceRange copy = ((ParkingSpaceRange) draftCopy);
            {
                Boolean minimalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minimal!= null));
                if (minimalShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceMinimal;
                    sourceMinimal = this.getMinimal();
                    Integer copyMinimal = ((Integer) strategy.copy(LocatorUtils.property(locator, "minimal", sourceMinimal), sourceMinimal, (this.minimal!= null)));
                    copy.setMinimal(copyMinimal);
                } else {
                    if (minimalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minimal = null;
                    }
                }
            }
            {
                Boolean maximalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maximal!= null));
                if (maximalShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceMaximal;
                    sourceMaximal = this.getMaximal();
                    Integer copyMaximal = ((Integer) strategy.copy(LocatorUtils.property(locator, "maximal", sourceMaximal), sourceMaximal, (this.maximal!= null)));
                    copy.setMaximal(copyMaximal);
                } else {
                    if (maximalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maximal = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ParkingSpaceRange();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ParkingSpaceRange that = ((ParkingSpaceRange) object);
        {
            Integer lhsMinimal;
            lhsMinimal = this.getMinimal();
            Integer rhsMinimal;
            rhsMinimal = that.getMinimal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimal", lhsMinimal), LocatorUtils.property(thatLocator, "minimal", rhsMinimal), lhsMinimal, rhsMinimal, (this.minimal!= null), (that.minimal!= null))) {
                return false;
            }
        }
        {
            Integer lhsMaximal;
            lhsMaximal = this.getMaximal();
            Integer rhsMaximal;
            rhsMaximal = that.getMaximal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximal", lhsMaximal), LocatorUtils.property(thatLocator, "maximal", rhsMaximal), lhsMaximal, rhsMaximal, (this.maximal!= null), (that.maximal!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
