package br.gov.previc.dados.ws;

import java.math.BigDecimal;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Local;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Local
@RolesAllowed("usuario")
@Path("dados")
public interface DadosWSInterface {
	@GET
    @Path("cad/pessoasjuridicasspc/{id}") 
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaPessoasJuridicasSpc(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	@GET
    @Path("cad/pessoasjuridicasspc/cnpj/{cnpj}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaPessoasJuridicasSpcPorCnpj(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "cnpj") BigDecimal cnpj);
	
	@GET
    @Path("cad/efpcs/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaEfpcs(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("cad/efpcs/idpjspc/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaEfpcsPorIdPjSpc(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("cad/planosbeneficios/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaPlanosBeneficios(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("cad/planosbeneficios/cnpb/{cnpb}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaPlanosBeneficiosPorCnpb(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "cnpb") Long cnpb);
	// ---
	@GET
    @Path("cad/situacoesplano/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaSituacoesPlano(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("cad/gestoesplano/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaGestoesPlano(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("cad/gestoesplano/efpc/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaGestoesPlanoPorEfpc(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("cad/gestoesplano/plano/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaGestoesPlanoPorPlano(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("cand/cadastrospessoasfisicasspc/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaCadastrosPessoasFisicasSpc(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("cand/cadastrospessoasfisicasspc/cpf/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaCadastrosPessoasFisicasSpcPorCpf(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") BigDecimal id);
	
	@GET
    @Path("sicadi/lancamentosplano/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaLancamentosPlano(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Long id);
	
	@GET
    @Path("sicadi/lancamentosplano/cnpb/{id}/ano/{ano}/mes/{mes}/trimestre/{trimestre}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaLancamentosPlanoPorCnpbPorTempo(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") BigDecimal id, 
			@PathParam(value = "ano") Integer ano, 
			@PathParam(value = "mes") Integer mes, 
			@PathParam(value = "trimestre") Integer trimestre);
	
	@GET
    @Path("sicadi/historicoscaptacao/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaHistoricosCaptacao(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("sicadi/historicoscaptacao/efpc/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaHistoricosCaptacaoPorEfpc(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("cand/dirigentes/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaDirigentes(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("cand/dirigentes/cadastro/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaDirigentesPorIdCadastroSpc(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("cand/habilitacoesanexo/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaHabilitacoesAnexo(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("cand/habilitacoesanexo/cadastro/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaHabilitacoesAnexoPorIdCadastroSpc(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
	@GET
    @Path("dados/tipofuncaodirigentes/{id}")
    @Produces(MediaType.APPLICATION_XML)  
	public Response consultaTipoFuncaoDirigentes(
			@Context UriInfo uriInfo, 
			@Context HttpServletRequest request,  
			@PathParam(value = "id") Integer id);
	
}
