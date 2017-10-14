
package com.enchulame.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "crearArticulo", namespace = "http://ws.enchulame.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearArticulo", namespace = "http://ws.enchulame.com/")
public class CrearArticulo {

    @XmlElement(name = "arg0", namespace = "")
    private com.enchulame.autor.Articulo arg0;

    /**
     * 
     * @return
     *     returns Articulo
     */
    public com.enchulame.autor.Articulo getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.enchulame.autor.Articulo arg0) {
        this.arg0 = arg0;
    }

}
