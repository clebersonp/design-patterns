package br.com.alura.chainOfResponsability.antes.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private final List<Item> itens;
	
	public Orcamento(){
		this.itens = new ArrayList<>();
	}
	
	public Orcamento(final List<Item> itens) {
		this.itens = itens;
	}
	
	public double getValor() {
		double valor = 0;
		if (!itens.isEmpty()) {
			valor = this.itens.stream().mapToDouble(i -> i.getValor()).sum();
		}
		return valor;
	}
	
	public void adicionaItem(final Item item) {
		this.itens.add(item);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(this.itens);
	}
}
