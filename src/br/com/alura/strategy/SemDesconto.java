package br.com.alura.strategy;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximoDesconto(Desconto proximo) {
		// n�o tem proximo, esse � o fim da linha
		
	}

}
