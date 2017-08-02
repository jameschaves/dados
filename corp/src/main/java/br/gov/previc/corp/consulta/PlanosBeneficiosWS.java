package br.gov.previc.corp.consulta;

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

import br.gov.previc.corp.dao.StaDAOInterface;
import br.gov.previc.corp.model.PlanosBeneficiosBean;
import br.gov.previc.corp.resposta.ItemConsultaEfpcs;
import br.gov.previc.corp.resposta.ItemConsultaPlanosBeneficios;
import br.gov.previc.corp.resposta.ResultadoConsultaEfpcs;
import br.gov.previc.corp.resposta.ResultadoConsultaPlanosBeneficios;

@Stateless
public class PlanosBeneficiosWS {
	@EJB(beanName="PlanosBeneficiosDAO")
	StaDAOInterface planosDAO;
	public PlanosBeneficiosWS(){	
	}
	public Response doConsulta(UriInfo uriInfo, HttpServletRequest request, String cnpb) {
		try{
			Map<String, Object> mapaParametro=new HashMap<String, Object>();
			mapaParametro.put("nuCnpb", Long.parseLong(cnpb));
			List<Object> recuperados = planosDAO.listByQueryName("PlanosBeneficiosBean.Native.findByCnpb",mapaParametro);
			ResultadoConsultaPlanosBeneficios resultadoConsulta = new ResultadoConsultaPlanosBeneficios(recuperados
	        		.stream()
	        		.map(r -> new ItemConsultaPlanosBeneficios((PlanosBeneficiosBean) r))
	        		.collect(Collectors.toList()));
			return Response.ok().entity(resultadoConsulta).build();
		}
		catch (Exception e){
			return Response.status(403).entity(e.getMessage()).build();
		}
	}

}
