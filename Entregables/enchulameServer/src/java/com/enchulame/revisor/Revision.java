/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enchulame.revisor;

import com.enchulame.editor.Entrega;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Oscar
 */
@Entity
@Table(name = "revision")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Revision.findAll", query = "SELECT r FROM Revision r")
    , @NamedQuery(name = "Revision.findByComentario", query = "SELECT r FROM Revision r WHERE r.comentario = :comentario")
    , @NamedQuery(name = "Revision.findByFecha", query = "SELECT r FROM Revision r WHERE r.fecha = :fecha")
    , @NamedQuery(name = "Revision.findByIdRevision", query = "SELECT r FROM Revision r WHERE r.idRevision = :idRevision")
    , @NamedQuery(name = "Revision.findByNota", query = "SELECT r FROM Revision r WHERE r.nota = :nota")
    , @NamedQuery(name = "Revision.findByRevisado", query = "SELECT r FROM Revision r WHERE r.revisado = :revisado")})
public class Revision implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 240)
    @Column(name = "comentario")
    private String comentario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idRevision")
    private Integer idRevision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nota")
    private float nota;
    @Column(name = "revisado")
    private Short revisado;
    @JoinColumn(name = "entrega_idEntrega", referencedColumnName = "idEntrega")
    @ManyToOne(optional = false)
    private Entrega entregaidEntrega;
    @JoinColumn(name = "revisor_idUsuario", referencedColumnName = "idRevisor")
    @ManyToOne(optional = false)
    private Revisor revisoridUsuario;

    public Revision() {
    }

    public Revision(Integer idRevision) {
        this.idRevision = idRevision;
    }

    public Revision(Integer idRevision, String comentario, Date fecha, float nota) {
        this.idRevision = idRevision;
        this.comentario = comentario;
        this.fecha = fecha;
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(Integer idRevision) {
        this.idRevision = idRevision;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Short getRevisado() {
        return revisado;
    }

    public void setRevisado(Short revisado) {
        this.revisado = revisado;
    }

    public Entrega getEntregaidEntrega() {
        return entregaidEntrega;
    }

    public void setEntregaidEntrega(Entrega entregaidEntrega) {
        this.entregaidEntrega = entregaidEntrega;
    }

    public Revisor getRevisoridUsuario() {
        return revisoridUsuario;
    }

    public void setRevisoridUsuario(Revisor revisoridUsuario) {
        this.revisoridUsuario = revisoridUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRevision != null ? idRevision.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Revision)) {
            return false;
        }
        Revision other = (Revision) object;
        if ((this.idRevision == null && other.idRevision != null) || (this.idRevision != null && !this.idRevision.equals(other.idRevision))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.enchulame.autor.Revision[ idRevision=" + idRevision + " ]";
    }
    
}
