package br.com.alura.chainOfResponsability.desafio.respostas;

import br.com.alura.chainOfResponsability.desafio.enumeration.Formato;
import br.com.alura.chainOfResponsability.desafio.exception.FormatoNaoEncontradoException;
import br.com.alura.chainOfResponsability.desafio.interfaces.Resposta;
import br.com.alura.chainOfResponsability.desafio.modelo.Conta;
import br.com.alura.chainOfResponsability.desafio.modelo.Requisicao;

public class RespostaXML implements Resposta {

	private Resposta proximaResposta;

	public RespostaXML(Resposta proximaResposta) {
		this.proximaResposta = proximaResposta;
	}
	
	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if (Formato.XML.equals(requisicao.getFormato())) {
			System.out.println("<conta><titular>" 
					+ conta.getTitular() + "</titular><saldo>" 
					+ conta.getSaldo() + "</saldo></conta>");
		} else if (this.proximaResposta != null) {
			this.proximaResposta.responde(requisicao, conta);
		} else {
			throw new FormatoNaoEncontradoException("Formato de resposta não encontrado");
		}
	}

}
