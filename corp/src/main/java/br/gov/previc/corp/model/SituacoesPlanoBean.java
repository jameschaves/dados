/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.previc.corp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author james.chaves
 */
@Entity
@Table(name = "[CORP].[CADSPC].[SITUACOES_PLANO]")
@XmlRootElement

public class SituacoesPlanoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@OneToOne(mappedBy = "situacoesPlanoBean", cascade = CascadeType.ALL)
	private PlanosBeneficiosBean planosBeneficiosBean;
	
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_SIT_PLANO")
	private Integer idSitPlano;

	@Basic(optional = false)
	@NotNull
	@Column(name = "NM_SIT_SECUNDARIA_PLANO")
	private String nmSitSecundaria;

	@Basic(optional = false)
	@NotNull
	@Column(name = "NM_SIT_PRINCIPAL_PLANO")
	private String nmSitPrincipal;
	
	public SituacoesPlanoBean() {
	}

	public PlanosBeneficiosBean getPlanosBeneficiosBean() {
		return planosBeneficiosBean;
	}

	public Integer getIdSitPlano() {
		return idSitPlano;
	}

	public String getNmSitSecundaria() {
		return nmSitSecundaria;
	}

	public String getNmSitPrincipal() {
		return nmSitPrincipal;
	}

	public void setPlanosBeneficiosBean(PlanosBeneficiosBean planosBeneficiosBean) {
		this.planosBeneficiosBean = planosBeneficiosBean;
	}

	public void setIdSitPlano(Integer idSitPlano) {
		this.idSitPlano = idSitPlano;
	}

	public void setNmSitSecundaria(String nmSitSecundaria) {
		this.nmSitSecundaria = nmSitSecundaria;
	}

	public void setNmSitPrincipal(String nmSitPrincipal) {
		this.nmSitPrincipal = nmSitPrincipal;
	}

	

	

	

}
