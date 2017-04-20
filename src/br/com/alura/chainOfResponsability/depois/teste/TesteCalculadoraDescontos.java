package br.com.alura.chainOfResponsability.depois.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.chainOfResponsability.depois.desconto.CalculadorDeDescontos;
import br.com.alura.chainOfResponsability.depois.modelo.Item;
import br.com.alura.chainOfResponsability.depois.modelo.Orcamento;

public class TesteCalculadoraDescontos {

	public static void main(String[] args) {
		
		List<Item> itens = new ArrayList<>();
//		itens.add(new Item("Caderno", 68.90));
//		itens.add(new Item("Mochila", 200.90));
		itens.add(new Item("Uniforme", 168.90));
		itens.add(new Item("Kit Higiene", 40.00));
		itens.add(new Item("Lapis", 12.90));
		itens.add(new Item("Caneta", 8.90));
		itens.add(new Item("Folha Sulfite", 80.00));
		
		Orcamento orcamento = new Orcamento(itens);
		
		CalculadorDeDescontos calculadora = new CalculadorDeDescontos();
		double desconto = calculadora.calcula(orcamento);
		
		System.out.println("Valor total sem desconto: " + orcamento.getValor() + ". Valor do desconto: " + desconto);
		
	}
	
}
