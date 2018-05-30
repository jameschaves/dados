package br.gov.previc.dados.consulta.resposta;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.previc.dados.model.PlanosBeneficiosModel;

@XmlType(propOrder = {"idPlano","nuCnpb","idSitPlano","nmPlano"})
public class ItemRespostaPlanosBeneficios extends ItemResposta{
	
	private Integer idPlano;
	private Long nuCnpb;
	private Integer idSitPlano;
	private String nmPlano;
	public ItemRespostaPlanosBeneficios() {
		super();
	}
	public ItemRespostaPlanosBeneficios(PlanosBeneficiosModel p) {
		this.idPlano=p.getIdPlano();
		this.nuCnpb=p.getNuCnpb();
		this.idSitPlano = p.getIdSitPlano();
		this.nmPlano = p.getNmPlano();
	}
	@XmlElement(name="IdPlano")
	public Integer getIdPlano() {
		return idPlano;
	}
	@XmlElement(name="NuCnpb")
	public Long getNuCnpb() {
		return nuCnpb;
	}
	@XmlElement(name="IdSitPlano")
	public Integer getIdSitPlano() {
		return idSitPlano;
	}
	@XmlElement(name="NmPlano")
	public String getNmPlano() {
		return nmPlano;
	}
	public void setIdPlano(Integer idPlano) {
		this.idPlano = idPlano;
	}
	public void setNuCnpb(Long nuCnpb) {
		this.nuCnpb = nuCnpb;
	}
	public void setIdSitPlano(Integer idSitPlano) {
		this.idSitPlano = idSitPlano;
	}
	public void setNmPlano(String nmPlano) {
		this.nmPlano = nmPlano;
	}
	
}
