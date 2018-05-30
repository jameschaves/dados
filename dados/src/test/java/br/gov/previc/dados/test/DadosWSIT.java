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
	static String cnpj = "6252746000179";
	static String cnpb = "1984000438";
	
	@Test
	public void testPessoasJuridicasSpcPorId() throws JAXBException {
		System.out.println("\n\nTestando consulta PessoasJuridicasSpc...");
		String idDeTeste="4";
		String url = "https://"+host+":"+port+"/dados/rest/dados/pessoasjuridicasspc/"+idDeTeste;	
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