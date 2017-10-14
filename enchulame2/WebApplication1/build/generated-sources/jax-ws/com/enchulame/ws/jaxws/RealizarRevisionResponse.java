
package com.enchulame.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "realizarRevisionResponse", namespace = "http://ws.enchulame.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "realizarRevisionResponse", namespace = "http://ws.enchulame.com/")
public class RealizarRevisionResponse {

    @XmlElement(name = "return", namespace = "")
    private com.enchulame.revisor.Revision _return;

    /**
     * 
     * @return
     *     returns Revision
     */
    public com.enchulame.revisor.Revision getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.enchulame.revisor.Revision _return) {
        this._return = _return;
    }

}
