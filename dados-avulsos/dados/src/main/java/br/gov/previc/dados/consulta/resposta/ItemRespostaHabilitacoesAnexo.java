package br.gov.previc.dados.consulta.resposta;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.previc.dados.model.HabilitacoesAnexoModel;

@XmlType(propOrder = {"idHabilitacao","idCadastroSpc","nuEfpc","cargoHabilitado","dtHabilitacao","dtValidade","codigoHabilitacao",
		"observacao","atualizacao","validadeHabilitacao","tipoFuncao","nuProcesso","nuDirigente","doAnexo"})
public class ItemRespostaHabilitacoesAnexo extends ItemResposta{

	
	private Integer idHabilitacao;
	private Integer idCadastroSpc;
	private Integer nuEfpc;
	private String cargoHabilitado;
	private Date dtHabilitacao;
	private Date dtValidade;
	private String codigoHabilitacao;
	private String observacao;
	private Date atualizacao;
	private Integer validadeHabilitacao;
	private String tipoFuncao;
	private String nuProcesso;
	private Long nuDirigente;
	private byte[] doAnexo;
	

	public ItemRespostaHabilitacoesAnexo() {
		super();
	}
	public ItemRespostaHabilitacoesAnexo(HabilitacoesAnexoModel m) {
		this.idHabilitacao = m.getIdHabilitacao();
		this.idCadastroSpc=m.getIdCadastroSpc();
		this.nuEfpc=m.getNuEfpc();
		this.cargoHabilitado=m.getCargoHabilitado();
		this.dtHabilitacao=m.getDtHabilitacao();
		this.dtValidade=m.getDtValidade();
		this.codigoHabilitacao=m.getCodigoHabilitacao();
		this.observacao=m.getObservacao();
		this.atualizacao=m.getAtualizacao();
		this.validadeHabilitacao=m.getValidadeHabilitacao();
		this.tipoFuncao=m.getTipoFuncao();
		this.nuProcesso=m.getNuProcesso();
		this.nuDirigente=m.getNuDirigente();
		this.doAnexo=m.getDoAnexo();
	}
	@XmlElement(name="IdHabilitacao")
	public Integer getIdHabilitacao() {
		return idHabilitacao;
	}
	@XmlElement(name="IdCadastroSpc")
	public Integer getIdCadastroSpc() {
		return idCadastroSpc;
	}
	@XmlElement(name="NuEfpc")
	public Integer getNuEfpc() {
		return nuEfpc;
	}
	@XmlElement(name="CargoHabilitado")
	public String getCargoHabilitado() {
		return cargoHabilitado;
	}
	@XmlElement(name="DtHabilitacao")
	public Date getDtHabilitacao() {
		return dtHabilitacao;
	}
	@XmlElement(name="DtValidade")
	public Date getDtValidade() {
		return dtValidade;
	}
	@XmlElement(name="CodigoHabilitacao")
	public String getCodigoHabilitacao() {
		return codigoHabilitacao;
	}
	@XmlElement(name="Observacao")
	public String getObservacao() {
		return observacao;
	}
	@XmlElement(name="Atualizacao")
	public Date getAtualizacao() {
		return atualizacao;
	}
	@XmlElement(name="ValidadeHabilitacao")
	public Integer getValidadeHabilitacao() {
		return validadeHabilitacao;
	}
	@XmlElement(name="TipoFuncao")
	public String getTipoFuncao() {
		return tipoFuncao;
	}
	@XmlElement(name="NuProcesso")
	public String getNuProcesso() {
		return nuProcesso;
	}
	@XmlElement(name="NuDirigente")
	public Long getNuDirigente() {
		return nuDirigente;
	}
	@XmlElement(name="DoAnexo")
	public byte[] getDoAnexo() {
		return doAnexo;
	}
	public void setIdHabilitacao(Integer idHabilitacao) {
		this.idHabilitacao = idHabilitacao;
	}
	public void setIdCadastroSpc(Integer idCadastroSpc) {
		this.idCadastroSpc = idCadastroSpc;
	}
	public void setNuEfpc(Integer nuEfpc) {
		this.nuEfpc = nuEfpc;
	}
	public void setCargoHabilitado(String cargoHabilitado) {
		this.cargoHabilitado = cargoHabilitado;
	}
	public void setDtHabilitacao(Date dtHabilitacao) {
		this.dtHabilitacao = dtHabilitacao;
	}
	public void setDtValidade(Date dtValidade) {
		this.dtValidade = dtValidade;
	}
	public void setCodigoHabilitacao(String codigoHabilitacao) {
		this.codigoHabilitacao = codigoHabilitacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public void setAtualizacao(Date atualizacao) {
		this.atualizacao = atualizacao;
	}
	public void setValidadeHabilitacao(Integer validadeHabilitacao) {
		this.validadeHabilitacao = validadeHabilitacao;
	}
	public void setTipoFuncao(String tipoFuncao) {
		this.tipoFuncao = tipoFuncao;
	}
	public void setNuProcesso(String nuProcesso) {
		this.nuProcesso = nuProcesso;
	}
	public void setNuDirigente(Long nuDirigente) {
		this.nuDirigente = nuDirigente;
	}
	public void setDoAnexo(byte[] doAnexo) {
		this.doAnexo = doAnexo;
	}
	

}
