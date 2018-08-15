package br.gov.previc.dados.consulta.servico;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

public interface ISituacoesPlanoWS {

	public Response doConsulta(UriInfo uriInfo, HttpServletRequest request, Integer id);
	public Response doConsultaGenerica(HttpServletRequest request,  Map<String, Object> mapaParametro, String query);
}
