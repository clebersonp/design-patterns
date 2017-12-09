package br.com.alura.templateMethod.antes.impostos;

import br.com.alura.templateMethod.antes.modelo.Orcamento;

public class Confins implements Imposto {

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.11;
	}
}