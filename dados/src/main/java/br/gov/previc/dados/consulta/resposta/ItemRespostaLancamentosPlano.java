package br.gov.previc.dados.consulta.resposta;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.previc.dados.model.LancamentosPlanoModel;

@XmlType(propOrder = {"csNaturezaLancamento","csNaturezaSaldoFinal","idCaptacao","nuAno","nuPlano","nuMes","nuArvore","nuConta","nuTrimestre","vlCredito","vlDebito","vlSaldoFinal","vlSaldoInicial"})
public class ItemRespostaLancamentosPlano {

	private String csNaturezaLancamento;
	private String csNaturezaSaldoFinal;
	private Long idCaptacao;
	private Integer nuAno;
	private BigDecimal nuPlano;
	private Integer nuMes;
	private Integer nuArvore;
	private BigDecimal nuConta;
	private Integer nuTrimestre;
	private Double vlCredito;
	private Double vlDebito;
	private Double vlSaldoFinal;
	private Double vlSaldoInicial;

	public ItemRespostaLancamentosPlano(LancamentosPlanoModel r) {
		this.csNaturezaLancamento = r.getCsNaturezaLancamento();
		this.csNaturezaSaldoFinal = r.getCsNaturezaSaldoFinal();
		this.idCaptacao = r.getIdCaptacao();
		this.nuAno = r.getNuAno();
		this.nuPlano = r.getNuPlano();
		this.nuMes = r.getNuMes();
		this.nuArvore = r.getNuArvore();
		this.nuConta = r.getNuConta();
		this.nuTrimestre = r.getNuTrimestre();
		this.vlCredito = r.getVlCredito();
		this.vlDebito = r.getVlDebito();
		this.vlSaldoFinal = r.getVlSaldoFinal();
		this.vlSaldoInicial = r.getVlSaldoInicial();
	}
	@XmlElement(name="CsNaturezaLancamento")
	public String getCsNaturezaLancamento() {
		return csNaturezaLancamento;
	}
	@XmlElement(name="CsNaturezaSaldoFinal")
	public String getCsNaturezaSaldoFinal() {
		return csNaturezaSaldoFinal;
	}
	@XmlElement(name="IdCaptacao")
	public Long getIdCaptacao() {
		return idCaptacao;
	}
	@XmlElement(name="NuAno")
	public Integer getNuAno() {
		return nuAno;
	}
	@XmlElement(name="NuPlano")
	public BigDecimal getNuPlano() {
		return nuPlano;
	}
	@XmlElement(name="NuMes")
	public Integer getNuMes() {
		return nuMes;
	}
	@XmlElement(name="NuArvore")
	public Integer getNuArvore() {
		return nuArvore;
	}
	@XmlElement(name="NuConta")
	public BigDecimal getNuConta() {
		return nuConta;
	}
	@XmlElement(name="NuTrimestre")
	public Integer getNuTrimestre() {
		return nuTrimestre;
	}
	@XmlElement(name="VlCredito")
	public Double getVlCredito() {
		return vlCredito;
	}
	@XmlElement(name="VlDebito")
	public Double getVlDebito() {
		return vlDebito;
	}
	@XmlElement(name="VlSaldoFinal")
	public Double getVlSaldoFinal() {
		return vlSaldoFinal;
	}
	@XmlElement(name="VlSaldoInicial")
	public Double getVlSaldoInicial() {
		return vlSaldoInicial;
	}

	public void setCsNaturezaLancamento(String csNaturezaLancamento) {
		this.csNaturezaLancamento = csNaturezaLancamento;
	}

	public void setCsNaturezaSaldoFinal(String csNaturezaSaldoFinal) {
		this.csNaturezaSaldoFinal = csNaturezaSaldoFinal;
	}

	public void setIdCaptacao(Long idCaptacao) {
		this.idCaptacao = idCaptacao;
	}

	public void setNuAno(Integer nuAno) {
		this.nuAno = nuAno;
	}

	public void setNuPlano(BigDecimal nuPlano) {
		this.nuPlano = nuPlano;
	}

	public void setNuMes(Integer nuMes) {
		this.nuMes = nuMes;
	}

	public void setNuArvore(Integer nuArvore) {
		this.nuArvore = nuArvore;
	}

	public void setNuConta(BigDecimal nuConta) {
		this.nuConta = nuConta;
	}

	public void setNuTrimestre(Integer nuTrimestre) {
		this.nuTrimestre = nuTrimestre;
	}

	public void setVlCredito(Double vlCredito) {
		this.vlCredito = vlCredito;
	}

	public void setVlDebito(Double vlDebito) {
		this.vlDebito = vlDebito;
	}

	public void setVlSaldoFinal(Double vlSaldoFinal) {
		this.vlSaldoFinal = vlSaldoFinal;
	}

	public void setVlSaldoInicial(Double vlSaldoInicial) {
		this.vlSaldoInicial = vlSaldoInicial;
	}



}
