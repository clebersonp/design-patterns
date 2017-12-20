package br.com.alura.decorator.outroExemplo.model;

public abstract class ArmaDecorator implements Arma {

    private Arma arma;
    protected static int quantidadeDeItens = 0;
    
    public ArmaDecorator(Arma arma) {
        if (arma != null) {
            this.arma = arma;
            ArmaDecorator.quantidadeDeItens++;
        }
    }
    
    @Override
    public void montar() {
        if (this.arma != null) {
            this.arma.montar();
        }
    }
    
    @Override
    public int getQuantidadeDeItens() {
        return ArmaDecorator.quantidadeDeItens;
    }
}