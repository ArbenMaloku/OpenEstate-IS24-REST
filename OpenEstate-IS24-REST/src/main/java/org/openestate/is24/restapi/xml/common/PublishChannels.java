//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.28 at 05:24:58 PM CET 
//


package org.openestate.is24.restapi.xml.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="publishChannel" type="{http://rest.immobilienscout24.de/schema/common/1.0}PublishChannel" maxOccurs="unbounded" minOccurs="0"/>
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
    "publishChannel"
})
@XmlRootElement(name = "publishChannels")
public class PublishChannels
    implements Cloneable, CopyTo, Equals, ToString
{

    protected List<PublishChannel> publishChannel;

    /**
     * Gets the value of the publishChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publishChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishChannel }
     * 
     * 
     */
    public List<PublishChannel> getPublishChannel() {
        if (publishChannel == null) {
            publishChannel = new ArrayList<PublishChannel>();
        }
        return this.publishChannel;
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
            List<PublishChannel> thePublishChannel;
            thePublishChannel = (((this.publishChannel!= null)&&(!this.publishChannel.isEmpty()))?this.getPublishChannel():null);
            strategy.appendField(locator, this, "publishChannel", buffer, thePublishChannel);
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
        if (draftCopy instanceof PublishChannels) {
            final PublishChannels copy = ((PublishChannels) draftCopy);
            if ((this.publishChannel!= null)&&(!this.publishChannel.isEmpty())) {
                List<PublishChannel> sourcePublishChannel;
                sourcePublishChannel = (((this.publishChannel!= null)&&(!this.publishChannel.isEmpty()))?this.getPublishChannel():null);
                @SuppressWarnings("unchecked")
                List<PublishChannel> copyPublishChannel = ((List<PublishChannel> ) strategy.copy(LocatorUtils.property(locator, "publishChannel", sourcePublishChannel), sourcePublishChannel));
                copy.publishChannel = null;
                if (copyPublishChannel!= null) {
                    List<PublishChannel> uniquePublishChannell = copy.getPublishChannel();
                    uniquePublishChannell.addAll(copyPublishChannel);
                }
            } else {
                copy.publishChannel = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new PublishChannels();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PublishChannels)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PublishChannels that = ((PublishChannels) object);
        {
            List<PublishChannel> lhsPublishChannel;
            lhsPublishChannel = (((this.publishChannel!= null)&&(!this.publishChannel.isEmpty()))?this.getPublishChannel():null);
            List<PublishChannel> rhsPublishChannel;
            rhsPublishChannel = (((that.publishChannel!= null)&&(!that.publishChannel.isEmpty()))?that.getPublishChannel():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publishChannel", lhsPublishChannel), LocatorUtils.property(thatLocator, "publishChannel", rhsPublishChannel), lhsPublishChannel, rhsPublishChannel)) {
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
