/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.previc.dados.model;

import java.io.Serializable;

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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author james.chaves
 */
@Entity
@Table(name = "CADSPC.PLANOS_BENEFICIOS")
@XmlRootElement
@NamedNativeQueries({
	@NamedNativeQuery(name = "PlanosBeneficiosModel.Native.findByCnpb", query = "SELECT * "
			+ "FROM [CADSPC].[PLANOS_BENEFICIOS] JOIN [CADSPC].[SITUACOES_PLANO] ON PLANOS_BENEFICIOS.ID_SIT_PLANO = SITUACOES_PLANO.ID_SIT_PLANO "
			+ "WHERE PLANOS_BENEFICIOS.NU_CNPB = :nuCnpb", resultClass = PlanosBeneficiosModel.class)
	})
@NamedQueries({
	@NamedQuery(name = "PlanosBeneficiosModel.findAll", query = "SELECT p FROM PlanosBeneficiosModel p"),
	@NamedQuery(name = "PlanosBeneficiosModel.findByIdPlano", query = "SELECT p FROM PlanosBeneficiosModel p WHERE p.idPlano = :idPlano"),
	@NamedQuery(name = "PlanosBeneficiosModel.findByCnpb", query = "SELECT p FROM PlanosBeneficiosModel p WHERE p.nuCnpb = :nuCnpb")
	})
public class PlanosBeneficiosModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_SIT_PLANO", insertable = false, updatable = false)
	private SituacoesPlanoModel situacoesPlanoBean;
	
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

	public PlanosBeneficiosModel() {
	}

	public SituacoesPlanoModel getSituacoesPlanoBean() {
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

	public void setSituacoesPlanoBean(SituacoesPlanoModel situacoesPlanoBean) {
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
