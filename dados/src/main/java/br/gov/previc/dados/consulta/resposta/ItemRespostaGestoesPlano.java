package br.gov.previc.dados.consulta.resposta;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.previc.dados.model.GestoesPlanoModel;

@XmlType(propOrder = {"dtFimTransfGestao","dtIniGestao","idGestaoPlano","idPlano","nuMatriculaEfpc"})
public class ItemRespostaGestoesPlano extends ItemResposta{

	private Date dtFimTransfGestao;
	private Date dtIniGestao;
	private Integer idGestaoPlano;
	private Integer idPlano;
	private Integer nuMatriculaEfpc;

	public ItemRespostaGestoesPlano(GestoesPlanoModel r) {
		this.dtFimTransfGestao = r.getDtFimTransfGestao();
		this.dtIniGestao = r.getDtIniGestao();
		this.idGestaoPlano = r.getIdGestaoPlano();
		this.idPlano = r.getIdPlano();
		this.nuMatriculaEfpc = r.getNuMatriculaEfpc();
		
	}
	public ItemRespostaGestoesPlano() {
		super();
	}
	@XmlElement(name="DtFimTransfGestao")
	public Date getDtFimTransfGestao() {
		return dtFimTransfGestao;
	}
	@XmlElement(name="DtIniGestao")
	public Date getDtIniGestao() {
		return dtIniGestao;
	}
	@XmlElement(name="IdGestaoPlano")
	public Integer getIdGestaoPlano() {
		return idGestaoPlano;
	}
	@XmlElement(name="IdPlano")
	public Integer getIdPlano() {
		return idPlano;
	}
	@XmlElement(name="NuMatriculaEfpc")
	public Integer getNuMatriculaEfpc() {
		return nuMatriculaEfpc;
	}

	public void setDtFimTransfGestao(Date dtFimTransfGestao) {
		this.dtFimTransfGestao = dtFimTransfGestao;
	}

	public void setDtIniGestao(Date dtIniGestao) {
		this.dtIniGestao = dtIniGestao;
	}

	public void setIdGestaoPlano(Integer idGestaoPlano) {
		this.idGestaoPlano = idGestaoPlano;
	}

	public void setIdPlano(Integer idPlano) {
		this.idPlano = idPlano;
	}

	public void setNuMatriculaEfpc(Integer nuMatriculaEfpc) {
		this.nuMatriculaEfpc = nuMatriculaEfpc;
	}

}
