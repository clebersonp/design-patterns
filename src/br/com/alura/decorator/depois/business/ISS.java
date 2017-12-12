package br.com.alura.decorator.depois.business;

import br.com.alura.decorator.depois.enuns.TipoImposto;
import br.com.alura.decorator.depois.modelo.Orcamento;

public class ISS extends Imposto {

	private static final double PERCENTUAL = 0.02;

	public ISS() {}
	
	public ISS(Imposto proximoImposto) {
		super(proximoImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * PERCENTUAL + calculaProximoImposto(orcamento);
	}

	@Override
	public TipoImposto getTipoImposto() {
		return TipoImposto.ISS;
	}

	@Override
	public double getPercentual() {
		return PERCENTUAL;
	}

}
