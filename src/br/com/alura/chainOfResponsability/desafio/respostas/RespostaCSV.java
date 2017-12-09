package br.com.alura.chainOfResponsability.desafio.respostas;

import br.com.alura.chainOfResponsability.desafio.enumeration.Formato;
import br.com.alura.chainOfResponsability.desafio.exception.FormatoNaoEncontradoException;
import br.com.alura.chainOfResponsability.desafio.interfaces.Resposta;
import br.com.alura.chainOfResponsability.desafio.modelo.Conta;
import br.com.alura.chainOfResponsability.desafio.modelo.Requisicao;

public class RespostaCSV implements Resposta {

	private Resposta proximaResposta;

	public RespostaCSV(Resposta proximaResposta) {
		this.proximaResposta = proximaResposta;
	}
	
	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if (Formato.CSV.equals(requisicao.getFormato())) {
			System.out.println(conta.getTitular() + ";" + conta.getSaldo());
		} else if (this.hasProximaResposta()) {
			this.proximaResposta.responde(requisicao, conta);
		} else {
			throw new FormatoNaoEncontradoException("Formato de resposta nao encontrado");
		}
	}

	@Override
	public boolean hasProximaResposta() {
		return this.proximaResposta != null;
	}
}
