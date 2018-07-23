package br.gov.previc.dados.ws;

import java.math.BigDecimal;

import javax.annotation.security.RolesAllowed;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;


@RolesAllowed("usuario")
@Path("cand")
public interface CandWSInterface {
	
	@GET
    @Path("cadastrospessoasfisicasspc/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaCadastrosPessoasFisicasSpc(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("cadastrospessoasfisicasspc/cpf/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaCadastrosPessoasFisicasSpcPorCpf(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") BigDecimal id);
	

	
	
	
}