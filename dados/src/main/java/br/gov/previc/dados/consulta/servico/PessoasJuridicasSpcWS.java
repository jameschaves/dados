package br.gov.previc.dados.consulta.servico;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.gov.previc.dados.consulta.resposta.ItemRespostaPessoasJuridicasSpc;
import br.gov.previc.dados.consulta.resposta.RespostaConsultaPessoasJuridicasSpc;
import br.gov.previc.dados.dao.DadosDaoInterface;
import br.gov.previc.dados.model.PessoasJuridicasSpcModel;

@Stateless
public class PessoasJuridicasSpcWS {
	//@EJB(beanName="PessoasJuridicasSpcDao")
	@EJB
	DadosDaoInterface pessoasJuridicasSpcDao; 
	static final Logger logger = LogManager.getLogger();
	public PessoasJuridicasSpcWS(){	
	}
	public Response doConsulta(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		Map<String, Object> mapaParametro=new HashMap<String, Object>();
		mapaParametro.put("idPjSpc", id);
		return 	doConsultaGenerica(uriInfo, request, mapaParametro, "PessoasJuridicasSpcModel.Native.findByIdPjSpc");	
	}
	public Response doConsultaPorCnpj(UriInfo uriInfo, HttpServletRequest request, String cnpj) {
		Map<String, Object> mapaParametro=new HashMap<String, Object>();
		mapaParametro.put("nuCnpj", cnpj);
		return 	doConsultaGenerica(uriInfo, request,  mapaParametro, "PessoasJuridicasSpcModel.Native.findByCnpj");	
	}
	
	public Response doConsultaGenerica(UriInfo uriInfo, HttpServletRequest request, Map<String, Object> mapaParametro, String query) {
		try{
			
			List<Object> recuperados = pessoasJuridicasSpcDao.listByQueryName(query,mapaParametro);
			logger.debug("Requisicao: " + request.getRemoteAddr());
			logger.debug("Encontrados " + recuperados.size() +" resultados.");
			List<PessoasJuridicasSpcModel> pjs = new LinkedList<PessoasJuridicasSpcModel>();
			for (Object recuperado : recuperados) {
				pjs.add((PessoasJuridicasSpcModel) recuperado);
			}
			logger.debug("Cast correto.");
			List<ItemRespostaPessoasJuridicasSpc> items = new LinkedList<ItemRespostaPessoasJuridicasSpc>();;
			for (PessoasJuridicasSpcModel pj : pjs) {
				items.add(new ItemRespostaPessoasJuridicasSpc(pj));
			}
			logger.debug("Lista de items: " + items.toString());
			RespostaConsultaPessoasJuridicasSpc resultadoConsulta = new RespostaConsultaPessoasJuridicasSpc(items);
			logger.debug("Resultados: " + resultadoConsulta);
			return Response.ok().entity(resultadoConsulta).build();
		}
		catch (Exception e){
			logger.info(e.getMessage());
			return Response.status(403).entity(e.getMessage()).build();
		}		
	}

}
