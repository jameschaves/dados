package br.gov.previc.dados.consulta.servico;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

public interface IDiasUteisWS {
	public  Response doConsulta(UriInfo uriInfo, HttpServletRequest request, Date data1, Date data2);
}
