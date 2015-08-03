
package org.openestate.is24.restapi.xml.common;

import java.awt.Color;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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


/**
 * <p>Java class for ContactMailCustomStyle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactMailCustomStyle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header1Color" type="{http://rest.immobilienscout24.de/schema/common/1.0}HexadecimalColorCode"/&gt;
 *         &lt;element name="header1FontColor" type="{http://rest.immobilienscout24.de/schema/common/1.0}HexadecimalColorCode"/&gt;
 *         &lt;element name="header2Color" type="{http://rest.immobilienscout24.de/schema/common/1.0}HexadecimalColorCode"/&gt;
 *         &lt;element name="header2FontColor" type="{http://rest.immobilienscout24.de/schema/common/1.0}HexadecimalColorCode"/&gt;
 *         &lt;element name="header3Color" type="{http://rest.immobilienscout24.de/schema/common/1.0}HexadecimalColorCode"/&gt;
 *         &lt;element name="header3FontColor" type="{http://rest.immobilienscout24.de/schema/common/1.0}HexadecimalColorCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactMailCustomStyle", propOrder = {
    "header1Color",
    "header1FontColor",
    "header2Color",
    "header2FontColor",
    "header3Color",
    "header3FontColor"
})
public class ContactMailCustomStyle
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Color header1Color;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Color header1FontColor;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Color header2Color;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Color header2FontColor;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Color header3Color;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Color header3FontColor;

    /**
     * Gets the value of the header1Color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Color getHeader1Color() {
        return header1Color;
    }

    /**
     * Sets the value of the header1Color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader1Color(Color value) {
        this.header1Color = value;
    }

    /**
     * Gets the value of the header1FontColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Color getHeader1FontColor() {
        return header1FontColor;
    }

    /**
     * Sets the value of the header1FontColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader1FontColor(Color value) {
        this.header1FontColor = value;
    }

    /**
     * Gets the value of the header2Color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Color getHeader2Color() {
        return header2Color;
    }

    /**
     * Sets the value of the header2Color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader2Color(Color value) {
        this.header2Color = value;
    }

    /**
     * Gets the value of the header2FontColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Color getHeader2FontColor() {
        return header2FontColor;
    }

    /**
     * Sets the value of the header2FontColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader2FontColor(Color value) {
        this.header2FontColor = value;
    }

    /**
     * Gets the value of the header3Color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Color getHeader3Color() {
        return header3Color;
    }

    /**
     * Sets the value of the header3Color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader3Color(Color value) {
        this.header3Color = value;
    }

    /**
     * Gets the value of the header3FontColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Color getHeader3FontColor() {
        return header3FontColor;
    }

    /**
     * Sets the value of the header3FontColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader3FontColor(Color value) {
        this.header3FontColor = value;
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
            Color theHeader1Color;
            theHeader1Color = this.getHeader1Color();
            strategy.appendField(locator, this, "header1Color", buffer, theHeader1Color);
        }
        {
            Color theHeader1FontColor;
            theHeader1FontColor = this.getHeader1FontColor();
            strategy.appendField(locator, this, "header1FontColor", buffer, theHeader1FontColor);
        }
        {
            Color theHeader2Color;
            theHeader2Color = this.getHeader2Color();
            strategy.appendField(locator, this, "header2Color", buffer, theHeader2Color);
        }
        {
            Color theHeader2FontColor;
            theHeader2FontColor = this.getHeader2FontColor();
            strategy.appendField(locator, this, "header2FontColor", buffer, theHeader2FontColor);
        }
        {
            Color theHeader3Color;
            theHeader3Color = this.getHeader3Color();
            strategy.appendField(locator, this, "header3Color", buffer, theHeader3Color);
        }
        {
            Color theHeader3FontColor;
            theHeader3FontColor = this.getHeader3FontColor();
            strategy.appendField(locator, this, "header3FontColor", buffer, theHeader3FontColor);
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
        if (draftCopy instanceof ContactMailCustomStyle) {
            final ContactMailCustomStyle copy = ((ContactMailCustomStyle) draftCopy);
            if (this.header1Color!= null) {
                Color sourceHeader1Color;
                sourceHeader1Color = this.getHeader1Color();
                Color copyHeader1Color = ((Color) strategy.copy(LocatorUtils.property(locator, "header1Color", sourceHeader1Color), sourceHeader1Color));
                copy.setHeader1Color(copyHeader1Color);
            } else {
                copy.header1Color = null;
            }
            if (this.header1FontColor!= null) {
                Color sourceHeader1FontColor;
                sourceHeader1FontColor = this.getHeader1FontColor();
                Color copyHeader1FontColor = ((Color) strategy.copy(LocatorUtils.property(locator, "header1FontColor", sourceHeader1FontColor), sourceHeader1FontColor));
                copy.setHeader1FontColor(copyHeader1FontColor);
            } else {
                copy.header1FontColor = null;
            }
            if (this.header2Color!= null) {
                Color sourceHeader2Color;
                sourceHeader2Color = this.getHeader2Color();
                Color copyHeader2Color = ((Color) strategy.copy(LocatorUtils.property(locator, "header2Color", sourceHeader2Color), sourceHeader2Color));
                copy.setHeader2Color(copyHeader2Color);
            } else {
                copy.header2Color = null;
            }
            if (this.header2FontColor!= null) {
                Color sourceHeader2FontColor;
                sourceHeader2FontColor = this.getHeader2FontColor();
                Color copyHeader2FontColor = ((Color) strategy.copy(LocatorUtils.property(locator, "header2FontColor", sourceHeader2FontColor), sourceHeader2FontColor));
                copy.setHeader2FontColor(copyHeader2FontColor);
            } else {
                copy.header2FontColor = null;
            }
            if (this.header3Color!= null) {
                Color sourceHeader3Color;
                sourceHeader3Color = this.getHeader3Color();
                Color copyHeader3Color = ((Color) strategy.copy(LocatorUtils.property(locator, "header3Color", sourceHeader3Color), sourceHeader3Color));
                copy.setHeader3Color(copyHeader3Color);
            } else {
                copy.header3Color = null;
            }
            if (this.header3FontColor!= null) {
                Color sourceHeader3FontColor;
                sourceHeader3FontColor = this.getHeader3FontColor();
                Color copyHeader3FontColor = ((Color) strategy.copy(LocatorUtils.property(locator, "header3FontColor", sourceHeader3FontColor), sourceHeader3FontColor));
                copy.setHeader3FontColor(copyHeader3FontColor);
            } else {
                copy.header3FontColor = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ContactMailCustomStyle();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ContactMailCustomStyle)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ContactMailCustomStyle that = ((ContactMailCustomStyle) object);
        {
            Color lhsHeader1Color;
            lhsHeader1Color = this.getHeader1Color();
            Color rhsHeader1Color;
            rhsHeader1Color = that.getHeader1Color();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "header1Color", lhsHeader1Color), LocatorUtils.property(thatLocator, "header1Color", rhsHeader1Color), lhsHeader1Color, rhsHeader1Color)) {
                return false;
            }
        }
        {
            Color lhsHeader1FontColor;
            lhsHeader1FontColor = this.getHeader1FontColor();
            Color rhsHeader1FontColor;
            rhsHeader1FontColor = that.getHeader1FontColor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "header1FontColor", lhsHeader1FontColor), LocatorUtils.property(thatLocator, "header1FontColor", rhsHeader1FontColor), lhsHeader1FontColor, rhsHeader1FontColor)) {
                return false;
            }
        }
        {
            Color lhsHeader2Color;
            lhsHeader2Color = this.getHeader2Color();
            Color rhsHeader2Color;
            rhsHeader2Color = that.getHeader2Color();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "header2Color", lhsHeader2Color), LocatorUtils.property(thatLocator, "header2Color", rhsHeader2Color), lhsHeader2Color, rhsHeader2Color)) {
                return false;
            }
        }
        {
            Color lhsHeader2FontColor;
            lhsHeader2FontColor = this.getHeader2FontColor();
            Color rhsHeader2FontColor;
            rhsHeader2FontColor = that.getHeader2FontColor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "header2FontColor", lhsHeader2FontColor), LocatorUtils.property(thatLocator, "header2FontColor", rhsHeader2FontColor), lhsHeader2FontColor, rhsHeader2FontColor)) {
                return false;
            }
        }
        {
            Color lhsHeader3Color;
            lhsHeader3Color = this.getHeader3Color();
            Color rhsHeader3Color;
            rhsHeader3Color = that.getHeader3Color();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "header3Color", lhsHeader3Color), LocatorUtils.property(thatLocator, "header3Color", rhsHeader3Color), lhsHeader3Color, rhsHeader3Color)) {
                return false;
            }
        }
        {
            Color lhsHeader3FontColor;
            lhsHeader3FontColor = this.getHeader3FontColor();
            Color rhsHeader3FontColor;
            rhsHeader3FontColor = that.getHeader3FontColor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "header3FontColor", lhsHeader3FontColor), LocatorUtils.property(thatLocator, "header3FontColor", rhsHeader3FontColor), lhsHeader3FontColor, rhsHeader3FontColor)) {
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
