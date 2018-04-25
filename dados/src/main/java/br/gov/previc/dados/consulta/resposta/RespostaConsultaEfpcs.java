package br.gov.previc.dados.consulta.resposta;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Resposta")
@XmlType(propOrder = {"colunas"})
public class RespostaConsultaEfpcs {
	private List<ItemRespostaEfpcs> colunas;
	public RespostaConsultaEfpcs() {
		super();
	}
	public RespostaConsultaEfpcs(List<ItemRespostaEfpcs> colunas) {
		this.colunas=colunas;
	}
	@XmlElementWrapper(name="Colunas")
    @XmlElement(name="Coluna")
	public List<ItemRespostaEfpcs> getColunas() {
		return colunas;
	}
	public void setColunas(List<ItemRespostaEfpcs> colunas) {
		this.colunas = colunas;
	}
}
