//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.28 at 05:24:58 PM CET 
//


package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for MasterDataContactDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterDataContactDetailsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}BaseContactDetails">
 *       &lt;sequence>
 *         &lt;element name="postOfficeBox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterDataContactDetailsType", propOrder = {
    "postOfficeBox"
})
public class MasterDataContactDetailsType
    extends BaseContactDetails
    implements Cloneable, CopyTo, Equals, ToString
{

    protected Boolean postOfficeBox;

    /**
     * Gets the value of the postOfficeBox property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostOfficeBox() {
        return postOfficeBox;
    }

    /**
     * Sets the value of the postOfficeBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostOfficeBox(Boolean value) {
        this.postOfficeBox = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            Boolean thePostOfficeBox;
            thePostOfficeBox = this.isPostOfficeBox();
            strategy.appendField(locator, this, "postOfficeBox", buffer, thePostOfficeBox);
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof MasterDataContactDetailsType) {
            final MasterDataContactDetailsType copy = ((MasterDataContactDetailsType) draftCopy);
            if (this.postOfficeBox!= null) {
                Boolean sourcePostOfficeBox;
                sourcePostOfficeBox = this.isPostOfficeBox();
                Boolean copyPostOfficeBox = ((Boolean) strategy.copy(LocatorUtils.property(locator, "postOfficeBox", sourcePostOfficeBox), sourcePostOfficeBox));
                copy.setPostOfficeBox(copyPostOfficeBox);
            } else {
                copy.postOfficeBox = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MasterDataContactDetailsType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MasterDataContactDetailsType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MasterDataContactDetailsType that = ((MasterDataContactDetailsType) object);
        {
            Boolean lhsPostOfficeBox;
            lhsPostOfficeBox = this.isPostOfficeBox();
            Boolean rhsPostOfficeBox;
            rhsPostOfficeBox = that.isPostOfficeBox();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postOfficeBox", lhsPostOfficeBox), LocatorUtils.property(thatLocator, "postOfficeBox", rhsPostOfficeBox), lhsPostOfficeBox, rhsPostOfficeBox)) {
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
