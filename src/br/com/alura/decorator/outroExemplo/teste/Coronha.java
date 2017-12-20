package br.com.alura.decorator.outroExemplo.teste;

import br.com.alura.decorator.outroExemplo.model.Arma;
import br.com.alura.decorator.outroExemplo.model.ArmaDecorator;

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