package br.gov.previc.data.resposta;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.previc.data.model.EfpcsBean;

@XmlType(propOrder = {"idPjSpc","matricula", "sgEfpc"})
public class ItemConsultaEfpcs {
	private String matricula;
	private String sgEfpc;
	private String idPjSpc;
	public ItemConsultaEfpcs(){
		super();
	}
	public ItemConsultaEfpcs(EfpcsBean r) {
		this.matricula = String.valueOf(r.getNuMatriculaEfpc());
		this.sgEfpc=r.getSgEfpc();
		this.idPjSpc=r.getIdPjSpc().toString();
	}
	@XmlElement(name = "Matricula")
	public String getMatricula() {
		return matricula;
	}
	@XmlElement(name = "SgEfpc")
	public String getSgEfpc() {
		return sgEfpc;
	}
	@XmlElement(name = "IdPjSpc")
	public String getIdPjSpc() {
		return idPjSpc;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setSgEfpc(String sgEfpc) {
		this.sgEfpc = sgEfpc;
	}
	
	public void setIdPjSpc(String idPjSpc) {
		this.idPjSpc = idPjSpc;
	}
}
