
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publishObject" type="{http://rest.immobilienscout24.de/schema/common/1.0}PublishObject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "publishObject"
})
@XmlRootElement(name = "publishObjects")
public class PublishObjects
    implements Cloneable, CopyTo, Equals, ToString
{

    protected List<PublishObject> publishObject;

    /**
     * Gets the value of the publishObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publishObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishObject }
     * 
     * 
     */
    public List<PublishObject> getPublishObject() {
        if (publishObject == null) {
            publishObject = new ArrayList<PublishObject>();
        }
        return this.publishObject;
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
            List<PublishObject> thePublishObject;
            thePublishObject = (((this.publishObject!= null)&&(!this.publishObject.isEmpty()))?this.getPublishObject():null);
            strategy.appendField(locator, this, "publishObject", buffer, thePublishObject);
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
        if (draftCopy instanceof PublishObjects) {
            final PublishObjects copy = ((PublishObjects) draftCopy);
            if ((this.publishObject!= null)&&(!this.publishObject.isEmpty())) {
                List<PublishObject> sourcePublishObject;
                sourcePublishObject = (((this.publishObject!= null)&&(!this.publishObject.isEmpty()))?this.getPublishObject():null);
                @SuppressWarnings("unchecked")
                List<PublishObject> copyPublishObject = ((List<PublishObject> ) strategy.copy(LocatorUtils.property(locator, "publishObject", sourcePublishObject), sourcePublishObject));
                copy.publishObject = null;
                if (copyPublishObject!= null) {
                    List<PublishObject> uniquePublishObjectl = copy.getPublishObject();
                    uniquePublishObjectl.addAll(copyPublishObject);
                }
            } else {
                copy.publishObject = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new PublishObjects();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PublishObjects)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PublishObjects that = ((PublishObjects) object);
        {
            List<PublishObject> lhsPublishObject;
            lhsPublishObject = (((this.publishObject!= null)&&(!this.publishObject.isEmpty()))?this.getPublishObject():null);
            List<PublishObject> rhsPublishObject;
            rhsPublishObject = (((that.publishObject!= null)&&(!that.publishObject.isEmpty()))?that.getPublishObject():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publishObject", lhsPublishObject), LocatorUtils.property(thatLocator, "publishObject", rhsPublishObject), lhsPublishObject, rhsPublishObject)) {
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
