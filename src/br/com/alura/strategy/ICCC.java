package br.com.alura.strategy;

public class ICCC implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		double valor = orcamento.getValor();
		if (valor < 1_000) {
			return valor * 0.05;
		}
		if (valor <= 3_000) {
			return valor * 0.07;
		}
		if (valor > 3_000) {
			return valor * 0.08 + 30.0;
		}
		return valor;
	}

}
