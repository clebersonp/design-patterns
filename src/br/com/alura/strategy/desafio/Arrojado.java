package br.com.alura.strategy.desafio;

import java.util.Random;

public class Arrojado implements Investimento {

	@Override
	public double invista(Conta conta) {
		double saldo = conta.getSaldo();
		Random random = new Random();
		if (random.nextDouble() > 0.49) {
			return saldo * 0.006;
		}
		if (random.nextDouble() > 0.29) {
			return saldo * 0.03;
		} else {
			return saldo * 0.05;
		}
		
	}

}
