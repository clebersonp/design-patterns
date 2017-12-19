package br.com.alura.state.desafio.model;

public class Positivo implements EstadoDeUmaConta {

    private static final double NOVENTA_CINCO_POR_CENTO = 0.95;
    private static final String POSITIVO = "Positivo";

    @Override
    public void positivar(ContaBancaria conta) {
        throw new IllegalStateException("Conta bancaria ja se encontra positiva!");
    }

    @Override
    public void negativar(ContaBancaria conta) {
        if (conta.getSaldo() < 0) {
            conta.setEstadoDeUmaConta(new Negativo());
        } else {
            throw new IllegalStateException("Conta nao pode ser negativada pois possui saldo positivo. Saldo: " 
                                + conta.getSaldo());
        }
    }

    @Override
    public void depositar(ContaBancaria conta, double valor) {
        double saldo = conta.getSaldo();
        saldo += valor * NOVENTA_CINCO_POR_CENTO;
        conta.setSaldo(saldo);
    }

    @Override
    public void sacar(ContaBancaria conta, double valor) {
        double saldo = conta.getSaldo();
        saldo -= valor;
        conta.setSaldo(saldo);
        if (conta.getSaldo() < 0) {
            this.negativar(conta);
        }
    }

    @Override
    public String getEstadoAsString() {
        return POSITIVO;
    }
}