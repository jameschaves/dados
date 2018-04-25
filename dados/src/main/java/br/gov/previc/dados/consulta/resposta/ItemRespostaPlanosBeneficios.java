package br.gov.previc.dados.consulta.resposta;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.previc.dados.model.PlanosBeneficiosModel;

@XmlType(propOrder = {"idPlano","nuCnpb"})
public class ItemRespostaPlanosBeneficios {
	@XmlElement(name="IdPlano")
	private Integer idPlano;
	@XmlElement(name="NuCnpb")
	private Long nuCnpb;
	public ItemRespostaPlanosBeneficios() {
		super();
	}
	public ItemRespostaPlanosBeneficios(PlanosBeneficiosModel p) {
		idPlano=p.getIdPlano();
		nuCnpb=p.getNuCnpb();
	}
	
}
