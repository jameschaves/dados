package br.gov.previc.dados.ws;

import java.math.BigDecimal;
import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.gov.previc.dados.consulta.servico.ICadastrosPessoasFisicasSpcWS;
import br.gov.previc.dados.consulta.servico.IConsultaHabilitacaoAnexoPdfWS;
import br.gov.previc.dados.consulta.servico.IDadosXQueryWS;
import br.gov.previc.dados.consulta.servico.IDiasUteisWS;
import br.gov.previc.dados.consulta.servico.IDirigentesWS;
import br.gov.previc.dados.consulta.servico.IEfpcsWS;
import br.gov.previc.dados.consulta.servico.IGestoesPlanoWS;
import br.gov.previc.dados.consulta.servico.IHabilitacoesAnexoWS;
import br.gov.previc.dados.consulta.servico.IHistoricosCaptacaoWS;
import br.gov.previc.dados.consulta.servico.ILancamentosPlanoWS;
import br.gov.previc.dados.consulta.servico.IPessoasJuridicasSpcWS;
import br.gov.previc.dados.consulta.servico.IPlanosBeneficiosWS;
import br.gov.previc.dados.consulta.servico.ISituacoesPlanoWS;
import br.gov.previc.dados.consulta.servico.ITipoFuncaoDirigentesWS;
import br.gov.previc.dados.consulta.servico.IProximoUtilWS;

@Stateless
public class DadosWS implements DadosWSInterface {
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
	@EJB
	ICadastrosPessoasFisicasSpcWS cadastrosPessoasFisicasSpcWS;
	@EJB
	IHistoricosCaptacaoWS historicosCaptacaoWS;
	@EJB
	ILancamentosPlanoWS lancamentosPlanoWS;
	@EJB
	IDirigentesWS dirigentesWS;
	@EJB
	IHabilitacoesAnexoWS habilitacaoAnexoWS;
	@EJB
	ITipoFuncaoDirigentesWS tipoFuncaoDirigentesWS;
	@EJB
	IConsultaHabilitacaoAnexoPdfWS consultaHabilitacaoAnexoPdfWS;
	@EJB(beanName = "DadosXQueryConsultaHabilitacaoPorNomeECpfWS")
	IDadosXQueryWS consultaHabilitacaoPorNomeECpfWS;
	@EJB
	IDiasUteisWS diasUteisWS;
	@EJB
	IProximoUtilWS proximoUtilWS;

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

	@Override
	public Response consultaCadastrosPessoasFisicasSpc(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return cadastrosPessoasFisicasSpcWS.doConsulta(uriInfo, request, id);
	}

	@Override
	public Response consultaCadastrosPessoasFisicasSpcPorCpf(UriInfo uriInfo, HttpServletRequest request,
			BigDecimal id) {
		return cadastrosPessoasFisicasSpcWS.doConsultaPorCpf(uriInfo, request, id);
	}

	@Override
	public Response consultaLancamentosPlano(UriInfo uriInfo, HttpServletRequest request, Long id) {
		return lancamentosPlanoWS.doConsulta(uriInfo, request, id);
	}

	@Override
	public Response consultaLancamentosPlanoPorCnpbPorTempo(UriInfo uriInfo, HttpServletRequest request, BigDecimal id,
			Integer ano, Integer mes, Integer trimestre) {
		return lancamentosPlanoWS.doConsultaPorCnpbPorTempo(uriInfo, request, id, ano, mes, trimestre);
	}

	@Override
	public Response consultaHistoricosCaptacao(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return historicosCaptacaoWS.doConsulta(uriInfo, request, id);
	}

	@Override
	public Response consultaHistoricosCaptacaoPorEfpc(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return historicosCaptacaoWS.doConsultaPorEfpc(uriInfo, request, id);
	}

	@Override
	public Response consultaDirigentes(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return dirigentesWS.doConsulta(uriInfo, request, id);
	}

	@Override
	public Response consultaDirigentesPorIdCadastroSpc(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return dirigentesWS.doConsultaPorIdCadastroSpc(uriInfo, request, id);
	}

	@Override
	public Response consultaHabilitacoesAnexo(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return habilitacaoAnexoWS.doConsulta(uriInfo, request, id);
	}

	@Override
	public Response consultaHabilitacoesAnexoPorIdCadastroSpc(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return habilitacaoAnexoWS.doConsultaPorIdCadastroSpc(uriInfo, request, id);
	}

	@Override
	public Response consultaTipoFuncaoDirigentes(UriInfo uriInfo, HttpServletRequest request, Integer id) {
		return tipoFuncaoDirigentesWS.doConsulta(uriInfo, request, id);
	}

	@Override
	public Response findContentBase64(UriInfo uriInfo, HttpServletRequest request) {
		return consultaHabilitacaoAnexoPdfWS.doConsulta(uriInfo, request);
	}
	
	@Override
	public Response consultaHabilitacoesComParametros(UriInfo uriInfo, HttpServletRequest request, String nome,
			String cpf, String efpc) {		
		return consultaHabilitacaoPorNomeECpfWS.doConsulta(uriInfo, request);
	}

	@Override
	public Response buscarSiglas(UriInfo uriInfo, HttpServletRequest request) {
		return consultaHabilitacaoPorNomeECpfWS.doConsultaSiglasEfpc(uriInfo, request);
	}

	@Override
	public Response consultaDiasUteis(UriInfo uriInfo, HttpServletRequest request, Date data1, Date data2) {
		return diasUteisWS.doConsulta(uriInfo, request, data1, data2);
	}
	
	@Override
	public Response consultaProximoUtil(UriInfo uriInfo, HttpServletRequest request, String data1) {
		return proximoUtilWS.doConsultaUtil(uriInfo, request, data1);
	}

}
