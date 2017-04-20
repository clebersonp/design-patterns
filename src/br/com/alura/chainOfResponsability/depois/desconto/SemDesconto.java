package br.com.alura.chainOfResponsability.depois.desconto;

import br.com.alura.chainOfResponsability.depois.modelo.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double calcula(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
		
	}

}
