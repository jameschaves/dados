package br.gov.previc.data.ws;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;



@Path("data")
public interface DataWebServiceInterface {
	
	@GET
    @Path("pessoasjuridicasspc")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaPessoasJuridicasSpc(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@QueryParam("cnpj") String cnpj) ;
	
	@GET
    @Path("efpcs") 
    @Produces(MediaType.APPLICATION_XML)  
    public Response consultaEfpcs(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@QueryParam("cnpj") String cnpj) ;
	@GET
    @Path("planosbeneficios") 
    @Produces(MediaType.APPLICATION_XML)  
    public Response consultaPlanosBeneficios(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@QueryParam("cnpb") String cnpb) ;
}