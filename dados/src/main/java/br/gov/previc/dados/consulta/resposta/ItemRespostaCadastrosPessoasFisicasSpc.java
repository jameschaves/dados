package br.gov.previc.dados.consulta.resposta;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.previc.dados.model.CadastrosPessoasFisicasSpcModel;

@XmlType(propOrder = {"csSexo","dtExpedicaoPassaporte","dtNascimento","idCadastroSpc","idPessoaFisica","nmMae","nmPessoaFisicaSpc","nuCpf","teEmail"})
public class ItemRespostaCadastrosPessoasFisicasSpc {

	private Integer csSexo;
	private Date dtExpedicaoPassaporte;
	private Date dtNascimento;
	private Integer idCadastroSpc;
	private Integer idPessoaFisica;
	private String nmMae;
	private String nmPessoaFisicaSpc;
	private BigDecimal nuCpf;
	private String teEmail;

	public ItemRespostaCadastrosPessoasFisicasSpc(CadastrosPessoasFisicasSpcModel r) {
		this.csSexo = r.getCsSexo();
		this.dtExpedicaoPassaporte = r.getDtExpedicaoPassaporte();
		this.dtNascimento = r.getDtNascimento();
		this.idCadastroSpc = r.getIdCadastroSpc();
		this.idPessoaFisica = r.getIdPessoaFisica();
		this.nmMae = r.getNmMae();
		this.nmPessoaFisicaSpc = r.getNmPessoaFisicaSpc();
		this.nuCpf = r.getNuCpf();
		this.teEmail = r.getTeEmail();
				
	}
	@XmlElement(name="CsSexo")
	public Integer getCsSexo() {
		return csSexo;
	}
	@XmlElement(name="DtExpedicaoPassaporte")
	public Date getDtExpedicaoPassaporte() {
		return dtExpedicaoPassaporte;
	}
	@XmlElement(name="DtNascimento")
	public Date getDtNascimento() {
		return dtNascimento;
	}
	@XmlElement(name="IdCadastroSpc")
	public Integer getIdCadastroSpc() {
		return idCadastroSpc;
	}
	@XmlElement(name="IdPessoaFisica")
	public Integer getIdPessoaFisica() {
		return idPessoaFisica;
	}
	@XmlElement(name="NmMae")
	public String getNmMae() {
		return nmMae;
	}
	@XmlElement(name="NmPessoaFisicaSpc")
	public String getNmPessoaFisicaSpc() {
		return nmPessoaFisicaSpc;
	}
	@XmlElement(name="NuCpf")
	public BigDecimal getNuCpf() {
		return nuCpf;
	}
	@XmlElement(name="TeEmail")
	public String getTeEmail() {
		return teEmail;
	}

	public void setCsSexo(Integer csSexo) {
		this.csSexo = csSexo;
	}

	public void setDtExpedicaoPassaporte(Date dtExpedicaoPassaporte) {
		this.dtExpedicaoPassaporte = dtExpedicaoPassaporte;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public void setIdCadastroSpc(Integer idCadastroSpc) {
		this.idCadastroSpc = idCadastroSpc;
	}

	public void setIdPessoaFisica(Integer idPessoaFisica) {
		this.idPessoaFisica = idPessoaFisica;
	}

	public void setNmMae(String nmMae) {
		this.nmMae = nmMae;
	}

	public void setNmPessoaFisicaSpc(String nmPessoaFisicaSpc) {
		this.nmPessoaFisicaSpc = nmPessoaFisicaSpc;
	}

	public void setNuCpf(BigDecimal nuCpf) {
		this.nuCpf = nuCpf;
	}

	public void setTeEmail(String teEmail) {
		this.teEmail = teEmail;
	}

}
