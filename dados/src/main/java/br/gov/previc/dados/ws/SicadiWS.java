package br.gov.previc.dados.ws;

import java.math.BigDecimal;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import br.gov.previc.dados.consulta.servico.HistoricosCaptacaoWS;
import br.gov.previc.dados.consulta.servico.LancamentosPlanoWS;
@Stateless
public class SicadiWS implements SicadiWSInterface{
	@EJB
	HistoricosCaptacaoWS historicosCaptacaoWS;
	@EJB
	LancamentosPlanoWS lancamentosPlanoWS;
	

	@Override
	public Response consultaLancamentosPlano(UriInfo uriInfo, HttpServletRequest request, Long id) {
		return lancamentosPlanoWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaLancamentosPlanoPorCnpbPorTempo(UriInfo uriInfo, HttpServletRequest request, BigDecimal	 id, Integer ano, Integer mes, Integer trimestre) {
		return lancamentosPlanoWS.doConsultaPorCnpbPorTempo(uriInfo, request, id, ano, mes, trimestre);
	}
	@Override
	public Response consultaHistoricosCaptacao(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return historicosCaptacaoWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaHistoricosCaptacaoPorEfpc(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return historicosCaptacaoWS.doConsultaPorEfpc(uriInfo, request, id);
	}
}
