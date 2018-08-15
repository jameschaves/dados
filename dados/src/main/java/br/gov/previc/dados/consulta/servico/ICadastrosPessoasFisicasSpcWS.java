package br.gov.previc.dados.consulta.servico;

import java.math.BigDecimal;
import java.util.Map;

import javax.ejb.Local;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Local
public interface ICadastrosPessoasFisicasSpcWS {
	public Response doConsulta(UriInfo uriInfo, HttpServletRequest request, Integer id);
	public Response doConsultaPorCpf(UriInfo uriInfo, HttpServletRequest request, BigDecimal id) ;
	public Response doConsultaGenerica(HttpServletRequest request,  Map<String, Object> mapaParametro, String query);
}
