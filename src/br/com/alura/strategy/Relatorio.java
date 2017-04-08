package br.com.alura.strategy;

import java.util.List;

import br.com.alura.strategy.desafio.Conta;

public interface Relatorio {
	public void imprime(List<Conta> contas);
}
