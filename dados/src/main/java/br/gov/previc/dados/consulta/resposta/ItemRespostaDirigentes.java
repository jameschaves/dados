package br.gov.previc.dados.consulta.resposta;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.previc.dados.model.DirigentesModel;
import br.gov.previc.dados.model.HistoricosCaptacaoModel;

@XmlType(propOrder = {"idDirigente","nmCargo","inReconducao","dtIniMandato","dtFimMandato","cargoRemunerado","represParticipantes",
		"responsavelRecursos","ativo","responsavelPlano","codigo","titular","ata","cgc","idCadastroSpc","tipoFuncao","presidente","prorrogacao","aetq"})
public class ItemRespostaDirigentes extends ItemResposta{
	private Integer idDirigente;
	private String nmCargo;
	private Integer inReconducao;
	private Date dtIniMandato;
	private Date dtFimMandato;
	private Integer cargoRemunerado;
	private Integer represParticipantes;
	private Integer responsavelRecursos;
	private Integer ativo;
	private Integer responsavelPlano;
	private Integer codigo;
	private Integer titular;
	private Integer ata;
	private Integer cgc;
	private Integer idCadastroSpc;
	private Integer tipoFuncao;
	private Integer presidente;
	private Integer prorrogacao;
	private Integer aetq;

	public ItemRespostaDirigentes() {
		super();
	}
	public ItemRespostaDirigentes(DirigentesModel m) {
		this.idDirigente=m.getIdDirigente();
		this.nmCargo=m.getNmCargo();
		this.inReconducao=m.getInReconducao();
		this.dtIniMandato=m.getDtIniMandato();
		this.dtFimMandato=m.getDtFimMandato();
		this.cargoRemunerado=m.getCargoRemunerado();
		this.represParticipantes=m.getRepresParticipantes();
		this.responsavelRecursos=m.getResponsavelRecursos();
		this.ativo=m.getAtivo();
		this.responsavelPlano=m.getResponsavelPlano();
		this.codigo=m.getCodigo();
		this.titular=m.getTitular();
		this.ata=m.getAta();
		this.cgc=m.getCgc();
		this.idCadastroSpc=m.getIdCadastroSpc();
		this.tipoFuncao=m.getTipoFuncao();
		this.presidente=m.getPresidente();
		this.prorrogacao=m.getProrrogacao();
		this.aetq=m.getAetq();
	}
	@XmlElement(name="IdDirigente")
	public Integer getIdDirigente() {
		return idDirigente;
	}
	@XmlElement(name="NmCargo")
	public String getNmCargo() {
		return nmCargo;
	}
	@XmlElement(name="InReconducao")
	public Integer getInReconducao() {
		return inReconducao;
	}
	@XmlElement(name="DtIniMandato")
	public Date getDtIniMandato() {
		return dtIniMandato;
	}
	@XmlElement(name="DtFimMandato")
	public Date getDtFimMandato() {
		return dtFimMandato;
	}
	@XmlElement(name="CargoRemunerado")
	public Integer getCargoRemunerado() {
		return cargoRemunerado;
	}
	@XmlElement(name="RepresParticipantes")
	public Integer getRepresParticipantes() {
		return represParticipantes;
	}
	@XmlElement(name="ResponsavelRecursos")
	public Integer getResponsavelRecursos() {
		return responsavelRecursos;
	}
	@XmlElement(name="Ativo")
	public Integer getAtivo() {
		return ativo;
	}
	@XmlElement(name="ResponsavelPlano")
	public Integer getResponsavelPlano() {
		return responsavelPlano;
	}
	@XmlElement(name="Codigo")
	public Integer getCodigo() {
		return codigo;
	}
	@XmlElement(name="Titular")
	public Integer getTitular() {
		return titular;
	}
	@XmlElement(name="Ata")
	public Integer getAta() {
		return ata;
	}
	@XmlElement(name="Cgc")
	public Integer getCgc() {
		return cgc;
	}
	@XmlElement(name="IdCadastroSpc")
	public Integer getIdCadastroSpc() {
		return idCadastroSpc;
	}
	@XmlElement(name="TipoFuncao")
	public Integer getTipoFuncao() {
		return tipoFuncao;
	}
	@XmlElement(name="Presidente")
	public Integer getPresidente() {
		return presidente;
	}
	@XmlElement(name="Prorrogacao")
	public Integer getProrrogacao() {
		return prorrogacao;
	}
	@XmlElement(name="Aetq")
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
