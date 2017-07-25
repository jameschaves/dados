package br.gov.previc.data.resposta;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.previc.data.model.PessoasJuridicasSpcBean;

@XmlType(propOrder = {"idPjSpc","cnpj", "razaoSocial", "endereco", "numero", "complemento", "bairro", 
		"municipio", "cep", "uf", "pais", "fone", "fax", "email", "site"})
public class ItemConsultaPessoasJuridicasSpc {
	private String cnpj;	
	private String razaoSocial;
	private String idPjSpc;
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private String municipio;
	private String cep;
	private String uf;
	private String pais;
	private String fone;
	private String fax;
	private String email;
	private String site;
	public ItemConsultaPessoasJuridicasSpc() {
		super();
	}
	public ItemConsultaPessoasJuridicasSpc(PessoasJuridicasSpcBean p) {
		this.razaoSocial=p.getNmRazaoSocial();
		this.cnpj=p.getNuCnpj().toString();
		this.idPjSpc=p.getIdPjSpc().toString();
		this.endereco=p.getTeEndereco();
		this.numero=p.getNuNumeroEnd();
		this.complemento=p.getTeComplemento();
		this.bairro=p.getNmBairro();
		this.municipio=p.getNmMunicipio();
		this.cep=p.getNuCep().toString();
		this.uf=p.getSgUf();
		this.pais=p.getNmPais();
		this.fone=p.getNuFone();
		this.fax=p.getNuFax();
		this.email=p.getTeEmail();
		this.site=p.getTeSite();
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
	@XmlElement(name = "Endereco")
	public String getEndereco() {
		return endereco;
	}
	@XmlElement(name = "Numero")
	public String getNumero() {
		return numero;
	}
	@XmlElement(name = "Complemento")
	public String getComplemento() {
		return complemento;
	}
	@XmlElement(name = "Bairro")
	public String getBairro() {
		return bairro;
	}
	@XmlElement(name = "Municipio")
	public String getMunicipio() {
		return municipio;
	}
	@XmlElement(name = "Cep")
	public String getCep() {
		return cep;
	}
	@XmlElement(name = "Uf")
	public String getUf() {
		return uf;
	}
	@XmlElement(name = "Pais")
	public String getPais() {
		return pais;
	}
	@XmlElement(name = "Fone")
	public String getFone() {
		return fone;
	}
	@XmlElement(name = "Fax")
	public String getFax() {
		return fax;
	}
	@XmlElement(name = "Email")
	public String getEmail() {
		return email;
	}
	@XmlElement(name = "Site")
	public String getSite() {
		return site;
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
	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSite(String site) {
		this.site = site;
	}
	
}
