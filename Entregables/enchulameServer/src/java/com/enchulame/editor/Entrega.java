/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enchulame.editor;

import com.enchulame.autor.Articulo;
import com.enchulame.autor.Articulo;
import com.enchulame.revisor.Revision;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Oscar
 */
@Entity
@Table(name = "entrega")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entrega.findAll", query = "SELECT e FROM Entrega e")
    , @NamedQuery(name = "Entrega.findByCopyright", query = "SELECT e FROM Entrega e WHERE e.copyright = :copyright")
    , @NamedQuery(name = "Entrega.findByEstado", query = "SELECT e FROM Entrega e WHERE e.estado = :estado")
    , @NamedQuery(name = "Entrega.findByFechaEnvio", query = "SELECT e FROM Entrega e WHERE e.fechaEnvio = :fechaEnvio")
    , @NamedQuery(name = "Entrega.findByIdEntrega", query = "SELECT e FROM Entrega e WHERE e.idEntrega = :idEntrega")
    , @NamedQuery(name = "Entrega.findByNotaFinal", query = "SELECT e FROM Entrega e WHERE e.notaFinal = :notaFinal")})
public class Entrega implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "copyright")
    private short copyright;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaEnvio")
    @Temporal(TemporalType.DATE)
    private Date fechaEnvio;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEntrega")
    private Integer idEntrega;
    @Basic(optional = false)
    @NotNull
    @Column(name = "notaFinal")
    private float notaFinal;
    @JoinColumn(name = "evento_idEvento", referencedColumnName = "idEvento")
    @ManyToOne(optional = false)
    private Evento eventoidEvento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "entregaidEntrega")
    private Collection<Articulo> articuloCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "entregaidEntrega")
    private Collection<Revision> revisionCollection;

    public Entrega() {
    }

    public Entrega(Integer idEntrega) {
        this.idEntrega = idEntrega;
    }

    public Entrega(Integer idEntrega, short copyright, String estado, Date fechaEnvio, float notaFinal) {
        this.idEntrega = idEntrega;
        this.copyright = copyright;
        this.estado = estado;
        this.fechaEnvio = fechaEnvio;
        this.notaFinal = notaFinal;
    }

    public short getCopyright() {
        return copyright;
    }

    public void setCopyright(short copyright) {
        this.copyright = copyright;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Integer getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(Integer idEntrega) {
        this.idEntrega = idEntrega;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    public Evento getEventoidEvento() {
        return eventoidEvento;
    }

    public void setEventoidEvento(Evento eventoidEvento) {
        this.eventoidEvento = eventoidEvento;
    }

    @XmlTransient
    public Collection<Articulo> getArticuloCollection() {
        return articuloCollection;
    }

    public void setArticuloCollection(Collection<Articulo> articuloCollection) {
        this.articuloCollection = articuloCollection;
    }

    @XmlTransient
    public Collection<Revision> getRevisionCollection() {
        return revisionCollection;
    }

    public void setRevisionCollection(Collection<Revision> revisionCollection) {
        this.revisionCollection = revisionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEntrega != null ? idEntrega.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entrega)) {
            return false;
        }
        Entrega other = (Entrega) object;
        if ((this.idEntrega == null && other.idEntrega != null) || (this.idEntrega != null && !this.idEntrega.equals(other.idEntrega))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.enchulame.autor.Entrega[ idEntrega=" + idEntrega + " ]";
    }
    
}
