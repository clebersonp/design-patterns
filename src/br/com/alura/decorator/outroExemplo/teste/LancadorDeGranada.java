package br.com.alura.decorator.outroExemplo.teste;

import br.com.alura.decorator.outroExemplo.model.Arma;
import br.com.alura.decorator.outroExemplo.model.ArmaDecorator;

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