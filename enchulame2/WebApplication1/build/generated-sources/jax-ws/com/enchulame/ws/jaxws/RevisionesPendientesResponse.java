
package com.enchulame.ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "revisionesPendientesResponse", namespace = "http://ws.enchulame.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "revisionesPendientesResponse", namespace = "http://ws.enchulame.com/")
public class RevisionesPendientesResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.enchulame.revisor.Revision> _return;

    /**
     * 
     * @return
     *     returns List<Revision>
     */
    public List<com.enchulame.revisor.Revision> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.enchulame.revisor.Revision> _return) {
        this._return = _return;
    }

}
