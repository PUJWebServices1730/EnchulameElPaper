
package com.enchulame.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para entrega complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="entrega">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="copyright" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventoidEvento" type="{http://ws.enchulame.com/}evento" minOccurs="0"/>
 *         &lt;element name="fechaEnvio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idEntrega" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="notaFinal" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entrega", propOrder = {
    "copyright",
    "estado",
    "eventoidEvento",
    "fechaEnvio",
    "idEntrega",
    "notaFinal"
})
public class Entrega {

    protected short copyright;
    protected String estado;
    protected Evento eventoidEvento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEnvio;
    protected Integer idEntrega;
    protected float notaFinal;

    /**
     * Obtiene el valor de la propiedad copyright.
     * 
     */
    public short getCopyright() {
        return copyright;
    }

    /**
     * Define el valor de la propiedad copyright.
     * 
     */
    public void setCopyright(short value) {
        this.copyright = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad eventoidEvento.
     * 
     * @return
     *     possible object is
     *     {@link Evento }
     *     
     */
    public Evento getEventoidEvento() {
        return eventoidEvento;
    }

    /**
     * Define el valor de la propiedad eventoidEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link Evento }
     *     
     */
    public void setEventoidEvento(Evento value) {
        this.eventoidEvento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEnvio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEnvio() {
        return fechaEnvio;
    }

    /**
     * Define el valor de la propiedad fechaEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEnvio(XMLGregorianCalendar value) {
        this.fechaEnvio = value;
    }

    /**
     * Obtiene el valor de la propiedad idEntrega.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdEntrega() {
        return idEntrega;
    }

    /**
     * Define el valor de la propiedad idEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdEntrega(Integer value) {
        this.idEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad notaFinal.
     * 
     */
    public float getNotaFinal() {
        return notaFinal;
    }

    /**
     * Define el valor de la propiedad notaFinal.
     * 
     */
    public void setNotaFinal(float value) {
        this.notaFinal = value;
    }

}
