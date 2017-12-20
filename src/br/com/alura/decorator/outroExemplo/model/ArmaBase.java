package br.com.alura.decorator.outroExemplo.model;

public class ArmaBase implements Arma {

    @Override
    public void montar() {
        System.out.println("Arma base montada com os acessorios escolhidos!");
    }

    @Override
    public int getQuantidadeDeItens() {
        return ArmaDecorator.quantidadeDeItens;
    }
}