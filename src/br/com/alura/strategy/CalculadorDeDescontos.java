package br.com.alura.strategy;

public class CalculadorDeDescontos {

	public double calcula(Orcamento orcamento) {
		
		Desconto d1 = new DescontoParaMaisDeCincoItens();
		Desconto d2 = new DescontoParaValorAcimaDeQuinhentosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();
		
		d1.setProximoDesconto(d2);
		d2.setProximoDesconto(d3);
		d3.setProximoDesconto(d4);
		
		return d1.desconta(orcamento);
	}
	
}
