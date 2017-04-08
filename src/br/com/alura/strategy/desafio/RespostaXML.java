package br.com.alura.strategy.desafio;

public class RespostaXML implements Resposta {

	private Resposta proxima;
	
	public RespostaXML(Resposta proxima) {
		this.proxima = proxima;
	}

	public RespostaXML() {
		this.proxima = null;
	}

	@Override
	public String responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.XML)) {
			return montarXML(conta);
		}
		if (this.proxima != null) {
			return this.proxima.responde(req, conta);
		} else {
			throw new IllegalArgumentException("Formato requisitado não pode ser encontrado!");
		}
		
	}

	private String montarXML(Conta conta) {
		StringBuilder xml = new StringBuilder();
		xml.append("<conta>\n")
			.append("\t<titular>")
			.append(conta.getTitular())
			.append("</titular>\n")
			.append("\t<saldo>")
			.append(conta.getSaldo())
			.append("</saldo>\n")
			.append("</conta>");
		return xml.toString();
	}
}
