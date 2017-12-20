package br.com.alura.observer.novoExemplo.business;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import br.com.alura.observer.novoExemplo.model.NotaFiscal;

public class EmissorNotaFiscal extends Observable implements Emissao {

    private NotaFiscal notaFiscal;
    private List<Observer> observers;

    public EmissorNotaFiscal(List<Observer> observers) {
        this.observers = observers;
        this.adicionarObserversAoObservable(this.observers);
    }
    
    @Override
    public void emitir(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
        System.out.println("Emitindo nota fiscal: \n");

        // avisa sobre a mudanca
        super.setChanged();
        // notifica todos os observers passando a notaFiscal
        super.notifyObservers(notaFiscal);
        
        System.out.println("Nota emitida com sucesso!");
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }
    
    // registrando os observers ao observable, para o metodo update() ser invocado
    // quando o notifyObservers for chamado
    private void adicionarObserversAoObservable(List<Observer> observers) {
        if (observers != null && !observers.isEmpty()) {
            observers.stream().forEach(o -> {
                super.addObserver(o);
            });
        }
    }
}