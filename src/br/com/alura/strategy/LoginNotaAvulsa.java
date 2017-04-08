package br.com.alura.strategy;

public class LoginNotaAvulsa implements TelaLogin {

	private final String telaNotaAvulsa = "https://demonstracao.ginfes.com.br/loginNotaAvulsa";
	
	public String getTelaNotaAvulsa() {
		return telaNotaAvulsa;
	}

	@Override
	public String recuperaPagina() {
		return this.getTelaNotaAvulsa();
	}
}
