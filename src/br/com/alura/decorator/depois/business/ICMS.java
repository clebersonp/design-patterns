package br.com.alura.decorator.depois.business;

import br.com.alura.decorator.depois.enuns.TipoImposto;
import br.com.alura.decorator.depois.modelo.Orcamento;

public class ICMS extends Imposto {

	private static final double PERCENTUAL = 0.04;
	
	public ICMS() {}
	
	public ICMS(Imposto proximoImposto) {
		super(proximoImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * PERCENTUAL + calculaProximoImposto(orcamento);
	}

	@Override
	public TipoImposto getTipoImposto() {
		return TipoImposto.ICMS;
	}

	@Override
	public double getPercentual() {
		return PERCENTUAL;
	}
}