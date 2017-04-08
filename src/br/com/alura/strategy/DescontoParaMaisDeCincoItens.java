package br.com.alura.strategy;

public class DescontoParaMaisDeCincoItens implements Desconto {

	private Desconto proximo;

	public double desconta(Orcamento orcamento) {
		if (orcamento.getItems().size() > 5) {
			return orcamento.getValor() * 0.1;
		}
		return this.proximo.desconta(orcamento);
	}

	@Override
	public void setProximoDesconto(Desconto proximo) {
		this.proximo = proximo;
		
	}
	
}
