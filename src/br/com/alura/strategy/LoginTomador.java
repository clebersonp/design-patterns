package br.com.alura.strategy;

public class LoginTomador implements TelaLogin {
	
	private final String telaLogin = "https://demonstracao.ginfes.com.br/loginTomador";
	
	public String getTelaLogin() {
		return telaLogin;
	}

	@Override
	public String recuperaPagina() {
		return this.getTelaLogin();
	}
	
	
}
