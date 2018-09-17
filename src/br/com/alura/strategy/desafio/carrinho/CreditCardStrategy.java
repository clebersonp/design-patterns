package br.com.alura.strategy.desafio.carrinho;

public class CreditCardStrategy implements PaymentStrategy {

    private final String name;
    private final String creditCardNumber;
    private final String cvv;
    private final String expiryDate;

    public CreditCardStrategy(final String name, final String creditCardNumber, final String cvv, final String expiryDate) {
        this.name = name;
        this.creditCardNumber = creditCardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(final double amount) {
        final double tax = 1.01;
        System.out.println(String.format("Credit Card payment: amount: %s", amount * tax));
    }

    public String getName() {
        return this.name;
    }

    public String getCreditCardNumber() {
        return this.creditCardNumber;
    }

    public String getCvv() {
        return this.cvv;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }
}