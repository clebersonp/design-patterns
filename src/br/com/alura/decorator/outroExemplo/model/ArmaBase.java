package br.com.alura.decorator.outroExemplo.model;

public class ArmaBase implements Arma {

    @Override
    public void montar() {
        System.out.println("Montar uma arma base!");
    }

    @Override
    public int getQuantidadeDeItens() {
        return 0;
    }
}