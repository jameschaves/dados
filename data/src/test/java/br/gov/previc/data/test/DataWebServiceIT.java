package br.gov.previc.data.test;

import java.util.Base64;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.junit.Test;

import br.gov.previc.data.resposta.ResultadoConsultaEfpcs;
import br.gov.previc.data.resposta.ResultadoConsultaPessoasJuridicasSpc;
import br.gov.previc.data.resposta.ResultadoConsultaPlanosBeneficios;

public class DataWebServiceIT {

	static String login = "data";
	static String password = "}+d9Wfr[8.}KG=8Y";
	static String host = "localhost";
	static String port = "8080";
	static String http = "http://";
	static String cnpj = "12905021000135";
	static String cnpb = "1904000118";
	
	@Test
	public void testPessoasJuridicasSpc() throws JAXBException {
		System.out.println("\n\nTestando consulta PessoasJuridicasSpc...");
		String url = http+host+":"+port+"/data/rest/data/pessoasjuridicasspc"
				+"?cnpj="
				+ cnpj;	
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
		String url = http+host+":"+port+"/data/rest/data/efpcs"
				+"?cnpj="
				+ cnpj;	
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
		String url = http+host+":"+port+"/data/rest/data/planosbeneficios"
				+"?cnpb="
				+ cnpb;	
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