package br.gov.previc.mockcnpj.seguranca;

import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.LogManager;

import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.LoginContext;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;


 

@Provider
public class SecurityFilter implements ContainerRequestFilter {
	static final Logger logger = LoggerFactory.getLogger(SecurityFilter.class);
	
	public void filter(ContainerRequestContext requestContext) throws IOException {
		
		logger.debug(requestContext.getUriInfo().getPath());
		//Get request headers
        final MultivaluedMap<String, String> headers = requestContext.getHeaders();
         
        //Fetch authorization header
		final List<String> authorization = headers.get(HttpHeaders.AUTHORIZATION);
        
        //If no authorization information present; block access
        if((null == authorization)||(authorization.isEmpty()))
        {
            requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED)
                    .entity("Nao autorizado.")
                    .build());
            return;
        }
		logger.debug(authorization.toString());
        Map<String, String> map=null;
        try {
        	map = extraiUsuarioSenha(authorization.get(0));
        }
        catch(Exception e) {
        	requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED)
                    .entity("Nao autorizado.")
                    .build());
        }
        if(null==map){
        	requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED)
                    .entity("Nao autorizado.")
                    .build());
        	return;
        }
				
		try {
        	CallbackHandler handler = new UserPassHandler(map.get("username"), map.get("password"));
        	//LoginContext lc = new LoginContext("java:/jaas/other", handler);
        	LoginContext lc = new LoginContext("other", handler);
        	lc.login();
        } catch (Exception e) {
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
    	usernameAndPassword = new String(Base64.getDecoder().decode(encodedUserPassword));
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
	