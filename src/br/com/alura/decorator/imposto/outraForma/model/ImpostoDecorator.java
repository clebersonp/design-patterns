package br.com.alura.decorator.imposto.outraForma.model;

public abstract class ImpostoDecorator implements Imposto {

    private Imposto imposto;
    
    public ImpostoDecorator(Imposto imposto) {
        this.imposto = imposto;
    }
    
    @Override
    public double calcularImposto(Orcamento orcamento) {
        if (imposto != null) {
            return imposto.calcularImposto(orcamento);
        }
        return 0;
    }
}