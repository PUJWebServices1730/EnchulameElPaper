package com.enchulame.editor;

import com.enchulame.editor.Evento;
import com.enchulame.usuario.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-21T13:29:21")
@StaticMetamodel(Editor.class)
public class Editor_ { 

    public static volatile SingularAttribute<Editor, Integer> idEditor;
    public static volatile SingularAttribute<Editor, Usuario> usuario;
    public static volatile CollectionAttribute<Editor, Evento> eventoCollection;

}