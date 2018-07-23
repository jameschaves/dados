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
@Path("sicadi")
public interface SicadiWSInterface {
	
	@GET
    @Path("lancamentosplano/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaLancamentosPlano(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Long id);
	
	@GET
    @Path("lancamentosplano/cnpb/{id}/ano/{ano}/mes/{mes}/trimestre/{trimestre}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaLancamentosPlanoPorCnpbPorTempo(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") BigDecimal id, 
			@PathParam(value = "ano") Integer ano, 
			@PathParam(value = "mes") Integer mes, 
			@PathParam(value = "trimestre") Integer trimestre);
	
	@GET
    @Path("historicoscaptacao/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaHistoricosCaptacao(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("historicoscaptacao/efpc/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaHistoricosCaptacaoPorEfpc(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
}