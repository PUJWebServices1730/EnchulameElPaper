package com.enchulame.main;

import com.enchulame.autor.Autor;
import com.enchulame.editor.Editor;
import com.enchulame.revisor.Revisor;
import javax.xml.ws.Endpoint;

import com.enchulame.usuario.Usuario;

public class Main {

    public static void main(String[] args) {
        
        try {
            Endpoint.publish("http://localhost:20844/Enchulame/usuario", new Usuario());
            Endpoint.publish("http://localhost:20844/Enchulame/revisor", new Revisor());
           //Endpoint.publish("http://localhost:20844/Enchulame/autor", new Autor());
            Endpoint.publish("http://localhost:20844/Enchulame/editor", new Editor());
            System.out.println("Funciona");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

    }

}
