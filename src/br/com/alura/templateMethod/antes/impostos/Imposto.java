package br.com.alura.templateMethod.antes.impostos;

import br.com.alura.templateMethod.antes.modelo.Orcamento;

public interface Imposto {

	double calcular(Orcamento orcamento);
	
}
