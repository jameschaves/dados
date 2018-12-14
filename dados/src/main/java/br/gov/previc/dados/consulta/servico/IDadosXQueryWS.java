package br.gov.previc.dados.consulta.servico;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

public interface IDadosXQueryWS {
	public Response doConsulta(UriInfo uriInfo, HttpServletRequest request);
}	
