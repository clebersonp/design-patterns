package br.com.alura.decorator.outroExemplo.model;

public abstract class ArmaDecorator implements Arma {

    private Arma arma;
    private static int quantidadeDeItens = 1;
    
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
        } else {
            System.out.println("Montagem arma finalizada!");
        }
    }
    
    @Override
    public int getQuantidadeDeItens() {
        return ArmaDecorator.quantidadeDeItens;
    }
}