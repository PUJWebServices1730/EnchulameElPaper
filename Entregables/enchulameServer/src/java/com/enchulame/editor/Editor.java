/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enchulame.editor;

import com.enchulame.usuario.Usuario;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Oscar
 */
@Entity
@Table(name = "editor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Editor.findAll", query = "SELECT e FROM Editor e")
    , @NamedQuery(name = "Editor.findByIdEditor", query = "SELECT e FROM Editor e WHERE e.idEditor = :idEditor")})
public class Editor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEditor")
    private Integer idEditor;
    @JoinColumn(name = "idEditor", referencedColumnName = "idUsuario", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Usuario usuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "editoridUsuario")
    private Collection<Evento> eventoCollection;

    public Editor() {
    }

    public Editor(Integer idEditor) {
        this.idEditor = idEditor;
    }

    public Integer getIdEditor() {
        return idEditor;
    }

    public void setIdEditor(Integer idEditor) {
        this.idEditor = idEditor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @XmlTransient
    public Collection<Evento> getEventoCollection() {
        return eventoCollection;
    }

    public void setEventoCollection(Collection<Evento> eventoCollection) {
        this.eventoCollection = eventoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEditor != null ? idEditor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Editor)) {
            return false;
        }
        Editor other = (Editor) object;
        if ((this.idEditor == null && other.idEditor != null) || (this.idEditor != null && !this.idEditor.equals(other.idEditor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.enchulame.autor.Editor[ idEditor=" + idEditor + " ]";
    }
    
}
