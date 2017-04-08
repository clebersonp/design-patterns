package br.com.alura.strategy.desafio;

public class RealizadorDeInvestimentos {

	public void realiza(Conta conta, Investimento investimento) {
		double resultado = investimento.invista(conta);
		conta.desposita(resultado * 0.75);
		
		System.out.println("Novo saldo: " + conta.getSaldo());
	}
	
}
