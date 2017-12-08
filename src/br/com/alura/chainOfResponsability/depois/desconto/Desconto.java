package br.com.alura.chainOfResponsability.depois.desconto;

import br.com.alura.chainOfResponsability.depois.modelo.Orcamento;

public interface Desconto {

	public double calcula(Orcamento orcamento);
	public void setProximoDesconto(Desconto desconto);
	public boolean hasProximoDesconto();
	
}
