package br.com.alura.builder.depois.builder;

import br.com.alura.builder.depois.model.ItemDaNota;

public class ItemDaNotaBuilder {

    private String item;
    private double valor;
    
    public ItemDaNotaBuilder comItem(String descricao) {
        this.item = descricao;
        return this;
    }
    
    public ItemDaNotaBuilder comValor(double valor) {
        this.valor = valor;
        return this;
    }
    
    public ItemDaNota constroi() {
        return new ItemDaNota(this.item, this.valor);
    }
}