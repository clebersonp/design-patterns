package br.com.alura.decorator.outroExemplo.teste;

import br.com.alura.decorator.outroExemplo.model.Arma;
import br.com.alura.decorator.outroExemplo.model.ArmaDecorator;

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