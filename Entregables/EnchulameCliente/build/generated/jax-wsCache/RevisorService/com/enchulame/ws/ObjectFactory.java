
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
    private final static QName _Revision_QNAME = new QName("http://ws.enchulame.com/", "revision");
    private final static QName _CrearRevisor_QNAME = new QName("http://ws.enchulame.com/", "crearRevisor");
    private final static QName _PalabrasClaves_QNAME = new QName("http://ws.enchulame.com/", "palabrasClaves");
    private final static QName _RevisionesRealizadas_QNAME = new QName("http://ws.enchulame.com/", "revisionesRealizadas");
    private final static QName _Revisor_QNAME = new QName("http://ws.enchulame.com/", "revisor");
    private final static QName _Editor_QNAME = new QName("http://ws.enchulame.com/", "editor");
    private final static QName _PalabrasClavesResponse_QNAME = new QName("http://ws.enchulame.com/", "palabrasClavesResponse");
    private final static QName _RealizarRevisionResponse_QNAME = new QName("http://ws.enchulame.com/", "realizarRevisionResponse");
    private final static QName _Entrega_QNAME = new QName("http://ws.enchulame.com/", "entrega");
    private final static QName _Usuario_QNAME = new QName("http://ws.enchulame.com/", "usuario");
    private final static QName _RevisionesRealizadasResponse_QNAME = new QName("http://ws.enchulame.com/", "revisionesRealizadasResponse");
    private final static QName _RealizarRevision_QNAME = new QName("http://ws.enchulame.com/", "realizarRevision");
    private final static QName _CrearRevisorResponse_QNAME = new QName("http://ws.enchulame.com/", "crearRevisorResponse");
    private final static QName _Evento_QNAME = new QName("http://ws.enchulame.com/", "evento");
    private final static QName _RevisionesPendientes_QNAME = new QName("http://ws.enchulame.com/", "revisionesPendientes");
    private final static QName _RevisionesPendientesResponse_QNAME = new QName("http://ws.enchulame.com/", "revisionesPendientesResponse");

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
     * Create an instance of {@link PalabrasClavesResponse }
     * 
     */
    public PalabrasClavesResponse createPalabrasClavesResponse() {
        return new PalabrasClavesResponse();
    }

    /**
     * Create an instance of {@link RevisionesRealizadas }
     * 
     */
    public RevisionesRealizadas createRevisionesRealizadas() {
        return new RevisionesRealizadas();
    }

    /**
     * Create an instance of {@link PalabrasClaves }
     * 
     */
    public PalabrasClaves createPalabrasClaves() {
        return new PalabrasClaves();
    }

    /**
     * Create an instance of {@link CrearRevisor }
     * 
     */
    public CrearRevisor createCrearRevisor() {
        return new CrearRevisor();
    }

    /**
     * Create an instance of {@link Autor }
     * 
     */
    public Autor createAutor() {
        return new Autor();
    }

    /**
     * Create an instance of {@link Revision }
     * 
     */
    public Revision createRevision() {
        return new Revision();
    }

    /**
     * Create an instance of {@link Evento }
     * 
     */
    public Evento createEvento() {
        return new Evento();
    }

    /**
     * Create an instance of {@link RevisionesPendientes }
     * 
     */
    public RevisionesPendientes createRevisionesPendientes() {
        return new RevisionesPendientes();
    }

    /**
     * Create an instance of {@link RevisionesPendientesResponse }
     * 
     */
    public RevisionesPendientesResponse createRevisionesPendientesResponse() {
        return new RevisionesPendientesResponse();
    }

    /**
     * Create an instance of {@link CrearRevisorResponse }
     * 
     */
    public CrearRevisorResponse createCrearRevisorResponse() {
        return new CrearRevisorResponse();
    }

    /**
     * Create an instance of {@link RealizarRevision }
     * 
     */
    public RealizarRevision createRealizarRevision() {
        return new RealizarRevision();
    }

    /**
     * Create an instance of {@link RevisionesRealizadasResponse }
     * 
     */
    public RevisionesRealizadasResponse createRevisionesRealizadasResponse() {
        return new RevisionesRealizadasResponse();
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
     * Create an instance of {@link RealizarRevisionResponse }
     * 
     */
    public RealizarRevisionResponse createRealizarRevisionResponse() {
        return new RealizarRevisionResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Revision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "revision")
    public JAXBElement<Revision> createRevision(Revision value) {
        return new JAXBElement<Revision>(_Revision_QNAME, Revision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearRevisor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "crearRevisor")
    public JAXBElement<CrearRevisor> createCrearRevisor(CrearRevisor value) {
        return new JAXBElement<CrearRevisor>(_CrearRevisor_QNAME, CrearRevisor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PalabrasClaves }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "palabrasClaves")
    public JAXBElement<PalabrasClaves> createPalabrasClaves(PalabrasClaves value) {
        return new JAXBElement<PalabrasClaves>(_PalabrasClaves_QNAME, PalabrasClaves.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevisionesRealizadas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "revisionesRealizadas")
    public JAXBElement<RevisionesRealizadas> createRevisionesRealizadas(RevisionesRealizadas value) {
        return new JAXBElement<RevisionesRealizadas>(_RevisionesRealizadas_QNAME, RevisionesRealizadas.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PalabrasClavesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "palabrasClavesResponse")
    public JAXBElement<PalabrasClavesResponse> createPalabrasClavesResponse(PalabrasClavesResponse value) {
        return new JAXBElement<PalabrasClavesResponse>(_PalabrasClavesResponse_QNAME, PalabrasClavesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealizarRevisionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "realizarRevisionResponse")
    public JAXBElement<RealizarRevisionResponse> createRealizarRevisionResponse(RealizarRevisionResponse value) {
        return new JAXBElement<RealizarRevisionResponse>(_RealizarRevisionResponse_QNAME, RealizarRevisionResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RevisionesRealizadasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "revisionesRealizadasResponse")
    public JAXBElement<RevisionesRealizadasResponse> createRevisionesRealizadasResponse(RevisionesRealizadasResponse value) {
        return new JAXBElement<RevisionesRealizadasResponse>(_RevisionesRealizadasResponse_QNAME, RevisionesRealizadasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealizarRevision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "realizarRevision")
    public JAXBElement<RealizarRevision> createRealizarRevision(RealizarRevision value) {
        return new JAXBElement<RealizarRevision>(_RealizarRevision_QNAME, RealizarRevision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearRevisorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "crearRevisorResponse")
    public JAXBElement<CrearRevisorResponse> createCrearRevisorResponse(CrearRevisorResponse value) {
        return new JAXBElement<CrearRevisorResponse>(_CrearRevisorResponse_QNAME, CrearRevisorResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RevisionesPendientes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "revisionesPendientes")
    public JAXBElement<RevisionesPendientes> createRevisionesPendientes(RevisionesPendientes value) {
        return new JAXBElement<RevisionesPendientes>(_RevisionesPendientes_QNAME, RevisionesPendientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevisionesPendientesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.enchulame.com/", name = "revisionesPendientesResponse")
    public JAXBElement<RevisionesPendientesResponse> createRevisionesPendientesResponse(RevisionesPendientesResponse value) {
        return new JAXBElement<RevisionesPendientesResponse>(_RevisionesPendientesResponse_QNAME, RevisionesPendientesResponse.class, null, value);
    }

}
