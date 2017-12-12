package br.com.alura.decorator.depois.business;

import br.com.alura.decorator.depois.enuns.TipoImposto;
import br.com.alura.decorator.depois.modelo.Orcamento;

public class IPI extends Imposto {

	private static final double PERCENTUAL = 0.03;

	public IPI() {}
	
	public IPI(Imposto proximoImposto) {
		super(proximoImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * PERCENTUAL + calculaProximoImposto(orcamento);
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
