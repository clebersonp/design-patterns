package br.com.alura.decorator.imposto.outraForma.model;

public class IEFP extends ImpostoDecorator {

    private static final double VINTE_POR_CENTO = 0.2;

    public IEFP(Imposto imposto) {
        super(imposto);
    }
    
    @Override
    public double calcularImposto(Orcamento orcamento) {
        double valorImposto = calcularIEFP(orcamento);
        System.out.printf("Calculando Imposto IEFP: %.2f * %.2f = %.2f\n", 
                        orcamento.getValor(), VINTE_POR_CENTO, valorImposto);  
        return valorImposto + super.calcularImposto(orcamento);
    }

    private double calcularIEFP(Orcamento orcamento) {
        double valorImposto = orcamento.getValor() * VINTE_POR_CENTO;
        return valorImposto;
    }
}