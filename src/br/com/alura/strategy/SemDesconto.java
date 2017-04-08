package br.com.alura.strategy;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximoDesconto(Desconto proximo) {
		// não tem proximo, esse é o fim da linha
		
	}

}
