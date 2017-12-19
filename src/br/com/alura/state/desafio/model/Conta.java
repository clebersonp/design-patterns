package br.com.alura.state.desafio.model;

public class Conta extends ContaBancaria {

    private String titular;
    private double valor;
    private EstadoDeUmaConta estadoAtual;
    
    public Conta() {
        this.estadoAtual = new Positivo();
    }
    
    public Conta(String titular, double valor) {
        if (valor >= 0) {
            this.estadoAtual = new Positivo();
            this.titular = titular;
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("Valor deve ser maior ou igual a Zero!");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0) {
            this.estadoAtual.sacar(this, valor);
        } else {
            throw new IllegalArgumentException("Valor a ser sacado deve ser maior que Zero!");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.estadoAtual.depositar(this, valor);
        } else {
            throw new IllegalArgumentException("Valor a ser depositado deve ser maior que Zero!");
        }
    }

    @Override
    public EstadoDeUmaConta getEstadoAtual() {
        return this.estadoAtual;
    }

    @Override
    protected void setEstadoDeUmaConta(EstadoDeUmaConta estadoDaConta) {
        this.estadoAtual = estadoDaConta;
    }

    @Override
    public double getSaldo() {
        return this.valor;
    }
    
    @Override
    protected void setSaldo(double valor) {
        this.valor = valor;
    }
    
    @Override
    public void negativar() {
        this.estadoAtual.negativar(this);
    }
    
    @Override
    public void positivar() {
        this.estadoAtual.positivar(this);
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
}