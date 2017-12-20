package br.com.alura.decorator.outroExemplo.model;

public class Mira extends ArmaDecorator {

    public Mira(Arma arma) {
        super(arma);
    }
    
    @Override
    public void montar() {
        System.out.println("Adicionando mira a arma!");
        super.montar();
    }
}