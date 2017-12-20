package br.com.alura.decorator.outroExemplo.teste;

import br.com.alura.decorator.outroExemplo.model.Arma;
import br.com.alura.decorator.outroExemplo.model.Mira;
import br.com.alura.decorator.outroExemplo.model.Silenciador;

public class TesteArma {
    
    public static void main(String[] args) {
        
        Arma arma = new Mira(new CanoCurto(new Silenciador(null)));
        arma.montar();
    }
}