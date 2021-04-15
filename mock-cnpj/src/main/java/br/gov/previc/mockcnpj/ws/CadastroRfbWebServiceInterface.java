package br.gov.previc.mockcnpj.ws;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;


@Path("cadastro-rfb")
public interface CadastroRfbWebServiceInterface {
	
	
	@GET
    @Path("cnpj-cadastro/{cnpj}")
    @Produces(MediaType.APPLICATION_JSON)  
	public Response getCnpjCadastroPorCnpj(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam("cnpj") BigDecimal cnpj);
	
	
}