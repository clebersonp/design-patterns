package br.com.alura.strategy.antes.testes;

import br.com.alura.strategy.antes.business.CalculadoraDeImpostos;
import br.com.alura.strategy.antes.enuns.TipoImposto;
import br.com.alura.strategy.antes.modelo.Orcamento;

public class TesteCalculadorImpostos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadoraDeImpostos.realizaCalculo(orcamento, TipoImposto.ISS);
		CalculadoraDeImpostos.realizaCalculo(orcamento, TipoImposto.ICMS);
		CalculadoraDeImpostos.realizaCalculo(orcamento, TipoImposto.IPI);
		
		
		CalculadoraDeImpostos.realizaCalculo(orcamento, TipoImposto.IPVA);
	}
	
}
