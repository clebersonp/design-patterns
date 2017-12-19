package br.com.alura.state.antes.teste;

import br.com.alura.state.antes.model.Orcamento;


/*
 * Teste que aplica tipos de descontos extras de acordo com o estado do orcamento
 * sem aplicar o design pattern State
 */

public class DescontoExtraTeste {

    public static void main(String[] args) {
            
        Orcamento orcamento = new Orcamento(500.0);
        
        System.out.printf("Estado atual do orcamento: %d\n", orcamento.getEstadoAtual());
        System.out.printf("valor atual do orcamento: %.2f\n\n", orcamento.getValor());
        
        orcamento.aplicarDescontoExtra();
        orcamento.aprovar();
        System.out.printf("Estado atual do orcamento: %d\n", orcamento.getEstadoAtual());
        System.out.printf("Valor atual apos aplicar desconto %.2f\n\n", orcamento.getValor());
    }
}