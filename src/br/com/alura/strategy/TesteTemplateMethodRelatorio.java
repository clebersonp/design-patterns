package br.com.alura.strategy;

import java.util.Arrays;
import java.util.List;

import br.com.alura.strategy.desafio.Conta;

public class TesteTemplateMethodRelatorio {

	public static void main(String[] args) {
		
		List<Conta> contas = criaContas();
		
		ImprimeRelatorio simples = new RelatorioSimples();
		ImprimeRelatorio complexo = new RelatorioComplexo();
		
		simples.imprime(contas);
		System.out.println("\n===============================================\n");
		complexo.imprime(contas);
	}

	private static List<Conta> criaContas() {

		Conta c1 = new Conta("Adriano", 50.0);
		c1.setAgencia("0976");
		c1.setNumero("852");
		
		Conta c2 = new Conta("Felipe", 75.0);
		c2.setAgencia("8465");
		c2.setNumero("465");
		
		Conta c3 = new Conta("Ricardo", 5000.0);
		c3.setAgencia("4132");
		c3.setNumero("832");
		
		return Arrays.asList(c1, c2, c3);
	}
}
