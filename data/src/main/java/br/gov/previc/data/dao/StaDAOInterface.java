/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.previc.data.dao;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;


/**
 *
 * @author James
 */
@Local
public interface StaDAOInterface {

	public void save(Object bean);

    public void merge(Object bean);

    public void remove(Object bean);

    public Object getById(long id);

    public List<Object> list();

    public List<Object> listByQueryName(String queryName);

	public List<Object> listByQueryName(String queryName, Map<String, Object> mapParametro);
	
}
