package br.com.alura.strategy.desafio;

import java.util.Random;

public class Moderado implements Investimento {

	@Override
	public double invista(Conta conta) {
		double saldo = conta.getSaldo();
		int random = new Random().nextInt(2);
		
		if (random == 0) {
			return saldo * 0.025;
		} else {
			return saldo * 0.007;
		}
	}

	
	
}
