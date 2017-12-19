package br.com.alura.builder.depois.model;

/*
 * Essa classe por ter poucos atributos nao tem a necessidade de
 * usar um builder, somente para praticar o exercicio.
 */

public class ItemDaNota {
 
    private String item;
    private double valor;
    
    public ItemDaNota() {}
    
    public ItemDaNota(String item, double valor) {
        this.item = item;
        this.valor = valor;
    }

    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ItemDaNota [item=" + item + ", valor=" + valor + "]";
    }
}