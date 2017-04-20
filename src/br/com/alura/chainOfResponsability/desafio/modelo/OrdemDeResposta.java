package br.com.alura.chainOfResponsability.desafio.modelo;

import br.com.alura.chainOfResponsability.desafio.interfaces.Resposta;
import br.com.alura.chainOfResponsability.desafio.respostas.RespostaCSV;
import br.com.alura.chainOfResponsability.desafio.respostas.RespostaPorcento;
import br.com.alura.chainOfResponsability.desafio.respostas.RespostaXML;

public class OrdemDeResposta {

	public void responde(Requisicao requisicao, Conta conta) {
		Resposta r1 = new RespostaXML(
							new RespostaCSV(
									new RespostaPorcento(null)));
		r1.responde(requisicao, conta);
	}
	
}
