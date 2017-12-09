package br.com.alura.templateMethod.antes.teste;

import br.com.alura.templateMethod.antes.business.CalculadoraImposto;
import br.com.alura.templateMethod.antes.impostos.Confins;
import br.com.alura.templateMethod.antes.impostos.ICMS;
import br.com.alura.templateMethod.antes.impostos.ICPP;
import br.com.alura.templateMethod.antes.impostos.IKCP;
import br.com.alura.templateMethod.antes.impostos.Imposto;
import br.com.alura.templateMethod.antes.modelo.Item;
import br.com.alura.templateMethod.antes.modelo.Orcamento;

public class TesteCalculadoraImposto {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento();
		orcamento.adicionar(new Item("Caderno", 80.0));
		orcamento.adicionar(new Item("Mochila", 200.0));
		orcamento.adicionar(new Item("Folha Sulfite", 150.0));
		
		Imposto confins = new Confins();
		Imposto icms = new ICMS();
		Imposto icpp = new ICPP();
		Imposto ikcp = new IKCP();
		
		CalculadoraImposto calculadora = new CalculadoraImposto();
		double impostoConfins = calculadora.calcular(orcamento, confins);
		double impostoICMS = calculadora.calcular(orcamento, icms);
		double impostoICPP = calculadora.calcular(orcamento, icpp);
		double impostoIKCP = calculadora.calcular(orcamento, ikcp);
		
		System.out.println("Imposto confins: " + impostoConfins);
		System.out.println("Imposto icms: " + impostoICMS);
		System.out.println("Imposto icpp: " + impostoICPP);
		System.out.println("Imposto ikcp: " + impostoIKCP);
	}
}