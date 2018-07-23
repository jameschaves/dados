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
@Path("cad")
public interface CadWSInterface {
	
	@GET
    @Path("pessoasjuridicasspc/{id}") 
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaPessoasJuridicasSpc(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	@GET
    @Path("pessoasjuridicasspc/cnpj/{cnpj}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaPessoasJuridicasSpcPorCnpj(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "cnpj") BigDecimal cnpj);
	
	@GET
    @Path("efpcs/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaEfpcs(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("efpcs/idpjspc/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaEfpcsPorIdPjSpc(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("planosbeneficios/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaPlanosBeneficios(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("planosbeneficios/cnpb/{cnpb}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaPlanosBeneficiosPorCnpb(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "cnpb") Long cnpb);
	// ---
	@GET
    @Path("situacoesplano/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaSituacoesPlano(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("gestoesplano/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaGestoesPlano(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("gestoesplano/efpc/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaGestoesPlanoPorEfpc(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("gestoesplano/plano/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaGestoesPlanoPorPlano(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	
	
}