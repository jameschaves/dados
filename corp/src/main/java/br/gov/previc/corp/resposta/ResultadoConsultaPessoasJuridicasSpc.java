package br.gov.previc.corp.resposta;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Resultado")
@XmlType(propOrder = {"pessoasJuridicasSpc"})
public class ResultadoConsultaPessoasJuridicasSpc {

	private List<ItemConsultaPessoasJuridicasSpc> pessoasjuridicasspc;
	
	public ResultadoConsultaPessoasJuridicasSpc() {
		super();
	}
	public ResultadoConsultaPessoasJuridicasSpc(List<ItemConsultaPessoasJuridicasSpc> pessoasjuridicasspc) {
		this.pessoasjuridicasspc = pessoasjuridicasspc;
	}
    @XmlElement(name="PessoasJuridicasSpc")
    public List<ItemConsultaPessoasJuridicasSpc> getPessoasJuridicasSpc() {
        return pessoasjuridicasspc;
    }
	public void setPessoasJuridicasSpc(List<ItemConsultaPessoasJuridicasSpc> pessoasjuridicasspc){
		this.pessoasjuridicasspc = pessoasjuridicasspc;
	}

}
