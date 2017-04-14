package br.com.alura.strategy.depois.segundaForma.business;

import br.com.alura.strategy.depois.segundaForma.enuns.TipoImposto;
import br.com.alura.strategy.depois.segundaForma.modelo.Orcamento;

public class Confins implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.11;
	}

	@Override
	public TipoImposto getTipoImposto() {
		return TipoImposto.CONFINS;
	}

	@Override
	public double getPercentual() {
		return 0.11;
	}

}
