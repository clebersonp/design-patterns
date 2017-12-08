package br.com.alura.chainOfResponsability.depois.desconto;

import br.com.alura.chainOfResponsability.depois.modelo.Orcamento;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximoDesconto;

	@Override
	public double calcula(Orcamento orcamento) {
		if (this.existe("lapis", orcamento) 
				&& existe("caneta", orcamento)) {
			return orcamento.getValor() * 0.05;
		}
		return proximoDesconto.calcula(orcamento);
	}

	private boolean existe(String produto, Orcamento orcamento) {
		return orcamento.getItens().stream()
							.filter(i -> i.getNome().equalsIgnoreCase(produto))
							.findFirst().isPresent();
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
		this.proximoDesconto = desconto;
	}
}