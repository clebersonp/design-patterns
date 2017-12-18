package br.com.alura.decorator.depois.business;

import br.com.alura.decorator.depois.enuns.TipoImposto;
import br.com.alura.decorator.depois.modelo.Orcamento;

public class ImpostoDecoratorComTemplate extends TemplateDeImpostoCondicional {

    private static final double MAXIMA_TAXACAO = 0.3;
    private static final double MINIMA_TAXACAO = 0.1;
    private Orcamento orcamento;
    
    public ImpostoDecoratorComTemplate() {
        super();
    }
    
    public ImpostoDecoratorComTemplate(Imposto proximoImposto) {
        super(proximoImposto);
    }
    
    @Override
    protected boolean deveAplicarTaxacaoMaxima(Orcamento orcamento) {
        this.orcamento = orcamento;
        return orcamento.getValor() >= 500.0;
    }

    @Override
    protected double maximaTaxacao() {
        return MAXIMA_TAXACAO;
    }

    @Override
    protected double minimaTaxacao() {
        return MINIMA_TAXACAO;
    }

    @Override
    public TipoImposto getTipoImposto() {
        return TipoImposto.IMPOSTO_DECORATOR_TEMPLATE;
    }

    @Override
    public double getPercentual() {
        if (this.deveAplicarTaxacaoMaxima(orcamento)) {
            return this.maximaTaxacao();
        } else {
            return this.minimaTaxacao();
        }
    }
}