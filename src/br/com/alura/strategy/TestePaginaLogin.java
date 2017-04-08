package br.com.alura.strategy;

public class TestePaginaLogin {

	public static void main(String[] args) {
		
		SeletorDePagina seletor = new SeletorDePagina();
		
		TelaLogin loginTomador = new LoginTomador();
		TelaLogin loginPrestador = new LoginPrestador();
		TelaLogin loginCredito = new LoginCredito();
		TelaLogin loginNotaAvulsa = new LoginNotaAvulsa();
		
		String paginaTomador = seletor.recuperaPagina(loginTomador);
		String paginaPrestador = seletor.recuperaPagina(loginPrestador);
		String paginaCredito = seletor.recuperaPagina(loginCredito);
		String paginaNotaAvulsa = seletor.recuperaPagina(loginNotaAvulsa);
		
		System.out.println(paginaTomador);
		System.out.println(paginaPrestador);
		System.out.println(paginaCredito);
		System.out.println(paginaNotaAvulsa);
		
		
		
	}
	
}
