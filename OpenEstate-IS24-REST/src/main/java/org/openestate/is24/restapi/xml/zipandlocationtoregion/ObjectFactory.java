//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.01 at 06:07:19 AM CET 
//


package org.openestate.is24.restapi.xml.zipandlocationtoregion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openestate.is24.restapi.xml.zipandlocationtoregion package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PriceRegionAssignment_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/zipandlocationtoregion/1.0", "priceRegionAssignment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openestate.is24.restapi.xml.zipandlocationtoregion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PriceRegionAssignment }
     * 
     */
    public PriceRegionAssignment createPriceRegionAssignment() {
        return new PriceRegionAssignment();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceRegionAssignment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/zipandlocationtoregion/1.0", name = "priceRegionAssignment")
    public JAXBElement<PriceRegionAssignment> createPriceRegionAssignment(PriceRegionAssignment value) {
        return new JAXBElement<PriceRegionAssignment>(_PriceRegionAssignment_QNAME, PriceRegionAssignment.class, null, value);
    }

}
