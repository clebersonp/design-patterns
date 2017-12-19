package br.com.alura.state.desafio.model;

public interface EstadoDeUmaConta {
    public void positivar(ContaBancaria conta);
    public void negativar(ContaBancaria conta);
    public void depositar(ContaBancaria conta, double valor);
    public void sacar(ContaBancaria conta, double valor);
    public String getEstadoAsString();
}
