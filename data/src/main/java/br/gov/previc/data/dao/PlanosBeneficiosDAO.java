package br.gov.previc.data.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.gov.previc.data.model.EfpcsBean;
import br.gov.previc.data.model.PlanosBeneficiosBean;

/**
 *
 * @author James Chaves
 */

@SuppressWarnings("unchecked")
@Stateless
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class PlanosBeneficiosDAO extends StaDAO implements StaDAOInterface{

	@PersistenceContext
	EntityManager manager;
	
    public PlanosBeneficiosBean getById(long id) {
    	//EntityManager manager = JPAUtil.getEntityManager();
    	PlanosBeneficiosBean item = manager.find(PlanosBeneficiosBean.class, id);
		//manager.close();
		return item;
        
    }

    public List<Object> list() {
		//EntityManager manager = JPAUtil.getEntityManager();
		List<Object> lista = manager.createQuery("from PlanosBeneficiosBean").getResultList();
		//manager.close();
		return lista;
    }
    
}
