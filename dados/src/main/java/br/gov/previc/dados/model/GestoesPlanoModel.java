package br.gov.previc.dados.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the GESTOES_PLANO database table.
 * 
 */
@Entity
@Table(name="GESTOES_PLANO")
@NamedQueries({
	@NamedQuery(name="GestoesPlanoModel.findAll", query="SELECT g FROM GestoesPlanoModel g"),
	@NamedQuery(name="GestoesPlanoModel.findByIdGestaoPlano", query="SELECT g FROM GestoesPlanoModel g WHERE g.idGestaoPlano = :idGestaoPlano"),
	@NamedQuery(name="GestoesPlanoModel.findByNuMatriculaEfpc", query="SELECT g FROM GestoesPlanoModel g WHERE g.nuMatriculaEfpc = :nuMatriculaEfpc"),
	@NamedQuery(name="GestoesPlanoModel.findByIdPlano", query="SELECT g FROM GestoesPlanoModel g WHERE g.idPlano = :idPlano")
})
public class GestoesPlanoModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DT_FIM_TRANSF_GESTAO")
	private Date dtFimTransfGestao;

	@Column(name="DT_INI_GESTAO")
	private Date dtIniGestao;

	@Column(name="DT_INI_TRANSFERENCIA")
	private Date dtIniTransferencia;
	
	@Id
	@Column(name="ID_GESTAO_PLANO")
	private Integer idGestaoPlano;

	@Column(name="ID_PLANO")
	private Integer idPlano;

	@Column(name="NU_MATRICULA_EFPC")
	private Integer nuMatriculaEfpc;

	public GestoesPlanoModel() {
	}

	public Date getDtFimTransfGestao() {
		return dtFimTransfGestao;
	}

	public Date getDtIniGestao() {
		return dtIniGestao;
	}

	public Date getDtIniTransferencia() {
		return dtIniTransferencia;
	}

	public Integer getIdGestaoPlano() {
		return idGestaoPlano;
	}

	public Integer getIdPlano() {
		return idPlano;
	}

	public Integer getNuMatriculaEfpc() {
		return nuMatriculaEfpc;
	}

	public void setDtFimTransfGestao(Date dtFimTransfGestao) {
		this.dtFimTransfGestao = dtFimTransfGestao;
	}

	public void setDtIniGestao(Date dtIniGestao) {
		this.dtIniGestao = dtIniGestao;
	}

	public void setDtIniTransferencia(Date dtIniTransferencia) {
		this.dtIniTransferencia = dtIniTransferencia;
	}

	public void setIdGestaoPlano(Integer idGestaoPlano) {
		this.idGestaoPlano = idGestaoPlano;
	}

	public void setIdPlano(Integer idPlano) {
		this.idPlano = idPlano;
	}

	public void setNuMatriculaEfpc(Integer nuMatriculaEfpc) {
		this.nuMatriculaEfpc = nuMatriculaEfpc;
	}

	

}