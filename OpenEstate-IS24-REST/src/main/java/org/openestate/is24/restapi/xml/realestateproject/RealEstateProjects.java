//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.01 at 06:07:19 AM CET 
//


package org.openestate.is24.restapi.xml.realestateproject;

import java.util.ArrayList;
import java.util.List;
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
 * Liste von Bauprojekte
 * 
 * <p>Java class for RealEstateProjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealEstateProjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="realEstateProject" type="{http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0}RealEstateProject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealEstateProjects", propOrder = {
    "realEstateProject"
})
public class RealEstateProjects
    implements Cloneable, CopyTo, Equals, ToString
{

    protected List<RealEstateProject> realEstateProject;

    /**
     * Gets the value of the realEstateProject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realEstateProject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealEstateProject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RealEstateProject }
     * 
     * 
     */
    public List<RealEstateProject> getRealEstateProject() {
        if (realEstateProject == null) {
            realEstateProject = new ArrayList<RealEstateProject>();
        }
        return this.realEstateProject;
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
            List<RealEstateProject> theRealEstateProject;
            theRealEstateProject = (((this.realEstateProject!= null)&&(!this.realEstateProject.isEmpty()))?this.getRealEstateProject():null);
            strategy.appendField(locator, this, "realEstateProject", buffer, theRealEstateProject);
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
        if (draftCopy instanceof RealEstateProjects) {
            final RealEstateProjects copy = ((RealEstateProjects) draftCopy);
            if ((this.realEstateProject!= null)&&(!this.realEstateProject.isEmpty())) {
                List<RealEstateProject> sourceRealEstateProject;
                sourceRealEstateProject = (((this.realEstateProject!= null)&&(!this.realEstateProject.isEmpty()))?this.getRealEstateProject():null);
                @SuppressWarnings("unchecked")
                List<RealEstateProject> copyRealEstateProject = ((List<RealEstateProject> ) strategy.copy(LocatorUtils.property(locator, "realEstateProject", sourceRealEstateProject), sourceRealEstateProject));
                copy.realEstateProject = null;
                if (copyRealEstateProject!= null) {
                    List<RealEstateProject> uniqueRealEstateProjectl = copy.getRealEstateProject();
                    uniqueRealEstateProjectl.addAll(copyRealEstateProject);
                }
            } else {
                copy.realEstateProject = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RealEstateProjects();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RealEstateProjects)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RealEstateProjects that = ((RealEstateProjects) object);
        {
            List<RealEstateProject> lhsRealEstateProject;
            lhsRealEstateProject = (((this.realEstateProject!= null)&&(!this.realEstateProject.isEmpty()))?this.getRealEstateProject():null);
            List<RealEstateProject> rhsRealEstateProject;
            rhsRealEstateProject = (((that.realEstateProject!= null)&&(!that.realEstateProject.isEmpty()))?that.getRealEstateProject():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateProject", lhsRealEstateProject), LocatorUtils.property(thatLocator, "realEstateProject", rhsRealEstateProject), lhsRealEstateProject, rhsRealEstateProject)) {
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
