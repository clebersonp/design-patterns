package br.com.alura.decorator.outroExemplo.model;

public class CanoCurto extends ArmaDecorator {

    public CanoCurto(Arma arma) {
        super(arma);
    }
    
    @Override
    public void montar() {
        System.out.println("Adicionando cano curto a arma!");
        super.montar();
    }
}