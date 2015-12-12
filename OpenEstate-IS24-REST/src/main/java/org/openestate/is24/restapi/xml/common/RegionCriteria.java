
package org.openestate.is24.restapi.xml.common;

import java.util.ArrayList;
import java.util.List;
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
 * Kriterien f\u00fcr die Regionssuche
 * 
 * Generelles Element f\u00fcr die Geo Criterias
 * 
 * <p>Java class for RegionCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}AbstractGeoCriteria"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geoInfoNodeCriteria" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoInfoNodeCriteria" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionCriteria", propOrder = {
    "geoInfoNodeCriteria"
})
public class RegionCriteria
    extends AbstractGeoCriteria
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected List<GeoInfoNodeCriteria> geoInfoNodeCriteria;

    /**
     * Gets the value of the geoInfoNodeCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geoInfoNodeCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeoInfoNodeCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoInfoNodeCriteria }
     * 
     * 
     */
    public List<GeoInfoNodeCriteria> getGeoInfoNodeCriteria() {
        if (geoInfoNodeCriteria == null) {
            geoInfoNodeCriteria = new ArrayList<GeoInfoNodeCriteria>();
        }
        return this.geoInfoNodeCriteria;
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
            List<GeoInfoNodeCriteria> theGeoInfoNodeCriteria;
            theGeoInfoNodeCriteria = (((this.geoInfoNodeCriteria!= null)&&(!this.geoInfoNodeCriteria.isEmpty()))?this.getGeoInfoNodeCriteria():null);
            strategy.appendField(locator, this, "geoInfoNodeCriteria", buffer, theGeoInfoNodeCriteria);
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
        if (draftCopy instanceof RegionCriteria) {
            final RegionCriteria copy = ((RegionCriteria) draftCopy);
            if ((this.geoInfoNodeCriteria!= null)&&(!this.geoInfoNodeCriteria.isEmpty())) {
                List<GeoInfoNodeCriteria> sourceGeoInfoNodeCriteria;
                sourceGeoInfoNodeCriteria = (((this.geoInfoNodeCriteria!= null)&&(!this.geoInfoNodeCriteria.isEmpty()))?this.getGeoInfoNodeCriteria():null);
                @SuppressWarnings("unchecked")
                List<GeoInfoNodeCriteria> copyGeoInfoNodeCriteria = ((List<GeoInfoNodeCriteria> ) strategy.copy(LocatorUtils.property(locator, "geoInfoNodeCriteria", sourceGeoInfoNodeCriteria), sourceGeoInfoNodeCriteria));
                copy.geoInfoNodeCriteria = null;
                if (copyGeoInfoNodeCriteria!= null) {
                    List<GeoInfoNodeCriteria> uniqueGeoInfoNodeCriterial = copy.getGeoInfoNodeCriteria();
                    uniqueGeoInfoNodeCriterial.addAll(copyGeoInfoNodeCriteria);
                }
            } else {
                copy.geoInfoNodeCriteria = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RegionCriteria();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RegionCriteria that = ((RegionCriteria) object);
        {
            List<GeoInfoNodeCriteria> lhsGeoInfoNodeCriteria;
            lhsGeoInfoNodeCriteria = (((this.geoInfoNodeCriteria!= null)&&(!this.geoInfoNodeCriteria.isEmpty()))?this.getGeoInfoNodeCriteria():null);
            List<GeoInfoNodeCriteria> rhsGeoInfoNodeCriteria;
            rhsGeoInfoNodeCriteria = (((that.geoInfoNodeCriteria!= null)&&(!that.geoInfoNodeCriteria.isEmpty()))?that.getGeoInfoNodeCriteria():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoInfoNodeCriteria", lhsGeoInfoNodeCriteria), LocatorUtils.property(thatLocator, "geoInfoNodeCriteria", rhsGeoInfoNodeCriteria), lhsGeoInfoNodeCriteria, rhsGeoInfoNodeCriteria)) {
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
