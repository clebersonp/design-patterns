package br.com.alura.observer.depois.business;

import br.com.alura.observer.depois.model.NotaFiscal;

public interface AcaoAposGerarNota {
    public void executar(NotaFiscal notaFiscal);
}