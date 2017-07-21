package br.gov.previc.data.dao;

import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author James Chaves
 */

@SuppressWarnings("unchecked")
@Stateless
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public abstract class StaDAO {

	@PersistenceContext
	EntityManager manager;
	
	@TransactionAttribute(TransactionAttributeType.MANDATORY)
	public void save(Object bean) {
		//EntityManager manager = JPAUtil.getEntityManager();
		//manager.getTransaction().begin();
		manager.persist(bean);
		//manager.getTransaction().commit();
		//manager.close();
	}
	/*
	public void save(Object bean, EntityManager manager) {
		manager.persist(bean);
	}
	*/
	@TransactionAttribute(TransactionAttributeType.MANDATORY)
	public void merge(Object bean) {
		//EntityManager manager = JPAUtil.getEntityManager();
		//manager.getTransaction().begin();
		manager.merge(bean);
		//manager.getTransaction().commit();
		//manager.close();
	}
	@TransactionAttribute(TransactionAttributeType.MANDATORY)
	public void remove(Object bean) {
		//EntityManager manager = JPAUtil.getEntityManager();
		//manager.getTransaction().begin();
		manager.remove(manager.contains(bean) ? bean : manager.merge(bean));
		//manager.getTransaction().commit();
		//manager.close();
	}

	public List<Object> listByQueryName(String queryName) {
		//EntityManager manager = JPAUtil.getEntityManager();
		//manager.getTransaction().begin();
		List<Object> lista = manager.createQuery(queryName).getResultList();
		//manager.getTransaction().commit();
		//manager.close();
		return lista;
	}

	public List<Object> listByQueryName(String queryName, Map<String, Object> mapaParametro) {
		//EntityManager manager = JPAUtil.getEntityManager();
		//manager.getTransaction().begin();
		Query query = manager.createNamedQuery(queryName);
		mapaParametro.entrySet().stream().forEach(entry -> query.setParameter(entry.getKey(), entry.getValue()));
		List<Object> lista = query.getResultList();
		//manager.getTransaction().commit();
		//manager.close();
		return lista;
	}
	
}
