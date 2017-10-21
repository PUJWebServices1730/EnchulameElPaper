package com.enchulame.editor;

import com.enchulame.editor.Editor;
import com.enchulame.editor.Entrega;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-21T13:29:22")
@StaticMetamodel(Evento.class)
public class Evento_ { 

    public static volatile SingularAttribute<Evento, String> descripcion;
    public static volatile SingularAttribute<Evento, String> lineamientos;
    public static volatile SingularAttribute<Evento, Date> fecha;
    public static volatile SingularAttribute<Evento, Editor> editoridUsuario;
    public static volatile SingularAttribute<Evento, Integer> idEvento;
    public static volatile SingularAttribute<Evento, String> lugar;
    public static volatile CollectionAttribute<Evento, Entrega> entregaCollection;
    public static volatile SingularAttribute<Evento, String> nombre;

}