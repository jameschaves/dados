package br.gov.previc.dados.seguranca;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.LoginContext;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jboss.resteasy.util.Base64;


@Provider
public class SecurityFilter implements ContainerRequestFilter {
	static final Logger logger = LogManager.getLogger();
	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		
		
		//Get request headers
        final MultivaluedMap<String, String> headers = requestContext.getHeaders();
         
        //Fetch authorization header
		final List<String> authorization = headers.get(HttpHeaders.AUTHORIZATION);
        
        //If no authorization information present; block access
		//Teste VEVTVEVfUEVUUk9TXzEyNTpQRVRST1M=
        if((null == authorization)||(authorization.isEmpty()))
        {
            requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED)
                    .entity("Não autorizado.")
                    .build());
            return;
        }
        Map<String, String> map = extraiUsuarioSenha(authorization.get(0)); 
        if(null==map){
        	requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED)
                    .entity("Não autorizado.")
                    .build());
        	return;
        }
        logger.debug("Requisição: " + requestContext.getHeaders().toString());
        try {
        	CallbackHandler handler = new UserPassHandler(map.get("username"), map.get("password"));
        	LoginContext lc = new LoginContext("other", handler);
        	lc.login();
        	/*
        	if (!map.get("password").equals(password))
        		requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED)
                        .entity("NÃ£o autorizado.")
                        .build());
        	*/
        } catch (Exception e) {
        	logger.debug("Requisição negada: " + requestContext.getHeaders().toString());
        	logger.debug("Erro: " + e.getMessage());
        	requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED)
                    .entity(e.getMessage())
                    .build());
        }
          	
    }
	
	public static Map<String, String> extraiUsuarioSenha(String authHeader){
    	
    	if(null==authHeader)
    		return null;
    	String usernameAndPassword = null;
    	final String encodedUserPassword = authHeader.replaceFirst("Basic" + " ", "");
    	try {
            usernameAndPassword = new String(Base64.decode(encodedUserPassword));
        } catch (IOException e) {       	
        	return null;
        }
        //Split username and password tokens
        final StringTokenizer tokenizer = new StringTokenizer(usernameAndPassword, ":");
        final String username = tokenizer.nextToken();
        final String password = tokenizer.nextToken();
        Map<String, String> map = new HashMap<String, String>();
        map.put("username", username);
        map.put("password", password);
    	return map;
    }
}
	