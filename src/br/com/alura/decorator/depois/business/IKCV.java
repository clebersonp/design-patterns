package br.com.alura.decorator.depois.business;

import br.com.alura.decorator.depois.enuns.TipoImposto;
import br.com.alura.decorator.depois.modelo.Orcamento;

public class IKCV extends Imposto {

    private static final double SEIS_POR_CENTO = 0.06;

    public IKCV() {
        super();
    }
    
    public IKCV(Imposto proximoImposto) {
        super(proximoImposto);
    }
    
    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * SEIS_POR_CENTO + super.calculaProximoImposto(orcamento);
    }

    @Override
    public TipoImposto getTipoImposto() {
        return TipoImposto.IKCV;
    }

    @Override
    public double getPercentual() {
        return SEIS_POR_CENTO;
    }
}