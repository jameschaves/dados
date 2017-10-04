package br.gov.previc.corp.test;

import java.util.Base64;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.junit.Test;

import br.gov.previc.corp.resposta.ResultadoConsultaEfpcs;
import br.gov.previc.corp.resposta.ResultadoConsultaPessoasJuridicasSpc;
import br.gov.previc.corp.resposta.ResultadoConsultaPlanosBeneficios;

public class CorpWebServiceIT {

	static String login = "corp";
	static String password = "P@$$w0rd";
	static String host = "10.68.14.72";
	static String port = "8080";
	static String http = "http://";
	static String cnpj = "6252746000179";
	static String cnpb = "1984000438";
	
	@Test
	public void testPessoasJuridicasSpc() throws JAXBException {
		System.out.println("\n\nTestando consulta PessoasJuridicasSpc...");
		String url = http+host+":"+port+"/corp/rest/corp/pessoasjuridicasspc"
				+"?cnpj="
				+ cnpj;	
		System.out.println("Url sendo testada: "+url);
		String encodedHeader = Base64.getEncoder().encodeToString((login+":"+password).getBytes());
	    Response response = ClientBuilder.newClient().target(url).request().header("Authorization", "Basic "+encodedHeader).get();
	    System.out.println("Status: "+response.getStatus());
	    System.out.println("Status Info: "+response.getStatusInfo().toString());
	    if(response.getStatus()==200){
	    	ResultadoConsultaPessoasJuridicasSpc resultado = response.readEntity(ResultadoConsultaPessoasJuridicasSpc.class);
	    	JAXBContext.newInstance(ResultadoConsultaPessoasJuridicasSpc.class).createMarshaller().marshal(resultado, System.out);
	    }else{
	    	System.out.println("Resultado: "+response.readEntity(String.class));
	    }
	    //Assert.assertEquals(200, response.getStatus());
	    
	}
	@Test
	public void testEfpcs() throws JAXBException {
		System.out.println("\n\nTestando consulta Efpcs...");
		String url = http+host+":"+port+"/corp/rest/corp/efpcs"
				+"?cnpj="
				+ cnpj;	
		System.out.println("Url sendo testada: "+url);
		String encodedHeader = Base64.getEncoder().encodeToString((login+":"+password).getBytes());
	    Response response = ClientBuilder.newClient().target(url).request().header("Authorization", "Basic "+encodedHeader).get();
	    System.out.println("Status: "+response.getStatus());
	    System.out.println("Status Info: "+response.getStatusInfo().toString());
	    if(response.getStatus()==200){
	    	ResultadoConsultaEfpcs resultado = response.readEntity(ResultadoConsultaEfpcs.class);
	    	JAXBContext.newInstance(ResultadoConsultaEfpcs.class).createMarshaller().marshal(resultado, System.out);
	    }else{
	    	System.out.println("Resultado: "+response.readEntity(String.class));
	    }
	    System.out.println();
	    //Assert.assertEquals(200, response.getStatus());
	    
	}
	@Test
	public void testPlanosBeneficios() throws JAXBException {
		System.out.println("\n\nTestando consulta PlanosBeneficios...");
		String url = http+host+":"+port+"/corp/rest/corp/planosbeneficios"
				+"?cnpb="
				+ cnpb;	
		System.out.println("Url sendo testada: "+url);
		String encodedHeader = Base64.getEncoder().encodeToString((login+":"+password).getBytes());
	    Response response = ClientBuilder.newClient().target(url).request().header("Authorization", "Basic "+encodedHeader).get();
	    System.out.println("Status: "+response.getStatus());
	    System.out.println("Status Info: "+response.getStatusInfo().toString());
	    if(response.getStatus()==200){
	    	ResultadoConsultaPlanosBeneficios resultado = response.readEntity(ResultadoConsultaPlanosBeneficios.class);
	    	JAXBContext.newInstance(ResultadoConsultaPlanosBeneficios.class).createMarshaller().marshal(resultado, System.out);
	    }else{
	    	System.out.println("Resultado: "+response.readEntity(String.class));
	    }
	    System.out.println();
	    //Assert.assertEquals(200, response.getStatus());
	    
	}
	
	
}