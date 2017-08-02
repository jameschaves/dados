package br.gov.previc.corp.ws;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import br.gov.previc.corp.consulta.EfpcsWS;
import br.gov.previc.corp.consulta.PessoasJuridicasSpcWS;
import br.gov.previc.corp.consulta.PlanosBeneficiosWS;

@Stateless
public class CorpWebService implements CorpWebServiceInterface{
	
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