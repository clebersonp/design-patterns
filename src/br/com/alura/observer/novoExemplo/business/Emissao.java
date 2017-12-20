package br.com.alura.observer.novoExemplo.business;

import br.com.alura.observer.novoExemplo.model.NotaFiscal;

public interface Emissao {
    public void emitir(NotaFiscal notaFiscal);
}