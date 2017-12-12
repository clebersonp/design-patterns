package br.com.alura.decorator.depois.testes;

import br.com.alura.decorator.depois.business.Confins;
import br.com.alura.decorator.depois.business.ICMS;
import br.com.alura.decorator.depois.business.IPI;
import br.com.alura.decorator.depois.business.IPVA;
import br.com.alura.decorator.depois.business.ISS;
import br.com.alura.decorator.depois.business.Imposto;
import br.com.alura.decorator.depois.modelo.Orcamento;

public class TesteCalculadoraImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500.0);
		
		// Padrao Decorator permite decorar as classes, agrupando funcionalidades antes separadas
		// Ou seja, comportamentos compostos
		Imposto issComICMS = new ISS(new ICMS());
		Imposto icmsComConfinsComIPI = new ICMS(new Confins(new IPI()));
		Imposto ipiComISS = new IPI(new ISS());
		Imposto confinsComICMS = new Confins(new ICMS());
		Imposto ipvaComIPI = new IPVA(new IPI());
		
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
		
	}
	
}
