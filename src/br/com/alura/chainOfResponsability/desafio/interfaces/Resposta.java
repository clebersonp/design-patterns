package br.com.alura.chainOfResponsability.desafio.interfaces;

import br.com.alura.chainOfResponsability.desafio.modelo.Conta;
import br.com.alura.chainOfResponsability.desafio.modelo.Requisicao;

public interface Resposta {

	public void responde(Requisicao requisicao, Conta conta);
	
}
