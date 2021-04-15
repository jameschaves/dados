package br.gov.previc.mockcnpj.ws;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.gov.previc.mockcnpj.seguranca.SecurityFilter;

@ApplicationPath("rest")
public class CadastroRfbWSApplication extends Application
{
   private Set<Object> singletons = new HashSet<Object>();
   private Set<Class<?>> empty = new HashSet<Class<?>>();

   public CadastroRfbWSApplication()
   {
      singletons.add(new CadastroRfbWebService());
      singletons.add(new SecurityFilter());
   }

   @Override
   public Set<Class<?>> getClasses()
   {
      return empty;
   }

   @Override
   public Set<Object> getSingletons()
   {
      return singletons;
   }

}
