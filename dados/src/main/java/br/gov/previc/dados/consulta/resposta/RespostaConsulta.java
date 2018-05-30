package br.gov.previc.dados.consulta.resposta;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Resposta")
@XmlType(propOrder = {"colunas"})
public class RespostaConsulta<T> {
	private List<T> colunas;
	public RespostaConsulta() {
		super();
	}
	public RespostaConsulta(List<T> colunas) {
		this.colunas=colunas;
	}
	@XmlElementWrapper(name="Colunas")
    @XmlElement(name="Coluna")
	public List<T> getColunas() {
		return colunas;
	}
	public void setColunas(List<T> colunas) {
		this.colunas = colunas;
	}
}
