package br.gov.previc.corp.ws;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.gov.previc.corp.seguranca.SecurityFilter;

@ApplicationPath("rest")
public class CorpWSApplication extends Application
{
   private Set<Object> singletons = new HashSet<Object>();
   private Set<Class<?>> empty = new HashSet<Class<?>>();

   public CorpWSApplication()
   {
      singletons.add(new CorpWebService());
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
