package br.com.alura.observer.depois.business;

import br.com.alura.observer.depois.model.NotaFiscal;

public class Impressora implements AcaoAposGerarNota {

    @Override
    public void executar(NotaFiscal notaFiscal) {
        System.out.printf("\nImprimindo nota fiscal: \n%s\n", notaFiscal);
    }
}