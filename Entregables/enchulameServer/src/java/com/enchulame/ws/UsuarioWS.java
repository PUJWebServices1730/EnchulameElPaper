package com.enchulame.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.enchulame.autor.Articulo;
import com.enchulame.usuario.Usuario;
import java.util.List;


@WebService
public interface UsuarioWS {
	
	@WebMethod
	public List<Articulo> buscarArticulo(String nombre, String autor_nombre, String autor_apellido, String palabra_clave);
	
	@WebMethod
	public Usuario crearUsuario(String nombre, String apellido, String clave, String correo);
	
        /*@WebMethod
	public boolean editarUsuario(int id, String clave, String nombre, String correo);
        
	@WebMethod
	public boolean eliminarUsuario(int id);

        @WebMethod
        public int iniciarSesion(String correo, String contraseña);*/
       
}
