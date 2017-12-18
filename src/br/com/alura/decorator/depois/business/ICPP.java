package br.com.alura.decorator.depois.business;

import br.com.alura.decorator.depois.enuns.TipoImposto;
import br.com.alura.decorator.depois.modelo.Orcamento;

public class ICPP extends Imposto {

    private static final double CINCO_POR_CENTO = 0.05;

    public ICPP() {
        super();
    }
    
    public ICPP(Imposto proximoImposto) {
        super(proximoImposto);
    }
    
    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * CINCO_POR_CENTO + super.calculaProximoImposto(orcamento);
    }

    @Override
    public TipoImposto getTipoImposto() {
        return TipoImposto.ICPP;
    }

    @Override
    public double getPercentual() {
        return CINCO_POR_CENTO;
    }
}