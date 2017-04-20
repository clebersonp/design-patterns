package br.com.alura.chainOfResponsability.desafio.exception;

public class FormatoNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public FormatoNaoEncontradoException(String msg) {
		super(msg);
	}

}
