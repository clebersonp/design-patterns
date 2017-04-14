package br.com.alura.strategy.depois.segundaForma.business;

import br.com.alura.strategy.depois.segundaForma.enuns.TipoImposto;
import br.com.alura.strategy.depois.segundaForma.modelo.Orcamento;

public class IPI implements Imposto {

	private static final double PERCENTUAL = 0.1;

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * PERCENTUAL;
	}

	@Override
	public TipoImposto getTipoImposto() {
		return TipoImposto.IPI;
	}

	@Override
	public double getPercentual() {
		return PERCENTUAL;
	}

}
