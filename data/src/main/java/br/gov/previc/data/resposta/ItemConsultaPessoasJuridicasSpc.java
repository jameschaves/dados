package br.gov.previc.data.resposta;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.previc.data.model.PessoasJuridicasSpcBean;

@XmlType(propOrder = {"idPjSpc","cnpj", "razaoSocial"})
public class ItemConsultaPessoasJuridicasSpc {
	private String cnpj;	
	private String razaoSocial;
	private String idPjSpc;
	public ItemConsultaPessoasJuridicasSpc() {
		super();
	}
	public ItemConsultaPessoasJuridicasSpc(PessoasJuridicasSpcBean p) {
		this.razaoSocial=p.getNmRazaoSocial();
		this.cnpj=p.getNuCnpj().toString();
		this.idPjSpc=p.getIdPjSpc().toString();
	}
	@XmlElement(name = "Cnpj")
	public String getCnpj() {
		return cnpj;
	}	
	@XmlElement(name = "RazaoSocial")
	public String getRazaoSocial() {
		return razaoSocial;
	}
	@XmlElement(name = "IdPjSpc")
	public String getIdPjSpc() {
		return idPjSpc;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public void setIdPjSpc(String idPjSpc) {
		this.idPjSpc = idPjSpc;
	}
	
}
