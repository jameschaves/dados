package br.gov.previc.dados.consulta.resposta;

import javax.xml.bind.annotation.XmlSeeAlso;

@XmlSeeAlso({
	ItemRespostaCadastrosPessoasFisicasSpc.class, 
    ItemRespostaEfpcs.class, 
    ItemRespostaGestoesPlano.class, 
    ItemRespostaHistoricosCaptacao.class, 
    ItemRespostaLancamentosPlano.class, 
    ItemRespostaPessoasJuridicasSpc.class, 
    ItemRespostaPlanosBeneficios.class, 
    ItemRespostaSituacoesPlano.class,
    ItemRespostaDirigentes.class,
    ItemRespostaHabilitacoesAnexo.class,
    ItemRespostaTipoFuncaoDirigentes.class
})
public class ItemResposta {
	public ItemResposta() {
		
	}
}
