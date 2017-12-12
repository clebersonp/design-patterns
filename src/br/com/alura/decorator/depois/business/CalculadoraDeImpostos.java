package br.com.alura.decorator.depois.business;

import br.com.alura.decorator.depois.modelo.Orcamento;

public class CalculadoraDeImpostos {

	public double realizaCalculo(Orcamento orcamento, Imposto imposto) {
		return imposto.calcula(orcamento);
	}
}
