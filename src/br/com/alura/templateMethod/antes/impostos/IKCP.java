package br.com.alura.templateMethod.antes.impostos;

import br.com.alura.templateMethod.antes.modelo.Orcamento;

public class IKCP implements Imposto {
	
	/* Repara que temos uma padrao.
	 * Dado um orcamento, podemos calcular o imposto com a maxima taxacao ou a minima
	 * O mesmo padrao pode surgir em outros tipos de impostos.
	 * Implementacao do templateMethod no package templateMethod.depois  
	 * 
	 */
	@Override
	public double calcular(Orcamento orcamento) {
		if (orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.05;
		}
		return orcamento.getValor() * 0.09;
	}
}