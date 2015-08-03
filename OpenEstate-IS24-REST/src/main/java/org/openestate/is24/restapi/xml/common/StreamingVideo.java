
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
 * Ein gestreamtes Video
 * 
 * <p>Java class for StreamingVideo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreamingVideo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}Attachment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="videoId" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/&gt;
 *         &lt;element name="videoInfo" type="{http://rest.immobilienscout24.de/schema/common/1.0}VideoInfo" maxOccurs="0" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamingVideo", propOrder = {
    "videoId"
})
public class StreamingVideo
    extends Attachment
    implements Cloneable, CopyTo, Equals, ToString
{

    protected String videoId;

    /**
     * Gets the value of the videoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoId() {
        return videoId;
    }

    /**
     * Sets the value of the videoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoId(String value) {
        this.videoId = value;
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
            String theVideoId;
            theVideoId = this.getVideoId();
            strategy.appendField(locator, this, "videoId", buffer, theVideoId);
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
        if (draftCopy instanceof StreamingVideo) {
            final StreamingVideo copy = ((StreamingVideo) draftCopy);
            if (this.videoId!= null) {
                String sourceVideoId;
                sourceVideoId = this.getVideoId();
                String copyVideoId = ((String) strategy.copy(LocatorUtils.property(locator, "videoId", sourceVideoId), sourceVideoId));
                copy.setVideoId(copyVideoId);
            } else {
                copy.videoId = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new StreamingVideo();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StreamingVideo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final StreamingVideo that = ((StreamingVideo) object);
        {
            String lhsVideoId;
            lhsVideoId = this.getVideoId();
            String rhsVideoId;
            rhsVideoId = that.getVideoId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "videoId", lhsVideoId), LocatorUtils.property(thatLocator, "videoId", rhsVideoId), lhsVideoId, rhsVideoId)) {
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
