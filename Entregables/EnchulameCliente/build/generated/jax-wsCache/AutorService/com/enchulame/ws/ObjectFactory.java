
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
    private final static QName _CrearArticulo_QNAME = new QName("http://ws.enchulame.com/", "crearArticulo");
    private final static QName _CrearArticuloResponse_QNAME = new QName("http://ws.enchulame.com/", "crearArticuloResponse");
    private final static QName _EliminarArticuloResponse_QNAME = new QName("http://ws.enchulame.com/", "eliminarArticuloResponse");
    private final static QName _EnviarCopyright_QNAME = new QName("http://ws.enchulame.com/", "enviarCopyright");
    private final static QName _EditarArticuloResponse_QNAME = new QName("http://ws.enchulame.com/", "editarArticuloResponse");
    private final static QName _EnviarCopyrightResponse_QNAME = new QName("http://ws.enchulame.com/", "enviarCopyrightResponse");
    private final static QName _EditarArticulo_QNAME = new QName("http://ws.enchulame.com/", "editarArticulo");
    private final static QName _Revisor_QNAME = new QName("http://ws.enchulame.com/", "revisor");
    private final static QName _CrearAutorResponse_QNAME = new QName("http://ws.enchulame.com/", "crearAutorResponse");
    private final static QName _Editor_QNAME = new QName("http://ws.enchulame.com/", "editor");
    private final static QName _BuscarArticulo_QNAME = new QName("http://ws.enchulame.com/", "buscarArticulo");
    private final static QName _AnadirAutorResponse_QNAME = new QName("http://ws.enchulame.com/", "anadirAutorResponse");
    private final static QName _CrearAutor_QNAME = new QName("http://ws.enchulame.com/", "crearAutor");
    private final static QName _Entrega_QNAME = new QName("http://ws.enchulame.com/", "entrega");
    private final static QName _Usuario_QNAME = new QName("http://ws.enchulame.com/", "usuario");
    private final static QName _Articulo_QNAME = new QName("http://ws.enchulame.com/", "articulo");
    private final static QName _Autorsecundario_QNAME = new QName("http://ws.enchulame.com/", "autorsecundario");
    private final static QName _BuscarArticuloResponse_QNAME = new QName("http://ws.enchulame.com/", "buscarArticuloResponse");
    private final static QName _EliminarArticulo_QNAME = new QName("http://ws.enchulame.com/", "eliminarArticulo");
    private final static QName _Evento_QNAME = new QName("http://ws.enchulame.com/", "evento");
    private final static QName _AnadirAutor_QNAME = new QName("http://ws.enchulame.com/", "anadirAutor");
    private final static QName _EditarArticuloArg2_QNAME = new QName("", "arg2");

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
     * Create an instance of {@link CrearAutorResponse }
     * 
     */
    public CrearAutorResponse createCrearAutorResponse() {
        return new CrearAutorResponse();
    }

    /**
     * Create an instance of {@link Editor }
     * 
     */
    public Editor createEditor() {
        return new Editor();
    }

    /**
     * Create an instance of {@link EnviarCopyrightResponse }
     * 
     */
    public EnviarCopyrightResponse createEnviarCopyrightResponse() {
        return new EnviarCopyrightResponse();
    }

    /**
     * Create an instance of {@link EditarArticulo }
     * 
     */
    public EditarArticulo createEditarArticulo() {
        return new EditarArticulo();
    }

    /**
     * Create an instance of {@link EditarArticuloResponse }
     * 
     */
    public EditarArticuloResponse createEditarArticuloResponse() {
        return new EditarArticuloResponse();
    }

    /**
     * Create an instance of {@link CrearArticulo }
     * 
     */
    public CrearArticulo createCrearArticulo() {
        return new CrearArticulo();
    }

    /**
     * Create an instance of {@link CrearArticuloResponse }
     * 
     */
    public CrearArticuloResponse createCrearArticuloResponse() {
        return new CrearArticuloResponse();
    }

    /**
     * Create an instance of {@link EliminarArticuloResponse }
     * 
     */
    public EliminarArticuloResponse createEliminarArticuloResponse() {
        return new EliminarArticuloResponse();
    }

    /**
     * Create an instance of {@link EnviarCopyright }
     * 
     */
    public EnviarCopyright createEnviarCopyright() {
        return new EnviarCopyright();
    }

    /**
     * Create an instance of {@link Autor }
     * 
     */
    public Autor createAutor() {
        return new Autor();
    }

    /**
     * Create an instance of {@link AnadirAutor }
     * 
     */
    public AnadirAutor createAnadirAutor() {
        return new AnadirAutor();
    }

    /**
     * Create an instance of {@link Evento }
     * 
     */
    public Evento createEvento() {
        return new Evento();
    }

    /**
     * Create an instance of {@link EliminarArticulo }
     * 
     */
    public EliminarArticulo createEliminarArticulo() {
        return new EliminarArticulo();
    }

    /**
     * Create an instance of {@link Autorsecundario }
     * 
     */
    public Autorsecundario createAutorsecundario() {
        return new Autorsecundario();
    }

    /**
     * Create an instance of {@link BuscarArticuloResponse }
     * 
     */
    public BuscarArticuloResponse createBuscarArticuloResponse() {
        return new BuscarArticuloResponse();
    }

    /**
     * Create an instance of {@link AnadirAutorResponse }
     * 
     */
    public AnadirAutorResponse createAnadirAutorResponse() {
        return new AnadirAutorResponse();
    }

    /**
     * Create an instance of {@link CrearAutor }
     * 
     */
    public CrearAutor createCrearAutor() {
        return new CrearAutor();
    }

    /**
     * Create an instance of {@link Entrega }
     * 
     */
    public Entrega createEntrega() {
        return new Entrega();
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
     * Create an instance of {@link BuscarArticulo }
     * 
     */
    public BuscarArticulo createBuscarArticulo() {
        return new BuscarArticulo();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearArticulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "crearArticulo")
    public JAXBElement<CrearArticulo> createCrearArticulo(CrearArticulo value) {
        return new JAXBElement<CrearArticulo>(_CrearArticulo_QNAME, CrearArticulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearArticuloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "crearArticuloResponse")
    public JAXBElement<CrearArticuloResponse> createCrearArticuloResponse(CrearArticuloResponse value) {
        return new JAXBElement<CrearArticuloResponse>(_CrearArticuloResponse_QNAME, CrearArticuloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarArticuloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "eliminarArticuloResponse")
    public JAXBElement<EliminarArticuloResponse> createEliminarArticuloResponse(EliminarArticuloResponse value) {
        return new JAXBElement<EliminarArticuloResponse>(_EliminarArticuloResponse_QNAME, EliminarArticuloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarCopyright }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "enviarCopyright")
    public JAXBElement<EnviarCopyright> createEnviarCopyright(EnviarCopyright value) {
        return new JAXBElement<EnviarCopyright>(_EnviarCopyright_QNAME, EnviarCopyright.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarArticuloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "editarArticuloResponse")
    public JAXBElement<EditarArticuloResponse> createEditarArticuloResponse(EditarArticuloResponse value) {
        return new JAXBElement<EditarArticuloResponse>(_EditarArticuloResponse_QNAME, EditarArticuloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarCopyrightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "enviarCopyrightResponse")
    public JAXBElement<EnviarCopyrightResponse> createEnviarCopyrightResponse(EnviarCopyrightResponse value) {
        return new JAXBElement<EnviarCopyrightResponse>(_EnviarCopyrightResponse_QNAME, EnviarCopyrightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarArticulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "editarArticulo")
    public JAXBElement<EditarArticulo> createEditarArticulo(EditarArticulo value) {
        return new JAXBElement<EditarArticulo>(_EditarArticulo_QNAME, EditarArticulo.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearAutorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "crearAutorResponse")
    public JAXBElement<CrearAutorResponse> createCrearAutorResponse(CrearAutorResponse value) {
        return new JAXBElement<CrearAutorResponse>(_CrearAutorResponse_QNAME, CrearAutorResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AnadirAutorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "anadirAutorResponse")
    public JAXBElement<AnadirAutorResponse> createAnadirAutorResponse(AnadirAutorResponse value) {
        return new JAXBElement<AnadirAutorResponse>(_AnadirAutorResponse_QNAME, AnadirAutorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearAutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "crearAutor")
    public JAXBElement<CrearAutor> createCrearAutor(CrearAutor value) {
        return new JAXBElement<CrearAutor>(_CrearAutor_QNAME, CrearAutor.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Autorsecundario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "autorsecundario")
    public JAXBElement<Autorsecundario> createAutorsecundario(Autorsecundario value) {
        return new JAXBElement<Autorsecundario>(_Autorsecundario_QNAME, Autorsecundario.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarArticulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "eliminarArticulo")
    public JAXBElement<EliminarArticulo> createEliminarArticulo(EliminarArticulo value) {
        return new JAXBElement<EliminarArticulo>(_EliminarArticulo_QNAME, EliminarArticulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Evento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "evento")
    public JAXBElement<Evento> createEvento(Evento value) {
        return new JAXBElement<Evento>(_Evento_QNAME, Evento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnadirAutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "anadirAutor")
    public JAXBElement<AnadirAutor> createAnadirAutor(AnadirAutor value) {
        return new JAXBElement<AnadirAutor>(_AnadirAutor_QNAME, AnadirAutor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg2", scope = EditarArticulo.class)
    public JAXBElement<byte[]> createEditarArticuloArg2(byte[] value) {
        return new JAXBElement<byte[]>(_EditarArticuloArg2_QNAME, byte[].class, EditarArticulo.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg2", scope = CrearArticulo.class)
    public JAXBElement<byte[]> createCrearArticuloArg2(byte[] value) {
        return new JAXBElement<byte[]>(_EditarArticuloArg2_QNAME, byte[].class, CrearArticulo.class, ((byte[]) value));
    }

}
