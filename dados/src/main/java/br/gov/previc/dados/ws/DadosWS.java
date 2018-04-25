package br.gov.previc.dados.ws;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import br.gov.previc.dados.consulta.servico.EfpcsWS;
import br.gov.previc.dados.consulta.servico.PessoasJuridicasSpcWS;
import br.gov.previc.dados.consulta.servico.PlanosBeneficiosWS;

@Stateless
public class DadosWS implements DadosWSInterface{
	
	@EJB
	PessoasJuridicasSpcWS pessoasJuridicasSpcWS;
	@EJB
	EfpcsWS efpcsWS;
	@EJB
	PlanosBeneficiosWS planosBeneficiosWS;
  	 
    
	
	@Override
	public Response consultaPessoasJuridicasSpc(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		
		return pessoasJuridicasSpcWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaPessoasJuridicasSpcPorCnpj(UriInfo uriInfo, HttpServletRequest request, String cnpj) {
		
		return pessoasJuridicasSpcWS.doConsultaPorCnpj(uriInfo, request, cnpj);
	}
	@Override
	public Response consultaEfpcs(UriInfo uriInfo, HttpServletRequest request, String id) {
		return efpcsWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaPlanosBeneficios(UriInfo uriInfo, HttpServletRequest request, String id) {
		
		return planosBeneficiosWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaPlanosBeneficiosPorCnpb(UriInfo uriInfo, HttpServletRequest request, String cnpb) {
		
		return planosBeneficiosWS.doConsultaPorCnpb(uriInfo, request, cnpb);
	}
	@Override
	public Response consultaEfpcsPorIdPjSpc(UriInfo uriInfo, HttpServletRequest request, String id) {
		return efpcsWS.doConsultaPorIdPjSpc(uriInfo, request, id);
	}
	
}