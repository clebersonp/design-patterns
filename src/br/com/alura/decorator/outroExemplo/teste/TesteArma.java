package br.com.alura.decorator.outroExemplo.teste;

import br.com.alura.decorator.outroExemplo.model.Arma;
import br.com.alura.decorator.outroExemplo.model.Mira;
import br.com.alura.decorator.outroExemplo.model.Silenciador;

public class TesteArma {
    
    public static void main(String[] args) {
        
        Arma arma = new Mira(
                        new CanoCurto(
                            new Silenciador(
                                new Coronha(
                                    new Trilho(
                                        new LancadorDeGranada(null))))));
        arma.montar();
        System.err.printf("Quantidade de itens na arma: %d", arma.getQuantidadeDeItens());
    }
}