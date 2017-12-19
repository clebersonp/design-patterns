package br.com.alura.state.desafio.model;

/*
 * No design patter state e muito comum que as classes que representam um estado
 * e as classes que usam como composicao um estao fiquem todas no mesmo pacote
 * para criar metodos com acesso protected
 * 
 * Obs: os estados do objeto fiquem no mesmo pacote que a classe principal, 
 * já que geralmente os estados precisam lidar diretamente com os atributos.
 */
public abstract class ContaBancaria {
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract EstadoDeUmaConta getEstadoAtual();
    protected abstract void setEstadoDeUmaConta(EstadoDeUmaConta estadoDaConta);
    public abstract double getSaldo();
    protected abstract void setSaldo(double valor);
    public abstract void negativar();
    public abstract void positivar();
}