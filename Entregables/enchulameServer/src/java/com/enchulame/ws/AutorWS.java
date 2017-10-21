package com.enchulame.ws;

import com.enchulame.autor.Articulo;
import com.enchulame.autor.Autorsecundario;
import com.enchulame.usuario.Usuario;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface AutorWS {
	
	//Implementa clase Autor
        @WebMethod
        public List<Articulo> buscarArticulo(String palabra_clave);
    
        @WebMethod
        public String anadirAutor(int idArticulo, Autorsecundario autSec);
        
        @WebMethod
        public boolean crearAutor(Usuario usuario);
             
        @WebMethod
	public String crearArticulo(String nombre, String resumen, byte[]archivo);
        
        @WebMethod
	public boolean editarArticulo(String nombre, String resumen, byte[]archivo);
        
        @WebMethod
	public boolean eliminarArticulo(int idArticulo);
        
        @WebMethod
	public boolean enviarCopyright(String autorizacion);

}