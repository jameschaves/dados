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

import br.gov.previc.dados.consulta.resposta.ItemRespostaPlanosBeneficios;
import br.gov.previc.dados.consulta.resposta.RespostaConsulta;
import br.gov.previc.dados.consulta.servico.IPlanosBeneficiosWS;
import br.gov.previc.dados.dao.DadosDaoInterface;
import br.gov.previc.dados.model.PlanosBeneficiosModel;

@Stateless
public class PlanosBeneficiosWS implements IPlanosBeneficiosWS{
	@EJB
	DadosDaoInterface dao;
	static final Logger logger = LogManager.getLogger();
	public PlanosBeneficiosWS(){	
	}
	public Response doConsulta(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		Map<String, Object> mapaParametro=new HashMap<String, Object>();
		mapaParametro.put("idPlano", id);
		return 	doConsultaGenerica(uriInfo, request, mapaParametro, "PlanosBeneficiosModel.findByIdPlano");	
	}
	public Response doConsultaPorCnpb(UriInfo uriInfo, HttpServletRequest request, Long cnpb) {
		Map<String, Object> mapaParametro=new HashMap<String, Object>();
		mapaParametro.put("nuCnpb", cnpb);
		return 	doConsultaGenerica(uriInfo, request, mapaParametro, "PlanosBeneficiosModel.findByNuCnpb");	
	}
	public Response doConsultaGenerica(UriInfo uriInfo, HttpServletRequest request, Map<String, Object> mapaParametro, String query) {
		try{
			List<Object> recuperados = dao.listByQueryName(query,mapaParametro);
			RespostaConsulta resultadoConsulta = new RespostaConsulta(recuperados.stream()
					.map(r -> new ItemRespostaPlanosBeneficios((PlanosBeneficiosModel) r)).collect(Collectors.toList()));
			return Response.ok().entity(resultadoConsulta).build();
		}
		catch (Exception e){
			logger.info(e.getMessage());
			return Response.status(403).entity(e.getMessage()).build();
		}
	}
	

}
