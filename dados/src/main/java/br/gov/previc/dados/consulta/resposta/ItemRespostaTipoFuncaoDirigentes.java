package br.gov.previc.dados.consulta.resposta;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.previc.dados.model.TipoFuncaoDirigentesModel;


@XmlType(propOrder = {"idTipoFuncao","nmTipoFuncao"})
public class ItemRespostaTipoFuncaoDirigentes extends ItemResposta{
	
	private Integer idTipoFuncao;
	private String nmTipoFuncao;
	public ItemRespostaTipoFuncaoDirigentes() {
		super();
	}
	public ItemRespostaTipoFuncaoDirigentes(TipoFuncaoDirigentesModel e) {
		this.idTipoFuncao=e.getIdTipoFuncao();
		this.nmTipoFuncao=e.getNmTipoFuncao();
	}
	@XmlElement(name="IdTipoFuncao")
	public Integer getIdTipoFuncao() {
		return idTipoFuncao;
	}
	@XmlElement(name="NmTipoFuncao")
	public String getNmTipoFuncao() {
		return nmTipoFuncao;
	}
	public void setIdTipoFuncao(Integer idTipoFuncao) {
		this.idTipoFuncao = idTipoFuncao;
	}
	public void setNmTipoFuncao(String nmTipoFuncao) {
		this.nmTipoFuncao = nmTipoFuncao;
	}
	
	
	
}
