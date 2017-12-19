package br.com.alura.state.desafio.teste;

import br.com.alura.state.desafio.model.Conta;
import br.com.alura.state.desafio.model.ContaBancaria;

public class PositivaNegativaContaTeste {

    public static void main(String[] args) {
        
        ContaBancaria contaCorrente = new Conta("Cleberson", 200.0);
        System.out.printf("Saldo da conta antes do deposito: %.2f\n", contaCorrente.getSaldo());
        System.out.printf("Estado atual da conta antes do deposito: %s\n\n", 
                        contaCorrente.getEstadoAtual().getEstadoAsString());
        
        contaCorrente.depositar(100.0);
        System.out.printf("Saldo da conta apos depositar: %.2f\n", contaCorrente.getSaldo());
        System.out.printf("Estado atual da conta apos o deposito: %s\n\n", 
                        contaCorrente.getEstadoAtual().getEstadoAsString());
        
//        contaCorrente.negativar(); nao e possivel negativar uma conta com saldo positivo
        
        contaCorrente.sacar(296.0);
        System.out.printf("Saldo da conta apos sacar: %.2f\n", contaCorrente.getSaldo());
        System.out.printf("Estado atual da conta apos o saque: %s\n\n", 
                        contaCorrente.getEstadoAtual().getEstadoAsString());
        
//        contaCorrente.sacar(20.0); nao e possivel sacar de uma conta com saldo negativo
        
        contaCorrente.depositar(20.0);
        System.out.printf("Saldo da conta apos depositar: %.2f\n", contaCorrente.getSaldo());
        System.out.printf("Estado atual da conta apos o saque: %s\n\n", 
                        contaCorrente.getEstadoAtual().getEstadoAsString());
        
//        contaCorrente.negativar(); nao e possivel negativar uma conta com saldo positivo
        
        
    }
    
}
