package br.com.alura.strategy.desafio.contrato;

import java.util.Random;

import br.com.alura.strategy.desafio.modelo.ContaCorrente;

public class Moderado implements Investimento {

	private static final Double MELHOR_CHANCE = 0.025;
	private static final Double PIOR_CHANCE = 0.007;
	private static final Double PERCENTUAL_LUCRO = 0.75;
	
	@Override
	public double realizarInvestimento(ContaCorrente conta) {
		int chance = new Random().nextInt(2);
		double lucro = 0;
		if (chance == 0) {
			lucro = conta.getSaldo() * PIOR_CHANCE;
		} else {
			lucro = conta.getSaldo() * MELHOR_CHANCE;
		}
		
		lucro = lucro * PERCENTUAL_LUCRO;
		
		conta.realizaDepostio(lucro);
		
		return lucro;
	}

}
