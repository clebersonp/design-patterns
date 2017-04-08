package br.com.alura.strategy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import br.com.alura.strategy.desafio.Conta;

public class RelatorioComplexo extends ImprimeRelatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco Estado");
		System.out.println("Rua Dr. Francisco do Amaral, 8556");
		System.out.println("55 (11) 44658-9562");
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println("Titular: " + conta.getTitular() 
				+ ", numero: " + conta.getNumero() + ", agencia: " + conta.getAgencia()
				+ ", saldo: " + conta.getSaldo());
		}
	}

	@Override
	protected void rodape() {
		System.out.println("banco.estado@estado.com.br");
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime()));
	}

}
