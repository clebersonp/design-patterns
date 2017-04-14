package br.com.alura.strategy.depois.primeiraForma.business;

import br.com.alura.strategy.depois.primeiraForma.enuns.TipoImposto;
import br.com.alura.strategy.depois.primeiraForma.modelo.Orcamento;

public class CalculadoraDeImpostosSemInterface {

	public static double realizaCalculo(Orcamento orcamento, TipoImposto imposto) {
		return orcamento.getValor() * imposto.getPercentual();
	}
}
