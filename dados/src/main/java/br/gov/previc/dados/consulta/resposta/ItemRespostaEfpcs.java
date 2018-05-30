package br.gov.previc.dados.consulta.resposta;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.previc.dados.model.EfpcsModel;


@XmlType(propOrder = {"sgEfpc","idPjSpc","nuMatriculaEfpc","csFundamentacaoLegal","csPatrocinioPredominante","dtAprovacaoEfpc","csTipoEfpc","dtInicioFunc","idSitEfpc","nuProcessoEfpc"})
public class ItemRespostaEfpcs extends ItemResposta{
	
	private String sgEfpc;
	private Integer idPjSpc;
	private Integer nuMatriculaEfpc;
	private Short csFundamentacaoLegal;
	private Short csPatrocinioPredominante;
	private Date dtAprovacaoEfpc;
	private short csTipoEfpc;
	private Date dtInicioFunc;
	private short idSitEfpc;
	private Long nuProcessoEfpc;
	public ItemRespostaEfpcs() {
		super();
	}
	public ItemRespostaEfpcs(EfpcsModel e) {
		this.sgEfpc=e.getSgEfpc();
		this.idPjSpc=e.getIdPjSpc();
		this.nuMatriculaEfpc=e.getNuMatriculaEfpc();
		this.csFundamentacaoLegal = e.getCsFundamentacaoLegal();
		this.csPatrocinioPredominante = e.getCsPatrocinioPredominante();
		this.csTipoEfpc = e.getCsTipoEfpc();
		this.dtAprovacaoEfpc = e.getDtAprovacaoEfpc();
		this.dtInicioFunc = e.getDtInicioFunc();
		this.idSitEfpc = e.getIdSitEfpc();
		this.nuProcessoEfpc = e.getNuProcessoEfpc();
	}
	@XmlElement(name="SgEfpc")
	public String getSgEfpc() {
		return sgEfpc;
	}
	@XmlElement(name="IdPjSpc")
	public Integer getIdPjSpc() {
		return idPjSpc;
	}
	@XmlElement(name="NuMatriculaEfpc")
	public Integer getNuMatriculaEfpc() {
		return nuMatriculaEfpc;
	}
	@XmlElement(name="CsFundamentacaoLegal")
	public Short getCsFundamentacaoLegal() {
		return csFundamentacaoLegal;
	}
	@XmlElement(name="CsPatrocinioPredominante")
	public Short getCsPatrocinioPredominante() {
		return csPatrocinioPredominante;
	}
	@XmlElement(name="DtAprovacaoEfpc")
	public Date getDtAprovacaoEfpc() {
		return dtAprovacaoEfpc;
	}
	@XmlElement(name="CsTipoEfpc")
	public short getCsTipoEfpc() {
		return csTipoEfpc;
	}
	@XmlElement(name="DtInicioFunc")
	public Date getDtInicioFunc() {
		return dtInicioFunc;
	}
	@XmlElement(name="IdSitEfpc")
	public short getIdSitEfpc() {
		return idSitEfpc;
	}
	@XmlElement(name="NuProcessoEfpc")
	public Long getNuProcessoEfpc() {
		return nuProcessoEfpc;
	}
	public void setSgEfpc(String sgEfpc) {
		this.sgEfpc = sgEfpc;
	}
	public void setIdPjSpc(Integer idPjSpc) {
		this.idPjSpc = idPjSpc;
	}
	public void setNuMatriculaEfpc(Integer nuMatriculaEfpc) {
		this.nuMatriculaEfpc = nuMatriculaEfpc;
	}
	public void setCsFundamentacaoLegal(Short csFundamentacaoLegal) {
		this.csFundamentacaoLegal = csFundamentacaoLegal;
	}
	public void setCsPatrocinioPredominante(Short csPatrocinioPredominante) {
		this.csPatrocinioPredominante = csPatrocinioPredominante;
	}
	public void setDtAprovacaoEfpc(Date dtAprovacaoEfpc) {
		this.dtAprovacaoEfpc = dtAprovacaoEfpc;
	}
	public void setCsTipoEfpc(short csTipoEfpc) {
		this.csTipoEfpc = csTipoEfpc;
	}
	public void setDtInicioFunc(Date dtInicioFunc) {
		this.dtInicioFunc = dtInicioFunc;
	}
	public void setIdSitEfpc(short idSitEfpc) {
		this.idSitEfpc = idSitEfpc;
	}
	public void setNuProcessoEfpc(Long nuProcessoEfpc) {
		this.nuProcessoEfpc = nuProcessoEfpc;
	}
	
}
