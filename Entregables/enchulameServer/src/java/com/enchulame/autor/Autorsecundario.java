/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enchulame.autor;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Oscar
 */
@Entity
@Table(name = "autorsecundario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Autorsecundario.findAll", query = "SELECT a FROM Autorsecundario a")
    , @NamedQuery(name = "Autorsecundario.findByNombre", query = "SELECT a FROM Autorsecundario a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Autorsecundario.findByApellido", query = "SELECT a FROM Autorsecundario a WHERE a.apellido = :apellido")
    , @NamedQuery(name = "Autorsecundario.findByIdAutorSecundario", query = "SELECT a FROM Autorsecundario a WHERE a.idAutorSecundario = :idAutorSecundario")})
public class Autorsecundario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Apellido")
    private String apellido;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAutorSecundario")
    private Integer idAutorSecundario;
    @JoinColumn(name = "articulo_idArticulo", referencedColumnName = "idArticulo")
    @ManyToOne(optional = false)
    private Articulo articuloidArticulo;

    public Autorsecundario() {
    }

    public Autorsecundario(Integer idAutorSecundario) {
        this.idAutorSecundario = idAutorSecundario;
    }

    public Autorsecundario(Integer idAutorSecundario, String nombre, String apellido) {
        this.idAutorSecundario = idAutorSecundario;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getIdAutorSecundario() {
        return idAutorSecundario;
    }

    public void setIdAutorSecundario(Integer idAutorSecundario) {
        this.idAutorSecundario = idAutorSecundario;
    }

    public Articulo getArticuloidArticulo() {
        return articuloidArticulo;
    }

    public void setArticuloidArticulo(Articulo articuloidArticulo) {
        this.articuloidArticulo = articuloidArticulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAutorSecundario != null ? idAutorSecundario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Autorsecundario)) {
            return false;
        }
        Autorsecundario other = (Autorsecundario) object;
        if ((this.idAutorSecundario == null && other.idAutorSecundario != null) || (this.idAutorSecundario != null && !this.idAutorSecundario.equals(other.idAutorSecundario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.enchulame.autor.Autorsecundario[ idAutorSecundario=" + idAutorSecundario + " ]";
    }
    
}
