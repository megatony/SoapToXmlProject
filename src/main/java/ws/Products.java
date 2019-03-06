
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Products complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Products">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MARKA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ARAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Liste_Fiyati" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Liste_Fiyati_Birimi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Stok_Durumu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mesaj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Products", propOrder = {
    "kod",
    "aciklama",
    "oem",
    "marka",
    "arac",
    "listeFiyati",
    "listeFiyatiBirimi",
    "stokDurumu",
    "mesaj"
})
public class Products {

    @XmlElement(name = "KOD")
    protected String kod;
    @XmlElement(name = "ACIKLAMA")
    protected String aciklama;
    @XmlElement(name = "OEM")
    protected String oem;
    @XmlElement(name = "MARKA")
    protected String marka;
    @XmlElement(name = "ARAC")
    protected String arac;
    @XmlElement(name = "Liste_Fiyati")
    protected String listeFiyati;
    @XmlElement(name = "Liste_Fiyati_Birimi")
    protected String listeFiyatiBirimi;
    @XmlElement(name = "Stok_Durumu")
    protected String stokDurumu;
    @XmlElement(name = "Mesaj")
    protected String mesaj;

    /**
     * Gets the value of the kod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOD() {
        return kod;
    }

    /**
     * Sets the value of the kod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOD(String value) {
        this.kod = value;
    }

    /**
     * Gets the value of the aciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA() {
        return aciklama;
    }

    /**
     * Sets the value of the aciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA(String value) {
        this.aciklama = value;
    }

    /**
     * Gets the value of the oem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOEM() {
        return oem;
    }

    /**
     * Sets the value of the oem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOEM(String value) {
        this.oem = value;
    }

    /**
     * Gets the value of the marka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMARKA() {
        return marka;
    }

    /**
     * Sets the value of the marka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMARKA(String value) {
        this.marka = value;
    }

    /**
     * Gets the value of the arac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARAC() {
        return arac;
    }

    /**
     * Sets the value of the arac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARAC(String value) {
        this.arac = value;
    }

    /**
     * Gets the value of the listeFiyati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListeFiyati() {
        return listeFiyati;
    }

    /**
     * Sets the value of the listeFiyati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListeFiyati(String value) {
        this.listeFiyati = value;
    }

    /**
     * Gets the value of the listeFiyatiBirimi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListeFiyatiBirimi() {
        return listeFiyatiBirimi;
    }

    /**
     * Sets the value of the listeFiyatiBirimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListeFiyatiBirimi(String value) {
        this.listeFiyatiBirimi = value;
    }

    /**
     * Gets the value of the stokDurumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStokDurumu() {
        return stokDurumu;
    }

    /**
     * Sets the value of the stokDurumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStokDurumu(String value) {
        this.stokDurumu = value;
    }

    /**
     * Gets the value of the mesaj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesaj() {
        return mesaj;
    }

    /**
     * Sets the value of the mesaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesaj(String value) {
        this.mesaj = value;
    }

}
