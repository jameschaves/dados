package br.gov.previc.dados.consulta.servico;

import java.math.BigDecimal;
import java.util.Map;

import javax.ejb.Local;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
@Local
public interface ILancamentosPlanoWS {
	public Response doConsulta(UriInfo uriInfo, HttpServletRequest request, Long id) ;
	public Response doConsultaPorCnpbPorTempo(UriInfo uriInfo, HttpServletRequest request, BigDecimal id, Integer ano, Integer mes, Integer trimestre) ;
	public Response doConsultaGenerica(HttpServletRequest request,  Map<String, Object> mapaParametro, String query);
}
