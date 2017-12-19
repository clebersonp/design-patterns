package br.com.alura.state.depois.model;

public class Reprovado implements EstadoDeUmOrcamento {

    private static final String REPROVADO = "Reprovado";

    @Override
    public void aplicarDescontoExtra(Orcamento orcamento) {
        throw new IllegalArgumentException("Orcamento no estado reprovado nao pode aplicar descontos!");
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        throw new IllegalStateException("Orcamento reprovado nao pode ser aprovado, somente finalizado");
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        throw new IllegalStateException("Orcamento ja esta reprovado!");
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Finalizado());
    }

    @Override
    public String getEstadoAtualString() {
        return REPROVADO;
    }
}