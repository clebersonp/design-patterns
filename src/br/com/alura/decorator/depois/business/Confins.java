package br.com.alura.decorator.depois.business;

import br.com.alura.decorator.depois.enuns.TipoImposto;
import br.com.alura.decorator.depois.modelo.Orcamento;

public class Confins extends Imposto {

	public Confins() {}
	
	public Confins(Imposto proximoImposto) {
		super(proximoImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		// padrao Decorator, se houver proximo imposto entao calcula, senao devolve 0
		return orcamento.getValor() * 0.10 + calculaProximoImposto(orcamento);
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
