package br.com.alura.decorator.outroExemplo.model;

public class Trilho extends ArmaDecorator {

    public Trilho(Arma arma) {
        super(arma);
    }
    
    @Override
    public void montar() {
        System.out.println("Adicionando o trilho a arma!");
        super.montar();
    }
}