
package com.enchulame.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para revision complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="revision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entregaidEntrega" type="{http://ws.enchulame.com/}entrega" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idRevision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nota" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="revisado" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="revisoridUsuario" type="{http://ws.enchulame.com/}revisor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "revision", propOrder = {
    "comentario",
    "entregaidEntrega",
    "fecha",
    "idRevision",
    "nota",
    "revisado",
    "revisoridUsuario"
})
public class Revision {

    protected String comentario;
    protected Entrega entregaidEntrega;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected Integer idRevision;
    protected float nota;
    protected Short revisado;
    protected Revisor revisoridUsuario;

    /**
     * Obtiene el valor de la propiedad comentario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Define el valor de la propiedad comentario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentario(String value) {
        this.comentario = value;
    }

    /**
     * Obtiene el valor de la propiedad entregaidEntrega.
     * 
     * @return
     *     possible object is
     *     {@link Entrega }
     *     
     */
    public Entrega getEntregaidEntrega() {
        return entregaidEntrega;
    }

    /**
     * Define el valor de la propiedad entregaidEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link Entrega }
     *     
     */
    public void setEntregaidEntrega(Entrega value) {
        this.entregaidEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad idRevision.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdRevision() {
        return idRevision;
    }

    /**
     * Define el valor de la propiedad idRevision.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdRevision(Integer value) {
        this.idRevision = value;
    }

    /**
     * Obtiene el valor de la propiedad nota.
     * 
     */
    public float getNota() {
        return nota;
    }

    /**
     * Define el valor de la propiedad nota.
     * 
     */
    public void setNota(float value) {
        this.nota = value;
    }

    /**
     * Obtiene el valor de la propiedad revisado.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRevisado() {
        return revisado;
    }

    /**
     * Define el valor de la propiedad revisado.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRevisado(Short value) {
        this.revisado = value;
    }

    /**
     * Obtiene el valor de la propiedad revisoridUsuario.
     * 
     * @return
     *     possible object is
     *     {@link Revisor }
     *     
     */
    public Revisor getRevisoridUsuario() {
        return revisoridUsuario;
    }

    /**
     * Define el valor de la propiedad revisoridUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Revisor }
     *     
     */
    public void setRevisoridUsuario(Revisor value) {
        this.revisoridUsuario = value;
    }

}
