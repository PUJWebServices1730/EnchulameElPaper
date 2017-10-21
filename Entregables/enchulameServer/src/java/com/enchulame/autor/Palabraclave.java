/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enchulame.autor;

import com.enchulame.revisor.Revisor;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Oscar
 */
@Entity
@Table(name = "palabraclave")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Palabraclave.findAll", query = "SELECT p FROM Palabraclave p")
    , @NamedQuery(name = "Palabraclave.findByIdPalabra", query = "SELECT p FROM Palabraclave p WHERE p.idPalabra = :idPalabra")
    , @NamedQuery(name = "Palabraclave.findByPalabraClave", query = "SELECT p FROM Palabraclave p WHERE p.palabraClave = :palabraClave")})
public class Palabraclave implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPalabra")
    private Integer idPalabra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "palabraClave")
    private String palabraClave;
    @JoinTable(name = "palabraclaverevisor", joinColumns = {
        @JoinColumn(name = "palabraclave_idPalabra", referencedColumnName = "idPalabra")}, inverseJoinColumns = {
        @JoinColumn(name = "revisor_idUsuario", referencedColumnName = "idRevisor")})
    @ManyToMany
    private Collection<Revisor> revisorCollection;
    @ManyToMany(mappedBy = "palabraclaveCollection")
    private Collection<Articulo> articuloCollection;

    public Palabraclave() {
    }

    public Palabraclave(Integer idPalabra) {
        this.idPalabra = idPalabra;
    }

    public Palabraclave(Integer idPalabra, String palabraClave) {
        this.idPalabra = idPalabra;
        this.palabraClave = palabraClave;
    }

    public Integer getIdPalabra() {
        return idPalabra;
    }

    public void setIdPalabra(Integer idPalabra) {
        this.idPalabra = idPalabra;
    }

    public String getPalabraClave() {
        return palabraClave;
    }

    public void setPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    @XmlTransient
    public Collection<Revisor> getRevisorCollection() {
        return revisorCollection;
    }

    public void setRevisorCollection(Collection<Revisor> revisorCollection) {
        this.revisorCollection = revisorCollection;
    }

    @XmlTransient
    public Collection<Articulo> getArticuloCollection() {
        return articuloCollection;
    }

    public void setArticuloCollection(Collection<Articulo> articuloCollection) {
        this.articuloCollection = articuloCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPalabra != null ? idPalabra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Palabraclave)) {
            return false;
        }
        Palabraclave other = (Palabraclave) object;
        if ((this.idPalabra == null && other.idPalabra != null) || (this.idPalabra != null && !this.idPalabra.equals(other.idPalabra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.enchulame.autor.Palabraclave[ idPalabra=" + idPalabra + " ]";
    }
    
}
