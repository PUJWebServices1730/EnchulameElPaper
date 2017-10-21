package com.enchulame.editor;

import com.enchulame.autor.Articulo;
import com.enchulame.editor.Evento;
import com.enchulame.revisor.Revision;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-21T13:29:22")
@StaticMetamodel(Entrega.class)
public class Entrega_ { 

    public static volatile CollectionAttribute<Entrega, Revision> revisionCollection;
    public static volatile SingularAttribute<Entrega, Short> copyright;
    public static volatile SingularAttribute<Entrega, String> estado;
    public static volatile SingularAttribute<Entrega, Date> fechaEnvio;
    public static volatile CollectionAttribute<Entrega, Articulo> articuloCollection;
    public static volatile SingularAttribute<Entrega, Float> notaFinal;
    public static volatile SingularAttribute<Entrega, Evento> eventoidEvento;
    public static volatile SingularAttribute<Entrega, Integer> idEntrega;

}