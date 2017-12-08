package br.com.alura.strategy.depois.segundaForma.testes;

import br.com.alura.strategy.depois.segundaForma.business.CalculadoraDeImpostosComInterface;
import br.com.alura.strategy.depois.segundaForma.business.Confins;
import br.com.alura.strategy.depois.segundaForma.business.ICMS;
import br.com.alura.strategy.depois.segundaForma.business.IPI;
import br.com.alura.strategy.depois.segundaForma.business.IPVA;
import br.com.alura.strategy.depois.segundaForma.business.ISS;
import br.com.alura.strategy.depois.segundaForma.business.Imposto;
import br.com.alura.strategy.depois.segundaForma.modelo.Orcamento;

public class TesteCalculadoraImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500.0);
		
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto ipi = new IPI();
		Imposto confins = new Confins();
		Imposto ipva = new IPVA();
		
		CalculadoraDeImpostosComInterface calculadora = new CalculadoraDeImpostosComInterface();
		
		// estou passando a estrategia de calculo para a calculadora
		double valorIss = calculadora.realizaCalculo(orcamento, iss);
		double valorIcms = calculadora.realizaCalculo(orcamento, icms);
		double valorIpi = calculadora.realizaCalculo(orcamento, ipi);
		double valorConfins = calculadora.realizaCalculo(orcamento, confins);
		double valorIpva = calculadora.realizaCalculo(orcamento, ipva);
		
		imprimeDetalhesImposto(orcamento, iss, valorIss);
		imprimeDetalhesImposto(orcamento, icms, valorIcms);
		imprimeDetalhesImposto(orcamento, ipi, valorIpi);
		imprimeDetalhesImposto(orcamento, confins, valorConfins);
		imprimeDetalhesImposto(orcamento, ipva, valorIpva);
	}

	private static void imprimeDetalhesImposto(Orcamento orcamento, Imposto imposto, double valorImposto) {
		System.out.println("Valor do Orcamento: R$" + orcamento.getValor());
		System.out.println("Tipo do Imposto a pagar: " + imposto.getTipoImposto());
		System.out.println("Percentual do imposto: " + imposto.getPercentual() * 100 + "%");
		System.out.println("Valor do imposto a pagar: R$" + valorImposto);
		System.out.println("====================================\n");
	}
	
}
