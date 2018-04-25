package br.gov.previc.dados.consulta.resposta;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.previc.dados.model.EfpcsModel;

@XmlType(propOrder = {"sgEfpc","idPjSpc","nuMatriculaEfpc"})
public class ItemRespostaEfpcs {
	@XmlElement(name="SgEfpc")
	private String sgEfpc;
	@XmlElement(name="IdPjSpc")
	private Integer idPjSpc;
	@XmlElement(name="NuMatriculaEfpc")
	private Integer nuMatriculaEfpc;
	public ItemRespostaEfpcs() {
		super();
	}
	public ItemRespostaEfpcs(EfpcsModel e) {
		sgEfpc=e.getSgEfpc();
		idPjSpc=e.getIdPjSpc();
		nuMatriculaEfpc=e.getNuMatriculaEfpc();
	}
	
}
