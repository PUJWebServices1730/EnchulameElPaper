
package com.enchulame.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.enchulame.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Autor_QNAME = new QName("http://ws.enchulame.com/", "autor");
    private final static QName _EliminarUsuario_QNAME = new QName("http://ws.enchulame.com/", "eliminarUsuario");
    private final static QName _EliminarUsuarioResponse_QNAME = new QName("http://ws.enchulame.com/", "eliminarUsuarioResponse");
    private final static QName _CrearUsuario_QNAME = new QName("http://ws.enchulame.com/", "crearUsuario");
    private final static QName _Revisor_QNAME = new QName("http://ws.enchulame.com/", "revisor");
    private final static QName _Editor_QNAME = new QName("http://ws.enchulame.com/", "editor");
    private final static QName _BuscarArticulo_QNAME = new QName("http://ws.enchulame.com/", "buscarArticulo");
    private final static QName _CrearUsuarioResponse_QNAME = new QName("http://ws.enchulame.com/", "crearUsuarioResponse");
    private final static QName _EditarUsuario_QNAME = new QName("http://ws.enchulame.com/", "editarUsuario");
    private final static QName _IniciarSesionResponse_QNAME = new QName("http://ws.enchulame.com/", "iniciarSesionResponse");
    private final static QName _Entrega_QNAME = new QName("http://ws.enchulame.com/", "entrega");
    private final static QName _IniciarSesion_QNAME = new QName("http://ws.enchulame.com/", "iniciarSesion");
    private final static QName _Usuario_QNAME = new QName("http://ws.enchulame.com/", "usuario");
    private final static QName _Articulo_QNAME = new QName("http://ws.enchulame.com/", "articulo");
    private final static QName _BuscarArticuloResponse_QNAME = new QName("http://ws.enchulame.com/", "buscarArticuloResponse");
    private final static QName _EditarUsuarioResponse_QNAME = new QName("http://ws.enchulame.com/", "editarUsuarioResponse");
    private final static QName _Evento_QNAME = new QName("http://ws.enchulame.com/", "evento");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.enchulame.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Revisor }
     * 
     */
    public Revisor createRevisor() {
        return new Revisor();
    }

    /**
     * Create an instance of {@link Editor }
     * 
     */
    public Editor createEditor() {
        return new Editor();
    }

    /**
     * Create an instance of {@link CrearUsuario }
     * 
     */
    public CrearUsuario createCrearUsuario() {
        return new CrearUsuario();
    }

    /**
     * Create an instance of {@link EliminarUsuarioResponse }
     * 
     */
    public EliminarUsuarioResponse createEliminarUsuarioResponse() {
        return new EliminarUsuarioResponse();
    }

    /**
     * Create an instance of {@link EliminarUsuario }
     * 
     */
    public EliminarUsuario createEliminarUsuario() {
        return new EliminarUsuario();
    }

    /**
     * Create an instance of {@link Autor }
     * 
     */
    public Autor createAutor() {
        return new Autor();
    }

    /**
     * Create an instance of {@link Evento }
     * 
     */
    public Evento createEvento() {
        return new Evento();
    }

    /**
     * Create an instance of {@link EditarUsuarioResponse }
     * 
     */
    public EditarUsuarioResponse createEditarUsuarioResponse() {
        return new EditarUsuarioResponse();
    }

    /**
     * Create an instance of {@link BuscarArticuloResponse }
     * 
     */
    public BuscarArticuloResponse createBuscarArticuloResponse() {
        return new BuscarArticuloResponse();
    }

    /**
     * Create an instance of {@link Entrega }
     * 
     */
    public Entrega createEntrega() {
        return new Entrega();
    }

    /**
     * Create an instance of {@link IniciarSesion }
     * 
     */
    public IniciarSesion createIniciarSesion() {
        return new IniciarSesion();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link Articulo }
     * 
     */
    public Articulo createArticulo() {
        return new Articulo();
    }

    /**
     * Create an instance of {@link IniciarSesionResponse }
     * 
     */
    public IniciarSesionResponse createIniciarSesionResponse() {
        return new IniciarSesionResponse();
    }

    /**
     * Create an instance of {@link BuscarArticulo }
     * 
     */
    public BuscarArticulo createBuscarArticulo() {
        return new BuscarArticulo();
    }

    /**
     * Create an instance of {@link CrearUsuarioResponse }
     * 
     */
    public CrearUsuarioResponse createCrearUsuarioResponse() {
        return new CrearUsuarioResponse();
    }

    /**
     * Create an instance of {@link EditarUsuario }
     * 
     */
    public EditarUsuario createEditarUsuario() {
        return new EditarUsuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Autor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "autor")
    public JAXBElement<Autor> createAutor(Autor value) {
        return new JAXBElement<Autor>(_Autor_QNAME, Autor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "eliminarUsuario")
    public JAXBElement<EliminarUsuario> createEliminarUsuario(EliminarUsuario value) {
        return new JAXBElement<EliminarUsuario>(_EliminarUsuario_QNAME, EliminarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "eliminarUsuarioResponse")
    public JAXBElement<EliminarUsuarioResponse> createEliminarUsuarioResponse(EliminarUsuarioResponse value) {
        return new JAXBElement<EliminarUsuarioResponse>(_EliminarUsuarioResponse_QNAME, EliminarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "crearUsuario")
    public JAXBElement<CrearUsuario> createCrearUsuario(CrearUsuario value) {
        return new JAXBElement<CrearUsuario>(_CrearUsuario_QNAME, CrearUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Revisor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "revisor")
    public JAXBElement<Revisor> createRevisor(Revisor value) {
        return new JAXBElement<Revisor>(_Revisor_QNAME, Revisor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Editor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "editor")
    public JAXBElement<Editor> createEditor(Editor value) {
        return new JAXBElement<Editor>(_Editor_QNAME, Editor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarArticulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "buscarArticulo")
    public JAXBElement<BuscarArticulo> createBuscarArticulo(BuscarArticulo value) {
        return new JAXBElement<BuscarArticulo>(_BuscarArticulo_QNAME, BuscarArticulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "crearUsuarioResponse")
    public JAXBElement<CrearUsuarioResponse> createCrearUsuarioResponse(CrearUsuarioResponse value) {
        return new JAXBElement<CrearUsuarioResponse>(_CrearUsuarioResponse_QNAME, CrearUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "editarUsuario")
    public JAXBElement<EditarUsuario> createEditarUsuario(EditarUsuario value) {
        return new JAXBElement<EditarUsuario>(_EditarUsuario_QNAME, EditarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IniciarSesionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "iniciarSesionResponse")
    public JAXBElement<IniciarSesionResponse> createIniciarSesionResponse(IniciarSesionResponse value) {
        return new JAXBElement<IniciarSesionResponse>(_IniciarSesionResponse_QNAME, IniciarSesionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "entrega")
    public JAXBElement<Entrega> createEntrega(Entrega value) {
        return new JAXBElement<Entrega>(_Entrega_QNAME, Entrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IniciarSesion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "iniciarSesion")
    public JAXBElement<IniciarSesion> createIniciarSesion(IniciarSesion value) {
        return new JAXBElement<IniciarSesion>(_IniciarSesion_QNAME, IniciarSesion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "usuario")
    public JAXBElement<Usuario> createUsuario(Usuario value) {
        return new JAXBElement<Usuario>(_Usuario_QNAME, Usuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Articulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "articulo")
    public JAXBElement<Articulo> createArticulo(Articulo value) {
        return new JAXBElement<Articulo>(_Articulo_QNAME, Articulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarArticuloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "buscarArticuloResponse")
    public JAXBElement<BuscarArticuloResponse> createBuscarArticuloResponse(BuscarArticuloResponse value) {
        return new JAXBElement<BuscarArticuloResponse>(_BuscarArticuloResponse_QNAME, BuscarArticuloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "editarUsuarioResponse")
    public JAXBElement<EditarUsuarioResponse> createEditarUsuarioResponse(EditarUsuarioResponse value) {
        return new JAXBElement<EditarUsuarioResponse>(_EditarUsuarioResponse_QNAME, EditarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Evento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "evento")
    public JAXBElement<Evento> createEvento(Evento value) {
        return new JAXBElement<Evento>(_Evento_QNAME, Evento.class, null, value);
    }

}
