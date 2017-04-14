package br.com.alura.strategy.desafio.contrato;

import br.com.alura.strategy.desafio.modelo.ContaCorrente;

public interface Investimento {

	public double realizarInvestimento(ContaCorrente conta);
	
}
