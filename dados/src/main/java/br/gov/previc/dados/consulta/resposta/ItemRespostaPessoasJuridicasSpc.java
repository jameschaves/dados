package br.gov.previc.dados.consulta.resposta;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.previc.dados.model.PessoasJuridicasSpcModel;

@XmlType(propOrder = {"idPjSpc","nmRazaoSocial","nuCnpj","csNaturezaJuridicaSpc","dtAtualizacaoPj","dtCadastroPj",
		"idEmpresa","inExcluido","inValidadoCnis","inPjNacional","nmBairro","nmFantasia","nuProcessoEfpc","teEmail"})
public class ItemRespostaPessoasJuridicasSpc{
	private Integer idPjSpc;
	private String nmRazaoSocial;
	private BigDecimal nuCnpj;
	private BigDecimal csNaturezaJuridicaSpc;
	private String dtAtualizacaoPj;
	private String dtCadastroPj;
	private BigDecimal idEmpresa;
	private String inExcluido;
	private String inValidadoCnis;
	private String inPjNacional;
	private String nmBairro;
	private String nmFantasia;
	private BigDecimal nuProcessoEfpc;
	private String teEmail;
	public ItemRespostaPessoasJuridicasSpc() {
		super();
	}
	public ItemRespostaPessoasJuridicasSpc(PessoasJuridicasSpcModel p) {
		this.idPjSpc=p.getIdPjSpc();
		this.nmRazaoSocial=p.getNmRazaoSocial();
		this.nuCnpj=p.getNuCnpj();
		this.csNaturezaJuridicaSpc = p.getCsNaturezaJuridicaSpc();
		this.dtAtualizacaoPj = p.getDtAtualizacaoPj();
		this.dtCadastroPj = p.getDtCadastroPj();
		this.idEmpresa = p.getIdEmpresa();
		this.inExcluido = p.getInExcluido();
		this.inPjNacional = p.getInPjNacional();
		this.inValidadoCnis = p.getInValidadoCnis();
		this.nmBairro = p.getNmBairro();
		this.nmFantasia = p.getNmFantasia();
		this.nuProcessoEfpc = p.getNuProcessoEfpc();
		this.teEmail = p.getTeEmail();
	}
	@XmlElement(name="IdPjSpc")
	public Integer getIdPjSpc() {
		return idPjSpc;
	}
	@XmlElement(name="NmRazaoSocial")
	public String getNmRazaoSocial() {
		return nmRazaoSocial;
	}
	@XmlElement(name="NuCnpj")
	public BigDecimal getNuCnpj() {
		return nuCnpj;
	}
	@XmlElement(name="CsNaturezaJuridicaSpc")
	public BigDecimal getCsNaturezaJuridicaSpc() {
		return csNaturezaJuridicaSpc;
	}
	@XmlElement(name="DtAtualizacaoPj")
	public String getDtAtualizacaoPj() {
		return dtAtualizacaoPj;
	}
	@XmlElement(name="DtCadastroPj")
	public String getDtCadastroPj() {
		return dtCadastroPj;
	}
	@XmlElement(name="IdEmpresa")
	public BigDecimal getIdEmpresa() {
		return idEmpresa;
	}
	@XmlElement(name="InExcluido")
	public String getInExcluido() {
		return inExcluido;
	}
	@XmlElement(name="InValidadoCnis")
	public String getInValidadoCnis() {
		return inValidadoCnis;
	}
	@XmlElement(name="InPjNacional")
	public String getInPjNacional() {
		return inPjNacional;
	}
	@XmlElement(name="NmBairro")
	public String getNmBairro() {
		return nmBairro;
	}
	@XmlElement(name="NmFantasia")
	public String getNmFantasia() {
		return nmFantasia;
	}
	@XmlElement(name="NuProcessoEfpc")
	public BigDecimal getNuProcessoEfpc() {
		return nuProcessoEfpc;
	}
	@XmlElement(name="TeEmail")
	public String getTeEmail() {
		return teEmail;
	}
	public void setIdPjSpc(Integer idPjSpc) {
		this.idPjSpc = idPjSpc;
	}
	public void setNmRazaoSocial(String nmRazaoSocial) {
		this.nmRazaoSocial = nmRazaoSocial;
	}
	public void setNuCnpj(BigDecimal nuCnpj) {
		this.nuCnpj = nuCnpj;
	}
	public void setCsNaturezaJuridicaSpc(BigDecimal csNaturezaJuridicaSpc) {
		this.csNaturezaJuridicaSpc = csNaturezaJuridicaSpc;
	}
	public void setDtAtualizacaoPj(String dtAtualizacaoPj) {
		this.dtAtualizacaoPj = dtAtualizacaoPj;
	}
	public void setDtCadastroPj(String dtCadastroPj) {
		this.dtCadastroPj = dtCadastroPj;
	}
	public void setIdEmpresa(BigDecimal idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public void setInExcluido(String inExcluido) {
		this.inExcluido = inExcluido;
	}
	public void setInValidadoCnis(String inValidadoCnis) {
		this.inValidadoCnis = inValidadoCnis;
	}
	public void setInPjNacional(String inPjNacional) {
		this.inPjNacional = inPjNacional;
	}
	public void setNmBairro(String nmBairro) {
		this.nmBairro = nmBairro;
	}
	public void setNmFantasia(String nmFantasia) {
		this.nmFantasia = nmFantasia;
	}
	public void setNuProcessoEfpc(BigDecimal nuProcessoEfpc) {
		this.nuProcessoEfpc = nuProcessoEfpc;
	}
	public void setTeEmail(String teEmail) {
		this.teEmail = teEmail;
	}
	
}
