package br.com.alura.strategy.depois.segundaForma.business;

import br.com.alura.strategy.depois.segundaForma.enuns.TipoImposto;
import br.com.alura.strategy.depois.segundaForma.modelo.Orcamento;

public class IPVA implements Imposto {

	private static final double PERCENTUAL = 0.09;
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * PERCENTUAL;
	}

	@Override
	public TipoImposto getTipoImposto() {
		return TipoImposto.IPVA;
	}

	@Override
	public double getPercentual() {
		return PERCENTUAL;
	}
	
}
