package br.gov.previc.dados.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="DADOS.TIPO_FUNCAO_DIRIGENTES")
@NamedQueries({
	@NamedQuery(name="TipoFuncaoDirigentesModel.findAll", query="SELECT t FROM TipoFuncaoDirigentesModel t"),
	@NamedQuery(name="TipoFuncaoDirigentesModel.findByIdTipoFuncao", query="SELECT t FROM TipoFuncaoDirigentesModel t WHERE t.idTipoFuncao = :idTipoFuncao")
	})
public class TipoFuncaoDirigentesModel {
	@Id
	@Column(name="ID_TIPO_FUNCAO")
	private Integer idTipoFuncao;
	@Column(name="NM_TIPO_FUNCAO")
	private String nmTipoFuncao;
	
	public Integer getIdTipoFuncao() {
		return idTipoFuncao;
	}
	public TipoFuncaoDirigentesModel() {

	}
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
