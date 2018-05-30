package br.gov.previc.dados.consulta.resposta;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Resposta")
@XmlType(propOrder = {"items"})
public class RespostaConsulta {
	private List<ItemResposta> items;
	public RespostaConsulta() {
	}
	public RespostaConsulta(List<ItemResposta> items) {
		this.items=items;
	}
	@XmlElementWrapper(name="Items")
	@XmlElements
    ({
        @XmlElement(name = "Item", type = ItemRespostaCadastrosPessoasFisicasSpc.class, required = false),
        @XmlElement(name = "Item", type = ItemRespostaEfpcs.class, required = false),
        @XmlElement(name = "Item", type = ItemRespostaGestoesPlano.class, required = false),
        @XmlElement(name = "Item", type = ItemRespostaHistoricosCaptacao.class, required = false),
        @XmlElement(name = "Item", type = ItemRespostaLancamentosPlano.class, required = false),
        @XmlElement(name = "Item", type = ItemRespostaPessoasJuridicasSpc.class, required = false),
        @XmlElement(name = "Item", type = ItemRespostaPlanosBeneficios.class, required = false),
        @XmlElement(name = "Item", type = ItemRespostaSituacoesPlano.class, required = false)
    })   
	public List<ItemResposta> getItems() {
		return items;
	}
	public void setItems(List<ItemResposta> items) {
		this.items = items;
	}
}
