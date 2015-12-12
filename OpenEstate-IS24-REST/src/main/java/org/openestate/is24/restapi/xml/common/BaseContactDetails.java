
package org.openestate.is24.restapi.xml.common;

import java.net.URL;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for BaseContactDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseContactDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="email" type="{http://rest.immobilienscout24.de/schema/common/1.0}Email" minOccurs="0"/&gt;
 *         &lt;element name="salutation" type="{http://rest.immobilienscout24.de/schema/common/1.0}SalutationType" minOccurs="0"/&gt;
 *         &lt;element name="firstname" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="lastname" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="faxNumberCountryCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\+[1-9]\d{0,3}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="faxNumberAreaCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{1,10}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="faxNumberSubscriber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[\d][\d \-]{0,24}[\d]"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="faxNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="(\+[1-9]\d{0,3}) +\d{1,10} +([\d][\d \-]{0,24}[\d])"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="phoneNumberCountryCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\+[1-9]\d{0,3}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="phoneNumberAreaCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{1,10}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="phoneNumberSubscriber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[\d][\d \-]{0,24}[\d]"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="phoneNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="(\+[1-9]\d{0,3}) +\d{1,10} +([\d][\d \-]{0,24}[\d])"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cellPhoneNumberCountryCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\+[1-9]\d{0,3}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cellPhoneNumberAreaCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{1,10}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cellPhoneNumberSubscriber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[\d][\d \-]{0,24}[\d]"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cellPhoneNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="(\+[1-9]\d{0,3}) +\d{1,10} +([\d][\d \-]{0,24}[\d])"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="address" type="{http://rest.immobilienscout24.de/schema/common/1.0}Address" minOccurs="0"/&gt;
 *         &lt;element name="countryCode" type="{http://rest.immobilienscout24.de/schema/common/1.0}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="title" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="additionName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="company" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="homepageUrl" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI"&gt;
 *               &lt;maxLength value="300"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="portraitUrl" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI"&gt;
 *               &lt;maxLength value="300"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="position" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseContactDetails", propOrder = {
    "email",
    "salutation",
    "firstname",
    "lastname",
    "faxNumberCountryCode",
    "faxNumberAreaCode",
    "faxNumberSubscriber",
    "faxNumber",
    "phoneNumberCountryCode",
    "phoneNumberAreaCode",
    "phoneNumberSubscriber",
    "phoneNumber",
    "cellPhoneNumberCountryCode",
    "cellPhoneNumberAreaCode",
    "cellPhoneNumberSubscriber",
    "cellPhoneNumber",
    "address",
    "countryCode",
    "title",
    "additionName",
    "company",
    "homepageUrl",
    "portraitUrl",
    "position"
})
@XmlSeeAlso({
    MasterDataContactDetailsType.class,
    ContactDetails.class
})
public class BaseContactDetails
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlJavaTypeAdapter(Adapter5 .class)
    protected String email;
    @XmlSchemaType(name = "string")
    protected SalutationType salutation;
    @XmlJavaTypeAdapter(Adapter40 .class)
    protected String firstname;
    @XmlJavaTypeAdapter(Adapter41 .class)
    protected String lastname;
    @XmlJavaTypeAdapter(Adapter42 .class)
    protected String faxNumberCountryCode;
    @XmlJavaTypeAdapter(Adapter43 .class)
    protected String faxNumberAreaCode;
    @XmlJavaTypeAdapter(Adapter44 .class)
    protected String faxNumberSubscriber;
    @XmlJavaTypeAdapter(Adapter45 .class)
    protected String faxNumber;
    @XmlJavaTypeAdapter(Adapter46 .class)
    protected String phoneNumberCountryCode;
    @XmlJavaTypeAdapter(Adapter47 .class)
    protected String phoneNumberAreaCode;
    @XmlJavaTypeAdapter(Adapter48 .class)
    protected String phoneNumberSubscriber;
    @XmlJavaTypeAdapter(Adapter49 .class)
    protected String phoneNumber;
    @XmlJavaTypeAdapter(Adapter50 .class)
    protected String cellPhoneNumberCountryCode;
    @XmlJavaTypeAdapter(Adapter51 .class)
    protected String cellPhoneNumberAreaCode;
    @XmlJavaTypeAdapter(Adapter52 .class)
    protected String cellPhoneNumberSubscriber;
    @XmlJavaTypeAdapter(Adapter53 .class)
    protected String cellPhoneNumber;
    protected Address address;
    @XmlSchemaType(name = "string")
    protected CountryCode countryCode;
    @XmlJavaTypeAdapter(Adapter54 .class)
    protected String title;
    @XmlJavaTypeAdapter(Adapter55 .class)
    protected String additionName;
    @XmlJavaTypeAdapter(Adapter56 .class)
    protected String company;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected URL homepageUrl;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected URL portraitUrl;
    @XmlJavaTypeAdapter(Adapter57 .class)
    protected String position;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link SalutationType }
     *     
     */
    public SalutationType getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalutationType }
     *     
     */
    public void setSalutation(SalutationType value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the faxNumberCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumberCountryCode() {
        return faxNumberCountryCode;
    }

    /**
     * Sets the value of the faxNumberCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumberCountryCode(String value) {
        this.faxNumberCountryCode = value;
    }

    /**
     * Gets the value of the faxNumberAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumberAreaCode() {
        return faxNumberAreaCode;
    }

    /**
     * Sets the value of the faxNumberAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumberAreaCode(String value) {
        this.faxNumberAreaCode = value;
    }

    /**
     * Gets the value of the faxNumberSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumberSubscriber() {
        return faxNumberSubscriber;
    }

    /**
     * Sets the value of the faxNumberSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumberSubscriber(String value) {
        this.faxNumberSubscriber = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the phoneNumberCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberCountryCode() {
        return phoneNumberCountryCode;
    }

    /**
     * Sets the value of the phoneNumberCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberCountryCode(String value) {
        this.phoneNumberCountryCode = value;
    }

    /**
     * Gets the value of the phoneNumberAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberAreaCode() {
        return phoneNumberAreaCode;
    }

    /**
     * Sets the value of the phoneNumberAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberAreaCode(String value) {
        this.phoneNumberAreaCode = value;
    }

    /**
     * Gets the value of the phoneNumberSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberSubscriber() {
        return phoneNumberSubscriber;
    }

    /**
     * Sets the value of the phoneNumberSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberSubscriber(String value) {
        this.phoneNumberSubscriber = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the cellPhoneNumberCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhoneNumberCountryCode() {
        return cellPhoneNumberCountryCode;
    }

    /**
     * Sets the value of the cellPhoneNumberCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhoneNumberCountryCode(String value) {
        this.cellPhoneNumberCountryCode = value;
    }

    /**
     * Gets the value of the cellPhoneNumberAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhoneNumberAreaCode() {
        return cellPhoneNumberAreaCode;
    }

    /**
     * Sets the value of the cellPhoneNumberAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhoneNumberAreaCode(String value) {
        this.cellPhoneNumberAreaCode = value;
    }

    /**
     * Gets the value of the cellPhoneNumberSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhoneNumberSubscriber() {
        return cellPhoneNumberSubscriber;
    }

    /**
     * Sets the value of the cellPhoneNumberSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhoneNumberSubscriber(String value) {
        this.cellPhoneNumberSubscriber = value;
    }

    /**
     * Gets the value of the cellPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    /**
     * Sets the value of the cellPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhoneNumber(String value) {
        this.cellPhoneNumber = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCode }
     *     
     */
    public CountryCode getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCode }
     *     
     */
    public void setCountryCode(CountryCode value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the additionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionName() {
        return additionName;
    }

    /**
     * Sets the value of the additionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionName(String value) {
        this.additionName = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the homepageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URL getHomepageUrl() {
        return homepageUrl;
    }

    /**
     * Sets the value of the homepageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomepageUrl(URL value) {
        this.homepageUrl = value;
    }

    /**
     * Gets the value of the portraitUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URL getPortraitUrl() {
        return portraitUrl;
    }

    /**
     * Sets the value of the portraitUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortraitUrl(URL value) {
        this.portraitUrl = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
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
            String theEmail;
            theEmail = this.getEmail();
            strategy.appendField(locator, this, "email", buffer, theEmail);
        }
        {
            SalutationType theSalutation;
            theSalutation = this.getSalutation();
            strategy.appendField(locator, this, "salutation", buffer, theSalutation);
        }
        {
            String theFirstname;
            theFirstname = this.getFirstname();
            strategy.appendField(locator, this, "firstname", buffer, theFirstname);
        }
        {
            String theLastname;
            theLastname = this.getLastname();
            strategy.appendField(locator, this, "lastname", buffer, theLastname);
        }
        {
            String theFaxNumberCountryCode;
            theFaxNumberCountryCode = this.getFaxNumberCountryCode();
            strategy.appendField(locator, this, "faxNumberCountryCode", buffer, theFaxNumberCountryCode);
        }
        {
            String theFaxNumberAreaCode;
            theFaxNumberAreaCode = this.getFaxNumberAreaCode();
            strategy.appendField(locator, this, "faxNumberAreaCode", buffer, theFaxNumberAreaCode);
        }
        {
            String theFaxNumberSubscriber;
            theFaxNumberSubscriber = this.getFaxNumberSubscriber();
            strategy.appendField(locator, this, "faxNumberSubscriber", buffer, theFaxNumberSubscriber);
        }
        {
            String theFaxNumber;
            theFaxNumber = this.getFaxNumber();
            strategy.appendField(locator, this, "faxNumber", buffer, theFaxNumber);
        }
        {
            String thePhoneNumberCountryCode;
            thePhoneNumberCountryCode = this.getPhoneNumberCountryCode();
            strategy.appendField(locator, this, "phoneNumberCountryCode", buffer, thePhoneNumberCountryCode);
        }
        {
            String thePhoneNumberAreaCode;
            thePhoneNumberAreaCode = this.getPhoneNumberAreaCode();
            strategy.appendField(locator, this, "phoneNumberAreaCode", buffer, thePhoneNumberAreaCode);
        }
        {
            String thePhoneNumberSubscriber;
            thePhoneNumberSubscriber = this.getPhoneNumberSubscriber();
            strategy.appendField(locator, this, "phoneNumberSubscriber", buffer, thePhoneNumberSubscriber);
        }
        {
            String thePhoneNumber;
            thePhoneNumber = this.getPhoneNumber();
            strategy.appendField(locator, this, "phoneNumber", buffer, thePhoneNumber);
        }
        {
            String theCellPhoneNumberCountryCode;
            theCellPhoneNumberCountryCode = this.getCellPhoneNumberCountryCode();
            strategy.appendField(locator, this, "cellPhoneNumberCountryCode", buffer, theCellPhoneNumberCountryCode);
        }
        {
            String theCellPhoneNumberAreaCode;
            theCellPhoneNumberAreaCode = this.getCellPhoneNumberAreaCode();
            strategy.appendField(locator, this, "cellPhoneNumberAreaCode", buffer, theCellPhoneNumberAreaCode);
        }
        {
            String theCellPhoneNumberSubscriber;
            theCellPhoneNumberSubscriber = this.getCellPhoneNumberSubscriber();
            strategy.appendField(locator, this, "cellPhoneNumberSubscriber", buffer, theCellPhoneNumberSubscriber);
        }
        {
            String theCellPhoneNumber;
            theCellPhoneNumber = this.getCellPhoneNumber();
            strategy.appendField(locator, this, "cellPhoneNumber", buffer, theCellPhoneNumber);
        }
        {
            Address theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress);
        }
        {
            CountryCode theCountryCode;
            theCountryCode = this.getCountryCode();
            strategy.appendField(locator, this, "countryCode", buffer, theCountryCode);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle);
        }
        {
            String theAdditionName;
            theAdditionName = this.getAdditionName();
            strategy.appendField(locator, this, "additionName", buffer, theAdditionName);
        }
        {
            String theCompany;
            theCompany = this.getCompany();
            strategy.appendField(locator, this, "company", buffer, theCompany);
        }
        {
            URL theHomepageUrl;
            theHomepageUrl = this.getHomepageUrl();
            strategy.appendField(locator, this, "homepageUrl", buffer, theHomepageUrl);
        }
        {
            URL thePortraitUrl;
            thePortraitUrl = this.getPortraitUrl();
            strategy.appendField(locator, this, "portraitUrl", buffer, thePortraitUrl);
        }
        {
            String thePosition;
            thePosition = this.getPosition();
            strategy.appendField(locator, this, "position", buffer, thePosition);
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
        if (draftCopy instanceof BaseContactDetails) {
            final BaseContactDetails copy = ((BaseContactDetails) draftCopy);
            if (this.email!= null) {
                String sourceEmail;
                sourceEmail = this.getEmail();
                String copyEmail = ((String) strategy.copy(LocatorUtils.property(locator, "email", sourceEmail), sourceEmail));
                copy.setEmail(copyEmail);
            } else {
                copy.email = null;
            }
            if (this.salutation!= null) {
                SalutationType sourceSalutation;
                sourceSalutation = this.getSalutation();
                SalutationType copySalutation = ((SalutationType) strategy.copy(LocatorUtils.property(locator, "salutation", sourceSalutation), sourceSalutation));
                copy.setSalutation(copySalutation);
            } else {
                copy.salutation = null;
            }
            if (this.firstname!= null) {
                String sourceFirstname;
                sourceFirstname = this.getFirstname();
                String copyFirstname = ((String) strategy.copy(LocatorUtils.property(locator, "firstname", sourceFirstname), sourceFirstname));
                copy.setFirstname(copyFirstname);
            } else {
                copy.firstname = null;
            }
            if (this.lastname!= null) {
                String sourceLastname;
                sourceLastname = this.getLastname();
                String copyLastname = ((String) strategy.copy(LocatorUtils.property(locator, "lastname", sourceLastname), sourceLastname));
                copy.setLastname(copyLastname);
            } else {
                copy.lastname = null;
            }
            if (this.faxNumberCountryCode!= null) {
                String sourceFaxNumberCountryCode;
                sourceFaxNumberCountryCode = this.getFaxNumberCountryCode();
                String copyFaxNumberCountryCode = ((String) strategy.copy(LocatorUtils.property(locator, "faxNumberCountryCode", sourceFaxNumberCountryCode), sourceFaxNumberCountryCode));
                copy.setFaxNumberCountryCode(copyFaxNumberCountryCode);
            } else {
                copy.faxNumberCountryCode = null;
            }
            if (this.faxNumberAreaCode!= null) {
                String sourceFaxNumberAreaCode;
                sourceFaxNumberAreaCode = this.getFaxNumberAreaCode();
                String copyFaxNumberAreaCode = ((String) strategy.copy(LocatorUtils.property(locator, "faxNumberAreaCode", sourceFaxNumberAreaCode), sourceFaxNumberAreaCode));
                copy.setFaxNumberAreaCode(copyFaxNumberAreaCode);
            } else {
                copy.faxNumberAreaCode = null;
            }
            if (this.faxNumberSubscriber!= null) {
                String sourceFaxNumberSubscriber;
                sourceFaxNumberSubscriber = this.getFaxNumberSubscriber();
                String copyFaxNumberSubscriber = ((String) strategy.copy(LocatorUtils.property(locator, "faxNumberSubscriber", sourceFaxNumberSubscriber), sourceFaxNumberSubscriber));
                copy.setFaxNumberSubscriber(copyFaxNumberSubscriber);
            } else {
                copy.faxNumberSubscriber = null;
            }
            if (this.faxNumber!= null) {
                String sourceFaxNumber;
                sourceFaxNumber = this.getFaxNumber();
                String copyFaxNumber = ((String) strategy.copy(LocatorUtils.property(locator, "faxNumber", sourceFaxNumber), sourceFaxNumber));
                copy.setFaxNumber(copyFaxNumber);
            } else {
                copy.faxNumber = null;
            }
            if (this.phoneNumberCountryCode!= null) {
                String sourcePhoneNumberCountryCode;
                sourcePhoneNumberCountryCode = this.getPhoneNumberCountryCode();
                String copyPhoneNumberCountryCode = ((String) strategy.copy(LocatorUtils.property(locator, "phoneNumberCountryCode", sourcePhoneNumberCountryCode), sourcePhoneNumberCountryCode));
                copy.setPhoneNumberCountryCode(copyPhoneNumberCountryCode);
            } else {
                copy.phoneNumberCountryCode = null;
            }
            if (this.phoneNumberAreaCode!= null) {
                String sourcePhoneNumberAreaCode;
                sourcePhoneNumberAreaCode = this.getPhoneNumberAreaCode();
                String copyPhoneNumberAreaCode = ((String) strategy.copy(LocatorUtils.property(locator, "phoneNumberAreaCode", sourcePhoneNumberAreaCode), sourcePhoneNumberAreaCode));
                copy.setPhoneNumberAreaCode(copyPhoneNumberAreaCode);
            } else {
                copy.phoneNumberAreaCode = null;
            }
            if (this.phoneNumberSubscriber!= null) {
                String sourcePhoneNumberSubscriber;
                sourcePhoneNumberSubscriber = this.getPhoneNumberSubscriber();
                String copyPhoneNumberSubscriber = ((String) strategy.copy(LocatorUtils.property(locator, "phoneNumberSubscriber", sourcePhoneNumberSubscriber), sourcePhoneNumberSubscriber));
                copy.setPhoneNumberSubscriber(copyPhoneNumberSubscriber);
            } else {
                copy.phoneNumberSubscriber = null;
            }
            if (this.phoneNumber!= null) {
                String sourcePhoneNumber;
                sourcePhoneNumber = this.getPhoneNumber();
                String copyPhoneNumber = ((String) strategy.copy(LocatorUtils.property(locator, "phoneNumber", sourcePhoneNumber), sourcePhoneNumber));
                copy.setPhoneNumber(copyPhoneNumber);
            } else {
                copy.phoneNumber = null;
            }
            if (this.cellPhoneNumberCountryCode!= null) {
                String sourceCellPhoneNumberCountryCode;
                sourceCellPhoneNumberCountryCode = this.getCellPhoneNumberCountryCode();
                String copyCellPhoneNumberCountryCode = ((String) strategy.copy(LocatorUtils.property(locator, "cellPhoneNumberCountryCode", sourceCellPhoneNumberCountryCode), sourceCellPhoneNumberCountryCode));
                copy.setCellPhoneNumberCountryCode(copyCellPhoneNumberCountryCode);
            } else {
                copy.cellPhoneNumberCountryCode = null;
            }
            if (this.cellPhoneNumberAreaCode!= null) {
                String sourceCellPhoneNumberAreaCode;
                sourceCellPhoneNumberAreaCode = this.getCellPhoneNumberAreaCode();
                String copyCellPhoneNumberAreaCode = ((String) strategy.copy(LocatorUtils.property(locator, "cellPhoneNumberAreaCode", sourceCellPhoneNumberAreaCode), sourceCellPhoneNumberAreaCode));
                copy.setCellPhoneNumberAreaCode(copyCellPhoneNumberAreaCode);
            } else {
                copy.cellPhoneNumberAreaCode = null;
            }
            if (this.cellPhoneNumberSubscriber!= null) {
                String sourceCellPhoneNumberSubscriber;
                sourceCellPhoneNumberSubscriber = this.getCellPhoneNumberSubscriber();
                String copyCellPhoneNumberSubscriber = ((String) strategy.copy(LocatorUtils.property(locator, "cellPhoneNumberSubscriber", sourceCellPhoneNumberSubscriber), sourceCellPhoneNumberSubscriber));
                copy.setCellPhoneNumberSubscriber(copyCellPhoneNumberSubscriber);
            } else {
                copy.cellPhoneNumberSubscriber = null;
            }
            if (this.cellPhoneNumber!= null) {
                String sourceCellPhoneNumber;
                sourceCellPhoneNumber = this.getCellPhoneNumber();
                String copyCellPhoneNumber = ((String) strategy.copy(LocatorUtils.property(locator, "cellPhoneNumber", sourceCellPhoneNumber), sourceCellPhoneNumber));
                copy.setCellPhoneNumber(copyCellPhoneNumber);
            } else {
                copy.cellPhoneNumber = null;
            }
            if (this.address!= null) {
                Address sourceAddress;
                sourceAddress = this.getAddress();
                Address copyAddress = ((Address) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress));
                copy.setAddress(copyAddress);
            } else {
                copy.address = null;
            }
            if (this.countryCode!= null) {
                CountryCode sourceCountryCode;
                sourceCountryCode = this.getCountryCode();
                CountryCode copyCountryCode = ((CountryCode) strategy.copy(LocatorUtils.property(locator, "countryCode", sourceCountryCode), sourceCountryCode));
                copy.setCountryCode(copyCountryCode);
            } else {
                copy.countryCode = null;
            }
            if (this.title!= null) {
                String sourceTitle;
                sourceTitle = this.getTitle();
                String copyTitle = ((String) strategy.copy(LocatorUtils.property(locator, "title", sourceTitle), sourceTitle));
                copy.setTitle(copyTitle);
            } else {
                copy.title = null;
            }
            if (this.additionName!= null) {
                String sourceAdditionName;
                sourceAdditionName = this.getAdditionName();
                String copyAdditionName = ((String) strategy.copy(LocatorUtils.property(locator, "additionName", sourceAdditionName), sourceAdditionName));
                copy.setAdditionName(copyAdditionName);
            } else {
                copy.additionName = null;
            }
            if (this.company!= null) {
                String sourceCompany;
                sourceCompany = this.getCompany();
                String copyCompany = ((String) strategy.copy(LocatorUtils.property(locator, "company", sourceCompany), sourceCompany));
                copy.setCompany(copyCompany);
            } else {
                copy.company = null;
            }
            if (this.homepageUrl!= null) {
                URL sourceHomepageUrl;
                sourceHomepageUrl = this.getHomepageUrl();
                URL copyHomepageUrl = ((URL) strategy.copy(LocatorUtils.property(locator, "homepageUrl", sourceHomepageUrl), sourceHomepageUrl));
                copy.setHomepageUrl(copyHomepageUrl);
            } else {
                copy.homepageUrl = null;
            }
            if (this.portraitUrl!= null) {
                URL sourcePortraitUrl;
                sourcePortraitUrl = this.getPortraitUrl();
                URL copyPortraitUrl = ((URL) strategy.copy(LocatorUtils.property(locator, "portraitUrl", sourcePortraitUrl), sourcePortraitUrl));
                copy.setPortraitUrl(copyPortraitUrl);
            } else {
                copy.portraitUrl = null;
            }
            if (this.position!= null) {
                String sourcePosition;
                sourcePosition = this.getPosition();
                String copyPosition = ((String) strategy.copy(LocatorUtils.property(locator, "position", sourcePosition), sourcePosition));
                copy.setPosition(copyPosition);
            } else {
                copy.position = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BaseContactDetails();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BaseContactDetails that = ((BaseContactDetails) object);
        {
            String lhsEmail;
            lhsEmail = this.getEmail();
            String rhsEmail;
            rhsEmail = that.getEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "email", lhsEmail), LocatorUtils.property(thatLocator, "email", rhsEmail), lhsEmail, rhsEmail)) {
                return false;
            }
        }
        {
            SalutationType lhsSalutation;
            lhsSalutation = this.getSalutation();
            SalutationType rhsSalutation;
            rhsSalutation = that.getSalutation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salutation", lhsSalutation), LocatorUtils.property(thatLocator, "salutation", rhsSalutation), lhsSalutation, rhsSalutation)) {
                return false;
            }
        }
        {
            String lhsFirstname;
            lhsFirstname = this.getFirstname();
            String rhsFirstname;
            rhsFirstname = that.getFirstname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstname", lhsFirstname), LocatorUtils.property(thatLocator, "firstname", rhsFirstname), lhsFirstname, rhsFirstname)) {
                return false;
            }
        }
        {
            String lhsLastname;
            lhsLastname = this.getLastname();
            String rhsLastname;
            rhsLastname = that.getLastname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastname", lhsLastname), LocatorUtils.property(thatLocator, "lastname", rhsLastname), lhsLastname, rhsLastname)) {
                return false;
            }
        }
        {
            String lhsFaxNumberCountryCode;
            lhsFaxNumberCountryCode = this.getFaxNumberCountryCode();
            String rhsFaxNumberCountryCode;
            rhsFaxNumberCountryCode = that.getFaxNumberCountryCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "faxNumberCountryCode", lhsFaxNumberCountryCode), LocatorUtils.property(thatLocator, "faxNumberCountryCode", rhsFaxNumberCountryCode), lhsFaxNumberCountryCode, rhsFaxNumberCountryCode)) {
                return false;
            }
        }
        {
            String lhsFaxNumberAreaCode;
            lhsFaxNumberAreaCode = this.getFaxNumberAreaCode();
            String rhsFaxNumberAreaCode;
            rhsFaxNumberAreaCode = that.getFaxNumberAreaCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "faxNumberAreaCode", lhsFaxNumberAreaCode), LocatorUtils.property(thatLocator, "faxNumberAreaCode", rhsFaxNumberAreaCode), lhsFaxNumberAreaCode, rhsFaxNumberAreaCode)) {
                return false;
            }
        }
        {
            String lhsFaxNumberSubscriber;
            lhsFaxNumberSubscriber = this.getFaxNumberSubscriber();
            String rhsFaxNumberSubscriber;
            rhsFaxNumberSubscriber = that.getFaxNumberSubscriber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "faxNumberSubscriber", lhsFaxNumberSubscriber), LocatorUtils.property(thatLocator, "faxNumberSubscriber", rhsFaxNumberSubscriber), lhsFaxNumberSubscriber, rhsFaxNumberSubscriber)) {
                return false;
            }
        }
        {
            String lhsFaxNumber;
            lhsFaxNumber = this.getFaxNumber();
            String rhsFaxNumber;
            rhsFaxNumber = that.getFaxNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "faxNumber", lhsFaxNumber), LocatorUtils.property(thatLocator, "faxNumber", rhsFaxNumber), lhsFaxNumber, rhsFaxNumber)) {
                return false;
            }
        }
        {
            String lhsPhoneNumberCountryCode;
            lhsPhoneNumberCountryCode = this.getPhoneNumberCountryCode();
            String rhsPhoneNumberCountryCode;
            rhsPhoneNumberCountryCode = that.getPhoneNumberCountryCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phoneNumberCountryCode", lhsPhoneNumberCountryCode), LocatorUtils.property(thatLocator, "phoneNumberCountryCode", rhsPhoneNumberCountryCode), lhsPhoneNumberCountryCode, rhsPhoneNumberCountryCode)) {
                return false;
            }
        }
        {
            String lhsPhoneNumberAreaCode;
            lhsPhoneNumberAreaCode = this.getPhoneNumberAreaCode();
            String rhsPhoneNumberAreaCode;
            rhsPhoneNumberAreaCode = that.getPhoneNumberAreaCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phoneNumberAreaCode", lhsPhoneNumberAreaCode), LocatorUtils.property(thatLocator, "phoneNumberAreaCode", rhsPhoneNumberAreaCode), lhsPhoneNumberAreaCode, rhsPhoneNumberAreaCode)) {
                return false;
            }
        }
        {
            String lhsPhoneNumberSubscriber;
            lhsPhoneNumberSubscriber = this.getPhoneNumberSubscriber();
            String rhsPhoneNumberSubscriber;
            rhsPhoneNumberSubscriber = that.getPhoneNumberSubscriber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phoneNumberSubscriber", lhsPhoneNumberSubscriber), LocatorUtils.property(thatLocator, "phoneNumberSubscriber", rhsPhoneNumberSubscriber), lhsPhoneNumberSubscriber, rhsPhoneNumberSubscriber)) {
                return false;
            }
        }
        {
            String lhsPhoneNumber;
            lhsPhoneNumber = this.getPhoneNumber();
            String rhsPhoneNumber;
            rhsPhoneNumber = that.getPhoneNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phoneNumber", lhsPhoneNumber), LocatorUtils.property(thatLocator, "phoneNumber", rhsPhoneNumber), lhsPhoneNumber, rhsPhoneNumber)) {
                return false;
            }
        }
        {
            String lhsCellPhoneNumberCountryCode;
            lhsCellPhoneNumberCountryCode = this.getCellPhoneNumberCountryCode();
            String rhsCellPhoneNumberCountryCode;
            rhsCellPhoneNumberCountryCode = that.getCellPhoneNumberCountryCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellPhoneNumberCountryCode", lhsCellPhoneNumberCountryCode), LocatorUtils.property(thatLocator, "cellPhoneNumberCountryCode", rhsCellPhoneNumberCountryCode), lhsCellPhoneNumberCountryCode, rhsCellPhoneNumberCountryCode)) {
                return false;
            }
        }
        {
            String lhsCellPhoneNumberAreaCode;
            lhsCellPhoneNumberAreaCode = this.getCellPhoneNumberAreaCode();
            String rhsCellPhoneNumberAreaCode;
            rhsCellPhoneNumberAreaCode = that.getCellPhoneNumberAreaCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellPhoneNumberAreaCode", lhsCellPhoneNumberAreaCode), LocatorUtils.property(thatLocator, "cellPhoneNumberAreaCode", rhsCellPhoneNumberAreaCode), lhsCellPhoneNumberAreaCode, rhsCellPhoneNumberAreaCode)) {
                return false;
            }
        }
        {
            String lhsCellPhoneNumberSubscriber;
            lhsCellPhoneNumberSubscriber = this.getCellPhoneNumberSubscriber();
            String rhsCellPhoneNumberSubscriber;
            rhsCellPhoneNumberSubscriber = that.getCellPhoneNumberSubscriber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellPhoneNumberSubscriber", lhsCellPhoneNumberSubscriber), LocatorUtils.property(thatLocator, "cellPhoneNumberSubscriber", rhsCellPhoneNumberSubscriber), lhsCellPhoneNumberSubscriber, rhsCellPhoneNumberSubscriber)) {
                return false;
            }
        }
        {
            String lhsCellPhoneNumber;
            lhsCellPhoneNumber = this.getCellPhoneNumber();
            String rhsCellPhoneNumber;
            rhsCellPhoneNumber = that.getCellPhoneNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellPhoneNumber", lhsCellPhoneNumber), LocatorUtils.property(thatLocator, "cellPhoneNumber", rhsCellPhoneNumber), lhsCellPhoneNumber, rhsCellPhoneNumber)) {
                return false;
            }
        }
        {
            Address lhsAddress;
            lhsAddress = this.getAddress();
            Address rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress)) {
                return false;
            }
        }
        {
            CountryCode lhsCountryCode;
            lhsCountryCode = this.getCountryCode();
            CountryCode rhsCountryCode;
            rhsCountryCode = that.getCountryCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countryCode", lhsCountryCode), LocatorUtils.property(thatLocator, "countryCode", rhsCountryCode), lhsCountryCode, rhsCountryCode)) {
                return false;
            }
        }
        {
            String lhsTitle;
            lhsTitle = this.getTitle();
            String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle)) {
                return false;
            }
        }
        {
            String lhsAdditionName;
            lhsAdditionName = this.getAdditionName();
            String rhsAdditionName;
            rhsAdditionName = that.getAdditionName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionName", lhsAdditionName), LocatorUtils.property(thatLocator, "additionName", rhsAdditionName), lhsAdditionName, rhsAdditionName)) {
                return false;
            }
        }
        {
            String lhsCompany;
            lhsCompany = this.getCompany();
            String rhsCompany;
            rhsCompany = that.getCompany();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "company", lhsCompany), LocatorUtils.property(thatLocator, "company", rhsCompany), lhsCompany, rhsCompany)) {
                return false;
            }
        }
        {
            URL lhsHomepageUrl;
            lhsHomepageUrl = this.getHomepageUrl();
            URL rhsHomepageUrl;
            rhsHomepageUrl = that.getHomepageUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "homepageUrl", lhsHomepageUrl), LocatorUtils.property(thatLocator, "homepageUrl", rhsHomepageUrl), lhsHomepageUrl, rhsHomepageUrl)) {
                return false;
            }
        }
        {
            URL lhsPortraitUrl;
            lhsPortraitUrl = this.getPortraitUrl();
            URL rhsPortraitUrl;
            rhsPortraitUrl = that.getPortraitUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "portraitUrl", lhsPortraitUrl), LocatorUtils.property(thatLocator, "portraitUrl", rhsPortraitUrl), lhsPortraitUrl, rhsPortraitUrl)) {
                return false;
            }
        }
        {
            String lhsPosition;
            lhsPosition = this.getPosition();
            String rhsPosition;
            rhsPosition = that.getPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "position", lhsPosition), LocatorUtils.property(thatLocator, "position", rhsPosition), lhsPosition, rhsPosition)) {
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
