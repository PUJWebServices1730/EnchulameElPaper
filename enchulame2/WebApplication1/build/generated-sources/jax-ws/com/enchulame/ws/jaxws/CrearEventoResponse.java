
package com.enchulame.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "crearEventoResponse", namespace = "http://ws.enchulame.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearEventoResponse", namespace = "http://ws.enchulame.com/")
public class CrearEventoResponse {

    @XmlElement(name = "return", namespace = "")
    private com.enchulame.editor.Evento _return;

    /**
     * 
     * @return
     *     returns Evento
     */
    public com.enchulame.editor.Evento getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.enchulame.editor.Evento _return) {
        this._return = _return;
    }

}
