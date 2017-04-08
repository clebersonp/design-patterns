package br.com.alura.strategy;

import java.util.List;

import br.com.alura.strategy.desafio.Conta;

public abstract class ImprimeRelatorio implements Relatorio {

	@Override
	public void imprime(List<Conta> contas) {
		cabecalho();
		corpo(contas);
		rodape();
	}

	protected abstract void cabecalho();

	protected abstract void corpo(List<Conta> contas);

	protected abstract void rodape();

}
