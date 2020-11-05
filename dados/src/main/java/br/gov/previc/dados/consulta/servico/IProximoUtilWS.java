package br.gov.previc.dados.consulta.servico;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

public interface IProximoUtilWS {
	public  Response doConsultaUtil(UriInfo uriInfo, HttpServletRequest request, Date data1);

}
