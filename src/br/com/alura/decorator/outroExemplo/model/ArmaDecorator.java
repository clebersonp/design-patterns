package br.com.alura.decorator.outroExemplo.model;

public abstract class ArmaDecorator implements Arma {

    private Arma arma;
    
    public ArmaDecorator(Arma arma) {
        this.arma = arma;
    }
    
    @Override
    public void montar() {
        if (this.arma != null) {
            this.arma.montar();
        } else {
            System.out.println("Montagem arma finalizada!");
        }
    }
}