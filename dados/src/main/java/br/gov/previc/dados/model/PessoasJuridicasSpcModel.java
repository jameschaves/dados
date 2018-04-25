package br.gov.previc.dados.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CADSPC.PESSOAS_JURIDICAS_SPC")
@NamedNativeQueries({

		@NamedNativeQuery(name = "PessoasJuridicasSpcModel.Native.findAll", query = "SELECT * FROM [CADSPC].[PESSOAS_JURIDICAS_SPC]", resultClass = PessoasJuridicasSpcModel.class),
		@NamedNativeQuery(name = "PessoasJuridicasSpcModel.Native.findByIdPjSpc", query = "SELECT * FROM [CADSPC].[PESSOAS_JURIDICAS_SPC] AS P WHERE P.ID_PJ_SPC = :idPjSpc", resultClass = PessoasJuridicasSpcModel.class),
		@NamedNativeQuery(name = "PessoasJuridicasSpcModel.Native.findByCnpj", query = "SELECT * FROM [CADSPC].[PESSOAS_JURIDICAS_SPC] AS P WHERE P.NU_CNPJ = :nuCnpj", resultClass = PessoasJuridicasSpcModel.class)

})
public class PessoasJuridicasSpcModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@OneToOne(mappedBy = "pessoasJuridicasSpcBean", cascade = CascadeType.ALL)
	private EfpcsModel efpcsBean;
	
	@Id
	@Column(name = "ID_PJ_SPC", unique = true, nullable = false)
	private Integer idPjSpc;

	@Column(name = "CS_NATUREZA_JURIDICA_SPC")
	private BigDecimal csNaturezaJuridicaSpc;

	@Column(name = "DT_ATUALIZACAO_PJ")
	private String dtAtualizacaoPj;

	@Column(name = "DT_CADASTRO_PJ")
	private String dtCadastroPj;

	@Column(name = "ID_EMPRESA")
	private BigDecimal idEmpresa;

	@Column(name = "IN_EXCLUIDO")
	private String inExcluido;

	@Column(name = "IN_PJ_NACIONAL")
	private String inPjNacional;

	@Column(name = "IN_VALIDADO_CNIS")
	private String inValidadoCnis;

	@Column(name = "NM_BAIRRO")
	private String nmBairro;

	@Column(name = "NM_FANTASIA")
	private String nmFantasia;

	@Column(name = "NM_MUNICIPIO")
	private String nmMunicipio;

	@Column(name = "NM_PAIS")
	private String nmPais;

	@Column(name = "NM_RAZAO_SOCIAL")
	private String nmRazaoSocial;

	@Column(name = "NU_CEP")
	private BigDecimal nuCep;

	@Column(name = "NU_CNPJ")
	private BigDecimal nuCnpj;

	@Column(name = "NU_FAX")
	private String nuFax;

	@Column(name = "NU_FONE")
	private String nuFone;

	@Column(name = "NU_NUMERO_END")
	private String nuNumeroEnd;

	@Column(name = "NU_PROCESSO_EFPC")
	private BigDecimal nuProcessoEfpc;

	@Column(name = "NU_REGISTRO_FISCAL")
	private String nuRegistroFiscal;

	@Column(name = "NU_USUARIO_ATUALIZACAO")
	private String nuUsuarioAtualizacao;

	@Column(name = "SG_UF")
	private String sgUf;

	@Column(name = "TE_COMPLEMENTO")
	private String teComplemento;

	@Column(name = "TE_EMAIL")
	private String teEmail;

	@Column(name = "TE_ENDERECO")
	private String teEndereco;

	@Column(name = "TE_OBSERVACAO")
	private String teObservacao;

	@Column(name = "TE_SITE")
	private String teSite;

	public PessoasJuridicasSpcModel() {
	}

	public BigDecimal getCsNaturezaJuridicaSpc() {
		return this.csNaturezaJuridicaSpc;
	}

	public void setCsNaturezaJuridicaSpc(BigDecimal csNaturezaJuridicaSpc) {
		this.csNaturezaJuridicaSpc = csNaturezaJuridicaSpc;
	}

	public String getDtAtualizacaoPj() {
		return this.dtAtualizacaoPj;
	}

	public void setDtAtualizacaoPj(String dtAtualizacaoPj) {
		this.dtAtualizacaoPj = dtAtualizacaoPj;
	}

	public String getDtCadastroPj() {
		return this.dtCadastroPj;
	}

	public void setDtCadastroPj(String dtCadastroPj) {
		this.dtCadastroPj = dtCadastroPj;
	}

	public BigDecimal getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(BigDecimal idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public Integer getIdPjSpc() {
		return this.idPjSpc;
	}

	public void setIdPjSpc(Integer idPjSpc) {
		this.idPjSpc = idPjSpc;
	}

	public String getInExcluido() {
		return this.inExcluido;
	}

	public void setInExcluido(String inExcluido) {
		this.inExcluido = inExcluido;
	}

	public String getInPjNacional() {
		return this.inPjNacional;
	}

	public void setInPjNacional(String inPjNacional) {
		this.inPjNacional = inPjNacional;
	}

	public String getInValidadoCnis() {
		return this.inValidadoCnis;
	}

	public void setInValidadoCnis(String inValidadoCnis) {
		this.inValidadoCnis = inValidadoCnis;
	}

	public String getNmBairro() {
		return this.nmBairro;
	}

	public void setNmBairro(String nmBairro) {
		this.nmBairro = nmBairro;
	}

	public String getNmFantasia() {
		return this.nmFantasia;
	}

	public void setNmFantasia(String nmFantasia) {
		this.nmFantasia = nmFantasia;
	}

	public String getNmMunicipio() {
		return this.nmMunicipio;
	}

	public void setNmMunicipio(String nmMunicipio) {
		this.nmMunicipio = nmMunicipio;
	}

	public String getNmPais() {
		return this.nmPais;
	}

	public void setNmPais(String nmPais) {
		this.nmPais = nmPais;
	}

	public String getNmRazaoSocial() {
		return this.nmRazaoSocial;
	}

	public void setNmRazaoSocial(String nmRazaoSocial) {
		this.nmRazaoSocial = nmRazaoSocial;
	}

	public BigDecimal getNuCep() {
		return this.nuCep;
	}

	public void setNuCep(BigDecimal nuCep) {
		this.nuCep = nuCep;
	}

	public BigDecimal getNuCnpj() {
		return this.nuCnpj;
	}

	public void setNuCnpj(BigDecimal nuCnpj) {
		this.nuCnpj = nuCnpj;
	}

	public String getNuFax() {
		return this.nuFax;
	}

	public void setNuFax(String nuFax) {
		this.nuFax = nuFax;
	}

	public String getNuFone() {
		return this.nuFone;
	}

	public void setNuFone(String nuFone) {
		this.nuFone = nuFone;
	}

	public String getNuNumeroEnd() {
		return this.nuNumeroEnd;
	}

	public void setNuNumeroEnd(String nuNumeroEnd) {
		this.nuNumeroEnd = nuNumeroEnd;
	}

	public BigDecimal getNuProcessoEfpc() {
		return this.nuProcessoEfpc;
	}

	public void setNuProcessoEfpc(BigDecimal nuProcessoEfpc) {
		this.nuProcessoEfpc = nuProcessoEfpc;
	}

	public String getNuRegistroFiscal() {
		return this.nuRegistroFiscal;
	}

	public void setNuRegistroFiscal(String nuRegistroFiscal) {
		this.nuRegistroFiscal = nuRegistroFiscal;
	}

	public String getNuUsuarioAtualizacao() {
		return this.nuUsuarioAtualizacao;
	}

	public void setNuUsuarioAtualizacao(String nuUsuarioAtualizacao) {
		this.nuUsuarioAtualizacao = nuUsuarioAtualizacao;
	}

	public String getSgUf() {
		return this.sgUf;
	}

	public void setSgUf(String sgUf) {
		this.sgUf = sgUf;
	}

	public String getTeComplemento() {
		return this.teComplemento;
	}

	public void setTeComplemento(String teComplemento) {
		this.teComplemento = teComplemento;
	}

	public String getTeEmail() {
		return this.teEmail;
	}

	public void setTeEmail(String teEmail) {
		this.teEmail = teEmail;
	}

	public String getTeEndereco() {
		return this.teEndereco;
	}

	public void setTeEndereco(String teEndereco) {
		this.teEndereco = teEndereco;
	}

	public String getTeObservacao() {
		return this.teObservacao;
	}

	public void setTeObservacao(String teObservacao) {
		this.teObservacao = teObservacao;
	}

	public String getTeSite() {
		return this.teSite;
	}

	public void setTeSite(String teSite) {
		this.teSite = teSite;
	}
	
	public EfpcsModel getEfpcsBean() {
		return efpcsBean;
	}

	public void setEfpcsBean(EfpcsModel efpcsBean) {
		this.efpcsBean = efpcsBean;
	}
	
	
}