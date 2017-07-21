package br.gov.previc.data.consulta;

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

import br.gov.previc.data.dao.StaDAOInterface;
import br.gov.previc.data.model.EfpcsBean;
import br.gov.previc.data.resposta.ItemConsultaEfpcs;
import br.gov.previc.data.resposta.ResultadoConsultaEfpcs;

@Stateless
public class EfpcsWS {
	@EJB(beanName="EfpcsDAO")
	StaDAOInterface efpcsDAO;
	public EfpcsWS(){	
	}
	public Response doConsulta(UriInfo uriInfo, HttpServletRequest request, String cnpj) {
		try{
			Map<String, Object> mapaParametro=new HashMap<String, Object>();
			mapaParametro.put("nuCnpj", BigDecimal.valueOf(Long.parseLong(cnpj)));
			List<Object> recuperados = efpcsDAO.listByQueryName("EfpcsBean.Native.findByCnpj",mapaParametro);
			ResultadoConsultaEfpcs resultadoConsulta = new ResultadoConsultaEfpcs(recuperados
	        		.stream()
	        		.map(r -> new ItemConsultaEfpcs((EfpcsBean) r))
	        		.collect(Collectors.toList()));
			return Response.ok().entity(resultadoConsulta).build();
		}
		catch (Exception e){
			return Response.status(403).entity(e.getMessage()).build();
		}
	}

}
