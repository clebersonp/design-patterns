package br.com.alura.templateMethod.depois.business;

import br.com.alura.templateMethod.depois.impostos.Imposto;
import br.com.alura.templateMethod.depois.modelo.Orcamento;

public class CalculadoraImposto {

	public double calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}