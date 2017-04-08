package br.com.alura.strategy;

public class DescontoParaValorAcimaDeQuinhentosReais implements Desconto {

	private Desconto proximo;

	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.07;
		}
		return this.proximo.desconta(orcamento);
	}

	@Override
	public void setProximoDesconto(Desconto proximo) {
		this.proximo = proximo;
		
	}
	
}
