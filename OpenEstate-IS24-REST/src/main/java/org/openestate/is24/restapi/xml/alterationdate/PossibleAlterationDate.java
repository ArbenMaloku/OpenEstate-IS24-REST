
package org.openestate.is24.restapi.xml.alterationdate;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
import org.openestate.is24.restapi.xml.Adapter2;


/**
 * <p>Java class for possibleAlterationDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="possibleAlterationDate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nextPossibleAlterationDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "possibleAlterationDate", propOrder = {
    "nextPossibleAlterationDate"
})
public class PossibleAlterationDate
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar nextPossibleAlterationDate;

    /**
     * Gets the value of the nextPossibleAlterationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getNextPossibleAlterationDate() {
        return nextPossibleAlterationDate;
    }

    /**
     * Sets the value of the nextPossibleAlterationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextPossibleAlterationDate(Calendar value) {
        this.nextPossibleAlterationDate = value;
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
            Calendar theNextPossibleAlterationDate;
            theNextPossibleAlterationDate = this.getNextPossibleAlterationDate();
            strategy.appendField(locator, this, "nextPossibleAlterationDate", buffer, theNextPossibleAlterationDate);
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
        if (draftCopy instanceof PossibleAlterationDate) {
            final PossibleAlterationDate copy = ((PossibleAlterationDate) draftCopy);
            if (this.nextPossibleAlterationDate!= null) {
                Calendar sourceNextPossibleAlterationDate;
                sourceNextPossibleAlterationDate = this.getNextPossibleAlterationDate();
                Calendar copyNextPossibleAlterationDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "nextPossibleAlterationDate", sourceNextPossibleAlterationDate), sourceNextPossibleAlterationDate));
                copy.setNextPossibleAlterationDate(copyNextPossibleAlterationDate);
            } else {
                copy.nextPossibleAlterationDate = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new PossibleAlterationDate();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PossibleAlterationDate)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PossibleAlterationDate that = ((PossibleAlterationDate) object);
        {
            Calendar lhsNextPossibleAlterationDate;
            lhsNextPossibleAlterationDate = this.getNextPossibleAlterationDate();
            Calendar rhsNextPossibleAlterationDate;
            rhsNextPossibleAlterationDate = that.getNextPossibleAlterationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nextPossibleAlterationDate", lhsNextPossibleAlterationDate), LocatorUtils.property(thatLocator, "nextPossibleAlterationDate", rhsNextPossibleAlterationDate), lhsNextPossibleAlterationDate, rhsNextPossibleAlterationDate)) {
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
