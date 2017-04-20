package br.com.alura.chainOfResponsability.desafio.teste;

import br.com.alura.chainOfResponsability.desafio.modelo.Conta;
import br.com.alura.chainOfResponsability.desafio.modelo.OrdemDeResposta;
import br.com.alura.chainOfResponsability.desafio.modelo.Requisicao;

public class TesteRespostas {

	public static void main(String[] args) {
		
		Requisicao requisicao = new Requisicao(null);
//		Requisicao requisicao = new Requisicao(Formato.PORCENTO);
//		Requisicao requisicao = new Requisicao(Formato.CSV);
//		Requisicao requisicao = new Requisicao(Formato.XML);
		Conta conta = new Conta("Cleberson", 5000.0);
		
		OrdemDeResposta ordemResposta = new OrdemDeResposta();
		
		ordemResposta.responde(requisicao, conta);
		
	}
	
}
