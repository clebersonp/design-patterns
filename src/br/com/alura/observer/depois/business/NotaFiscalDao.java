package br.com.alura.observer.depois.business;

import br.com.alura.observer.depois.model.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNota {

    @Override
    public void executar(NotaFiscal notaFiscal) {
        System.out.printf("\nSalvando nota fiscal no banco: \n%s\n", notaFiscal);
    }
}