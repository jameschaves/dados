package br.gov.previc.dados.ws;

import java.math.BigDecimal;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import br.gov.previc.dados.consulta.servico.ICadastrosPessoasFisicasSpcWS;
@Stateless
public class CandWS implements CandWSInterface{
	@EJB
	ICadastrosPessoasFisicasSpcWS cadastrosPessoasFisicasSpcWS; 
	
	@Override
	public Response consultaCadastrosPessoasFisicasSpc(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return cadastrosPessoasFisicasSpcWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaCadastrosPessoasFisicasSpcPorCpf(UriInfo uriInfo, HttpServletRequest request, BigDecimal id) {
		return cadastrosPessoasFisicasSpcWS.doConsultaPorCpf(uriInfo, request, id);
	}
}
