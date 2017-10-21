package com.enchulame.autor;

import com.enchulame.autor.Articulo;
import com.enchulame.revisor.Revisor;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-21T13:29:22")
@StaticMetamodel(Palabraclave.class)
public class Palabraclave_ { 

    public static volatile SingularAttribute<Palabraclave, String> palabraClave;
    public static volatile CollectionAttribute<Palabraclave, Revisor> revisorCollection;
    public static volatile CollectionAttribute<Palabraclave, Articulo> articuloCollection;
    public static volatile SingularAttribute<Palabraclave, Integer> idPalabra;

}