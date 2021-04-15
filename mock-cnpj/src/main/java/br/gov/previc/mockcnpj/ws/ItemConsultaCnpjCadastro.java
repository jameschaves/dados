package br.gov.previc.mockcnpj.ws;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CnpjCadastro")
public class ItemConsultaCnpjCadastro {
	private Integer idCnpj;
	private String cnpj;
	private Integer identificador;
	private String razaoSocial;
	private String nomeFantasia;
	private String situacaoCadastral;
	private String dtSituacaoCadastral;
	private Integer motivoSituacaoCadastral;
	private String nmCidadeExterior;
	private String coPais;
	private String nmPais;
	private Integer codNaturezaJuridica;
	private String dtInicioAtividade;
	private Integer cnaeFiscal;
	private String desTipoLogradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String uf;
	private Integer codMunicipio;
	private String municipio;
	private String dddTelefone1;
	private String ddd1;
	private String telefone1;
	private String dddTelefone2;
	private String ddd2;
	private String telefone2;
	private String dddFax;
	private String nuDddFax;
	private String nuFax;
	private String correioEletronico;
	private Integer qualificacaoResponsavel;
	private Float cpSocialEmpresa;
	private String porteEmpresa;
	private String opcaoSimples;
	private String dtOpcaoSimples;
	private String dtExclusaoSimples;
	private String opcaoMei;
	private String situacaoEspecial;
	private String dtSituacaoEspecial;
	private Integer idCap;
	public ItemConsultaCnpjCadastro() {
	}
	@XmlElement(name="IdCnpj")
	public Integer getIdCnpj() {
		return idCnpj;
	}
	@XmlElement(name="Cnpj")
	public String getCnpj() {
		return cnpj;
	}
	@XmlElement(name="Identificador")
	public Integer getIdentificador() {
		return identificador;
	}
	@XmlElement(name="RazaoSocial")
	public String getRazaoSocial() {
		return razaoSocial;
	}
	@XmlElement(name="NomeFantasia")
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	@XmlElement(name="SituacaoCadastral")
	public String getSituacaoCadastral() {
		return situacaoCadastral;
	}
	@XmlElement(name="DtSituacaoCadastral")
	public String getDtSituacaoCadastral() {
		return dtSituacaoCadastral;
	}
	@XmlElement(name="MotivoSituacaoCadastral")
	public Integer getMotivoSituacaoCadastral() {
		return motivoSituacaoCadastral;
	}
	@XmlElement(name="NmCidadeExterior")
	public String getNmCidadeExterior() {
		return nmCidadeExterior;
	}
	@XmlElement(name="CoPais")
	public String getCoPais() {
		return coPais;
	}
	@XmlElement(name="NmPais")
	public String getNmPais() {
		return nmPais;
	}
	@XmlElement(name="CodNaturezaJuridica")
	public Integer getCodNaturezaJuridica() {
		return codNaturezaJuridica;
	}
	@XmlElement(name="DtInicioAtividade")
	public String getDtInicioAtividade() {
		return dtInicioAtividade;
	}
	@XmlElement(name="CnaeFiscal")
	public Integer getCnaeFiscal() {
		return cnaeFiscal;
	}
	@XmlElement(name="DesTipoLogradouro")
	public String getDesTipoLogradouro() {
		return desTipoLogradouro;
	}
	@XmlElement(name="Numero")
	public String getNumero() {
		return numero;
	}
	@XmlElement(name="Complemento")
	public String getComplemento() {
		return complemento;
	}
	@XmlElement(name="Bairro")
	public String getBairro() {
		return bairro;
	}
	@XmlElement(name="Cep")
	public String getCep() {
		return cep;
	}
	@XmlElement(name="Uf")
	public String getUf() {
		return uf;
	}
	@XmlElement(name="CodMunicipio")
	public Integer getCodMunicipio() {
		return codMunicipio;
	}
	@XmlElement(name="Municipio")
	public String getMunicipio() {
		return municipio;
	}
	@XmlElement(name="DddTelefone1")
	public String getDddTelefone1() {
		return dddTelefone1;
	}
	@XmlElement(name="Ddd1")
	public String getDdd1() {
		return ddd1;
	}
	@XmlElement(name="Telefone1")
	public String getTelefone1() {
		return telefone1;
	}
	@XmlElement(name="DddTelefone2")
	public String getDddTelefone2() {
		return dddTelefone2;
	}
	@XmlElement(name="Ddd2")
	public String getDdd2() {
		return ddd2;
	}
	@XmlElement(name="Telefone2")
	public String getTelefone2() {
		return telefone2;
	}
	@XmlElement(name="DddFax")
	public String getDddFax() {
		return dddFax;
	}
	@XmlElement(name="NuDddFax")
	public String getNuDddFax() {
		return nuDddFax;
	}
	@XmlElement(name="NuFax")
	public String getNuFax() {
		return nuFax;
	}
	@XmlElement(name="CorreioEletronico")
	public String getCorreioEletronico() {
		return correioEletronico;
	}
	@XmlElement(name="QualificacaoResponsavel")
	public Integer getQualificacaoResponsavel() {
		return qualificacaoResponsavel;
	}
	@XmlElement(name="CpSocialEmpresa")
	public Float getCpSocialEmpresa() {
		return cpSocialEmpresa;
	}
	@XmlElement(name="PorteEmpresa")
	public String getPorteEmpresa() {
		return porteEmpresa;
	}
	@XmlElement(name="OpcaoSimples")
	public String getOpcaoSimples() {
		return opcaoSimples;
	}
	@XmlElement(name="DtOpcaoSimples")
	public String getDtOpcaoSimples() {
		return dtOpcaoSimples;
	}
	@XmlElement(name="DtExclusaoSimples")
	public String getDtExclusaoSimples() {
		return dtExclusaoSimples;
	}
	@XmlElement(name="OpcaoMei")
	public String getOpcaoMei() {
		return opcaoMei;
	}
	@XmlElement(name="SituacaoEspecial")
	public String getSituacaoEspecial() {
		return situacaoEspecial;
	}
	@XmlElement(name="DtSituacaoEspecial")
	public String getDtSituacaoEspecial() {
		return dtSituacaoEspecial;
	}
	@XmlElement(name="IdCap")
	public Integer getIdCap() {
		return idCap;
	}
	public void setIdCnpj(Integer idCnpj) {
		this.idCnpj = idCnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public void setSituacaoCadastral(String situacaoCadastral) {
		this.situacaoCadastral = situacaoCadastral;
	}
	public void setDtSituacaoCadastral(String dtSituacaoCadastral) {
		this.dtSituacaoCadastral = dtSituacaoCadastral;
	}
	public void setMotivoSituacaoCadastral(Integer motivoSituacaoCadastral) {
		this.motivoSituacaoCadastral = motivoSituacaoCadastral;
	}
	public void setNmCidadeExterior(String nmCidadeExterior) {
		this.nmCidadeExterior = nmCidadeExterior;
	}
	public void setCoPais(String coPais) {
		this.coPais = coPais;
	}
	public void setNmPais(String nmPais) {
		this.nmPais = nmPais;
	}
	public void setCodNaturezaJuridica(Integer codNaturezaJuridica) {
		this.codNaturezaJuridica = codNaturezaJuridica;
	}
	public void setDtInicioAtividade(String dtInicioAtividade) {
		this.dtInicioAtividade = dtInicioAtividade;
	}
	public void setCnaeFiscal(Integer cnaeFiscal) {
		this.cnaeFiscal = cnaeFiscal;
	}
	public void setDesTipoLogradouro(String desTipoLogradouro) {
		this.desTipoLogradouro = desTipoLogradouro;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public void setCodMunicipio(Integer codMunicipio) {
		this.codMunicipio = codMunicipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public void setDddTelefone1(String dddTelefone1) {
		this.dddTelefone1 = dddTelefone1;
	}
	public void setDdd1(String ddd1) {
		this.ddd1 = ddd1;
	}
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	public void setDddTelefone2(String dddTelefone2) {
		this.dddTelefone2 = dddTelefone2;
	}
	public void setDdd2(String ddd2) {
		this.ddd2 = ddd2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	public void setDddFax(String dddFax) {
		this.dddFax = dddFax;
	}
	public void setNuDddFax(String nuDddFax) {
		this.nuDddFax = nuDddFax;
	}
	public void setNuFax(String nuFax) {
		this.nuFax = nuFax;
	}
	public void setCorreioEletronico(String correioEletronico) {
		this.correioEletronico = correioEletronico;
	}
	public void setQualificacaoResponsavel(Integer qualificacaoResponsavel) {
		this.qualificacaoResponsavel = qualificacaoResponsavel;
	}
	public void setCpSocialEmpresa(Float cpSocialEmpresa) {
		this.cpSocialEmpresa = cpSocialEmpresa;
	}
	public void setPorteEmpresa(String porteEmpresa) {
		this.porteEmpresa = porteEmpresa;
	}
	public void setOpcaoSimples(String opcaoSimples) {
		this.opcaoSimples = opcaoSimples;
	}
	public void setDtOpcaoSimples(String dtOpcaoSimples) {
		this.dtOpcaoSimples = dtOpcaoSimples;
	}
	public void setDtExclusaoSimples(String dtExclusaoSimples) {
		this.dtExclusaoSimples = dtExclusaoSimples;
	}
	public void setOpcaoMei(String opcaoMei) {
		this.opcaoMei = opcaoMei;
	}
	public void setSituacaoEspecial(String situacaoEspecial) {
		this.situacaoEspecial = situacaoEspecial;
	}
	public void setDtSituacaoEspecial(String dtSituacaoEspecial) {
		this.dtSituacaoEspecial = dtSituacaoEspecial;
	}
	public void setIdCap(Integer idCap) {
		this.idCap = idCap;
	}
	public ItemConsultaCnpjCadastro(Integer idCnpj, String cnpj, Integer identificador, String razaoSocial,
			String nomeFantasia, String situacaoCadastral, String dtSituacaoCadastral, Integer motivoSituacaoCadastral,
			String nmCidadeExterior, String coPais, String nmPais, Integer codNaturezaJuridica,
			String dtInicioAtividade, Integer cnaeFiscal, String desTipoLogradouro, String numero, String complemento,
			String bairro, String cep, String uf, Integer codMunicipio, String municipio, String dddTelefone1,
			String ddd1, String telefone1, String dddTelefone2, String ddd2, String telefone2, String dddFax,
			String nuDddFax, String nuFax, String correioEletronico, Integer qualificacaoResponsavel,
			Float cpSocialEmpresa, String porteEmpresa, String opcaoSimples, String dtOpcaoSimples,
			String dtExclusaoSimples, String opcaoMei, String situacaoEspecial, String dtSituacaoEspecial,
			Integer idCap) {
		super();
		this.idCnpj = idCnpj;
		this.cnpj = cnpj;
		this.identificador = identificador;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.situacaoCadastral = situacaoCadastral;
		this.dtSituacaoCadastral = dtSituacaoCadastral;
		this.motivoSituacaoCadastral = motivoSituacaoCadastral;
		this.nmCidadeExterior = nmCidadeExterior;
		this.coPais = coPais;
		this.nmPais = nmPais;
		this.codNaturezaJuridica = codNaturezaJuridica;
		this.dtInicioAtividade = dtInicioAtividade;
		this.cnaeFiscal = cnaeFiscal;
		this.desTipoLogradouro = desTipoLogradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.uf = uf;
		this.codMunicipio = codMunicipio;
		this.municipio = municipio;
		this.dddTelefone1 = dddTelefone1;
		this.ddd1 = ddd1;
		this.telefone1 = telefone1;
		this.dddTelefone2 = dddTelefone2;
		this.ddd2 = ddd2;
		this.telefone2 = telefone2;
		this.dddFax = dddFax;
		this.nuDddFax = nuDddFax;
		this.nuFax = nuFax;
		this.correioEletronico = correioEletronico;
		this.qualificacaoResponsavel = qualificacaoResponsavel;
		this.cpSocialEmpresa = cpSocialEmpresa;
		this.porteEmpresa = porteEmpresa;
		this.opcaoSimples = opcaoSimples;
		this.dtOpcaoSimples = dtOpcaoSimples;
		this.dtExclusaoSimples = dtExclusaoSimples;
		this.opcaoMei = opcaoMei;
		this.situacaoEspecial = situacaoEspecial;
		this.dtSituacaoEspecial = dtSituacaoEspecial;
		this.idCap = idCap;
	}
	
	

}
