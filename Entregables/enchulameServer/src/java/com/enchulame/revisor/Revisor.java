/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enchulame.revisor;

import com.enchulame.autor.Palabraclave;
import com.enchulame.usuario.Usuario;
import com.enchulame.ws.RevisorWS;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.jws.WebService;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Oscar
 */

@WebService(endpointInterface = "com.enchulame.ws.RevisorWS", portName = "RevisorWS")

@Entity
@Table(name = "revisor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Revisor.findAll", query = "SELECT r FROM Revisor r")
    , @NamedQuery(name = "Revisor.findByIdRevisor", query = "SELECT r FROM Revisor r WHERE r.idRevisor = :idRevisor")})
public class Revisor implements Serializable,RevisorWS {

    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idRevisor")
    private Integer idRevisor;
    @ManyToMany(mappedBy = "revisorCollection")
    private Collection<Palabraclave> palabraclaveCollection;
    @JoinColumn(name = "idRevisor", referencedColumnName = "idUsuario", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Usuario usuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "revisoridUsuario")
    private Collection<Revision> revisionCollection;

    public Revisor() {
        this.palabraclaveCollection = null;
        this.revisionCollection = null;
    }

    public Revisor(Integer idRevisor) {
        this.idRevisor = idRevisor;
        this.palabraclaveCollection = null;
        this.revisionCollection = null;
    }

    public Revisor(Integer idRevisor, Collection<Palabraclave> palabraclaveCollection, Usuario usuario) {
        this.idRevisor = idRevisor;
        this.palabraclaveCollection = palabraclaveCollection;
        this.usuario = usuario;
        this.revisionCollection = null;
    }

    
    
    public Integer getIdRevisor() {
        return idRevisor;
    }

    public void setIdRevisor(Integer idRevisor) {
        this.idRevisor = idRevisor;
    }

    @XmlTransient
    public Collection<Palabraclave> getPalabraclaveCollection() {
        return palabraclaveCollection;
    }

    public void setPalabraclaveCollection(Collection<Palabraclave> palabraclaveCollection) {
        this.palabraclaveCollection = palabraclaveCollection;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
        hash += (idRevisor != null ? idRevisor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Revisor)) {
            return false;
        }
        Revisor other = (Revisor) object;
        if ((this.idRevisor == null && other.idRevisor != null) || (this.idRevisor != null && !this.idRevisor.equals(other.idRevisor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.enchulame.autor.Revisor[ idRevisor=" + idRevisor + " ]";
    }

    

    @Override
    public Revision realizarRevision(int idRevision) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Revision> revisionesPendientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Revision> revisionesRealizadas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> palabrasClaves() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("enchulameServerPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNativeQuery("SELECT palabraClave FROM palabraclave;");
        List results = query.getResultList();    
        return results;
    }

    @Override
    public boolean crearRevisor(Usuario usuario, List<String> especialidad) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("enchulameServerPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        //Query query = em.createNativeQuery("SELECT * FROM palabraclave;");
        et.begin();
        Revisor r = new Revisor(4, null, null);
        em.persist(r);
        et.commit();   
        return true;
    }
    
    private int idgenerate(){
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("enchulameServerPU");
        EntityManager em = emf.createEntityManager();
        Query q =em.createNativeQuery("SELECT MAX(u.idUsuario) FROM USUARIO u;");
       int num=1;
        if(q.getSingleResult()!=null)
        {
            num =(int) q.getSingleResult() ; 
            num = num+1;
        }
        return num;
    }

    
}
