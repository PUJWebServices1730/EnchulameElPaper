
package com.enchulame.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para articulo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="articulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="archivo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="autoridUsuario" type="{http://ws.enchulame.com/}autor" minOccurs="0"/>
 *         &lt;element name="entregaidEntrega" type="{http://ws.enchulame.com/}entrega" minOccurs="0"/>
 *         &lt;element name="idArticulo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "articulo", propOrder = {
    "archivo",
    "autoridUsuario",
    "entregaidEntrega",
    "idArticulo",
    "nombre",
    "resumen"
})
public class Articulo {

    protected byte[] archivo;
    protected Autor autoridUsuario;
    protected Entrega entregaidEntrega;
    protected Integer idArticulo;
    protected String nombre;
    protected String resumen;

    /**
     * Obtiene el valor de la propiedad archivo.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getArchivo() {
        return archivo;
    }

    /**
     * Define el valor de la propiedad archivo.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setArchivo(byte[] value) {
        this.archivo = value;
    }

    /**
     * Obtiene el valor de la propiedad autoridUsuario.
     * 
     * @return
     *     possible object is
     *     {@link Autor }
     *     
     */
    public Autor getAutoridUsuario() {
        return autoridUsuario;
    }

    /**
     * Define el valor de la propiedad autoridUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Autor }
     *     
     */
    public void setAutoridUsuario(Autor value) {
        this.autoridUsuario = value;
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
     * Obtiene el valor de la propiedad idArticulo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdArticulo() {
        return idArticulo;
    }

    /**
     * Define el valor de la propiedad idArticulo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdArticulo(Integer value) {
        this.idArticulo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad resumen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResumen() {
        return resumen;
    }

    /**
     * Define el valor de la propiedad resumen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResumen(String value) {
        this.resumen = value;
    }

}
