package br.com.alura.strategy;

public class LoginCredito implements TelaLogin {

	private final String telaCredito = "https://demonstracao.ginfes.com.br/loginCredito";
	
	public String getTelaCredito() {
		return telaCredito;
	}

	@Override
	public String recuperaPagina() {
		return this.getTelaCredito();
	}
}
