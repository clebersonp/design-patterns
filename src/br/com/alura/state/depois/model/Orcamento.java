package br.com.alura.state.depois.model;

public class Orcamento {

    private double valor;
    private EstadoDeUmOrcamento estadoAtual;
    
    public Orcamento() {
        this.estadoAtual = new EmAprovacao();
    }
    
    public Orcamento(double valor) {
        this();
        this.valor = valor;
    }
    
    /*
     * Aplicando design pattern State
     * Metodos que delegam a responsabilidade para as classes que representam seu estado
     */
    public void aplicarDescontoExtra() {
        this.estadoAtual.aplicarDescontoExtra(this);
    }
    
    public void aprovar() {
        this.estadoAtual.aprovar(this);
    }
    
    public void reprovar() {
        this.estadoAtual.reprovar(this);
    }
    
    public void finalizar() {
        this.estadoAtual.finalizar(this);
    }

    /*
     * Aplicando design pattern State
     * Metodos que delegam a responsabilidade para as classes que representam seu estado
     */
    
    public double getValor() {
        return valor;
    }
    protected void setValor(double valor) {
        this.valor = valor;
    }

    public EstadoDeUmOrcamento getEstadoAtual() {
        return estadoAtual;
    }
    protected void setEstadoAtual(EstadoDeUmOrcamento estadoAtual) {
        this.estadoAtual = estadoAtual;
    }
    
    public String getEstadoAtualString() {
        return this.estadoAtual.getEstadoAtualString();
    }
}