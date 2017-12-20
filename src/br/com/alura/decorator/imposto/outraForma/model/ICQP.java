package br.com.alura.decorator.imposto.outraForma.model;

public class ICQP extends ImpostoDecorator {

    private static final double DOIS_POR_CENTO = 0.02;

    public ICQP(Imposto imposto) {
        super(imposto);
    }
    
    @Override
    public double calcularImposto(Orcamento orcamento) {
        double valorImposto = calcularICQP(orcamento);
        System.out.printf("Calculando imposto ICQP: %.2f * %.2f = %.2f\n", 
                        orcamento.getValor(), DOIS_POR_CENTO, valorImposto);
        return valorImposto + super.calcularImposto(orcamento);
    }

    private double calcularICQP(Orcamento orcamento) {
        return orcamento.getValor() * DOIS_POR_CENTO;
    }
}