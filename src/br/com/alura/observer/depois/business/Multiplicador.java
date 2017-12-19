package br.com.alura.observer.depois.business;

import br.com.alura.observer.depois.model.NotaFiscal;

public class Multiplicador implements AcaoAposGerarNota {

    private double fator;
    
    public Multiplicador(double fator) {
        this.fator = fator;
    }
    
    @Override
    public void executar(NotaFiscal notaFiscal) {
        double valorMultiplicado = multiplicarValorBruto(notaFiscal);
        System.out.printf("\nMultiplicando o valor bruto da nota fiscal: %.2f, por %.2f = %.2f\n%s\n",
                        notaFiscal.getValorBruto(), this.fator, valorMultiplicado, notaFiscal);
    }

    private double multiplicarValorBruto(NotaFiscal notaFiscal) {
        double valorBruto = notaFiscal.getValorBruto();
        valorBruto *= this.fator;
        return valorBruto;
    }
}