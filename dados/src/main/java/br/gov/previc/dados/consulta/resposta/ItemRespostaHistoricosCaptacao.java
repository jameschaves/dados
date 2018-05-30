package br.gov.previc.dados.consulta.resposta;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.previc.dados.model.HistoricosCaptacaoModel;

@XmlType(propOrder = {"csStatus","dtCaptacao","dtEnvio","idArquivoDaiea","idCaptacao","teObs","nuMatriculaEfpc"})
public class ItemRespostaHistoricosCaptacao {

	private String csStatus;
	private Date dtCaptacao;
	private Date dtEnvio;
	private Integer idArquivoDaiea;
	private Integer idCaptacao;
	private String teObs;
	private Integer nuMatriculaEfpc;

	public ItemRespostaHistoricosCaptacao(HistoricosCaptacaoModel r) {
		this.csStatus = r.getCsStatus();
		this.dtCaptacao = r.getDtCaptacao();
		this.dtEnvio = r.getDtEnvio();
		this.idArquivoDaiea = r.getIdArquivoDaiea();
		this.idCaptacao = r.getIdCaptacao();
		this.nuMatriculaEfpc = r.getNuMatriculaEfpc();
		this.teObs = r.getTeObs();
	}
	@XmlElement(name="CsStatus")
	public String getCsStatus() {
		return csStatus;
	}
	@XmlElement(name="DtCaptacao")
	public Date getDtCaptacao() {
		return dtCaptacao;
	}
	@XmlElement(name="DtEnvio")
	public Date getDtEnvio() {
		return dtEnvio;
	}
	@XmlElement(name="IdArquivoDaiea")
	public Integer getIdArquivoDaiea() {
		return idArquivoDaiea;
	}
	@XmlElement(name="IdCaptacao")
	public Integer getIdCaptacao() {
		return idCaptacao;
	}
	@XmlElement(name="TeObs")
	public String getTeObs() {
		return teObs;
	}
	@XmlElement(name="NuMatriculaEfpc")
	public Integer getNuMatriculaEfpc() {
		return nuMatriculaEfpc;
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

	public void setTeObs(String teObs) {
		this.teObs = teObs;
	}

	public void setNuMatriculaEfpc(Integer nuMatriculaEfpc) {
		this.nuMatriculaEfpc = nuMatriculaEfpc;
	}

}
