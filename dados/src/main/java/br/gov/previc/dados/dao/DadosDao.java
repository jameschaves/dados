package br.gov.previc.dados.dao;

import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@SuppressWarnings("unchecked")
@Stateless
public class DadosDao implements DadosDaoInterface {

	@PersistenceContext
	EntityManager manager;

	@Override
	public List<Object> listByQueryName(String queryName) {
		List<Object> lista = manager.createQuery(queryName).getResultList();
		return lista;
	}

	@Override
	public List<Object> listByQueryName(String queryName, Map<String, Object> mapaParametro) {
		Query query = manager.createNamedQuery(queryName);
		mapaParametro.entrySet().stream().forEach(entry -> query.setParameter(entry.getKey(), entry.getValue()));
		List<Object> lista = query.getResultList();
		return lista;
	}

	@Override
	public String resultByQueryName(String sql, Map<String, Object> mapaParametro) {
		Query query = manager.createNativeQuery(sql);
		mapaParametro.entrySet().stream().forEach(entry -> query.setParameter(entry.getKey(), entry.getValue()));
		return (String) query.getSingleResult();
	}

}
