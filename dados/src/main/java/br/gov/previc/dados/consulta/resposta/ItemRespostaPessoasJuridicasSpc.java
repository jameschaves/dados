package br.gov.previc.dados.consulta.resposta;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.previc.dados.model.PessoasJuridicasSpcModel;

@XmlType(propOrder = {"idPjSpc","nmRazaoSocial","nuCnpj"})
public class ItemRespostaPessoasJuridicasSpc{
	@XmlElement(name="IdPjSpc")
	private Integer idPjSpc;
	@XmlElement(name="NmRazaoSocial")
	private String nmRazaoSocial;
	@XmlElement(name="NuCnpj")
	private BigDecimal nuCnpj;
	public ItemRespostaPessoasJuridicasSpc() {
		super();
	}
	public ItemRespostaPessoasJuridicasSpc(PessoasJuridicasSpcModel p) {
		this.idPjSpc=p.getIdPjSpc();
		this.nmRazaoSocial=p.getNmRazaoSocial();
		this.nuCnpj=p.getNuCnpj();
	}
	
}
