package br.com.alura.templateMethod.antes.business;

import br.com.alura.templateMethod.antes.impostos.Imposto;
import br.com.alura.templateMethod.antes.modelo.Orcamento;

public class CalculadoraImposto {

	public double calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}