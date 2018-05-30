package br.gov.previc.dados.consulta.servico;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.gov.previc.dados.consulta.resposta.ItemRespostaLancamentosPlano;
import br.gov.previc.dados.consulta.resposta.RespostaConsulta;
import br.gov.previc.dados.dao.DadosDaoInterface;
import br.gov.previc.dados.model.LancamentosPlanoModel;
import br.gov.previc.dados.utils.Utils;

@Stateless
public class LancamentosPlanoWS {
	@EJB
	DadosDaoInterface dao;
	static final Logger logger = LogManager.getLogger();
	public Response doConsulta(UriInfo uriInfo, HttpServletRequest request, Long id) {
		Map<String, Object> mapaParametro=new HashMap<String, Object>();
		mapaParametro.put("idCaptacao", id);
		return 	doConsultaGenerica(request, mapaParametro, "LancamentosPlanoModel.findByIdCaptacao");
	}

	public Response doConsultaPorCnpbPorTempo(UriInfo uriInfo, HttpServletRequest request, BigDecimal id, Integer ano, Integer mes, Integer trimestre) {
		Map<String, Object> mapaParametro=new HashMap<String, Object>();
		mapaParametro.put("nuPlano", id);
		mapaParametro.put("nuAno", ano);
		if (mes == 0 && trimestre == 0){
			return 	doConsultaGenerica(request, mapaParametro, "LancamentosPlanoModel.findByNuPlanoAndNuAnoAndNuMesIsNullAndNuTrimestreIsNull");
		}
		else if (mes == 0 && trimestre != 0) {
			mapaParametro.put("nuTrimestre", mes);
			return 	doConsultaGenerica(request, mapaParametro, "LancamentosPlanoModel.findByNuPlanoAndNuAnoAndNuMesIsNullAndNuTrimestre");
		}
		else if (mes != 0 && trimestre == 0) {
			mapaParametro.put("nuMes", mes);
			return 	doConsultaGenerica(request, mapaParametro, "LancamentosPlanoModel.findByNuPlanoAndNuAnoAndNuMesAndNuTrimestreIsNull");
		}
		else {
			mapaParametro.put("nuMes", mes);
			mapaParametro.put("nuTrimestre", trimestre);
			return 	doConsultaGenerica(request, mapaParametro, "LancamentosPlanoModel.findByNuPlanoAndNuAnoAndNuMesAndNuTrimestre");
		}
		
	}
	public Response doConsultaGenerica(HttpServletRequest request,  Map<String, Object> mapaParametro, String query) {
		try{
			List<Object> recuperados = dao.listByQueryName(query,mapaParametro);
			logger.info("Requisição de origem "+Utils.getClientIp(request) + " encontrou " + recuperados.size() +" resultados.");
			RespostaConsulta resultadoConsulta = new RespostaConsulta(recuperados.stream()
					.map(r -> new ItemRespostaLancamentosPlano((LancamentosPlanoModel) r)).collect(Collectors.toList()));
			return Response.ok().entity(resultadoConsulta).build();
		}
		catch (Exception e){
			logger.info("Erro na requisicao de origem "+Utils.getClientIp(request) +" com a mensagem "+e.getMessage());
			return Response.status(403).entity(e.getMessage()).build();
		}
	}
}
