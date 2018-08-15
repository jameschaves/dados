package br.gov.previc.dados.consulta.servico;

import java.math.BigDecimal;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

public interface IPessoasJuridicasSpcWS {
	public Response doConsulta(UriInfo uriInfo, HttpServletRequest request, Integer id) ;
	public Response doConsultaPorCnpj(UriInfo uriInfo, HttpServletRequest request, BigDecimal cnpj) ;
	
	public Response doConsultaGenerica(UriInfo uriInfo, HttpServletRequest request, Map<String, Object> mapaParametro, String query) ;
}
