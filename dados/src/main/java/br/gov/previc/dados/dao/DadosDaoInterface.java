/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.previc.dados.dao;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;


/**
 *
 * @author James
 */
@Local
public interface DadosDaoInterface {

    public List<Object> listByQueryName(String queryName);

	public List<Object> listByQueryName(String queryName, Map<String, Object> mapParametro);
	
}
