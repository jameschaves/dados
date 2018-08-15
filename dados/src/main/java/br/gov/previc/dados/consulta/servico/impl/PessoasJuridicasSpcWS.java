package br.gov.previc.dados.consulta.servico.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.gov.previc.dados.consulta.resposta.ItemRespostaPessoasJuridicasSpc;
import br.gov.previc.dados.consulta.resposta.RespostaConsulta;
import br.gov.previc.dados.consulta.servico.IPessoasJuridicasSpcWS;
import br.gov.previc.dados.dao.DadosDaoInterface;
import br.gov.previc.dados.model.PessoasJuridicasSpcModel;
import br.gov.previc.dados.utils.Utils;

@Stateless
public class PessoasJuridicasSpcWS implements IPessoasJuridicasSpcWS{
	@EJB
	DadosDaoInterface dao; 
	static final Logger logger = LogManager.getLogger();
	public PessoasJuridicasSpcWS(){	
	}
	public Response doConsulta(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		Map<String, Object> mapaParametro=new HashMap<String, Object>();
		mapaParametro.put("idPjSpc", id);
		return 	doConsultaGenerica(uriInfo, request, mapaParametro, "PessoasJuridicasSpcModel.findByIdPjSpc");	
	}
	public Response doConsultaPorCnpj(UriInfo uriInfo, HttpServletRequest request, BigDecimal cnpj) {
		Map<String, Object> mapaParametro=new HashMap<String, Object>();
		mapaParametro.put("nuCnpj", cnpj);
		return 	doConsultaGenerica(uriInfo, request,  mapaParametro, "PessoasJuridicasSpcModel.findByNuCnpj");	
	}
	
	public Response doConsultaGenerica(UriInfo uriInfo, HttpServletRequest request, Map<String, Object> mapaParametro, String query) {
		try{
			List<Object> recuperados = dao.listByQueryName(query,mapaParametro);
			logger.info("Requisição de origem "+Utils.getClientIp(request) + " encontrou " + recuperados.size() +" resultados.");
			RespostaConsulta resultadoConsulta = new RespostaConsulta(recuperados.stream()
					.map(r -> new ItemRespostaPessoasJuridicasSpc((PessoasJuridicasSpcModel) r)).collect(Collectors.toList()));
			return Response.ok().entity(resultadoConsulta).build();
		}
		catch (Exception e){
			logger.info("Erro na requisicao de origem "+Utils.getClientIp(request) +" com a mensagem "+e.getMessage());
			return Response.status(403).entity(e.getMessage()).build();
		}		
	}

}
