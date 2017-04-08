package br.com.alura.strategy;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		
		if (orcamento.existeItem("LAPIS")
				&& orcamento.existeItem("CANETA")) {
			return orcamento.getValor() * 0.05;
		}
		
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximoDesconto(Desconto proximo) {
		this.proximo = proximo;
		
	}

}
