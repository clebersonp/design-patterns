package br.com.alura.strategy.desafio.teste;

import br.com.alura.strategy.desafio.contrato.Arrojado;
import br.com.alura.strategy.desafio.contrato.Investimento;
import br.com.alura.strategy.desafio.modelo.ContaCorrente;

public class TesteInvestimento {

	public static void main(String[] args) {
		
		Investimento arrojado = new Arrojado();
		ContaCorrente conta = new ContaCorrente();
		
		conta.realizaDepostio(500.0);
		
		double lucroDoInvestimento = arrojado.realizarInvestimento(conta);
		
		imprimeDadosConta(conta, lucroDoInvestimento);
		
	}

	private static void imprimeDadosConta(ContaCorrente conta, double lucroDoInvestimento) {
		System.out.println("Saldo da conta: " + conta.getSaldo());
		System.out.println("Valor do investimento: " + lucroDoInvestimento);
		System.out.println("==================================================");
	}
	
}
