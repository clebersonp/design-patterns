package br.com.alura.decorator.outroExemplo.model;

public class Silenciador extends ArmaDecorator {

    public Silenciador(Arma arma) {
        super(arma);
    }
    
    @Override
    public void montar() {
        System.out.println("Adicionando silenciador a arma!");
        super.montar();
    }
}