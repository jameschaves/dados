package br.gov.previc.dados.consulta.servico;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

public interface IHabilitacoesAnexoWS {
	public Response doConsulta(UriInfo uriInfo, HttpServletRequest request, Integer id);
	public Response doConsultaPorIdCadastroSpc(UriInfo uriInfo, HttpServletRequest request, Integer id);
	public Response doConsultaGenerica(HttpServletRequest request,  Map<String, Object> mapaParametro, String query);
}
