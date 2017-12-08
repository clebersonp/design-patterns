package br.com.alura.chainOfResponsability.depois.desconto;

import br.com.alura.chainOfResponsability.depois.modelo.Orcamento;

public class SemDesconto implements Desconto {

	private Desconto proximoDesconto;

	@Override
	public double calcula(Orcamento orcamento) {
		// metodo de finalizacao. Acaba com o encadeamento de chamadas pois nao seta o proximo da cadeia de descontos.
		if (hasProximoDesconto()) {
			return this.proximoDesconto.calcula(orcamento);
		}
		return 0;
	}

	@Override
	public void setProximoDesconto(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}

	@Override
	public boolean hasProximoDesconto() {
		return this.proximoDesconto != null;
	}
}