package br.com.alura.templateMethod.depois.impostos;

import br.com.alura.templateMethod.depois.modelo.Orcamento;

public class IKCP extends TemplateImpostoTaxacao {
	
	@Override
	public boolean deveAplicarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500.0;
	}

	@Override
	public double maximaTaxacao() {
		return 0.05;
	}

	@Override
	public double minimaTaxacao() {
		return 0.09;
	}
}