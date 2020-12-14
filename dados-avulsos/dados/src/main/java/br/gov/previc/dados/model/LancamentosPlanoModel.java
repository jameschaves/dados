package br.gov.previc.dados.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the LANCAMENTOS_PLANO database table.
 * 
 */
@Entity
@Table(name="SPC.LANCAMENTOS_PLANO")
@NamedQueries({
	@NamedQuery(name="LancamentosPlanoModel.findAll", query="SELECT l FROM LancamentosPlanoModel l"),
	@NamedQuery(name="LancamentosPlanoModel.findByIdCaptacao", query="SELECT l FROM LancamentosPlanoModel l WHERE l.idCaptacao = :idCaptacao"),
	@NamedQuery(name="LancamentosPlanoModel.findByNuPlano", query="SELECT l FROM LancamentosPlanoModel l WHERE l.nuPlano = :nuPlano"),
	@NamedQuery(name="LancamentosPlanoModel.findByNuAno", query="SELECT l FROM LancamentosPlanoModel l WHERE l.nuAno = :nuAno"),
	@NamedQuery(name="LancamentosPlanoModel.findByNuPlanoAndNuAnoAndNuMesAndNuTrimestre", query="SELECT l FROM LancamentosPlanoModel l WHERE l.nuPlano = :nuPlano AND l.nuAno = :nuAno AND l.nuMes = :nuMes AND l.nuTrimestre = :nuTrimestre"),
	@NamedQuery(name="LancamentosPlanoModel.findByNuPlanoAndNuAnoAndNuMesIsNullAndNuTrimestre", query="SELECT l FROM LancamentosPlanoModel l WHERE l.nuPlano = :nuPlano AND l.nuAno = :nuAno AND l.nuMes is null AND l.nuTrimestre = :nuTrimestre"),
	@NamedQuery(name="LancamentosPlanoModel.findByNuPlanoAndNuAnoAndNuMesAndNuTrimestreIsNull", query="SELECT l FROM LancamentosPlanoModel l WHERE l.nuPlano = :nuPlano AND l.nuAno = :nuAno AND l.nuMes = :nuMes AND l.nuTrimestre is null"),
	@NamedQuery(name="LancamentosPlanoModel.findByNuPlanoAndNuAnoAndNuMesIsNullAndNuTrimestreIsNull", query="SELECT l FROM LancamentosPlanoModel l WHERE l.nuPlano = :nuPlano AND l.nuAno = :nuAno AND l.nuMes is null AND l.nuTrimestre is null")
})
public class LancamentosPlanoModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CS_NATUREZA_LANCAMENTO")
	private String csNaturezaLancamento;

	@Column(name="CS_NATUREZA_SALDO_FINAL")
	private String csNaturezaSaldoFinal;
	
	@Id
	@Column(name="ID_CAPTACAO")
	private Long idCaptacao;

	@Column(name="NU_ANO")
	private Integer nuAno;

	@Column(name="NU_ARVORE")
	private Integer nuArvore;

	@Column(name="NU_CONTA")
	private BigDecimal nuConta;

	@Column(name="NU_MES")
	private Integer nuMes;

	@Column(name="NU_PLANO")
	private BigDecimal nuPlano;

	@Column(name="NU_TRIMESTRE")
	private Integer nuTrimestre;

	@Column(name="VL_CREDITO")
	private Double vlCredito;

	@Column(name="VL_DEBITO")
	private Double vlDebito;

	@Column(name="VL_SALDO_FINAL")
	private Double vlSaldoFinal;

	@Column(name="VL_SALDO_INICIAL")
	private Double vlSaldoInicial;

	public LancamentosPlanoModel() {
	}

	public String getCsNaturezaLancamento() {
		return csNaturezaLancamento;
	}

	public String getCsNaturezaSaldoFinal() {
		return csNaturezaSaldoFinal;
	}

	public Long getIdCaptacao() {
		return idCaptacao;
	}

	public Integer getNuAno() {
		return nuAno;
	}

	public Integer getNuArvore() {
		return nuArvore;
	}

	public BigDecimal getNuConta() {
		return nuConta;
	}

	public Integer getNuMes() {
		return nuMes;
	}

	public BigDecimal getNuPlano() {
		return nuPlano;
	}

	public Integer getNuTrimestre() {
		return nuTrimestre;
	}

	public Double getVlCredito() {
		return vlCredito;
	}

	public Double getVlDebito() {
		return vlDebito;
	}

	public Double getVlSaldoFinal() {
		return vlSaldoFinal;
	}

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

	public void setNuArvore(Integer nuArvore) {
		this.nuArvore = nuArvore;
	}

	public void setNuConta(BigDecimal nuConta) {
		this.nuConta = nuConta;
	}

	public void setNuMes(Integer nuMes) {
		this.nuMes = nuMes;
	}

	public void setNuPlano(BigDecimal nuPlano) {
		this.nuPlano = nuPlano;
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