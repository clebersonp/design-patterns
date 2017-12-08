package br.com.alura.chainOfResponsability.depois.desconto;

import br.com.alura.chainOfResponsability.depois.modelo.Orcamento;

public class CalculadorDeDescontos {

	public double calcula(Orcamento orcamento) {
		
		// define as regras de desconto
		Desconto d1 = new DescontoParaMaisDeCincoItens();
		Desconto d2 = new DescontoParaMaisDeQuinhentosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();
		
		// define a cadeia e a ordem de descontos
		d1.setProximoDesconto(d2);
		d2.setProximoDesconto(d3);
		d3.setProximoDesconto(d4);
		
		// inicia a chamada em cadeia
		return d1.calcula(orcamento);
		
	}
	
}
