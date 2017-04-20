package br.com.alura.chainOfResponsability.depois.desconto;

import br.com.alura.chainOfResponsability.depois.modelo.Item;
import br.com.alura.chainOfResponsability.depois.modelo.Orcamento;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximoDesconto;

	@Override
	public double calcula(Orcamento orcamento) {
		
		if (existe("lapis", orcamento) 
				&& existe("caneta", orcamento)) {
			return orcamento.getValor() * 0.05;
		}
		
		return proximoDesconto.calcula(orcamento);
	}

	private boolean existe(String produto, Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (produto.equalsIgnoreCase(item.getNome())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
		this.proximoDesconto = desconto;
		
	}

}
