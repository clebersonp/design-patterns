package br.com.alura.decorator.outroExemplo.teste;

import br.com.alura.decorator.outroExemplo.model.Arma;
import br.com.alura.decorator.outroExemplo.model.ArmaBase;
import br.com.alura.decorator.outroExemplo.model.CanoCurto;
import br.com.alura.decorator.outroExemplo.model.Coronha;
import br.com.alura.decorator.outroExemplo.model.LancadorDeGranada;
import br.com.alura.decorator.outroExemplo.model.Mira;
import br.com.alura.decorator.outroExemplo.model.Silenciador;
import br.com.alura.decorator.outroExemplo.model.Trilho;

public class TesteArma {
    
    public static void main(String[] args) {
        
        Arma arma = new Mira(
                        new CanoCurto(
                            new Silenciador(
                                new Coronha(
                                    new Trilho(
                                        new LancadorDeGranada(
                                            new ArmaBase()))))));
        arma.montar();
        System.err.printf("Quantidade de itens na arma: %d", arma.getQuantidadeDeItens());
    }
}