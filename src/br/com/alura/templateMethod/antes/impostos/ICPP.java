package br.com.alura.templateMethod.antes.impostos;

import br.com.alura.templateMethod.antes.modelo.Orcamento;

public class ICPP implements Imposto {

	/* Repara que temos uma padrao.
	 * Dado um orcamento, podemos calcular o imposto com a maxima taxacao ou a minima
	 * O mesmo padrao pode surgir em outros tipos de impostos.
	 * Implementacao do templateMethod no package templateMethod.depois  
	 * 
	 */
	@Override
	public double calcular(Orcamento orcamento) {
		if (orcamento.getValor() > 500 && existeItensComValorSuperior50Reais(orcamento)) {
			return orcamento.getValor() * 0.1;
		}
		return orcamento.getValor() * 0.05;
	}

	private boolean existeItensComValorSuperior50Reais(Orcamento orcamento) {
		return orcamento.getItens().stream()
				.filter(i -> i.getValor() > 50.0)
				.findFirst().isPresent();
	}
}