package br.com.alura.chainOfResponsability.desafio.respostas;

import br.com.alura.chainOfResponsability.desafio.enumeration.Formato;
import br.com.alura.chainOfResponsability.desafio.exception.FormatoNaoEncontradoException;
import br.com.alura.chainOfResponsability.desafio.interfaces.Resposta;
import br.com.alura.chainOfResponsability.desafio.modelo.Conta;
import br.com.alura.chainOfResponsability.desafio.modelo.Requisicao;

public class RespostaJSON implements Resposta {

	private Resposta proximaResposta;
	
	public RespostaJSON(Resposta proximaResposta) {
		this.proximaResposta = proximaResposta;
	}
	
	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if (Formato.JSON.equals(requisicao.getFormato())) {
			System.out.println(this.recuperarJSON(conta));
		} else if (this.hasProximaResposta()) {
			this.proximaResposta.responde(requisicao, conta);
		} else {
			throw new FormatoNaoEncontradoException("Formato da requisicao nao encontrada!");
		}
	}

	@Override
	public boolean hasProximaResposta() {
		return this.proximaResposta != null;
	}
	
	public String recuperarJSON(Conta conta) {
		StringBuilder sb = new StringBuilder();
		sb.append("{\n");
		sb.append("  \"titular\":").append("\"").append(conta.getTitular()).append("\",\n");
		sb.append("  \"saldo\":").append("\"").append(conta.getSaldo()).append("\"\n");
		sb.append("}");
		
		return sb.toString();
	}
}