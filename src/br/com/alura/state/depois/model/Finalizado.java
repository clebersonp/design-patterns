package br.com.alura.state.depois.model;

public class Finalizado implements EstadoDeUmOrcamento {

    private static final String FINALIZADO = "Finalizado";

    @Override
    public void aplicarDescontoExtra(Orcamento orcamento) {
        throw new IllegalArgumentException("Orcamento em estado finalizado nao pode aplicar descontos!");
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        throw new IllegalStateException("Orcamento ja esta finalizado!");
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        throw new IllegalStateException("Orcamento ja esta finalizado!");
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        throw new IllegalStateException("Orcamento ja esta finalizado!");
    }

    @Override
    public String getEstadoAtualString() {
        return FINALIZADO;
    }
}