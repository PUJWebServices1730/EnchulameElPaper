package com.enchulame.revisor;

import com.enchulame.editor.Entrega;
import com.enchulame.revisor.Revisor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-21T13:29:22")
@StaticMetamodel(Revision.class)
public class Revision_ { 

    public static volatile SingularAttribute<Revision, Date> fecha;
    public static volatile SingularAttribute<Revision, Entrega> entregaidEntrega;
    public static volatile SingularAttribute<Revision, Short> revisado;
    public static volatile SingularAttribute<Revision, String> comentario;
    public static volatile SingularAttribute<Revision, Float> nota;
    public static volatile SingularAttribute<Revision, Revisor> revisoridUsuario;
    public static volatile SingularAttribute<Revision, Integer> idRevision;

}