package br.gov.previc.data.ws;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import br.gov.previc.data.consulta.EfpcsWS;
import br.gov.previc.data.consulta.PessoasJuridicasSpcWS;
import br.gov.previc.data.consulta.PlanosBeneficiosWS;

@Stateless
public class DataWebService implements DataWebServiceInterface{
	
	@EJB
	PessoasJuridicasSpcWS pessoasJuridicasSpcWS;
	@EJB
	EfpcsWS efpcsWS;
	@EJB
	PlanosBeneficiosWS planosWS;
  
	public Response consultaPessoasJuridicasSpc(
			UriInfo uriInfo, 
			HttpServletRequest request,  
			String cnpj) {
		
        return pessoasJuridicasSpcWS.doConsulta(uriInfo, request, cnpj);
    }	 
    public Response consultaEfpcs(
    		UriInfo uriInfo, 
    		HttpServletRequest request, 
    		String cnpj) {
		
		return efpcsWS.doConsulta(uriInfo, request, cnpj);
        
    }
    public Response consultaPlanosBeneficios(
    		UriInfo uriInfo, 
    		HttpServletRequest request, 
    		String cnpb) {
		
		return planosWS.doConsulta(uriInfo, request, cnpb);
        
    }
	
}