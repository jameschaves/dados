package br.gov.previc.dados.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the CADASTROS_PESSOAS_FISICAS_SPC database table.
 * 
 */
@Entity
@Table(name="CADASTROS_PESSOAS_FISICAS_SPC")
@NamedQueries({
	@NamedQuery(name="CadastrosPessoasFisicasSpcModel.findAll", query="SELECT c FROM CadastrosPessoasFisicasSpcModel c"),
	@NamedQuery(name="CadastrosPessoasFisicasSpcModel.findByIdPessoaFisica", query="SELECT c FROM CadastrosPessoasFisicasSpcModel c WHERE c.idPessoaFisica = :idPessoaFisica"),
	@NamedQuery(name="CadastrosPessoasFisicasSpcModel.findByNuCpf", query="SELECT c FROM CadastrosPessoasFisicasSpcModel c WHERE c.nuCpf = :nuCpf")
	})
public class CadastrosPessoasFisicasSpcModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CS_ESTADO_CIVIL")
	private Integer csEstadoCivil;

	@Column(name="CS_GRAU_INSTRUCAO")
	private Integer csGrauInstrucao;

	@Column(name="CS_NACIONALIDADE")
	private Integer csNacionalidade;

	@Column(name="CS_ORG_EMISSOR_IDENT")
	private Integer csOrgEmissorIdent;

	@Column(name="CS_ORG_EMISSOR_IDENT_PROF")
	private Integer csOrgEmissorIdentProf;

	@Column(name="CS_SEXO")
	private Integer csSexo;

	@Column(name="DT_EXPEDICAO_PASSAPORTE")
	private Date dtExpedicaoPassaporte;

	@Column(name="DT_NASCIMENTO")
	private Date dtNascimento;

	@Column(name="ID_CADASTRO_SPC")
	private Integer idCadastroSpc;

	@Column(name="ID_MUNI_PREV")
	private Integer idMuniPrev;
	
	@Id
	@Column(name="ID_PESSOA_FISICA")
	private Integer idPessoaFisica;

	@Column(name="ID_UF_PREV")
	private Integer idUfPrev;

	@Column(name="NM_BAIRRO")
	private String nmBairro;

	@Column(name="NM_LOGRADOURO")
	private String nmLogradouro;

	@Column(name="NM_MAE")
	private String nmMae;

	@Column(name="NM_PESSOA_FISICA_SPC")
	private String nmPessoaFisicaSpc;

	@Column(name="NU_CELULAR")
	private String nuCelular;

	@Column(name="NU_CEP")
	private BigDecimal nuCep;

	@Column(name="NU_CPF")
	private BigDecimal nuCpf;

	@Column(name="NU_DDD_CELULAR")
	private String nuDddCelular;

	@Column(name="NU_DDD_TELEFONE")
	private String nuDddTelefone;

	@Column(name="NU_IDENTIDADE")
	private String nuIdentidade;

	@Column(name="NU_IDENTIDADE_PROFISSIONAL")
	private String nuIdentidadeProfissional;

	@Column(name="NU_LOGRADOURO")
	private String nuLogradouro;

	@Column(name="NU_MUNI_IBGE")
	private BigDecimal nuMuniIbge;

	@Column(name="NU_NIT_PRIMARIO")
	private BigDecimal nuNitPrimario;

	@Column(name="NU_PASSAPORTE")
	private String nuPassaporte;

	@Column(name="NU_RAMAL")
	private String nuRamal;

	@Column(name="NU_REGISTRO_ESTRANGEIRO")
	private String nuRegistroEstrangeiro;

	@Column(name="NU_REGISTRO_PROFISSIONAL")
	private String nuRegistroProfissional;

	@Column(name="NU_TELEFONE")
	private String nuTelefone;

	@Column(name="SG_IDENT_PROF_UF")
	private String sgIdentProfUf;

	@Column(name="SG_IDENT_UF")
	private String sgIdentUf;

	@Column(name="SG_UF")
	private String sgUf;

	@Column(name="TE_COMPL_LOGR")
	private String teComplLogr;

	@Column(name="TE_EMAIL")
	private String teEmail;

	public CadastrosPessoasFisicasSpcModel() {
	}

	public Integer getCsEstadoCivil() {
		return csEstadoCivil;
	}

	public Integer getCsGrauInstrucao() {
		return csGrauInstrucao;
	}

	public Integer getCsNacionalidade() {
		return csNacionalidade;
	}

	public Integer getCsOrgEmissorIdent() {
		return csOrgEmissorIdent;
	}

	public Integer getCsOrgEmissorIdentProf() {
		return csOrgEmissorIdentProf;
	}

	public Integer getCsSexo() {
		return csSexo;
	}

	public Date getDtExpedicaoPassaporte() {
		return dtExpedicaoPassaporte;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public Integer getIdCadastroSpc() {
		return idCadastroSpc;
	}

	public Integer getIdMuniPrev() {
		return idMuniPrev;
	}

	public Integer getIdPessoaFisica() {
		return idPessoaFisica;
	}

	public Integer getIdUfPrev() {
		return idUfPrev;
	}

	public String getNmBairro() {
		return nmBairro;
	}

	public String getNmLogradouro() {
		return nmLogradouro;
	}

	public String getNmMae() {
		return nmMae;
	}

	public String getNmPessoaFisicaSpc() {
		return nmPessoaFisicaSpc;
	}

	public String getNuCelular() {
		return nuCelular;
	}

	public BigDecimal getNuCep() {
		return nuCep;
	}

	public BigDecimal getNuCpf() {
		return nuCpf;
	}

	public String getNuDddCelular() {
		return nuDddCelular;
	}

	public String getNuDddTelefone() {
		return nuDddTelefone;
	}

	public String getNuIdentidade() {
		return nuIdentidade;
	}

	public String getNuIdentidadeProfissional() {
		return nuIdentidadeProfissional;
	}

	public String getNuLogradouro() {
		return nuLogradouro;
	}

	public BigDecimal getNuMuniIbge() {
		return nuMuniIbge;
	}

	public BigDecimal getNuNitPrimario() {
		return nuNitPrimario;
	}

	public String getNuPassaporte() {
		return nuPassaporte;
	}

	public String getNuRamal() {
		return nuRamal;
	}

	public String getNuRegistroEstrangeiro() {
		return nuRegistroEstrangeiro;
	}

	public String getNuRegistroProfissional() {
		return nuRegistroProfissional;
	}

	public String getNuTelefone() {
		return nuTelefone;
	}

	public String getSgIdentProfUf() {
		return sgIdentProfUf;
	}

	public String getSgIdentUf() {
		return sgIdentUf;
	}

	public String getSgUf() {
		return sgUf;
	}

	public String getTeComplLogr() {
		return teComplLogr;
	}

	public String getTeEmail() {
		return teEmail;
	}

	public void setCsEstadoCivil(Integer csEstadoCivil) {
		this.csEstadoCivil = csEstadoCivil;
	}

	public void setCsGrauInstrucao(Integer csGrauInstrucao) {
		this.csGrauInstrucao = csGrauInstrucao;
	}

	public void setCsNacionalidade(Integer csNacionalidade) {
		this.csNacionalidade = csNacionalidade;
	}

	public void setCsOrgEmissorIdent(Integer csOrgEmissorIdent) {
		this.csOrgEmissorIdent = csOrgEmissorIdent;
	}

	public void setCsOrgEmissorIdentProf(Integer csOrgEmissorIdentProf) {
		this.csOrgEmissorIdentProf = csOrgEmissorIdentProf;
	}

	public void setCsSexo(Integer csSexo) {
		this.csSexo = csSexo;
	}

	public void setDtExpedicaoPassaporte(Date dtExpedicaoPassaporte) {
		this.dtExpedicaoPassaporte = dtExpedicaoPassaporte;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public void setIdCadastroSpc(Integer idCadastroSpc) {
		this.idCadastroSpc = idCadastroSpc;
	}

	public void setIdMuniPrev(Integer idMuniPrev) {
		this.idMuniPrev = idMuniPrev;
	}

	public void setIdPessoaFisica(Integer idPessoaFisica) {
		this.idPessoaFisica = idPessoaFisica;
	}

	public void setIdUfPrev(Integer idUfPrev) {
		this.idUfPrev = idUfPrev;
	}

	public void setNmBairro(String nmBairro) {
		this.nmBairro = nmBairro;
	}

	public void setNmLogradouro(String nmLogradouro) {
		this.nmLogradouro = nmLogradouro;
	}

	public void setNmMae(String nmMae) {
		this.nmMae = nmMae;
	}

	public void setNmPessoaFisicaSpc(String nmPessoaFisicaSpc) {
		this.nmPessoaFisicaSpc = nmPessoaFisicaSpc;
	}

	public void setNuCelular(String nuCelular) {
		this.nuCelular = nuCelular;
	}

	public void setNuCep(BigDecimal nuCep) {
		this.nuCep = nuCep;
	}

	public void setNuCpf(BigDecimal nuCpf) {
		this.nuCpf = nuCpf;
	}

	public void setNuDddCelular(String nuDddCelular) {
		this.nuDddCelular = nuDddCelular;
	}

	public void setNuDddTelefone(String nuDddTelefone) {
		this.nuDddTelefone = nuDddTelefone;
	}

	public void setNuIdentidade(String nuIdentidade) {
		this.nuIdentidade = nuIdentidade;
	}

	public void setNuIdentidadeProfissional(String nuIdentidadeProfissional) {
		this.nuIdentidadeProfissional = nuIdentidadeProfissional;
	}

	public void setNuLogradouro(String nuLogradouro) {
		this.nuLogradouro = nuLogradouro;
	}

	public void setNuMuniIbge(BigDecimal nuMuniIbge) {
		this.nuMuniIbge = nuMuniIbge;
	}

	public void setNuNitPrimario(BigDecimal nuNitPrimario) {
		this.nuNitPrimario = nuNitPrimario;
	}

	public void setNuPassaporte(String nuPassaporte) {
		this.nuPassaporte = nuPassaporte;
	}

	public void setNuRamal(String nuRamal) {
		this.nuRamal = nuRamal;
	}

	public void setNuRegistroEstrangeiro(String nuRegistroEstrangeiro) {
		this.nuRegistroEstrangeiro = nuRegistroEstrangeiro;
	}

	public void setNuRegistroProfissional(String nuRegistroProfissional) {
		this.nuRegistroProfissional = nuRegistroProfissional;
	}

	public void setNuTelefone(String nuTelefone) {
		this.nuTelefone = nuTelefone;
	}

	public void setSgIdentProfUf(String sgIdentProfUf) {
		this.sgIdentProfUf = sgIdentProfUf;
	}

	public void setSgIdentUf(String sgIdentUf) {
		this.sgIdentUf = sgIdentUf;
	}

	public void setSgUf(String sgUf) {
		this.sgUf = sgUf;
	}

	public void setTeComplLogr(String teComplLogr) {
		this.teComplLogr = teComplLogr;
	}

	public void setTeEmail(String teEmail) {
		this.teEmail = teEmail;
	}

}