package br.com.alura.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private double valor;

	private List<Item> items;
	
	public Orcamento(double valor) {
		this.valor = valor;
		this.items = new ArrayList<>();
	}
	
	public double getValor() {
		return valor;
	}

	public List<Item> getItems() {
		return Collections.unmodifiableList(this.items);
	}
	
	public void adicionaItem(Item item) {
		this.items.add(item);
	}

	public boolean existeItem(String nomeDoItem) {
		return items.stream()
				.anyMatch(i -> i.getNome().equalsIgnoreCase(nomeDoItem));
	}
}
