package br.com.alura.strategy.desafio.contrato;

import br.com.alura.strategy.desafio.modelo.ContaCorrente;

public class Conservador implements Investimento {

	private static final Double PERCENTUAL_LUCRO = 0.75;
	private static final Double PERCENTUAL_INVESTIMENTO = 0.008;
	
	@Override
	public double realizarInvestimento(ContaCorrente conta) {
		double lucro = conta.getSaldo() * PERCENTUAL_INVESTIMENTO;
		lucro = lucro * PERCENTUAL_LUCRO;
		conta.realizaDepostio(lucro);
		
		return lucro;
	}

	
	
}
