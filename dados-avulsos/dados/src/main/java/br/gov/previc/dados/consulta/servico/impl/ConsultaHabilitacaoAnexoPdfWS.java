package br.gov.previc.dados.consulta.servico.impl;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.gov.previc.dados.consulta.servico.IConsultaHabilitacaoAnexoPdfWS;
import br.gov.previc.dados.dao.DadosDaoInterface;
import br.gov.previc.dados.utils.Utils;

@Stateless
public class ConsultaHabilitacaoAnexoPdfWS implements IConsultaHabilitacaoAnexoPdfWS {
	@EJB
	public DadosDaoInterface dao;
	static final Logger logger = LogManager.getLogger();

	static final String sql = "SELECT [DO_ANEXO] FROM [DADOS].[CAND].[HABILITACOES_ANEXO] WHERE ID_HABILITACAO = :id";

	public ConsultaHabilitacaoAnexoPdfWS() {
	}

	@Override
	public Response doConsulta(UriInfo uriInfo, HttpServletRequest request) {
		Map<String, Object> mapaParametro = new HashMap<String, Object>();
		String id = uriInfo.getPathParameters().getFirst("id");
//		logger.info("CPF mapeado: " + cpf);
		mapaParametro.put("id", id);
		return doConsultaGenerica(request, mapaParametro, sql);
	}

	public Response doConsultaGenerica(HttpServletRequest request, Map<String, Object> mapaParametro, String query) {
		byte[] result = null;
		try {
			result = dao.resultBySql(query, mapaParametro);
//			logger.info("Requisição de origem " + Utils.getClientIp(request) + " encontrou ");

			return Response.ok(new ByteArrayInputStream(result)).build();

		} catch (Exception e) {
			logger.info(
					"Erro na requisicao de origem " + Utils.getClientIp(request) + " com a mensagem " + e.getMessage());
			return Response.status(403).entity(e.getMessage()).build();
		}
	}

}
