package br.com.alura.strategy.antes.business;

import br.com.alura.strategy.antes.enuns.TipoImposto;
import br.com.alura.strategy.antes.modelo.Orcamento;

public class CalculadoraDeImpostos {

	public static void realizaCalculo(Orcamento orcamento, TipoImposto imposto) {
		
		double valorImpostoCalculado = 0.0;
		
		if (imposto.equals(TipoImposto.ISS)) {
			valorImpostoCalculado = orcamento.getValor() * 0.02;
		} else if (imposto.equals(TipoImposto.ICMS)) {
			valorImpostoCalculado = orcamento.getValor() * 0.04;
		} else if (imposto.equals(TipoImposto.IPI)) {
			valorImpostoCalculado = orcamento.getValor() * 0.1;
		} else if (imposto.equals(TipoImposto.IPVA)) {
			valorImpostoCalculado = orcamento.getValor() * 0.07;
		} 
		
		System.out.println("Valor e tipo do imposto a pagar, respectivamente: " + valorImpostoCalculado + ", " + imposto);
		
	}
	
}
