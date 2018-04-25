package br.gov.previc.dados.consulta.resposta;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Resposta")
@XmlType(propOrder = {"colunas"})
public class RespostaConsultaPlanosBeneficios {
	private List<ItemRespostaPlanosBeneficios> colunas;
	public RespostaConsultaPlanosBeneficios() {
		super();
	}
	public RespostaConsultaPlanosBeneficios(List<ItemRespostaPlanosBeneficios> colunas) {
		this.colunas=colunas;
	}
	@XmlElementWrapper(name="Colunas")
    @XmlElement(name="Coluna")
	public List<ItemRespostaPlanosBeneficios> getColunas() {
		return colunas;
	}
	public void setColunas(List<ItemRespostaPlanosBeneficios> colunas) {
		this.colunas = colunas;
	}
}
