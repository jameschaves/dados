package br.gov.previc.dados.consulta.servico;

import java.util.Map;

import javax.ejb.Local;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
@Local
public interface IPlanosBeneficiosWS {
	public Response doConsulta(UriInfo uriInfo, HttpServletRequest request, Integer id);
	public Response doConsultaPorCnpb(UriInfo uriInfo, HttpServletRequest request, Long cnpb);
	public Response doConsultaGenerica(UriInfo uriInfo, HttpServletRequest request, Map<String, Object> mapaParametro, String query) ;
}
