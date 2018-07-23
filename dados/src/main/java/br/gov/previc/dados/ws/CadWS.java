package br.gov.previc.dados.ws;

import java.math.BigDecimal;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import br.gov.previc.dados.consulta.servico.EfpcsWS;
import br.gov.previc.dados.consulta.servico.GestoesPlanoWS;
import br.gov.previc.dados.consulta.servico.PessoasJuridicasSpcWS;
import br.gov.previc.dados.consulta.servico.PlanosBeneficiosWS;
import br.gov.previc.dados.consulta.servico.SituacoesPlanoWS;

public class CadWS implements CadWSInterface{
	@EJB
	PessoasJuridicasSpcWS pessoasJuridicasSpcWS;
	@EJB
	EfpcsWS efpcsWS;
	@EJB
	PlanosBeneficiosWS planosBeneficiosWS;
	@EJB
	GestoesPlanoWS gestoesPlanoWS; 
	@EJB
	SituacoesPlanoWS situacoesPlanoWS;
	
	
	@Override
	public Response consultaPessoasJuridicasSpc(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		
		return pessoasJuridicasSpcWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaPessoasJuridicasSpcPorCnpj(UriInfo uriInfo, HttpServletRequest request, BigDecimal cnpj) {
		
		return pessoasJuridicasSpcWS.doConsultaPorCnpj(uriInfo, request, cnpj);
	}
	@Override
	public Response consultaEfpcs(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return efpcsWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaPlanosBeneficios(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		
		return planosBeneficiosWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaPlanosBeneficiosPorCnpb(UriInfo uriInfo, HttpServletRequest request, Long cnpb) {
		
		return planosBeneficiosWS.doConsultaPorCnpb(uriInfo, request, cnpb);
	}
	@Override
	public Response consultaEfpcsPorIdPjSpc(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return efpcsWS.doConsultaPorIdPjSpc(uriInfo, request, id);
	}
	@Override
	public Response consultaSituacoesPlano(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return situacoesPlanoWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaGestoesPlano(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return gestoesPlanoWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaGestoesPlanoPorEfpc(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return gestoesPlanoWS.doConsultaPorEfpc(uriInfo, request, id);
	}
	@Override
	public Response consultaGestoesPlanoPorPlano(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return gestoesPlanoWS.doConsultaPorPlano(uriInfo, request, id);
	}
}
