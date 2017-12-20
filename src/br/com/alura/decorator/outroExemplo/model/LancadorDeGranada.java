package br.com.alura.decorator.outroExemplo.model;

public class LancadorDeGranada extends ArmaDecorator {
    
    public LancadorDeGranada(Arma arma) {
        super(arma);
    }
    
    @Override
    public void montar() {
        System.out.println("Adicionando lancador de granadas a arma!");
        super.montar();
    }
}