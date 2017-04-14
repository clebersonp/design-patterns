package br.com.alura.strategy.desafio.modelo;

public class ContaCorrente {

	private double saldo;
	
	public ContaCorrente(){}
	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}
	
	public void realizaDepostio(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
