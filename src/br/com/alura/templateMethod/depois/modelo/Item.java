package br.com.alura.templateMethod.depois.modelo;

public class Item {

	private String descricao;
	private double valor;

	public Item(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
