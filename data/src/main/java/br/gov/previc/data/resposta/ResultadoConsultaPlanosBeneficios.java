package br.gov.previc.data.resposta;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Resultado")
@XmlType(propOrder = {"planosBeneficios"})
public class ResultadoConsultaPlanosBeneficios {

	private List<ItemConsultaPlanosBeneficios> planosBeneficios;
	public ResultadoConsultaPlanosBeneficios() {
		super();
	}
	public ResultadoConsultaPlanosBeneficios(List<ItemConsultaPlanosBeneficios> planosBeneficios) {
		this.planosBeneficios = planosBeneficios;
	}
    @XmlElement(name="PlanosBeneficios")
    public List<ItemConsultaPlanosBeneficios> getPlanosBeneficios() {
        return planosBeneficios;
    }
	public void setPlanosBeneficios(List<ItemConsultaPlanosBeneficios> planosBeneficios){
		this.planosBeneficios = planosBeneficios;
	}

}
