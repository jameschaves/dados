package br.gov.previc.data.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.gov.previc.data.model.EfpcsBean;

/**
 *
 * @author James Chaves
 */

@SuppressWarnings("unchecked")
@Stateless
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class EfpcsDAO extends StaDAO implements StaDAOInterface{

	@PersistenceContext
	EntityManager manager;
	
    public EfpcsBean getById(long id) {
    	//EntityManager manager = JPAUtil.getEntityManager();
    	EfpcsBean item = manager.find(EfpcsBean.class, id);
		//manager.close();
		return item;
        
    }

    public List<Object> list() {
		//EntityManager manager = JPAUtil.getEntityManager();
		List<Object> lista = manager.createQuery("from EfpcsBean").getResultList();
		//manager.close();
		return lista;
    }
    
}
