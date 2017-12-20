package br.com.alura.decorator.outroExemplo.teste;

import br.com.alura.decorator.outroExemplo.model.Arma;
import br.com.alura.decorator.outroExemplo.model.ArmaDecorator;

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