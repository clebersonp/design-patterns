package br.com.alura.templateMethod.depois.impostos;

import br.com.alura.templateMethod.depois.modelo.Orcamento;

public abstract class TemplateImpostoTaxacao implements Imposto {

	@Override
	public double calcular(Orcamento orcamento) {
		if (deveAplicarMaximaTaxacao(orcamento)) {
			return orcamento.getValor() * maximaTaxacao();
		}
		return orcamento.getValor() * minimaTaxacao();
	}
	
	public abstract boolean deveAplicarMaximaTaxacao(Orcamento orcamento);
	public abstract double maximaTaxacao();
	public abstract double minimaTaxacao();
}