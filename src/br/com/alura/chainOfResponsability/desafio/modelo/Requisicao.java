package br.com.alura.chainOfResponsability.desafio.modelo;

import br.com.alura.chainOfResponsability.desafio.enumeration.Formato;

public class Requisicao {

	private Formato formato;

	public Requisicao(Formato formato) {
		this.formato = formato;
	}

	public Formato getFormato() {
		return formato;
	}
}
