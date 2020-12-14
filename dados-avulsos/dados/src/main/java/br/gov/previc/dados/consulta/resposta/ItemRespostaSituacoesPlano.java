package br.gov.previc.dados.consulta.resposta;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.previc.dados.model.SituacoesPlanoModel;

@XmlType(propOrder = {"idSitPlano","nmSitPrincipal","nmSitSecundaria"})
public class ItemRespostaSituacoesPlano extends ItemResposta{

	private Integer idSitPlano;
	private String nmSitPrincipal;
	private String nmSitSecundaria;

	public ItemRespostaSituacoesPlano() {
		super();
	}
	public ItemRespostaSituacoesPlano(SituacoesPlanoModel r) {
		this.idSitPlano = r.getIdSitPlano();
		this.nmSitPrincipal = r.getNmSitPrincipal();
		this.nmSitSecundaria = r.getNmSitSecundaria();
	}
	@XmlElement(name="IdSitPlano")
	public Integer getIdSitPlano() {
		return idSitPlano;
	}
	@XmlElement(name="NmSitPrincipal")
	public String getNmSitPrincipal() {
		return nmSitPrincipal;
	}
	@XmlElement(name="NmSitSecundaria")
	public String getNmSitSecundaria() {
		return nmSitSecundaria;
	}

	public void setIdSitPlano(Integer idSitPlano) {
		this.idSitPlano = idSitPlano;
	}

	public void setNmSitPrincipal(String nmSitPrincipal) {
		this.nmSitPrincipal = nmSitPrincipal;
	}

	public void setNmSitSecundaria(String nmSitSecundaria) {
		this.nmSitSecundaria = nmSitSecundaria;
	}

}
