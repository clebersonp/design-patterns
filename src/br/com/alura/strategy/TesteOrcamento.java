package br.com.alura.strategy;

import java.util.Random;

public class TesteOrcamento {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(500.0);
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		Imposto iccc = new ICCC();
		
		System.out.println(calculador.calcular(orcamento, iss));
		System.out.println(calculador.calcular(orcamento, icms));
		System.out.println(calculador.calcular(orcamento, iccc));
		
		System.out.println(new Random().nextInt(2));
		
		
	}
	
}
