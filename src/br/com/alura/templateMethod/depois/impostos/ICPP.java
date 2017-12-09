package br.com.alura.templateMethod.depois.impostos;

import br.com.alura.templateMethod.depois.modelo.Orcamento;

public class ICPP extends TemplateImpostoTaxacao {

	/* Repara que temos uma padrao.
	 * Dado um orcamento, podemos calcular o imposto com a maxima taxacao ou a minima
	 * O mesmo padrao pode surgir em outros tipos de impostos.
	 * Pois isso implemenatamos o templateMethod, para que todos os impostos com as mesmas
	 * caracteristicas tenham os mesmos metodos 
	 * A classe passa a extender a class abstrata TemplateImpostoTaxacao ao invez de implementar
	 * diretamento a interface Imposto, justamento para implementar os metodos template da superclasse
	 * 
	 */
	private boolean existeItensComValorSuperior50Reais(Orcamento orcamento) {
		return orcamento.getItens().stream()
				.filter(i -> i.getValor() > 50.0)
				.findFirst().isPresent();
	}

	@Override
	public boolean deveAplicarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && existeItensComValorSuperior50Reais(orcamento);
	}

	@Override
	public double maximaTaxacao() {
		return 0.05;
	}

	@Override
	public double minimaTaxacao() {
		return 0.1;
	}
}