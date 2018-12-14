package br.gov.previc.dados.consulta.servico.impl;

import java.util.HashMap;

import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.gov.previc.dados.consulta.servico.IDadosXQueryWS;
import br.gov.previc.dados.dao.DadosDaoInterface;
import br.gov.previc.dados.utils.Utils;

@Stateless
public class DadosXQueryConsultaHabilitacaoPorCpfWS implements IDadosXQueryWS {
	@EJB
	public DadosDaoInterface dao;
	static final Logger logger = LogManager.getLogger();
	
	static final String sql = "DECLARE @xmlHabilitacao XML;\r\n" + 
			"SELECT @xmlHabilitacao = \r\n" + 
			"(\r\n" + 
			"SELECT\r\n" + 
			"	TRIM(NM_PESSOA_FISICA_SPC) AS nome_pessoa_fisica,\r\n" + 
			"	NU_CPF AS cpf,\r\n" + 
			"	SG_EFPC AS sigla,\r\n" + 
			"	NM_TIPO_FUNCAO AS funcao,\r\n" + 
			"	NM_CARGO AS cargo,\r\n" + 
			"	IIF(IN_AETQ = 1, 'SIM', 'NÃO') AS aetq,\r\n" + 
			"	TE_CODIGO_HABILITACAO AS numero_habilitacao,\r\n" + 
			"	DT_VALIDADE AS validade_habilitacao\r\n" + 
			"\r\n" + 
			"  FROM [DADOS].[CAND].[DIRIGENTES]\r\n" + 
			"  JOIN CAND.CADASTROS_PESSOAS_FISICAS_SPC ON DIRIGENTES.ID_CADASTRO_SPC = CADASTROS_PESSOAS_FISICAS_SPC.ID_CADASTRO_SPC\r\n" + 
			"  JOIN CAND.HABILITACOES_ANEXO ON DIRIGENTES.ID_DIRIGENTE = HABILITACOES_ANEXO.NU_DIRIGENTE\r\n" + 
			"  JOIN DADOS.TIPO_FUNCAO_DIRIGENTES ON HABILITACOES_ANEXO.ID_TIPO_FUNCAO = TIPO_FUNCAO_DIRIGENTES.ID_TIPO_FUNCAO\r\n" + 
			"  JOIN CADSPC.EFPCS ON HABILITACOES_ANEXO.NU_EFPC = EFPCS.NU_MATRICULA_EFPC\r\n" + 
			"  WHERE NU_CPF = :cpf \r\n" + 
			"  ORDER BY NM_PESSOA_FISICA_SPC\r\n" + 
			"  FOR XML RAW ('habilitacao'), ROOT ('habilitacoes'), ELEMENTS \r\n" + 
			")\r\n" + 
			"SELECT  CAST(@xmlHabilitacao AS VARCHAR(MAX))  AS XmlHabilitacao;";


	public DadosXQueryConsultaHabilitacaoPorCpfWS() {
	}

	@Override
	public Response doConsulta(UriInfo uriInfo, HttpServletRequest request) {
		Map<String, Object> mapaParametro = new HashMap<String, Object>();
		String cpf = uriInfo.getPathParameters().getFirst("cpf");
		logger.info("CPF mapeado: " + cpf);
		mapaParametro.put("cpf", cpf);
		return doConsultaGenerica(request, mapaParametro, sql);
	}

	public Response doConsultaGenerica(HttpServletRequest request, Map<String, Object> mapaParametro, String query) {
		try {
			String result = dao.resultByQueryName(query, mapaParametro);
			logger.info("Requisição de origem " + Utils.getClientIp(request) + " encontrou ");
			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			logger.info(
					"Erro na requisicao de origem " + Utils.getClientIp(request) + " com a mensagem " + e.getMessage());
			return Response.status(403).entity(e.getMessage()).build();
		}
	}

}
