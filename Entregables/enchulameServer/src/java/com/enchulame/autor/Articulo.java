/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enchulame.autor;

import com.enchulame.editor.Entrega;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "articulo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Articulo.findAll", query = "SELECT a FROM Articulo a")
    , @NamedQuery(name = "Articulo.findByNombre", query = "SELECT a FROM Articulo a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Articulo.findByResumen", query = "SELECT a FROM Articulo a WHERE a.resumen = :resumen")
    , @NamedQuery(name = "Articulo.findByIdArticulo", query = "SELECT a FROM Articulo a WHERE a.idArticulo = :idArticulo")})
public class Articulo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "resumen")
    private String resumen;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idArticulo")
    private Integer idArticulo;
    @Lob
    @Column(name = "archivo")
    private byte[] archivo;
    @JoinTable(name = "articulopalabraclave", joinColumns = {
        @JoinColumn(name = "articulo_idArticulo", referencedColumnName = "idArticulo")}, inverseJoinColumns = {
        @JoinColumn(name = "palabraclave_idPalabra", referencedColumnName = "idPalabra")})
    @ManyToMany
    private Collection<Palabraclave> palabraclaveCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "articuloidArticulo")
    private Collection<Autorsecundario> autorsecundarioCollection;
    @JoinColumn(name = "autor_idUsuario", referencedColumnName = "idAutor")
    @ManyToOne(optional = false)
    private Autor autoridUsuario;
    @JoinColumn(name = "entrega_idEntrega", referencedColumnName = "idEntrega")
    @ManyToOne(optional = false)
    private Entrega entregaidEntrega;

    public Articulo() {
    }

    public Articulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
        
    }

    public Articulo(Integer idArticulo, String nombre, String resumen) {
        this.idArticulo = idArticulo;
        this.nombre = nombre;
        this.resumen = resumen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Integer getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    public byte[] getArchivo() {
        return archivo;
    }

    public void setArchivo(byte[] archivo) {
        this.archivo = archivo;
    }

    @XmlTransient
    public Collection<Palabraclave> getPalabraclaveCollection() {
        return palabraclaveCollection;
    }

    public void setPalabraclaveCollection(Collection<Palabraclave> palabraclaveCollection) {
        this.palabraclaveCollection = palabraclaveCollection;
    }

    @XmlTransient
    public Collection<Autorsecundario> getAutorsecundarioCollection() {
        return autorsecundarioCollection;
    }

    public void setAutorsecundarioCollection(Collection<Autorsecundario> autorsecundarioCollection) {
        this.autorsecundarioCollection = autorsecundarioCollection;
    }

    public Autor getAutoridUsuario() {
        return autoridUsuario;
    }

    public void setAutoridUsuario(Autor autoridUsuario) {
        this.autoridUsuario = autoridUsuario;
    }

    public Entrega getEntregaidEntrega() {
        return entregaidEntrega;
    }

    public void setEntregaidEntrega(Entrega entregaidEntrega) {
        this.entregaidEntrega = entregaidEntrega;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArticulo != null ? idArticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articulo)) {
            return false;
        }
        Articulo other = (Articulo) object;
        if ((this.idArticulo == null && other.idArticulo != null) || (this.idArticulo != null && !this.idArticulo.equals(other.idArticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.enchulame.autor.Articulo[ idArticulo=" + idArticulo + " ]";
    }
    
}
