package br.com.alura.chainOfResponsability.depois.desconto;

import br.com.alura.chainOfResponsability.depois.modelo.Orcamento;

public class DescontoParaMaisDeQuinhentosReais implements Desconto {

	private Desconto proximoDesconto;

	@Override
	public double calcula(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.05;
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