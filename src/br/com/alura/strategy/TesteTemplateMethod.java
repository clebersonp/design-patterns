package br.com.alura.strategy;

public class TesteTemplateMethod {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(600);
		orcamento.adicionaItem(new Item("Lapis", 15.0));
		//orcamento.adicionaItem(new Item("Lapis", 15.0));
		orcamento.adicionaItem(new Item("Sulfite", 20.0));
		orcamento.adicionaItem(new Item("Lousa", 150.0));
		
		TemplateImpostoCondicional icpp = new ICPP();
		TemplateImpostoCondicional ikcv = new IKCV();
		TemplateImpostoCondicional ihit = new IHIT();
		
		double impostoIcpp = icpp.calcula(orcamento);
		double impostoIkcv = ikcv.calcula(orcamento);
		double impostoIhit = ihit.calcula(orcamento);
		
		System.out.println("ICPP: " + impostoIcpp);
		System.out.println("IKCV: " + impostoIkcv);
		System.out.println("IHIT: " + impostoIhit);
		
	}
	
}
