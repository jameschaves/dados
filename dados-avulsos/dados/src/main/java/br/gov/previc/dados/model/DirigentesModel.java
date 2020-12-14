package br.gov.previc.dados.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="CAND.DIRIGENTES")
@NamedQueries({
	@NamedQuery(name="DirigentesModel.findAll", query="SELECT d FROM DirigentesModel d"),
	@NamedQuery(name="DirigentesModel.findByIdDirigente", query="SELECT d FROM DirigentesModel d WHERE d.idDirigente = :idDirigente"),
	@NamedQuery(name="DirigentesModel.findByIdCadastroSpc", query="SELECT d FROM DirigentesModel d WHERE d.idCadastroSpc = :idCadastroSpc")
	})
public class DirigentesModel {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ID_DIRIGENTE")
	private Integer idDirigente;
	@Column(name="NM_CARGO")
	private String nmCargo;
	@Column(name="IN_RECONDUCAO")
	private Integer inReconducao;
	@Column(name="DT_INICIO_MANDATO")
	private Date dtIniMandato;
	@Column(name="DT_FIM_MANDATO")
	private Date dtFimMandato;
	@Column(name="IN_CARGO_REMUNERADO")
	private Integer cargoRemunerado;
	@Column(name="IN_REPRES_PARTICIPANTE")
	private Integer represParticipantes;
	@Column(name="IN_RESPONSAVEL_RECURSOS")
	private Integer responsavelRecursos;
	@Column(name="IN_ATIVO")
	private Integer ativo;
	@Column(name="IN_RESPONSAVEL_PLANO")
	private Integer responsavelPlano;
	@Column(name="NU_CODIGO")
	private Integer codigo;
	@Column(name="IN_TITULAR")
	private Integer titular;
	@Column(name="ID_ATA")
	private Integer ata;
	@Column(name="NU_CGC")
	private Integer cgc;
	@Column(name="ID_CADASTRO_SPC")
	private Integer idCadastroSpc;
	@Column(name="ID_TIPO_FUNCAO")
	private Integer tipoFuncao;
	@Column(name="IN_PRESIDENTE")
	private Integer presidente;
	@Column(name="IN_PRORROGACAO")
	private Integer prorrogacao;
	@Column(name="IN_AETQ")
	private Integer aetq;
	public DirigentesModel() {
		
	}
	public Integer getIdDirigente() {
		return idDirigente;
	}
	public String getNmCargo() {
		return nmCargo;
	}
	public Integer getInReconducao() {
		return inReconducao;
	}
	public Date getDtIniMandato() {
		return dtIniMandato;
	}
	public Date getDtFimMandato() {
		return dtFimMandato;
	}
	public Integer getCargoRemunerado() {
		return cargoRemunerado;
	}
	public Integer getRepresParticipantes() {
		return represParticipantes;
	}
	public Integer getResponsavelRecursos() {
		return responsavelRecursos;
	}
	public Integer getAtivo() {
		return ativo;
	}
	public Integer getResponsavelPlano() {
		return responsavelPlano;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public Integer getTitular() {
		return titular;
	}
	public Integer getAta() {
		return ata;
	}
	public Integer getCgc() {
		return cgc;
	}
	public Integer getIdCadastroSpc() {
		return idCadastroSpc;
	}
	public Integer getTipoFuncao() {
		return tipoFuncao;
	}
	public Integer getPresidente() {
		return presidente;
	}
	public Integer getProrrogacao() {
		return prorrogacao;
	}
	public Integer getAetq() {
		return aetq;
	}
	public void setIdDirigente(Integer idDirigente) {
		this.idDirigente = idDirigente;
	}
	public void setNmCargo(String nmCargo) {
		this.nmCargo = nmCargo;
	}
	public void setInReconducao(Integer inReconducao) {
		this.inReconducao = inReconducao;
	}
	public void setDtIniMandato(Date dtIniMandato) {
		this.dtIniMandato = dtIniMandato;
	}
	public void setDtFimMandato(Date dtFimMandato) {
		this.dtFimMandato = dtFimMandato;
	}
	public void setCargoRemunerado(Integer cargoRemunerado) {
		this.cargoRemunerado = cargoRemunerado;
	}
	public void setRepresParticipantes(Integer represParticipantes) {
		this.represParticipantes = represParticipantes;
	}
	public void setResponsavelRecursos(Integer responsavelRecursos) {
		this.responsavelRecursos = responsavelRecursos;
	}
	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}
	public void setResponsavelPlano(Integer responsavelPlano) {
		this.responsavelPlano = responsavelPlano;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public void setTitular(Integer titular) {
		this.titular = titular;
	}
	public void setAta(Integer ata) {
		this.ata = ata;
	}
	public void setCgc(Integer cgc) {
		this.cgc = cgc;
	}
	public void setIdCadastroSpc(Integer idCadastroSpc) {
		this.idCadastroSpc = idCadastroSpc;
	}
	public void setTipoFuncao(Integer tipoFuncao) {
		this.tipoFuncao = tipoFuncao;
	}
	public void setPresidente(Integer presidente) {
		this.presidente = presidente;
	}
	public void setProrrogacao(Integer prorrogacao) {
		this.prorrogacao = prorrogacao;
	}
	public void setAetq(Integer aetq) {
		this.aetq = aetq;
	}
}
