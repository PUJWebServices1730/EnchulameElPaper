package com.enchulame.revisor;

import com.enchulame.autor.Palabraclave;
import com.enchulame.revisor.Revision;
import com.enchulame.usuario.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-21T13:29:21")
@StaticMetamodel(Revisor.class)
public class Revisor_ { 

    public static volatile CollectionAttribute<Revisor, Revision> revisionCollection;
    public static volatile CollectionAttribute<Revisor, Palabraclave> palabraclaveCollection;
    public static volatile SingularAttribute<Revisor, Integer> idRevisor;
    public static volatile SingularAttribute<Revisor, Usuario> usuario;

}