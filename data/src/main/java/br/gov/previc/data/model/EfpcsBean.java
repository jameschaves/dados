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

@Entity
@Table(name = "[CADSPC].EFPCS")
@XmlRootElement
@NamedNativeQueries({
		@NamedNativeQuery(name = "EfpcsBean.Native.findByCnpj", query = "SELECT * "
				+ "FROM [CORP].[CADSPC].[EFPCS] JOIN [CORP].[CADSPC].PESSOAS_JURIDICAS_SPC ON EFPCS.ID_PJ_SPC = PESSOAS_JURIDICAS_SPC.ID_PJ_SPC "
				+ "WHERE PESSOAS_JURIDICAS_SPC.NU_CNPJ = :nuCnpj", resultClass = EfpcsBean.class),
		@NamedNativeQuery(name = "EfpcsBean.Native.findByNumatriculaEfpc", query = "SELECT * "
				+ "FROM [CORP].[CADSPC].[EFPCS] JOIN [CORP].[CADSPC].PESSOAS_JURIDICAS_SPC ON EFPCS.ID_PJ_SPC = PESSOAS_JURIDICAS_SPC.ID_PJ_SPC "
				+ "WHERE EFPCS.NU_MATRICULA_EFPC = :nuMatriculaEfpc", resultClass = EfpcsBean.class) 
		})

@NamedQueries({ @NamedQuery(name = "EfpcsBean.findAll", query = "SELECT e FROM EfpcsBean e"),
		@NamedQuery(name = "EfpcsBean.findByNuMatriculaEfpc", query = "SELECT e FROM EfpcsBean e WHERE e.nuMatriculaEfpc = :nuMatriculaEfpc"),
		@NamedQuery(name = "EfpcsBean.findBySgEfpc", query = "SELECT e FROM EfpcsBean e WHERE e.sgEfpc = :sgEfpc"),
		@NamedQuery(name = "EfpcsBean.findByQtMaxDiretoresExec", query = "SELECT e FROM EfpcsBean e WHERE e.qtMaxDiretoresExec = :qtMaxDiretoresExec"),
		@NamedQuery(name = "EfpcsBean.findByQtMaxConselheiroFiscal", query = "SELECT e FROM EfpcsBean e WHERE e.qtMaxConselheiroFiscal = :qtMaxConselheiroFiscal"),
		@NamedQuery(name = "EfpcsBean.findByQtMaxConselheiroDelib", query = "SELECT e FROM EfpcsBean e WHERE e.qtMaxConselheiroDelib = :qtMaxConselheiroDelib"),
		@NamedQuery(name = "EfpcsBean.findByCsFundamentacaoLegal", query = "SELECT e FROM EfpcsBean e WHERE e.csFundamentacaoLegal = :csFundamentacaoLegal"),
		@NamedQuery(name = "EfpcsBean.findByCsTipoEfpc", query = "SELECT e FROM EfpcsBean e WHERE e.csTipoEfpc = :csTipoEfpc"),
		@NamedQuery(name = "EfpcsBean.findByDtAprovacaoEfpc", query = "SELECT e FROM EfpcsBean e WHERE e.dtAprovacaoEfpc = :dtAprovacaoEfpc"),
		@NamedQuery(name = "EfpcsBean.findByDtInicioFunc", query = "SELECT e FROM EfpcsBean e WHERE e.dtInicioFunc = :dtInicioFunc"),
		@NamedQuery(name = "EfpcsBean.findByDtEncerramentoEfpc", query = "SELECT e FROM EfpcsBean e WHERE e.dtEncerramentoEfpc = :dtEncerramentoEfpc"),
		@NamedQuery(name = "EfpcsBean.findByIdPjSpc", query = "SELECT e FROM EfpcsBean e WHERE e.idPjSpc = :idPjSpc"),
		@NamedQuery(name = "EfpcsBean.findByIdSitEfpc", query = "SELECT e FROM EfpcsBean e WHERE e.idSitEfpc = :idSitEfpc"),
		@NamedQuery(name = "EfpcsBean.findByCsPatrocinioPredominante", query = "SELECT e FROM EfpcsBean e WHERE e.csPatrocinioPredominante = :csPatrocinioPredominante"),
		@NamedQuery(name = "EfpcsBean.findByNuProcessoEfpc", query = "SELECT e FROM EfpcsBean e WHERE e.nuProcessoEfpc = :nuProcessoEfpc"),
		@NamedQuery(name = "EfpcsBean.findByTeExpedienteFunc", query = "SELECT e FROM EfpcsBean e WHERE e.teExpedienteFunc = :teExpedienteFunc"),
		@NamedQuery(name = "EfpcsBean.findByIdImgOutrosDoc", query = "SELECT e FROM EfpcsBean e WHERE e.idImgOutrosDoc = :idImgOutrosDoc") 
		})
public class EfpcsBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PJ_SPC", insertable = false, updatable = false)
	private PessoasJuridicasSpcBean pessoasJuridicasSpcBean;

	@Id
	@Column(name = "NU_MATRICULA_EFPC", unique = true, nullable = false)
	private Integer nuMatriculaEfpc;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 60)
	@Column(name = "SG_EFPC")
	private String sgEfpc;

	@Basic(optional = false)
	@NotNull
	@Column(name = "QT_MAX_DIRETORES_EXEC")
	private short qtMaxDiretoresExec;

	@Basic(optional = false)
	@NotNull
	@Column(name = "QT_MAX_CONSELHEIRO_FISCAL")
	private short qtMaxConselheiroFiscal;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 384)
	@Column(name = "QT_MAX_CONSELHEIRO_DELIB")
	private String qtMaxConselheiroDelib;

	@Column(name = "CS_FUNDAMENTACAO_LEGAL")
	private Short csFundamentacaoLegal;

	@Basic(optional = false)
	@NotNull
	@Column(name = "CS_TIPO_EFPC")
	private short csTipoEfpc;

	@Column(name = "DT_APROVACAO_EFPC")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtAprovacaoEfpc;

	@Column(name = "DT_INICIO_FUNC")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtInicioFunc;

	@Column(name = "DT_ENCERRAMENTO_EFPC")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtEncerramentoEfpc;
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_PJ_SPC")
	private Integer idPjSpc;

	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_SIT_EFPC")
	private short idSitEfpc;

	@Column(name = "CS_PATROCINIO_PREDOMINANTE")
	private Short csPatrocinioPredominante;

	@Column(name = "NU_PROCESSO_EFPC")
	private Long nuProcessoEfpc;

	@Size(max = 20)
	@Column(name = "TE_EXPEDIENTE_FUNC")
	private String teExpedienteFunc;

	@Column(name = "ID_IMG_OUTROS_DOC")
	private Integer idImgOutrosDoc;

	public EfpcsBean() {
	}

	public EfpcsBean(Integer nuMatriculaEfpc) {
		this.nuMatriculaEfpc = nuMatriculaEfpc;
	}

	public EfpcsBean(Integer nuMatriculaEfpc, String sgEfpc, short qtMaxDiretoresExec, short qtMaxConselheiroFiscal,
			String qtMaxConselheiroDelib, short csTipoEfpc, Integer idPjSpc, short idSitEfpc) {
		this.nuMatriculaEfpc = nuMatriculaEfpc;
		this.sgEfpc = sgEfpc;
		this.qtMaxDiretoresExec = qtMaxDiretoresExec;
		this.qtMaxConselheiroFiscal = qtMaxConselheiroFiscal;
		this.qtMaxConselheiroDelib = qtMaxConselheiroDelib;
		this.csTipoEfpc = csTipoEfpc;
		this.idPjSpc = idPjSpc;
		this.idSitEfpc = idSitEfpc;
	}

	public Integer getNuMatriculaEfpc() {
		return nuMatriculaEfpc;
	}

	public void setNuMatriculaEfpc(Integer nuMatriculaEfpc) {
		this.nuMatriculaEfpc = nuMatriculaEfpc;
	}

	public String getSgEfpc() {

		return sgEfpc;
	}

	public void setSgEfpc(String sgEfpc) {
		this.sgEfpc = sgEfpc;
	}

	public short getQtMaxDiretoresExec() {
		return qtMaxDiretoresExec;
	}

	public void setQtMaxDiretoresExec(short qtMaxDiretoresExec) {
		this.qtMaxDiretoresExec = qtMaxDiretoresExec;
	}

	public short getQtMaxConselheiroFiscal() {
		return qtMaxConselheiroFiscal;
	}

	public void setQtMaxConselheiroFiscal(short qtMaxConselheiroFiscal) {
		this.qtMaxConselheiroFiscal = qtMaxConselheiroFiscal;
	}

	public String getQtMaxConselheiroDelib() {
		return qtMaxConselheiroDelib;
	}

	public void setQtMaxConselheiroDelib(String qtMaxConselheiroDelib) {
		this.qtMaxConselheiroDelib = qtMaxConselheiroDelib;
	}

	public Short getCsFundamentacaoLegal() {
		return csFundamentacaoLegal;
	}

	public void setCsFundamentacaoLegal(Short csFundamentacaoLegal) {
		this.csFundamentacaoLegal = csFundamentacaoLegal;
	}

	public short getCsTipoEfpc() {
		return csTipoEfpc;
	}

	public void setCsTipoEfpc(short csTipoEfpc) {
		this.csTipoEfpc = csTipoEfpc;
	}

	public Date getDtAprovacaoEfpc() {
		return dtAprovacaoEfpc;
	}

	public void setDtAprovacaoEfpc(Date dtAprovacaoEfpc) {
		this.dtAprovacaoEfpc = dtAprovacaoEfpc;
	}

	public Date getDtInicioFunc() {
		return dtInicioFunc;
	}

	public void setDtInicioFunc(Date dtInicioFunc) {
		this.dtInicioFunc = dtInicioFunc;
	}

	public Date getDtEncerramentoEfpc() {
		return dtEncerramentoEfpc;
	}

	public void setDtEncerramentoEfpc(Date dtEncerramentoEfpc) {
		this.dtEncerramentoEfpc = dtEncerramentoEfpc;
	}

	public Integer getIdPjSpc() {
		return idPjSpc;
	}

	public void setIdPjSpc(Integer idPjSpc) {
		this.idPjSpc = idPjSpc;
	}

	public short getIdSitEfpc() {
		return idSitEfpc;
	}

	public void setIdSitEfpc(short idSitEfpc) {
		this.idSitEfpc = idSitEfpc;
	}

	public Short getCsPatrocinioPredominante() {
		return csPatrocinioPredominante;
	}

	public void setCsPatrocinioPredominante(Short csPatrocinioPredominante) {
		this.csPatrocinioPredominante = csPatrocinioPredominante;
	}

	public Long getNuProcessoEfpc() {
		return nuProcessoEfpc;
	}

	public void setNuProcessoEfpc(Long nuProcessoEfpc) {
		this.nuProcessoEfpc = nuProcessoEfpc;
	}

	public String getTeExpedienteFunc() {
		return teExpedienteFunc;
	}

	public void setTeExpedienteFunc(String teExpedienteFunc) {
		this.teExpedienteFunc = teExpedienteFunc;
	}

	public Integer getIdImgOutrosDoc() {
		return idImgOutrosDoc;
	}

	public void setIdImgOutrosDoc(Integer idImgOutrosDoc) {
		this.idImgOutrosDoc = idImgOutrosDoc;
	}

	/**
	 * @return the pessoasJuridicasSpcBean
	 */
	public PessoasJuridicasSpcBean getPessoasJuridicasSpcBean() {
		return pessoasJuridicasSpcBean;
	}

	/**
	 * @param pessoasJuridicasSpcBean the pessoasJuridicasSpcBean to set
	 */
	public void setPessoasJuridicasSpcBean(PessoasJuridicasSpcBean pessoasJuridicasSpcBean) {
		this.pessoasJuridicasSpcBean = pessoasJuridicasSpcBean;
	}

	@Override
	public String toString() {
		return "Model.Efpcs[ nuMatriculaEfpc=" + nuMatriculaEfpc + " ]";
	}

}
