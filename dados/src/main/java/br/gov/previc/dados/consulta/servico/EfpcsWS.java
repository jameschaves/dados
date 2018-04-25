package br.gov.previc.dados.consulta.servico;

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

import br.gov.previc.dados.consulta.resposta.ItemRespostaEfpcs;
import br.gov.previc.dados.consulta.resposta.RespostaConsultaEfpcs;
import br.gov.previc.dados.dao.DadosDaoInterface;
import br.gov.previc.dados.model.EfpcsModel;

@Stateless
public class EfpcsWS {
	//@EJB(beanName="EfpcsDao")
	@EJB
	DadosDaoInterface efpcsDAO;
	static final Logger logger = LogManager.getLogger();
	public EfpcsWS(){	
	}
	public Response doConsulta(UriInfo uriInfo, HttpServletRequest request, String id) {
		Map<String, Object> mapaParametro=new HashMap<String, Object>();
		mapaParametro.put("nuMatriculaEfpc", id);
		return 	doConsultaGenerica(uriInfo, request, mapaParametro, "EfpcsModel.findByNuMatriculaEfpc");	
	}
	public Response doConsultaGenerica(UriInfo uriInfo, HttpServletRequest request,  Map<String, Object> mapaParametro, String query) {
		try{
			List<Object> recuperados = efpcsDAO.listByQueryName(query,mapaParametro);
			logger.info("Encontrados " + recuperados.size() +" resultados.");
			RespostaConsultaEfpcs resultadoConsulta = new RespostaConsultaEfpcs(recuperados.stream().map(r -> new ItemRespostaEfpcs((EfpcsModel) r))
	        		.collect(Collectors.toList()));
			//System.out.println("Encontrados " + resultadoConsulta.getEfpcs().size() +" resultados.");
			return Response.ok().entity(resultadoConsulta).build();
		}
		catch (Exception e){
			logger.info(e.getMessage());
			return Response.status(403).entity(e.getMessage()).build();
		}
	}
	public Response doConsultaPorIdPjSpc(UriInfo uriInfo, HttpServletRequest request, String id) {
		Map<String, Object> mapaParametro=new HashMap<String, Object>();
		mapaParametro.put("idPjSpc", id);
		return 	doConsultaGenerica(uriInfo, request, mapaParametro, "EfpcsModel.findByIdPjSpc");	
	}
	

}
