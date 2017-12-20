package br.com.alura.decorator.imposto.outraForma.teste;

import br.com.alura.decorator.imposto.outraForma.model.GGP;
import br.com.alura.decorator.imposto.outraForma.model.ICQP;
import br.com.alura.decorator.imposto.outraForma.model.IEFP;
import br.com.alura.decorator.imposto.outraForma.model.Imposto;
import br.com.alura.decorator.imposto.outraForma.model.MCSM;
import br.com.alura.decorator.imposto.outraForma.model.Orcamento;

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