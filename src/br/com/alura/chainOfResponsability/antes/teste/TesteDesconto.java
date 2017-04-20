package br.com.alura.chainOfResponsability.antes.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.chainOfResponsability.antes.desconto.CalculadorDeDescontos;
import br.com.alura.chainOfResponsability.antes.modelo.Item;
import br.com.alura.chainOfResponsability.antes.modelo.Orcamento;

public class TesteDesconto {

	public static void main(String[] args) {
		
		List<Item> itens = new ArrayList<>();
		itens.add(new Item("Caderno", 50.80));
		itens.add(new Item("Lapis", 12.40));
		itens.add(new Item("Apontador", 8.65));
		itens.add(new Item("Borracha", 4.90));
		itens.add(new Item("Mochila", 150.00));
		itens.add(new Item("Tenis", 200.00));

		Orcamento orcamento = new Orcamento(itens);
		
		CalculadorDeDescontos calculadora = new CalculadorDeDescontos();
		
		double desconto = calculadora.calcula(orcamento);
		
		System.out.println("O valor total foi de: " + orcamento.getValor() + ". O valor do desconto foi de: " + desconto);
		
		
		
		
	}
	
}
