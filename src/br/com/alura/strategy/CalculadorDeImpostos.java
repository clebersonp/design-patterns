package br.com.alura.strategy;

public class CalculadorDeImpostos {

	public double calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcula(orcamento);
	}
}
