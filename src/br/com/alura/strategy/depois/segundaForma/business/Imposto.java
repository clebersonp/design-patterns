package br.com.alura.strategy.depois.segundaForma.business;

import br.com.alura.strategy.depois.segundaForma.enuns.TipoImposto;
import br.com.alura.strategy.depois.segundaForma.modelo.Orcamento;

public interface Imposto {

	public double calcula(Orcamento orcamento);
	public TipoImposto getTipoImposto();
	public double getPercentual();
	
}
