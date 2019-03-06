
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="uname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "uname",
    "upass"
})
@XmlRootElement(name = "GetProducts")
public class GetProducts {

    protected String uname;
    protected String upass;

    /**
     * Gets the value of the uname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUname() {
        return uname;
    }

    /**
     * Sets the value of the uname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUname(String value) {
        this.uname = value;
    }

    /**
     * Gets the value of the upass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpass() {
        return upass;
    }

    /**
     * Sets the value of the upass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpass(String value) {
        this.upass = value;
    }

}
