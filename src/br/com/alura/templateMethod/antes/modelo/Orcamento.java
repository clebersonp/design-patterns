package br.com.alura.templateMethod.antes.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private List<Item> itens = new ArrayList<>();
	
	public double getValor() {
		return this.itens.stream().mapToDouble(i -> i.getValor()).sum();
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public void adicionar(Item item) {
		this.itens.add(item);
	}
	
}
