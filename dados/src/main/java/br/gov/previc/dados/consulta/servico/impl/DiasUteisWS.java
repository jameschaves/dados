package br.gov.previc.dados.consulta.servico.impl;

import java.util.Date;

import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.gov.previc.dados.consulta.servico.IDiasUteisWS;
import br.gov.previc.dados.utils.Utils;

@Stateless
public class DiasUteisWS implements IDiasUteisWS{
	static final Logger logger = LogManager.getLogger();
	@Override
	public Response doConsulta(UriInfo uriInfo, HttpServletRequest request, Date data1, Date data2) {
		try{
			return Response.ok().entity(123).build();
		}
		catch (Exception e){
			logger.info("Erro na requisicao de origem "+Utils.getClientIp(request) +" com a mensagem "+e.getMessage());
			return Response.status(403).entity(e.getMessage()).build();
		}
	}

}
