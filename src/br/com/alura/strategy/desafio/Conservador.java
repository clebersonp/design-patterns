package br.com.alura.strategy.desafio;

public class Conservador implements Investimento {

	@Override
	public double invista(Conta conta) {
		return conta.getSaldo() * 0.008;
	}

}
