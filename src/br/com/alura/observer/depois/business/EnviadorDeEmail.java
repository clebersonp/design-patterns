package br.com.alura.observer.depois.business;

import br.com.alura.observer.depois.model.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota {

    @Override
    public void executar(NotaFiscal notaFiscal) {
        System.out.printf("\nEnviando nota fiscal por email: \n%s\n", notaFiscal);
    }
}