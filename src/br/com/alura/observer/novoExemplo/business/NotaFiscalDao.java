package br.com.alura.observer.novoExemplo.business;

import java.util.Observable;
import java.util.Observer;

import br.com.alura.observer.novoExemplo.model.NotaFiscal;

public class NotaFiscalDao implements Observer {

    @Override
    public void update(Observable observable, Object notaFiscalEmitida) {
        if (observable instanceof EmissorNotaFiscal) {
            NotaFiscal notaFiscal = (NotaFiscal) notaFiscalEmitida;
            System.err.printf("Salvando nota fiscal no banco de dados... \n%s\n\n", notaFiscal);
        }
    }
}