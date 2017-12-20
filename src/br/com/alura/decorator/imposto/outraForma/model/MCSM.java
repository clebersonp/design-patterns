package br.com.alura.decorator.imposto.outraForma.model;

public class MCSM extends ImpostoDecorator {

    private static final double CINCO_POR_CENTO = 0.05;

    public MCSM(Imposto imposto) {
        super(imposto);
    }
    
    @Override
    public double calcularImposto(Orcamento orcamento) {
        double valorImposto = calcularMCSM(orcamento);
        System.out.printf("Calculando Imposto MCSM: %.2f * %.2f = %.2f\n", 
                        orcamento.getValor(), CINCO_POR_CENTO, valorImposto);
        return valorImposto + super.calcularImposto(orcamento);
    }

    private double calcularMCSM(Orcamento orcamento) {
        double valorImposto = orcamento.getValor() * CINCO_POR_CENTO;
        return valorImposto;
    }
}