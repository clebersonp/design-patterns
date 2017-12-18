package br.com.alura.decorator.depois.testes;

import br.com.alura.decorator.depois.business.CalculadoraDeImpostos;
import br.com.alura.decorator.depois.business.Confins;
import br.com.alura.decorator.depois.business.ICMS;
import br.com.alura.decorator.depois.business.ICPP;
import br.com.alura.decorator.depois.business.IKCV;
import br.com.alura.decorator.depois.business.IPI;
import br.com.alura.decorator.depois.business.IPVA;
import br.com.alura.decorator.depois.business.ISS;
import br.com.alura.decorator.depois.business.Imposto;
import br.com.alura.decorator.depois.business.ImpostoMuitoAlto;
import br.com.alura.decorator.depois.modelo.Orcamento;

public class TesteCalculadoraImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500.0);
		
		// Comportamento compostos por outros comportamentos:
		// Padrao Decorator permite decorar as classes, agrupando funcionalidades antes separadas
		// Ou seja, comportamentos compostos
		// Posso criar um novo tipo de tributo, que na verdade, e um conjunto dos tributos ja existentes,
		// calculando o tributo em cadeia(grupo)
		System.out.println("\nSomente Padrao Decorator");
		Imposto issComICMS = new ISS(new ICMS());
		Imposto icmsComConfinsComIPI = new ICMS(new Confins(new IPI()));
		Imposto ipiComISS = new IPI(new ISS());
		Imposto confinsComICMS = new Confins(new ICMS());
		Imposto ipvaComIPI = new IPVA(new IPI());
		
		Imposto impostoMuitoAlto = new ImpostoMuitoAlto(new Confins());
		Imposto icppComIkcv = new ICPP(new IKCV());
		
		double resultadoISSComICMS = issComICMS.calcula(orcamento);
		System.out.println(resultadoISSComICMS);
		
		double resultadoIcmsComConfinsComIPI = icmsComConfinsComIPI.calcula(orcamento);
		System.out.println(resultadoIcmsComConfinsComIPI);
		
		double resultadoIpiComIss = ipiComISS.calcula(orcamento);
		System.out.println(resultadoIpiComIss);
		
		double resultadoConfinsComICMS = confinsComICMS.calcula(orcamento);
		System.out.println(resultadoConfinsComICMS);
		
		double resultadoIpvaComIPI = ipvaComIPI.calcula(orcamento);
		System.out.println(resultadoIpvaComIPI);
		
		double resultadoImpostoMuitoAlto = impostoMuitoAlto.calcula(orcamento);
		System.out.println(resultadoImpostoMuitoAlto);
		
		double resultadoIcppComIkcv = icppComIkcv.calcula(orcamento);
		System.out.println(resultadoIcppComIkcv);
		
		// Poderia utilizar o padrao strategy aqui tbm
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println("\nPadrao Decorator utilizando em conjunto com o padrao strategy");
		System.out.println(calculadora.realizaCalculo(orcamento, issComICMS));
		System.out.println(calculadora.realizaCalculo(orcamento, icmsComConfinsComIPI));
		System.out.println(calculadora.realizaCalculo(orcamento, ipiComISS));
		System.out.println(calculadora.realizaCalculo(orcamento, confinsComICMS));
		System.out.println(calculadora.realizaCalculo(orcamento, ipvaComIPI));
		System.out.println(calculadora.realizaCalculo(orcamento, impostoMuitoAlto));
		System.out.println(calculadora.realizaCalculo(orcamento, icppComIkcv));
	}
	
}
