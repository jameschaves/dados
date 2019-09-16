package br.gov.previc.dados.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="HABILITACOES_ANEXO")
@NamedQueries({
	@NamedQuery(name="HabilitacoesAnexoModel.findAll", query="SELECT d FROM HabilitacoesAnexoModel d"),
	@NamedQuery(name="HabilitacoesAnexoModel.findByIdHabilitacao", query="SELECT d FROM HabilitacoesAnexoModel d WHERE d.idHabilitacao = :idHabilitacao"),
	@NamedQuery(name="HabilitacoesAnexoModel.findByIdCadastroSpc", query="SELECT d FROM HabilitacoesAnexoModel d WHERE d.idCadastroSpc = :idCadastroSpc")
	})
public class HabilitacoesAnexoModel {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ID_HABILITACAO")
	private Integer idHabilitacao;
	@Column(name="ID_CADASTRO_SPC")
	private Integer idCadastroSpc;
	@Column(name="NU_EFPC")
	private Integer nuEfpc;
	@Column(name="TE_CARGO_HABILITADO")
	private String cargoHabilitado;
	@Column(name="DT_HABILITACAO")
	private Date dtHabilitacao;
	@Column(name="DT_VALIDADE")
	private Date dtValidade;
	@Column(name="TE_CODIGO_HABILITACAO")
	private String codigoHabilitacao;
	@Column(name="TE_OBSERVACAO")
	private String observacao;
	@Column(name="DT_ATUALIZACAO")
	private Date atualizacao;
	@Column(name="CS_VALIDADE_HABILITACAO")
	private Integer validadeHabilitacao;
	@Column(name="ID_TIPO_FUNCAO")
	private String tipoFuncao;
	@Column(name="NU_PROCESSO")
	private String nuProcesso;
	@Column(name="NU_DIRIGENTE")
	private Long nuDirigente;
	@Column(name="DO_ANEXO")
	private byte[] doAnexo;
	public HabilitacoesAnexoModel() {
		
	}
	public Integer getIdHabilitacao() {
		return idHabilitacao;
	}
	public Integer getIdCadastroSpc() {
		return idCadastroSpc;
	}
	public Integer getNuEfpc() {
		return nuEfpc;
	}
	public String getCargoHabilitado() {
		return cargoHabilitado;
	}
	public Date getDtHabilitacao() {
		return dtHabilitacao;
	}
	public Date getDtValidade() {
		return dtValidade;
	}
	public String getCodigoHabilitacao() {
		return codigoHabilitacao;
	}
	public String getObservacao() {
		return observacao;
	}
	public Date getAtualizacao() {
		return atualizacao;
	}
	public Integer getValidadeHabilitacao() {
		return validadeHabilitacao;
	}
	public String getTipoFuncao() {
		return tipoFuncao;
	}
	public String getNuProcesso() {
		return nuProcesso;
	}
	public Long getNuDirigente() {
		return nuDirigente;
	}
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
