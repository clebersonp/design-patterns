package br.com.alura.strategy.depois.segundaForma.business;

import br.com.alura.strategy.depois.segundaForma.modelo.Orcamento;

public class CalculadoraDeImpostosComInterface {

	public double realizaCalculo(Orcamento orcamento, Imposto imposto) {
		return imposto.calcula(orcamento);
	}
}
