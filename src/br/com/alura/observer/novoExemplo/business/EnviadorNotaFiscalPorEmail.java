package br.com.alura.observer.novoExemplo.business;

import java.util.Observable;
import java.util.Observer;

import br.com.alura.observer.novoExemplo.model.NotaFiscal;

public class EnviadorNotaFiscalPorEmail implements Observer {

    @Override
    public void update(Observable observable, Object notaFiscalEmitida) {
        if (observable instanceof EmissorNotaFiscal) {
            NotaFiscal notaFiscal = (NotaFiscal) notaFiscalEmitida;
            System.err.printf("Enviando nota fiscal por email... \n%s\n\n", notaFiscal);
        }
    }
}