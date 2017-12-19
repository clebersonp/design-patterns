package br.com.alura.state.depois.teste;

import br.com.alura.state.depois.model.Orcamento;

public class DescontoExtraOrcamentoTeste {
    public static void main(String[] args) {
        
        Orcamento orcamento = new Orcamento(500.0);
        
        System.out.printf("Valor do orcamento antes do desconto: %.2f\n", orcamento.getValor());
        System.out.printf("Estado do orcamento: %s\n\n", orcamento.getEstadoAtualString());
        
        orcamento.aplicarDescontoExtra();
//        orcamento.aplicarDescontoExtra(); permite apenas um desconto por estado
        orcamento.aprovar();
        
        System.out.printf("Valor do orcamento depois do desconto: %.2f\n", orcamento.getValor());
        System.out.printf("Novo estado do orcamento: %s\n\n", orcamento.getEstadoAtualString());
        
        orcamento.aplicarDescontoExtra();
//        orcamento.aplicarDescontoExtra(); permite apenas um desconto por estado
        orcamento.finalizar();

        System.out.printf("Valor do orcamento depois do desconto: %.2f\n", orcamento.getValor());
        System.out.printf("Novo estado do orcamento: %s\n\n", orcamento.getEstadoAtualString());
        
//        orcamento.aplicarDescontoExtra(); nao permite aplicar descontos a orcamentos ja finalizados
//        orcamento.aprovar(); nao permite aprovar um orcamento ja finalizado
    }
}