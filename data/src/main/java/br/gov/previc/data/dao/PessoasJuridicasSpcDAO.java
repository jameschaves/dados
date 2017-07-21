package br.gov.previc.data.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.gov.previc.data.model.PessoasJuridicasSpcBean;

/**
 *
 * @author James Chaves
 */

@SuppressWarnings("unchecked")
@Stateless
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class PessoasJuridicasSpcDAO extends StaDAO implements StaDAOInterface{
	
	@PersistenceContext
	EntityManager manager;
	
	public PessoasJuridicasSpcBean getById(long id) {
		//EntityManager manager = JPAUtil.getEntityManager();
		PessoasJuridicasSpcBean item = manager.find(PessoasJuridicasSpcBean.class, id);
		//manager.close();
		return item;
		
	}

	public List<Object> list() {
		//EntityManager manager = JPAUtil.getEntityManager();
		List<Object> lista = manager.createQuery("from PessoasJuridicasSpcBean").getResultList();
		//manager.close();
		return lista;
	}
}
