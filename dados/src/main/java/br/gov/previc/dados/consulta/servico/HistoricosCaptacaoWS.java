package br.gov.previc.dados.consulta.servico;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.gov.previc.dados.consulta.resposta.ItemRespostaHistoricosCaptacao;
import br.gov.previc.dados.consulta.resposta.RespostaConsulta;
import br.gov.previc.dados.dao.DadosDaoInterface;
import br.gov.previc.dados.model.HistoricosCaptacaoModel;
import br.gov.previc.dados.utils.Utils;

public class HistoricosCaptacaoWS {
	@EJB
	DadosDaoInterface dao;
	static final Logger logger = LogManager.getLogger();
	public Response doConsulta(UriInfo uriInfo, HttpServletRequest request, String id) {
		Map<String, Object> mapaParametro=new HashMap<String, Object>();
		mapaParametro.put("idCaptacao", id);
		return 	doConsultaGenerica(request, mapaParametro, "HistoricosCaptacaoModel.findByIdCaptacao");
	}

	public Response doConsultaPorEfpc(UriInfo uriInfo, HttpServletRequest request, String id) {
		Map<String, Object> mapaParametro=new HashMap<String, Object>();
		mapaParametro.put("nuMatriculaEfpc", id);
		return 	doConsultaGenerica(request, mapaParametro, "HistoricosCaptacaoModel.findByNuMatriculaEfpc");
	}
	public Response doConsultaGenerica(HttpServletRequest request,  Map<String, Object> mapaParametro, String query) {
		try{
			List<Object> recuperados = dao.listByQueryName(query,mapaParametro);
			logger.info("Requisição de origem "+Utils.getClientIp(request) + " encontrou " + recuperados.size() +" resultados.");
			RespostaConsulta<ItemRespostaHistoricosCaptacao> resultadoConsulta = new RespostaConsulta<ItemRespostaHistoricosCaptacao>(recuperados.stream()
					.map(r -> new ItemRespostaHistoricosCaptacao((HistoricosCaptacaoModel) r)).collect(Collectors.toList()));
			return Response.ok().entity(resultadoConsulta).build();
		}
		catch (Exception e){
			logger.info("Erro na requisicao de origem "+Utils.getClientIp(request) +" com a mensagem "+e.getMessage());
			return Response.status(403).entity(e.getMessage()).build();
		}
	}
}
