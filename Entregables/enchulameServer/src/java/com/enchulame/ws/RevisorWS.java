package com.enchulame.ws;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.enchulame.autor.Articulo;
import com.enchulame.revisor.Revision;
import com.enchulame.revisor.Revisor;
import com.enchulame.usuario.Usuario;
import java.util.List;

@WebService
public interface RevisorWS {
    
        @WebMethod
        public boolean crearRevisor(Usuario usuario, List<String> especialidad);
    
        @WebMethod
	public Revision realizarRevision(int idRevision);
        
        @WebMethod
	public List<Revision> revisionesPendientes();
        
        @WebMethod
        public List<Revision> revisionesRealizadas();
        
        @WebMethod
        public List<String> palabrasClaves();
       
	
}
