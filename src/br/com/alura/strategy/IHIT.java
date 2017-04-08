package br.com.alura.strategy;

import java.util.stream.Collectors;

public class IHIT extends TemplateImpostoCondicional {

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.01) * orcamento.getItems().size();
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100.0;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return existeDoisItensComMesmoNome(orcamento);
	}

	private boolean existeDoisItensComMesmoNome(Orcamento orcamento) {
		return orcamento.getItems().stream()
				.collect(Collectors.groupingBy(Item::getNome))
				.values().stream()
				.anyMatch(i -> i.size() > 1);
	}

}
