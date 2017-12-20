package br.com.alura.decorator.imposto.outraForma.model;

public class TesteCalculoImposto {

    public static void main(String[] args) {
        
        Orcamento orcamento = new Orcamento(1000.0);
        Imposto imposto = new GGP(
                            new ICQP(
                                new IEFP(
                                    new MCSM(null))));
        
        System.err.printf("Valor do Orcamento: %.2f\n", orcamento.getValor());
        double valorImpostoAPagar = imposto.calcularImposto(orcamento);
        System.err.printf("Imposto a pagar: %.2f", valorImpostoAPagar);
    }
}