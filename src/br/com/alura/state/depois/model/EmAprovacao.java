package br.com.alura.state.depois.model;

public class EmAprovacao implements EstadoDeUmOrcamento {

    private static final double DESCONTO = 0.05;
    private static final String EM_APROVACAO = "Em aprovacao";
    private boolean descontoJaAplicado = false;

    @Override
    public void aplicarDescontoExtra(Orcamento orcamento) {
        if (!descontoJaAplicado) {
            double valor = orcamento.getValor();
            valor -= valor * DESCONTO;
            orcamento.setValor(valor);
            descontoJaAplicado = true;
        } else {
            throw new IllegalArgumentException("Orcamento " + EM_APROVACAO + " ja recebeu um desconto!");
        }
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Aprovado());
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Reprovado());
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        throw new IllegalStateException("Orcamento em aprovacao nao pode ser finalizado diretamente!");
    }

    @Override
    public String getEstadoAtualString() {
        return EM_APROVACAO;
    }

    public boolean isDescontoJaAplicado() {
        return descontoJaAplicado;
    }
}