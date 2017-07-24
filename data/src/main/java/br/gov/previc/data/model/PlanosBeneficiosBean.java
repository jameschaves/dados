/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.previc.data.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
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
@Table(name = "[CORP].[CADSPC].[PLANOS_BENEFICIOS]")
@XmlRootElement
@NamedNativeQueries({
	@NamedNativeQuery(name = "PlanosBeneficiosBean.Native.findByCnpb", query = "SELECT * "
			+ "FROM [CADSPC].[PLANOS_BENEFICIOS] JOIN [CADSPC].[SITUACOES_PLANO] ON PLANOS_BENEFICIOS.ID_SIT_PLANO = SITUACOES_PLANO.ID_SIT_PLANO "
			+ "WHERE PLANOS_BENEFICIOS.NU_CNPB = :nuCnpb", resultClass = PlanosBeneficiosBean.class) 
	})
@NamedQueries({
	@NamedQuery(name = "PlanosBeneficiosBean.findAll", query = "SELECT p FROM PlanosBeneficiosBean p"),
	@NamedQuery(name = "PlanosBeneficiosBean.findByCnpb", query = "SELECT p FROM PlanosBeneficiosBean p WHERE p.nuCnpb = :nuCnpb")
	})
public class PlanosBeneficiosBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_SIT_PLANO", insertable = false, updatable = false)
	private SituacoesPlanoBean situacoesPlanoBean;
	
	@Id
	@Column(name = "ID_PLANO", unique = true, nullable = false)
	private Integer idPlano;

	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_SIT_PLANO")
	private Integer idSitPlano;

	@Basic(optional = false)
	@NotNull
	@Column(name = "NM_PLANO")
	private String nmPlano;

	@Basic(optional = false)
	@NotNull
	@Column(name = "NU_CNPB")
	private Long nuCnpb;

	public PlanosBeneficiosBean() {
	}

	public SituacoesPlanoBean getSituacoesPlanoBean() {
		return situacoesPlanoBean;
	}

	public Integer getIdPlano() {
		return idPlano;
	}

	public Integer getIdSitPlano() {
		return idSitPlano;
	}

	public String getNmPlano() {
		return nmPlano;
	}

	public Long getNuCnpb() {
		return nuCnpb;
	}

	public void setSituacoesPlanoBean(SituacoesPlanoBean situacoesPlanoBean) {
		this.situacoesPlanoBean = situacoesPlanoBean;
	}

	public void setIdPlano(Integer idPlano) {
		this.idPlano = idPlano;
	}

	public void setIdSitPlano(Integer idSitPlano) {
		this.idSitPlano = idSitPlano;
	}

	public void setNmPlano(String nmPlano) {
		this.nmPlano = nmPlano;
	}

	public void setNuCnpb(Long nuCnpb) {
		this.nuCnpb = nuCnpb;
	}

	

	

	

}
