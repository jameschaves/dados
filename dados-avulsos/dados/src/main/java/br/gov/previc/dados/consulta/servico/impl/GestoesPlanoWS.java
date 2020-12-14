package br.gov.previc.dados.consulta.servico.impl;

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

import br.gov.previc.dados.consulta.resposta.ItemRespostaGestoesPlano;
import br.gov.previc.dados.consulta.resposta.RespostaConsulta;
import br.gov.previc.dados.consulta.servico.IGestoesPlanoWS;
import br.gov.previc.dados.dao.DadosDaoInterface;
import br.gov.previc.dados.model.GestoesPlanoModel;
import br.gov.previc.dados.utils.Utils;
@Stateless
public class GestoesPlanoWS implements IGestoesPlanoWS{
	@EJB
	DadosDaoInterface dao;
	static final Logger logger = LogManager.getLogger();
	public Response doConsulta(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		Map<String, Object> mapaParametro=new HashMap<String, Object>();
		mapaParametro.put("idGestaoPlano", id);
		return 	doConsultaGenerica(request, mapaParametro, "GestoesPlanoModel.findByIdGestaoPlano");	
	}

	public Response doConsultaPorEfpc(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		Map<String, Object> mapaParametro=new HashMap<String, Object>();
		mapaParametro.put("nuMatriculaEfpc", id);
		return 	doConsultaGenerica(request, mapaParametro, "GestoesPlanoModel.findByNuMatriculaEfpc");	
	}

	public Response doConsultaPorPlano(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		Map<String, Object> mapaParametro=new HashMap<String, Object>();
		mapaParametro.put("idPlano", id);
		return 	doConsultaGenerica(request, mapaParametro, "GestoesPlanoModel.findByIdPlano");	
	}
	public Response doConsultaGenerica(HttpServletRequest request,  Map<String, Object> mapaParametro, String query) {
		try{
			List<Object> recuperados = dao.listByQueryName(query,mapaParametro);
			logger.info("Requisição de origem "+Utils.getClientIp(request) + " encontrou " + recuperados.size() +" resultados.");
			RespostaConsulta resultadoConsulta = new RespostaConsulta(recuperados.stream()
					.map(r -> new ItemRespostaGestoesPlano((GestoesPlanoModel) r)).collect(Collectors.toList()));
			return Response.ok().entity(resultadoConsulta).build();
		}
		catch (Exception e){
			logger.info("Erro na requisicao de origem "+Utils.getClientIp(request) +" com a mensagem "+e.getMessage());
			return Response.status(403).entity(e.getMessage()).build();
		}
	}
}
