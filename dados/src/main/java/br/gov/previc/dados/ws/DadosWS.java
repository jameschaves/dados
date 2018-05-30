package br.gov.previc.dados.ws;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import br.gov.previc.dados.consulta.servico.CadastrosPessoasFisicasSpcWS;
import br.gov.previc.dados.consulta.servico.EfpcsWS;
import br.gov.previc.dados.consulta.servico.GestoesPlanoWS;
import br.gov.previc.dados.consulta.servico.HistoricosCaptacaoWS;
import br.gov.previc.dados.consulta.servico.LancamentosPlanoWS;
import br.gov.previc.dados.consulta.servico.PessoasJuridicasSpcWS;
import br.gov.previc.dados.consulta.servico.PlanosBeneficiosWS;
import br.gov.previc.dados.consulta.servico.SituacoesPlanoWS;

@Stateless
public class DadosWS implements DadosWSInterface{
	
	@EJB
	PessoasJuridicasSpcWS pessoasJuridicasSpcWS;
	@EJB
	EfpcsWS efpcsWS;
	@EJB
	PlanosBeneficiosWS planosBeneficiosWS;
	@EJB
	GestoesPlanoWS gestoesPlanoWS; 
	@EJB
	CadastrosPessoasFisicasSpcWS cadastrosPessoasFisicasSpcWS; 
	@EJB
	HistoricosCaptacaoWS historicosCaptacaoWS;
	@EJB
	LancamentosPlanoWS lancamentosPlanoWS;
	@EJB
	SituacoesPlanoWS situacoesPlanoWS;
	
	
	@Override
	public Response consultaPessoasJuridicasSpc(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		
		return pessoasJuridicasSpcWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaPessoasJuridicasSpcPorCnpj(UriInfo uriInfo, HttpServletRequest request, String cnpj) {
		
		return pessoasJuridicasSpcWS.doConsultaPorCnpj(uriInfo, request, cnpj);
	}
	@Override
	public Response consultaEfpcs(UriInfo uriInfo, HttpServletRequest request, String id) {
		return efpcsWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaPlanosBeneficios(UriInfo uriInfo, HttpServletRequest request, String id) {
		
		return planosBeneficiosWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaPlanosBeneficiosPorCnpb(UriInfo uriInfo, HttpServletRequest request, String cnpb) {
		
		return planosBeneficiosWS.doConsultaPorCnpb(uriInfo, request, cnpb);
	}
	@Override
	public Response consultaEfpcsPorIdPjSpc(UriInfo uriInfo, HttpServletRequest request, String id) {
		return efpcsWS.doConsultaPorIdPjSpc(uriInfo, request, id);
	}
	@Override
	public Response consultaSituacoesPlano(UriInfo uriInfo, HttpServletRequest request, String id) {
		return situacoesPlanoWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaGestoesPlano(UriInfo uriInfo, HttpServletRequest request, String id) {
		return gestoesPlanoWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaGestoesPlanoPorEfpc(UriInfo uriInfo, HttpServletRequest request, String id) {
		return gestoesPlanoWS.doConsultaPorEfpc(uriInfo, request, id);
	}
	@Override
	public Response consultaGestoesPlanoPorPlano(UriInfo uriInfo, HttpServletRequest request, String id) {
		return gestoesPlanoWS.doConsultaPorPlano(uriInfo, request, id);
	}
	@Override
	public Response consultaCadastrosPessoasFisicasSpc(UriInfo uriInfo, HttpServletRequest request, String id) {
		return cadastrosPessoasFisicasSpcWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaCadastrosPessoasFisicasSpcPorCpf(UriInfo uriInfo, HttpServletRequest request, String id) {
		return cadastrosPessoasFisicasSpcWS.doConsultaPorCpf(uriInfo, request, id);
	}
	@Override
	public Response consultaLancamentosPlano(UriInfo uriInfo, HttpServletRequest request, String id) {
		return lancamentosPlanoWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaLancamentosPlanoPorPlano(UriInfo uriInfo, HttpServletRequest request, String id) {
		return lancamentosPlanoWS.doConsultaPorPlano(uriInfo, request, id);
	}
	@Override
	public Response consultaLancamentosPlanoPorAno(UriInfo uriInfo, HttpServletRequest request, String id) {
		return lancamentosPlanoWS.doConsultaPorAno(uriInfo, request, id);
	}
	@Override
	public Response consultaHistoricosCaptacao(UriInfo uriInfo, HttpServletRequest request, String id) {
		return historicosCaptacaoWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaHistoricosCaptacaoPorEfpc(UriInfo uriInfo, HttpServletRequest request, String id) {
		return historicosCaptacaoWS.doConsultaPorEfpc(uriInfo, request, id);
	}
	
}