package com.enchulame.usuario;

import com.enchulame.autor.Articulo;
import com.enchulame.autor.Autor;
import com.enchulame.editor.Editor;
import com.enchulame.revisor.Revisor;
import com.enchulame.ws.UsuarioWS;
import java.io.Serializable;
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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@WebService(endpointInterface = "com.enchulame.ws.UsuarioWS", portName = "UsuarioWS")

@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByClave", query = "SELECT u FROM Usuario u WHERE u.clave = :clave")
    , @NamedQuery(name = "Usuario.findByCorreo", query = "SELECT u FROM Usuario u WHERE u.correo = :correo")
    , @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario")
    , @NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Usuario.findByApellido", query = "SELECT u FROM Usuario u WHERE u.apellido = :apellido")})
public class Usuario implements Serializable, UsuarioWS {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "clave")
    private String clave;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "correo")
    private String correo;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idUsuario")
    private Integer idUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "apellido")
    private String apellido;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "usuario")
    private Revisor revisor;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "usuario")
    private Editor editor;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "usuario")
    private Autor autor;

    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(Integer idUsuario, String clave, String correo, String nombre, String apellido) {
        this.idUsuario = idUsuario;
        this.clave = clave;
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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

    public Revisor getRevisor() {
        return revisor;
    }

    public void setRevisor(Revisor revisor) {
        this.revisor = revisor;
    }

    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.enchulame.autor.Usuario[ idUsuario=" + idUsuario + " ]";
    }

    
    //===Métodos a implementar===
    
    @Override
    public List<Articulo> buscarArticulo(String nombre, String autor_nombre, String autor_apellido, String palabra_clave) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("enchulameServerPU");
        EntityManager em = emf.createEntityManager();
        String select = "SELECT a.nombre FROM Articulo a ";
        String where = " WHERE a.idArticulo > 0 ";
        if (autor_nombre != null && autor_apellido != null){
            select += " inner join Usuario u " ;
            where += "  and u.idUsuario = a.autor_idUsuario and u.nombre = '"+ autor_nombre+"' and u.apellido = '" + autor_apellido + "' ";
        }
        if (nombre != null){
            where += "  and a.nombre = '"+ nombre +"' ";
        }
        if (palabra_clave != null){
            select += " inner join Articulopalabraclave p " + "inner join palabraclave c ";
            where += "  and p.articulo_idArticulo = a.idArticulo " +
                     "  and c.idPalabra = p.palabraClave_idPalabra and c.palabraClave = '" + palabra_clave + "' ";
        }
        String consulta = select + where; 
        Query query = em.createNativeQuery(consulta);
        List<Articulo> results = query.getResultList();
        return results;
    }

    @Override
    public Usuario crearUsuario(String nombre, String apellido, String clave, String correo) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("enchulameServerPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
          Query q =em.createNativeQuery("SELECT MAX(u.idUsuario) FROM USUARIO u;");
        Integer num=1;
        if(q.getSingleResult()!=null)
        {
            num =Integer.parseInt(q.getSingleResult().toString()); 
            num = num+1;
        }
        Usuario aux = new Usuario((int)num, clave, correo, nombre, apellido);
        em.persist(aux);
        et.commit();        
        return aux;
    }

    //@Override
    public boolean editarUsuario(int id, String clave, String nombre, String correo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //@Override
    public boolean eliminarUsuario(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //@Override
    public int iniciarSesion(String correo, String contraseña) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
