package br.com.alura.strategy;

public class IKCV extends TemplateImpostoCondicional {

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500
				&& existeItemValorSuperiorA100(orcamento);
	}

	private boolean existeItemValorSuperiorA100(Orcamento orcamento) {
		return orcamento.getItems().stream()
			.mapToDouble(Item::getValor)
			.anyMatch(valor -> valor > 100.0);
	}

}
