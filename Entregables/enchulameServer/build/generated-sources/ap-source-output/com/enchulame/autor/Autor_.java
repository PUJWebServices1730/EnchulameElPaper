package com.enchulame.autor;

import com.enchulame.autor.Articulo;
import com.enchulame.usuario.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-21T13:29:21")
@StaticMetamodel(Autor.class)
public class Autor_ { 

    public static volatile SingularAttribute<Autor, Integer> idAutor;
    public static volatile CollectionAttribute<Autor, Articulo> articuloCollection;
    public static volatile SingularAttribute<Autor, Usuario> usuario;

}