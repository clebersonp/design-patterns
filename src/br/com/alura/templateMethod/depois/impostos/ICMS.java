package br.com.alura.templateMethod.depois.impostos;

import br.com.alura.templateMethod.depois.modelo.Orcamento;

public class ICMS implements Imposto {

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.7;
	}
}