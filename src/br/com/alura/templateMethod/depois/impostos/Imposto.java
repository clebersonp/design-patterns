package br.com.alura.templateMethod.depois.impostos;

import br.com.alura.templateMethod.depois.modelo.Orcamento;

public interface Imposto {

	double calcular(Orcamento orcamento);
	
}
