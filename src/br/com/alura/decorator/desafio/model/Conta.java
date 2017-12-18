package br.com.alura.decorator.desafio.model;

import java.time.LocalDate;

public class Conta {

    private String titular;
    private double valor;
    private LocalDate dataAbertura;
 
    public Conta() {}
    
    public Conta(String titular, double valor) {
        this.titular = titular;
        this.valor = valor;
        this.dataAbertura = LocalDate.now();
    }

    public Conta(String titular, double valor, LocalDate dataAbertura) {
        this.titular = titular;
        this.valor = valor;
        this.dataAbertura = dataAbertura;
    }
    
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getValor() {
        return valor;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            this.valor += valor;
        }
    }
    
    public void sacar(double valor) {
        if (this.valor >= valor) {
            this.valor -= valor;
        }
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    @Override
    public String toString() {
        return "Conta [titular=" + titular + ", valor=" + valor + ", dataAbertura=" + dataAbertura + "]";
    }
}