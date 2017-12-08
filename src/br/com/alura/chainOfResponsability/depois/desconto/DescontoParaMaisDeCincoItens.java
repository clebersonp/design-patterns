package br.com.alura.chainOfResponsability.depois.desconto;

import br.com.alura.chainOfResponsability.depois.modelo.Orcamento;

public class DescontoParaMaisDeCincoItens implements Desconto {

	private Desconto proximoDesconto;

	@Override
	public double calcula(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}
		if (hasProximoDesconto()) {
			return this.proximoDesconto.calcula(orcamento);
		}
		return 0;
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
		this.proximoDesconto = desconto;
	}

	@Override
	public boolean hasProximoDesconto() {
		return this.proximoDesconto != null;
	}
}