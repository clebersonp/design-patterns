package br.com.alura.chainOfResponsability.desafio.respostas;

import java.text.MessageFormat;

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
			System.out.println(this.recuperarXml(conta));
		} else if (this.hasProximaResposta()) {
			this.proximaResposta.responde(requisicao, conta);
		} else {
			throw new FormatoNaoEncontradoException("Formato de resposta nao encontrado");
		}
	}

	private String recuperarXml(Conta conta) {
		StringBuilder sb = new StringBuilder();
		sb.append("<conta>\n");
		sb.append("  <titular>").append("{0}").append("</titular>\n");
		sb.append("  <saldo>").append("{1}").append("</saldo>\n");
		sb.append("</conta>");
		
		return MessageFormat.format(sb.toString(), conta.getTitular(), conta.getSaldo());
	}

	@Override
	public boolean hasProximaResposta() {
		return this.proximaResposta != null;
	}

}
