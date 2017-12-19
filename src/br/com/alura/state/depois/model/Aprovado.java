package br.com.alura.state.depois.model;

/*
 * Cada estado sabe como comportar de acordo com seu estado atual
 * Por isso o uso de uma interface que contem todos os contratos
 * padroes para um estado
 */
public class Aprovado implements EstadoDeUmOrcamento {

    private static final double DESCONTO = 0.02;
    private static final String APROVADO = "Aprovado";
    private boolean descontoJaAplicado = false;
    
    @Override
    public void aplicarDescontoExtra(Orcamento orcamento) {
        if (!descontoJaAplicado) {
            double valor = orcamento.getValor();
            valor -= valor * DESCONTO;
            orcamento.setValor(valor);
            descontoJaAplicado = true;
        } else {
            throw new IllegalArgumentException("Orcamento em estado " + APROVADO + " ja recebeu um desconto");
        }
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        throw new IllegalStateException("Orcamento ja se encontra aprovado!");
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        throw new IllegalStateException("Orcamento aprovado nao pode ser reprovado, somente finalizado!");
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Finalizado());
    }

    @Override
    public String getEstadoAtualString() {
        return APROVADO;
    }

    public boolean isDescontoJaAplicado() {
        return descontoJaAplicado;
    }
}