package br.gov.previc.corp.resposta;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.previc.corp.model.PlanosBeneficiosBean;

@XmlType(propOrder = {"idPlano","nmPlano", "nuCnpb", "sitPrincipal", "sitSecundaria"})
public class ItemConsultaPlanosBeneficios {
	private String idPlano;
	private String nmPlano;
	private String nuCnpb;
	private String sitPrincipal;
	private String sitSecundaria;
	public ItemConsultaPlanosBeneficios(){
		super();
	}
	public ItemConsultaPlanosBeneficios(PlanosBeneficiosBean r) {
		this.idPlano = r.getIdPlano().toString();
		this.nmPlano = r.getNmPlano();
		this.nuCnpb = r.getNuCnpb().toString();
		this.sitPrincipal = r.getSituacoesPlanoBean().getNmSitPrincipal();
		this.sitSecundaria = r.getSituacoesPlanoBean().getNmSitSecundaria();
	}
	@XmlElement(name = "IdPlano")
	public String getIdPlano() {
		return idPlano;
	}
	@XmlElement(name = "NmPlano")
	public String getNmPlano() {
		return nmPlano;
	}
	@XmlElement(name = "NuCnpb")
	public String getNuCnpb() {
		return nuCnpb;
	}
	@XmlElement(name = "SitPrincipal")
	public String getSitPrincipal() {
		return sitPrincipal;
	}
	@XmlElement(name = "SitSecundaria")
	public String getSitSecundaria() {
		return sitSecundaria;
	}
	public void setIdPlano(String idPlano) {
		this.idPlano = idPlano;
	}
	public void setNmPlano(String nmPlano) {
		this.nmPlano = nmPlano;
	}
	public void setNuCnpb(String nuCnpb) {
		this.nuCnpb = nuCnpb;
	}
	public void setSitPrincipal(String sitPrincipal) {
		this.sitPrincipal = sitPrincipal;
	}
	public void setSitSecundaria(String sitSecundaria) {
		this.sitSecundaria = sitSecundaria;
	}
	
}
