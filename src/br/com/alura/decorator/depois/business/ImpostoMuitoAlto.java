package br.com.alura.decorator.depois.business;

import br.com.alura.decorator.depois.business.Imposto;
import br.com.alura.decorator.depois.enuns.TipoImposto;
import br.com.alura.decorator.depois.modelo.Orcamento;

public class ImpostoMuitoAlto extends Imposto {

    private static final double VINTE_POR_CENTO = 0.2;

    public ImpostoMuitoAlto() {
        super();
    }
    
    public ImpostoMuitoAlto(Imposto proximoImposto) {
        super(proximoImposto);
    }
    
    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * VINTE_POR_CENTO + super.calculaProximoImposto(orcamento);
    }

    @Override
    public TipoImposto getTipoImposto() {
        return TipoImposto.IMPOSTO_MUITO_ALTO;
    }

    @Override
    public double getPercentual() {
        return VINTE_POR_CENTO;
    }
}