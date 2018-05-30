package br.gov.previc.dados.consulta.servico.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import br.gov.previc.dados.consulta.servico.EfpcsWS;
import br.gov.previc.dados.dao.DadosDao;
import br.gov.previc.dados.model.EfpcsModel;

public class EfpcsWSTest {
	
	@Test
	public void testaMetodoDoConsulta() {
		EfpcsWS efpcsWS = new EfpcsWS();
		efpcsWS.dao = Mockito.mock(DadosDao.class);
		Map<String, Object> mockMapaParametro=new HashMap<String, Object>();
		mockMapaParametro.put("nuMatriculaEfpc", "1");
		EfpcsModel mockEfpcsModel = new EfpcsModel();
		mockEfpcsModel.setCsFundamentacaoLegal((short)1);
		mockEfpcsModel.setCsPatrocinioPredominante((short)1);
		mockEfpcsModel.setCsTipoEfpc((short)1);
		mockEfpcsModel.setDtAprovacaoEfpc(new Date());
		mockEfpcsModel.setDtEncerramentoEfpc(new Date());
		mockEfpcsModel.setDtInicioFunc(new Date());
		mockEfpcsModel.setIdPjSpc(1);
		mockEfpcsModel.setIdSitEfpc((short)1);
		mockEfpcsModel.setNuMatriculaEfpc(1);
		mockEfpcsModel.setNuProcessoEfpc(1L);
		mockEfpcsModel.setQtMaxConselheiroDelib("1");
		mockEfpcsModel.setQtMaxConselheiroFiscal((short)1);
		mockEfpcsModel.setQtMaxDiretoresExec((short)1);
		mockEfpcsModel.setTeExpedienteFunc("");
		List<Object> mockLista = new ArrayList<Object>();
		mockLista.add(mockEfpcsModel);
		Mockito.when(efpcsWS.dao
		        .listByQueryName("EfpcsModel.findByNuMatriculaEfpc", mockMapaParametro))
		        .thenReturn(mockLista);
		HttpServletRequest  mockedRequest = Mockito.mock(HttpServletRequest.class);
		Mockito.when(mockedRequest
		        .getHeader("X-FORWARDED-FOR"))
		        .thenReturn(this.getClass().getName());
		UriInfo  mockedUriInfo = Mockito.mock(UriInfo.class);
		
		Response response = efpcsWS.doConsulta(mockedUriInfo, mockedRequest, 1);
	    Assert.assertEquals(response.getStatus(),200);
	}
	@Test
	public void testaMetodoDoConsultaPorIdPjSpc() {
		EfpcsWS efpcsWS = new EfpcsWS();
		efpcsWS.dao = Mockito.mock(DadosDao.class);
		Map<String, Object> mockMapaParametro=new HashMap<String, Object>();
		mockMapaParametro.put("idPjSpc", "1");
		EfpcsModel mockEfpcsModel = new EfpcsModel();
		mockEfpcsModel.setCsFundamentacaoLegal((short)1);
		mockEfpcsModel.setCsPatrocinioPredominante((short)1);
		mockEfpcsModel.setCsTipoEfpc((short)1);
		mockEfpcsModel.setDtAprovacaoEfpc(new Date());
		mockEfpcsModel.setDtEncerramentoEfpc(new Date());
		mockEfpcsModel.setDtInicioFunc(new Date());
		mockEfpcsModel.setIdPjSpc(1);
		mockEfpcsModel.setIdSitEfpc((short)1);
		mockEfpcsModel.setNuMatriculaEfpc(1);
		mockEfpcsModel.setNuProcessoEfpc(1L);
		mockEfpcsModel.setQtMaxConselheiroDelib("1");
		mockEfpcsModel.setQtMaxConselheiroFiscal((short)1);
		mockEfpcsModel.setQtMaxDiretoresExec((short)1);
		mockEfpcsModel.setTeExpedienteFunc("");
		List<Object> mockLista = new ArrayList<Object>();
		mockLista.add(mockEfpcsModel);
		Mockito.when(efpcsWS.dao
		        .listByQueryName("EfpcsModel.findByIdPjSpc", mockMapaParametro))
		        .thenReturn(mockLista);
		HttpServletRequest  mockedRequest = Mockito.mock(HttpServletRequest.class);
		Mockito.when(mockedRequest
		        .getHeader("X-FORWARDED-FOR"))
		        .thenReturn(this.getClass().getName());
		UriInfo  mockedUriInfo = Mockito.mock(UriInfo.class);
		
		Response response = efpcsWS.doConsultaPorIdPjSpc(mockedUriInfo, mockedRequest, 1);
	    Assert.assertEquals(response.getStatus(),200);
	}
}
