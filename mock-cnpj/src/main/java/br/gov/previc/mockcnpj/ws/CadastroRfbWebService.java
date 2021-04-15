package br.gov.previc.mockcnpj.ws;

import java.math.BigDecimal;

import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Stateless
public class CadastroRfbWebService implements CadastroRfbWebServiceInterface{
	
	
	
    public Response getCnpjCadastroPorCnpj(UriInfo uriInfo, HttpServletRequest request, BigDecimal cnpj)  {
    	
    	ItemConsultaCnpjCadastro res = new ItemConsultaCnpjCadastro(
    			46378,
    			"00058166000169",
    			1,
    			"FUNDACAO TECHNOS DE PREVIDENCIA SOCIAL",
    			null,
    			"02",
    			"20051103",
    			0,
    			null,
    			null,
    			null,
    			3069,
    			"19940504",
    			8430200,
    			"QUADRA",
    			"SGAN 601 CONJUNTO 'S' PARTE 'B'",
    			"S/N",
    			null,
    			"ASA NORTE",
    			"70830010",
    			9701,
    			"BRASILIA",
    			"61 21088911",
    			"61",
    			"21088911",
    			"61  21088848",
    			"61",
    			"21088848",
    			"61",
    			"61",
    			"21088914",
    			null,
    			16,
    			0f,
    			"05",
    			"0",
    			"00000000",
    			"00000000",
    			"N",
    			null, 
    			null,
    			11
    			);
    	return Response.ok().entity(res).build();   	
	
    	
	}
	
    
	
}