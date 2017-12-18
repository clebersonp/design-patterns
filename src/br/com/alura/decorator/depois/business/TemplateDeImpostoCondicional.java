package br.com.alura.decorator.depois.business;

import br.com.alura.decorator.depois.modelo.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto {

    public TemplateDeImpostoCondicional() {
        super();
    }
    
    public TemplateDeImpostoCondicional(Imposto proximoImposto) {
        super(proximoImposto);
    }
    
    @Override
    public double calcula(Orcamento orcamento) {
        if (deveAplicarTaxacaoMaxima(orcamento)) {
            return orcamento.getValor() * maximaTaxacao() + super.calculaProximoImposto(orcamento);
        }
        return orcamento.getValor() * minimaTaxacao() + super.calculaProximoImposto(orcamento);
    }

    protected abstract boolean deveAplicarTaxacaoMaxima(Orcamento orcamento);
    protected abstract double maximaTaxacao();
    protected abstract double minimaTaxacao();
}