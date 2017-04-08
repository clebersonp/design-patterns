package br.com.alura.strategy.desafio;

public class RespostaPorcento implements Resposta {

	private Resposta proxima;

	public RespostaPorcento(Resposta proxima) {
		this.proxima = proxima;
	}
	
	public RespostaPorcento() {
		this.proxima = null;
	}

	@Override
	public String responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.PORCENTO)) {
			return montarResposta(conta);
		}
		if (this.proxima != null) {
			return this.proxima.responde(req, conta);
		} else {
			throw new IllegalArgumentException("Formato requisitado não pode ser encontrado!"); 
		}
	}

	private String montarResposta(Conta conta) {
		StringBuilder porcento = new StringBuilder();
		porcento.append(conta.getTitular())
			.append("%")
			.append(conta.getSaldo())
			.append("%");
		return porcento.toString();
	}
}
