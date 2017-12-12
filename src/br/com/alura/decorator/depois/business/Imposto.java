package br.com.alura.decorator.depois.business;

import br.com.alura.decorator.depois.enuns.TipoImposto;
import br.com.alura.decorator.depois.modelo.Orcamento;

public abstract class Imposto {

	protected Imposto proximoImposto;
	
	public Imposto() {}
	
	// se quiser utilizar composicao de impostos utilizando o padrao Decorator
	// Estou decorando a classe, e juntando varios comportamentos antes distintos em uma so classe
	public Imposto(Imposto proximoImposto) {
		this.proximoImposto = proximoImposto;
	}
	
	public abstract double calcula(Orcamento orcamento);
	public abstract TipoImposto getTipoImposto();
	public abstract double getPercentual();
	
	// Utilizado para o Decorator
	protected double calculaProximoImposto(Orcamento orcamento) {
		// se houver proximo imposto, entao calcula seu imposto
		if (this.proximoImposto == null) {
			return 0;
		}
		return this.proximoImposto.calcula(orcamento);
	}
}