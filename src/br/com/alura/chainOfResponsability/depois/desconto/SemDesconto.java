package br.com.alura.chainOfResponsability.depois.desconto;

import br.com.alura.chainOfResponsability.depois.modelo.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double calcula(Orcamento orcamento) {
		// metodo de finalizacao. Acaba com o encadeamento de chamadas pois nao seta o proximo da cadeia de descontos.
		return 0;
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
		// nao tem proximo
	}
}