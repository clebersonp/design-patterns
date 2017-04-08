package br.com.alura.strategy;

public interface Desconto {

	public double desconta(Orcamento orcamento);
	public void setProximoDesconto(Desconto proximo);
	
}
