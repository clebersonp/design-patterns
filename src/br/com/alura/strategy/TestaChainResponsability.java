package br.com.alura.strategy;

public class TestaChainResponsability {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adicionaItem(new Item("Lapis", 250.0));
		orcamento.adicionaItem(new Item("Caneta", 250.0));
		
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		double desconto = calculador.calcula(orcamento);
		
		System.out.println(desconto);
		
	}
	
}
