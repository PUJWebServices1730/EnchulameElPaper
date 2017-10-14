
package com.enchulame.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "buscarArticuloResponse", namespace = "http://ws.enchulame.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarArticuloResponse", namespace = "http://ws.enchulame.com/")
public class BuscarArticuloResponse {

    @XmlElement(name = "return", namespace = "")
    private com.enchulame.autor.Articulo _return;

    /**
     * 
     * @return
     *     returns Articulo
     */
    public com.enchulame.autor.Articulo getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.enchulame.autor.Articulo _return) {
        this._return = _return;
    }

}
