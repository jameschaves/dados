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
@Path("dados")
public interface DadosWSInterface {
	
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