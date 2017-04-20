package br.com.alura.chainOfResponsability.antes.desconto;

import br.com.alura.chainOfResponsability.antes.modelo.Orcamento;

public class CalculadorDeDescontos {

	public double calcula(Orcamento orcamento) {
		double desconto = 0;
		
		if (orcamento.getItens().size() > 5) {
			desconto = orcamento.getValor() * 0.1;
		}
		
		if (orcamento.getValor() > 450.0) {
			desconto = orcamento.getValor() * 0.05;
		}
		
		return desconto;
	}
	
}
