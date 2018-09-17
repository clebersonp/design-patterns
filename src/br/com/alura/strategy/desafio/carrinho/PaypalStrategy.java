package br.com.alura.strategy.desafio.carrinho;

public class PaypalStrategy implements PaymentStrategy {

    private final String emailId;
    private final String pwd;

    public PaypalStrategy(final String emailId, final String pwd) {
        this.emailId = emailId;
        this.pwd = pwd;
    }

    @Override
    public void pay(final double amount) {
        final double tax = 1.005;
        System.out.println(String.format("Paypal payment: amount: %s", amount * tax));
    }

    public String getEmailId() {
        return this.emailId;
    }

    public String getPwd() {
        return this.pwd;
    }
}
