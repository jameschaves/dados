package br.gov.previc.data.ws;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.gov.previc.data.seguranca.SecurityFilter;

@ApplicationPath("rest")
public class DataWSApplication extends Application
{
   private Set<Object> singletons = new HashSet<Object>();
   private Set<Class<?>> empty = new HashSet<Class<?>>();

   public DataWSApplication()
   {
      singletons.add(new DataWebService());
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
