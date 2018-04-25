package br.gov.previc.dados.consulta.resposta;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Resposta")
@XmlType(propOrder = {"colunas"})
public class RespostaConsultaPessoasJuridicasSpc {
	
	private List<ItemRespostaPessoasJuridicasSpc> colunas;
	public RespostaConsultaPessoasJuridicasSpc() {
		super();
	}
	public RespostaConsultaPessoasJuridicasSpc(List<ItemRespostaPessoasJuridicasSpc> colunas) {
		this.colunas=colunas;
	}
	@XmlElementWrapper(name="Colunas")
    @XmlElement(name="Coluna")
	public List<ItemRespostaPessoasJuridicasSpc> getColunas() {
		return colunas;
	}
	public void setColunas(List<ItemRespostaPessoasJuridicasSpc> colunas) {
		this.colunas = colunas;
	}
    
}
