package br.gov.previc.dados.test;

import java.util.Base64;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBException;

import org.junit.Assert;
import org.junit.Test;

public class DadosWSIT {

	static String login = "dados";
	static String password = "P@$$w0rd";
	static String host = "localhost"; 
	static String port = "8443";
	
	@Test
	public void testPessoasJuridicasSpc() throws JAXBException {
		System.out.println("\n\nTestando consulta a PessoasJuridicasSpc...");
		String idDeTeste="4";
		String url = "https://"+host+":"+port+"/dados/rest/dados/pessoasjuridicasspc/"+idDeTeste;	
		testaUrl(url);
	}
	@Test
	public void testPessoasJuridicasSpcPorCnpj() throws JAXBException {
		System.out.println("\n\nTestando consulta a PessoasJuridicasSpc por Cnpj...");
		String idDeTeste="74060534000140";
		String url = "https://"+host+":"+port+"/dados/rest/dados/pessoasjuridicasspc/cnpj/"+idDeTeste;	
		testaUrl(url);
	}
	@Test
	public void testEfpcs() throws JAXBException {
		System.out.println("\n\nTestando consulta a Efpcs...");
		String idDeTeste="14";
		String url = "https://"+host+":"+port+"/dados/rest/dados/efpcs/"+idDeTeste;	
		testaUrl(url);
	}
	@Test
	public void testEfpcsPorIdPjSpc() throws JAXBException {
		System.out.println("\n\nTestando consulta a Efpcs por IdPjSpc...");
		String idDeTeste="100";
		String url = "https://"+host+":"+port+"/dados/rest/dados/efpcs/idpjspc/"+idDeTeste;	
		testaUrl(url);
	}
	@Test
	public void testPlanosBeneficios() throws JAXBException {
		System.out.println("\n\nTestando consulta a PlanosBeneficios...");
		String idDeTeste="100";
		String url = "https://"+host+":"+port+"/dados/rest/dados/planosbeneficios/"+idDeTeste;	
		testaUrl(url);
	}
	@Test
	public void testPlanosBeneficiosPorCnpb() throws JAXBException {
		System.out.println("\n\nTestando consulta a PlanosBeneficios por Cnpb...");
		String idDeTeste="1979001456";
		String url = "https://"+host+":"+port+"/dados/rest/dados/planosbeneficios/cnpb/"+idDeTeste;	
		testaUrl(url);
	}
	@Test
	public void testSituacoesPlano() throws JAXBException {
		System.out.println("\n\nTestando consulta a SituacoesPlano...");
		String idDeTeste="1";
		String url = "https://"+host+":"+port+"/dados/rest/dados/situacoesplano/"+idDeTeste;	
		testaUrl(url);
	}
	@Test
	public void testGestoesPlano() throws JAXBException {
		System.out.println("\n\nTestando consulta a GestoesPlano...");
		String idDeTeste="3";
		String url = "https://"+host+":"+port+"/dados/rest/dados/gestoesplano/"+idDeTeste;	
		testaUrl(url);	
	}
	@Test
	public void testGestoesPlanoPorEfpc() throws JAXBException {
		System.out.println("\n\nTestando consulta a GestoesPlano por Efpc...");
		String idDeTeste="655";
		String url = "https://"+host+":"+port+"/dados/rest/dados/gestoesplano/efpc/"+idDeTeste;	
		testaUrl(url);	
	}
	@Test
	public void testGestoesPlanoPorPlano() throws JAXBException {
		System.out.println("\n\nTestando consulta a GestoesPlano por Plano...");
		String idDeTeste="655";
		String url = "https://"+host+":"+port+"/dados/rest/dados/gestoesplano/plano/"+idDeTeste;	
		testaUrl(url);	
	}
	@Test
	public void testCadastrosPessoasFisicasSpc() throws JAXBException {
		System.out.println("\n\nTestando consulta a CadastrosPessoasFisicasSpc...");
		String idDeTeste="3348";
		String url = "https://"+host+":"+port+"/dados/rest/dados/cadastrospessoasfisicasspc/"+idDeTeste;	
		testaUrl(url);	
	}
	@Test
	public void testCadastrosPessoasFisicasSpcPorCpf() throws JAXBException {
		System.out.println("\n\nTestando consulta a CadastrosPessoasFisicasSpc...");
		String idDeTeste="26225794700";
		String url = "https://"+host+":"+port+"/dados/rest/dados/cadastrospessoasfisicasspc/cpf/"+idDeTeste;	
		testaUrl(url);	
	}
	@Test
	public void testLancamentosPlano() throws JAXBException {
		System.out.println("\n\nTestando consulta a LancamentosPlano...");
		String idDeTeste="26225794700";
		String url = "https://"+host+":"+port+"/dados/rest/dados/lancamentosplano/"+idDeTeste;	
		testaUrl(url);	
	}
	@Test
	public void testLancamentosPlanoPorCnpbPorTempo() throws JAXBException {
		System.out.println("\n\nTestando consulta a LancamentosPlano por cnpb ...");
		String cnpbDeTeste="1998005119";
		String anoDeTeste="2010";
		String mesDeTeste="1";
		String trimestreDeTeste="0";
		String url = "https://"+host+":"+port+"/dados/rest/dados/lancamentosplano/cnpb/"+cnpbDeTeste+"/ano/"+anoDeTeste+"/mes/"+mesDeTeste+"/trimestre/"+trimestreDeTeste;	
		testaUrl(url);	
	}
	@Test
	public void testHistoricosCaptacao() throws JAXBException {
		System.out.println("\n\nTestando consulta a HistoricosCaptacao...");
		String idDeTeste="201214";
		String url = "https://"+host+":"+port+"/dados/rest/dados/historicoscaptacao/"+idDeTeste;	
		testaUrl(url);	
	}
	@Test
	public void testHistoricosCaptacaoPorEfpc() throws JAXBException {
		System.out.println("\n\nTestando consulta a HistoricosCaptacao por Efpc...");
		String idDeTeste="3037";
		String url = "https://"+host+":"+port+"/dados/rest/dados/historicoscaptacao/efpc/"+idDeTeste;	
		testaUrl(url);	
	}
	public void testaUrl(String url) {
		System.out.println("Url sendo testada: "+url);
		String encodedHeader = Base64.getEncoder().encodeToString((login+":"+password).getBytes());
		Response response = ClientBuilder.newClient().target(url).request(MediaType.APPLICATION_XML)
	    		.header("Authorization", "Basic "+ encodedHeader).get();
	    System.out.println("Status: "+response.getStatus());
	    System.out.println("Status Info: "+response.getStatusInfo().toString());
	    if(response.getStatus()==200){
	    	String resposta = response.readEntity(String.class);
	    	System.out.println(resposta);
	    }else{
	    	System.out.println("Resultado: "+response.readEntity(String.class));
	    }
	    Assert.assertEquals(200, response.getStatus());
	}
}