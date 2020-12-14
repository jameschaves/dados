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
 * The persistent class for the HISTORICOS_CAPTACAO database table.
 * 
 */
@Entity
@Table(name="SPC.HISTORICOS_CAPTACAO")
@NamedQueries({
	@NamedQuery(name="HistoricosCaptacaoModel.findAll", query="SELECT h FROM HistoricosCaptacaoModel h"),
	@NamedQuery(name="HistoricosCaptacaoModel.findByIdCaptacao", query="SELECT h FROM HistoricosCaptacaoModel h WHERE h.idCaptacao = :idCaptacao"),
	@NamedQuery(name="HistoricosCaptacaoModel.findByNuMatriculaEfpc", query="SELECT h FROM HistoricosCaptacaoModel h WHERE h.nuMatriculaEfpc = :nuMatriculaEfpc")
})
public class HistoricosCaptacaoModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CS_STATUS")
	private String csStatus;

	@Column(name="DT_CAPTACAO")
	private Date dtCaptacao;

	@Column(name="DT_ENVIO")
	private Date dtEnvio;

	@Column(name="ID_ARQUIVO_DAIEA")
	private Integer idArquivoDaiea;
	
	@Id
	@Column(name="ID_CAPTACAO")
	private Integer idCaptacao;

	@Column(name="NU_MATRICULA_EFPC")
	private Integer nuMatriculaEfpc;

	@Column(name="TE_OBS")
	private String teObs;

	public HistoricosCaptacaoModel() {
	}

	public String getCsStatus() {
		return csStatus;
	}

	public Date getDtCaptacao() {
		return dtCaptacao;
	}

	public Date getDtEnvio() {
		return dtEnvio;
	}

	public Integer getIdArquivoDaiea() {
		return idArquivoDaiea;
	}

	public Integer getIdCaptacao() {
		return idCaptacao;
	}

	public Integer getNuMatriculaEfpc() {
		return nuMatriculaEfpc;
	}

	public String getTeObs() {
		return teObs;
	}

	public void setCsStatus(String csStatus) {
		this.csStatus = csStatus;
	}

	public void setDtCaptacao(Date dtCaptacao) {
		this.dtCaptacao = dtCaptacao;
	}

	public void setDtEnvio(Date dtEnvio) {
		this.dtEnvio = dtEnvio;
	}

	public void setIdArquivoDaiea(Integer idArquivoDaiea) {
		this.idArquivoDaiea = idArquivoDaiea;
	}

	public void setIdCaptacao(Integer idCaptacao) {
		this.idCaptacao = idCaptacao;
	}

	public void setNuMatriculaEfpc(Integer nuMatriculaEfpc) {
		this.nuMatriculaEfpc = nuMatriculaEfpc;
	}

	public void setTeObs(String teObs) {
		this.teObs = teObs;
	}

	

}