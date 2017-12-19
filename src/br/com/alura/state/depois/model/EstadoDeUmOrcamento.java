package br.com.alura.state.depois.model;

public interface EstadoDeUmOrcamento {
    public void aplicarDescontoExtra(Orcamento orcamento);
    public void aprovar(Orcamento orcamento);
    public void reprovar(Orcamento orcamento);
    public void finalizar(Orcamento orcamento);
    public String getEstadoAtualString();
}