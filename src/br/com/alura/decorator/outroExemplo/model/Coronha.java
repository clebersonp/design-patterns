package br.com.alura.decorator.outroExemplo.model;

public class Coronha extends ArmaDecorator {

    public Coronha(Arma arma) {
        super(arma);
    }
    
    @Override
    public void montar() {
        System.out.println("Adicionando a coranha a arma!");
        super.montar();
    }
}