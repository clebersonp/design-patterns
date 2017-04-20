package br.com.alura.chainOfResponsability.depois.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private final List<Item> itens;
	
	public Orcamento() {
		this.itens = new ArrayList<>();
	}
	
	public Orcamento(List<Item> itens) {
		this.itens = itens;
	}
	
	public double getValor() {
		double valor = 0;
		
		if (!this.itens.isEmpty()) {
			valor = this.itens.stream().mapToDouble(i -> i.getValor()).sum();
		}
		
		return valor;
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(this.itens);
	}
	
}
