package br.gov.previc.dados.ws;

import java.math.BigDecimal;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.gov.previc.dados.consulta.servico.IEfpcsWS;
import br.gov.previc.dados.consulta.servico.IGestoesPlanoWS;
import br.gov.previc.dados.consulta.servico.IPessoasJuridicasSpcWS;
import br.gov.previc.dados.consulta.servico.IPlanosBeneficiosWS;
import br.gov.previc.dados.consulta.servico.ISituacoesPlanoWS;
@Stateless
public class CadWS implements CadWSInterface{
	@EJB
	IPessoasJuridicasSpcWS pessoasJuridicasSpcWS;
	@EJB
	IEfpcsWS efpcsWS;
	@EJB
	IPlanosBeneficiosWS planosBeneficiosWS;
	@EJB
	IGestoesPlanoWS gestoesPlanoWS; 
	@EJB
	ISituacoesPlanoWS situacoesPlanoWS;
	static final Logger logger = LogManager.getLogger();
	
	@Override
	public Response consultaPessoasJuridicasSpc(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		logger.debug("PessoasJuridicasSpcWS pessoasJuridicasSpcWS = " + pessoasJuridicasSpcWS);
		return pessoasJuridicasSpcWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaPessoasJuridicasSpcPorCnpj(UriInfo uriInfo, HttpServletRequest request, BigDecimal cnpj) {
		
		return pessoasJuridicasSpcWS.doConsultaPorCnpj(uriInfo, request, cnpj);
	}
	@Override
	public Response consultaEfpcs(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return efpcsWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaPlanosBeneficios(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		
		return planosBeneficiosWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaPlanosBeneficiosPorCnpb(UriInfo uriInfo, HttpServletRequest request, Long cnpb) {
		
		return planosBeneficiosWS.doConsultaPorCnpb(uriInfo, request, cnpb);
	}
	@Override
	public Response consultaEfpcsPorIdPjSpc(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return efpcsWS.doConsultaPorIdPjSpc(uriInfo, request, id);
	}
	@Override
	public Response consultaSituacoesPlano(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return situacoesPlanoWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaGestoesPlano(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return gestoesPlanoWS.doConsulta(uriInfo, request, id);
	}
	@Override
	public Response consultaGestoesPlanoPorEfpc(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return gestoesPlanoWS.doConsultaPorEfpc(uriInfo, request, id);
	}
	@Override
	public Response consultaGestoesPlanoPorPlano(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return gestoesPlanoWS.doConsultaPorPlano(uriInfo, request, id);
	}
}
