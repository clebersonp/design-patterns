package br.com.alura.strategy.desafio;

public class Conta {

	private double saldo;
	private String titular;
	private String agencia;
	private String numero;

	public Conta() {
		
	}
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		
	}
	
	public void desposita(double saldo) {
		this.saldo += saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
