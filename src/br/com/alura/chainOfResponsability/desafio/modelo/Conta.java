package br.com.alura.chainOfResponsability.desafio.modelo;

public class Conta {

	private double saldo;
	private String titular;
	
	public Conta() {}
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}
}
