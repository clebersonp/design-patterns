package br.com.alura.strategy.desafio.carrinho;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Item> items;

    public ShoppingCart() {
        super();
        this.items = new ArrayList<>();
    }

    public void addItem(final Item item) {
        this.items.add(item);
    }

    public void removeItem(final Item item) {
        this.items.remove(item);
    }

    public double calculateTotal() {
        return this.items.stream().mapToDouble(Item::getPrice).reduce(0.0, (price1, price2) -> price1 + price2);
    }

    public void payVia(final PaymentStrategy strategy) {
        strategy.pay(this.calculateTotal());
    }
}