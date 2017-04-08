package br.com.alura.strategy.desafio;

public class RespostaCSV implements Resposta {

	private Resposta proxima;

	public RespostaCSV(Resposta resposta) {
		this.proxima = resposta;
	}
	
	public RespostaCSV() {
		this.proxima = null;
	}

	@Override
	public String responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.CSV)) {
			return montarCSV(conta);
		}
		if (this.proxima != null) {
			return this.proxima.responde(req, conta);
		} else {
			throw new IllegalArgumentException("Formato requisitado não pode ser encontrado!");
		}
	}

	private String montarCSV(Conta conta) {
		StringBuilder csv = new StringBuilder();
		csv.append(conta.getTitular())
		.append(";")
		.append(conta.getSaldo());
		return csv.toString();
	}
}