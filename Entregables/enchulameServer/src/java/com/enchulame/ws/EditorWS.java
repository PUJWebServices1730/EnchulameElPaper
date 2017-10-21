package com.enchulame.ws;

import com.enchulame.editor.Entrega;
import java.util.Date;
import com.enchulame.editor.Evento;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface EditorWS {
	
        @WebMethod
	public boolean asignarRevisor(Entrega entrega, int idUsuario);
    
         @WebMethod 
        public int buscarRevisor(String especializacion);
	        
        
        @WebMethod
        public boolean crearEditor(int idUsuario);
 
        @WebMethod
	public Evento crearEvento(int idEvento, String descripcion, Date fecha,
			String lineamientos, String lugar, String nombre);
	
        @WebMethod
	public Evento editarEvento(int idEvento, String descripcion, Date fecha,
			String lineamientos, String lugar, String nombre);
	
        @WebMethod
	public void eliminarEvento(int idEvento);
	
        @WebMethod
	public void publicarArticulo(Entrega entrega);
	
        @WebMethod
	public void removerArticulo(int idArticulo);
	
        @WebMethod
	public void solicitarCopyright(int idArticulo);
        
         @WebMethod
	public List<Evento> verEventos(int idUsuario);
        
        @WebMethod
	public List<Entrega> verEntregas(Evento evento);
        
        
}
