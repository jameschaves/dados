package br.gov.previc.corp.resposta;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Resultado")
@XmlType(propOrder = {"efpcs"})
public class ResultadoConsultaEfpcs {

	private List<ItemConsultaEfpcs> efpcs;
	public ResultadoConsultaEfpcs() {
		super();
	}
	public ResultadoConsultaEfpcs(List<ItemConsultaEfpcs> efpcs) {
		this.efpcs = efpcs;
	}
    @XmlElement(name="Efpcs")
    public List<ItemConsultaEfpcs> getEfpcs() {
        return efpcs;
    }
	public void setEfpcs(List<ItemConsultaEfpcs> efpcs){
		this.efpcs = efpcs;
	}

}
