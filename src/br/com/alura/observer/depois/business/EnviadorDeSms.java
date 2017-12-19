package br.com.alura.observer.depois.business;

import br.com.alura.observer.depois.model.NotaFiscal;

public class EnviadorDeSms implements AcaoAposGerarNota {

    @Override
    public void executar(NotaFiscal notaFiscal) {
        System.out.printf("\nEnviando nota fiscal via SMS: \n%s\n", notaFiscal);
    }
}