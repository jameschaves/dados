package br.gov.previc.data.dao;

import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@SuppressWarnings("unchecked")
@Stateless
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public abstract class StaDAO {

	@PersistenceContext
	EntityManager manager;
	
	@TransactionAttribute(TransactionAttributeType.MANDATORY)
	public void save(Object bean) {
		manager.persist(bean);
	}
	@TransactionAttribute(TransactionAttributeType.MANDATORY)
	public void merge(Object bean) {
		manager.merge(bean);
	}
	@TransactionAttribute(TransactionAttributeType.MANDATORY)
	public void remove(Object bean) {
		manager.remove(manager.contains(bean) ? bean : manager.merge(bean));
	}

	public List<Object> listByQueryName(String queryName) {
		List<Object> lista = manager.createQuery(queryName).getResultList();
		return lista;
	}

	public List<Object> listByQueryName(String queryName, Map<String, Object> mapaParametro) {
		Query query = manager.createNamedQuery(queryName);
		mapaParametro.entrySet().stream().forEach(entry -> query.setParameter(entry.getKey(), entry.getValue()));
		List<Object> lista = query.getResultList();
		return lista;
	}
	
}
