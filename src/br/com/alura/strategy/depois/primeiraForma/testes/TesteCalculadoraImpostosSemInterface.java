package br.com.alura.strategy.depois.primeiraForma.testes;

import br.com.alura.strategy.depois.primeiraForma.business.CalculadoraDeImpostosSemInterface;
import br.com.alura.strategy.depois.primeiraForma.enuns.TipoImposto;
import br.com.alura.strategy.depois.primeiraForma.modelo.Orcamento;

public class TesteCalculadoraImpostosSemInterface {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(500.0);
		
		TipoImposto icms = TipoImposto.ICMS;
		TipoImposto iss = TipoImposto.ISS;
		
		double icmsPagar = CalculadoraDeImpostosSemInterface.realizaCalculo(orcamento, TipoImposto.ICMS);
		
		double issPagar = CalculadoraDeImpostosSemInterface.realizaCalculo(orcamento, TipoImposto.ISS);
		
		imprimeImpostoCalculado(orcamento, icms, icmsPagar);
		imprimeImpostoCalculado(orcamento, iss, issPagar);
	}

	private static void imprimeImpostoCalculado(Orcamento orcamento, TipoImposto imposto, double icmsPagar) {
		System.out.println("Tipo, percentual e valor do imposto à pagar, respectivamente: " 
				+ imposto + ", " + imposto.getPercentual() * 100 + "%, R$" + icmsPagar 
				+ " de R$" + orcamento.getValor());
	}
	
}
