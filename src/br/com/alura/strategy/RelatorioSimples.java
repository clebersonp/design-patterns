package br.com.alura.strategy;

import java.util.List;

import br.com.alura.strategy.desafio.Conta;

public class RelatorioSimples extends ImprimeRelatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco Natural");
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println("Titular: " + conta.getTitular() + ", saldo: " + conta.getSaldo());
		}
	}

	@Override
	protected void rodape() {
		System.out.println("55 (11) 4468-7765");
	}

	
}
