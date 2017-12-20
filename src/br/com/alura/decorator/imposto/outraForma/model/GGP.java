package br.com.alura.decorator.imposto.outraForma.model;

public class GGP extends ImpostoDecorator {

    private static final double OITO_POR_CENTO = 0.08;

    public GGP(Imposto imposto) {
        super(imposto);
    }
    
    @Override
    public double calcularImposto(Orcamento orcamento) {
        double valorImposto = calcularGGP(orcamento);
        System.out.printf("Calculando imposto GGP: %.2f * %.2f = %.2f\n", 
                        orcamento.getValor(), OITO_POR_CENTO, valorImposto);
        return valorImposto + super.calcularImposto(orcamento);
    }

    private double calcularGGP(Orcamento orcamento) {
        double valorImposto = orcamento.getValor() * OITO_POR_CENTO;
        return valorImposto;
    }
}