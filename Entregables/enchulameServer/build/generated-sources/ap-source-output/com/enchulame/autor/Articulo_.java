package com.enchulame.autor;

import com.enchulame.autor.Autor;
import com.enchulame.autor.Autorsecundario;
import com.enchulame.autor.Palabraclave;
import com.enchulame.editor.Entrega;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-21T13:29:22")
@StaticMetamodel(Articulo.class)
public class Articulo_ { 

    public static volatile SingularAttribute<Articulo, Integer> idArticulo;
    public static volatile CollectionAttribute<Articulo, Autorsecundario> autorsecundarioCollection;
    public static volatile SingularAttribute<Articulo, byte[]> archivo;
    public static volatile CollectionAttribute<Articulo, Palabraclave> palabraclaveCollection;
    public static volatile SingularAttribute<Articulo, Entrega> entregaidEntrega;
    public static volatile SingularAttribute<Articulo, String> resumen;
    public static volatile SingularAttribute<Articulo, Autor> autoridUsuario;
    public static volatile SingularAttribute<Articulo, String> nombre;

}