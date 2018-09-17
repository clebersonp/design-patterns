package br.com.alura.strategy.desafio.carrinho;

public class ShoppingCartTest {

    public static void main(final String[] args) {

        final ShoppingCart cart = new ShoppingCart();

        final Item item1 = new Item("1234", 20.50);
        final Item item2 = new Item("5678", 655.89);

        cart.addItem(item1);
        cart.addItem(item2);

        // pay by paypal strategy
        cart.payVia(new PaypalStrategy("fulano@gmail.com", "123456789"));

        // pay by credit card strategy
        cart.payVia(new CreditCardStrategy("Fulano da Silva", "45352658794512", "185", "08/2020"));
    }
}