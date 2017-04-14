package br.com.alura.strategy.desafio.contrato;

import java.util.Random;

import br.com.alura.strategy.desafio.modelo.ContaCorrente;

public class Arrojado implements Investimento {

	private static final Double PERCENTUAL_LUCRO = 0.75;
	private static final Double MELHOR_CHANCE = 0.05;
	private static final Double MEDIA_CHANCE = 0.03;
	private static final Double PIOR_CHANCE = 0.006;
	
	@Override
	public double realizarInvestimento(ContaCorrente conta) {

		double chance = new Random().nextDouble();
		double lucro = 0;
		
		if (chance >= 0.5) {
			lucro = conta.getSaldo() * PIOR_CHANCE;
		} else if (chance >= 0.3) {
			lucro = conta.getSaldo() * MEDIA_CHANCE;
		} else {
			lucro = conta.getSaldo() * MELHOR_CHANCE;
		}
		
		lucro = lucro * PERCENTUAL_LUCRO;
		conta.realizaDepostio(lucro);
		
		return lucro;
	}

}
