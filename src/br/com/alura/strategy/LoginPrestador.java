package br.com.alura.strategy;

public class LoginPrestador implements TelaLogin {

	private final String telaLogin = "https://demonstracao.ginfes.com.br/loginPrestador";
	
	public String getTelaLogin() {
		return telaLogin;
	}

	@Override
	public String recuperaPagina() {
		return this.getTelaLogin();
	}
}
