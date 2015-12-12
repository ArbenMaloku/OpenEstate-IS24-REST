
package org.openestate.is24.restapi.xml.premiumplacement;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
import org.openestate.is24.restapi.xml.Adapter4;


/**
 * Liste von Premiumplacements
 * 
 * <p>Java class for Premiumplacements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Premiumplacements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="premiumplacement" type="{http://rest.immobilienscout24.de/schema/offer/premiumplacement/1.0}Premiumplacement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}href"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Premiumplacements", propOrder = {
    "premiumplacement"
})
public class Premiumplacements
    implements Cloneable, CopyTo, Equals, ToString
{

    protected List<Premiumplacement> premiumplacement;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    protected URL href;

    /**
     * Gets the value of the premiumplacement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premiumplacement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremiumplacement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Premiumplacement }
     * 
     * 
     */
    public List<Premiumplacement> getPremiumplacement() {
        if (premiumplacement == null) {
            premiumplacement = new ArrayList<Premiumplacement>();
        }
        return this.premiumplacement;
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
            List<Premiumplacement> thePremiumplacement;
            thePremiumplacement = (((this.premiumplacement!= null)&&(!this.premiumplacement.isEmpty()))?this.getPremiumplacement():null);
            strategy.appendField(locator, this, "premiumplacement", buffer, thePremiumplacement);
        }
        {
            URL theHref;
            theHref = this.getHref();
            strategy.appendField(locator, this, "href", buffer, theHref);
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
        if (draftCopy instanceof Premiumplacements) {
            final Premiumplacements copy = ((Premiumplacements) draftCopy);
            if ((this.premiumplacement!= null)&&(!this.premiumplacement.isEmpty())) {
                List<Premiumplacement> sourcePremiumplacement;
                sourcePremiumplacement = (((this.premiumplacement!= null)&&(!this.premiumplacement.isEmpty()))?this.getPremiumplacement():null);
                @SuppressWarnings("unchecked")
                List<Premiumplacement> copyPremiumplacement = ((List<Premiumplacement> ) strategy.copy(LocatorUtils.property(locator, "premiumplacement", sourcePremiumplacement), sourcePremiumplacement));
                copy.premiumplacement = null;
                if (copyPremiumplacement!= null) {
                    List<Premiumplacement> uniquePremiumplacementl = copy.getPremiumplacement();
                    uniquePremiumplacementl.addAll(copyPremiumplacement);
                }
            } else {
                copy.premiumplacement = null;
            }
            if (this.href!= null) {
                URL sourceHref;
                sourceHref = this.getHref();
                URL copyHref = ((URL) strategy.copy(LocatorUtils.property(locator, "href", sourceHref), sourceHref));
                copy.setHref(copyHref);
            } else {
                copy.href = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Premiumplacements();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Premiumplacements that = ((Premiumplacements) object);
        {
            List<Premiumplacement> lhsPremiumplacement;
            lhsPremiumplacement = (((this.premiumplacement!= null)&&(!this.premiumplacement.isEmpty()))?this.getPremiumplacement():null);
            List<Premiumplacement> rhsPremiumplacement;
            rhsPremiumplacement = (((that.premiumplacement!= null)&&(!that.premiumplacement.isEmpty()))?that.getPremiumplacement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "premiumplacement", lhsPremiumplacement), LocatorUtils.property(thatLocator, "premiumplacement", rhsPremiumplacement), lhsPremiumplacement, rhsPremiumplacement)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
