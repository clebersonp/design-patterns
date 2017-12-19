package br.com.alura.state.desafio.model;

public class Negativo implements EstadoDeUmaConta {

    private static final double NOVENTA_OITO_POR_CENTO = 0.98;
    private static final String NEGATIVO = "Negativo";

    @Override
    public void positivar(ContaBancaria conta) {
        if (conta.getSaldo() >= 0) {
            conta.setEstadoDeUmaConta(new Positivo());
        } else {
            throw new IllegalStateException("Conta nao pode ser positivada pois possui saldo negativo. Saldo: " 
                                + conta.getSaldo());
        }
    }

    @Override
    public void negativar(ContaBancaria conta) {
        throw new IllegalStateException("Conta ja se encontra negativada!");
    }

    @Override
    public void depositar(ContaBancaria conta, double valor) {
        double saldo = conta.getSaldo();
        saldo += valor * NOVENTA_OITO_POR_CENTO;
        conta.setSaldo(saldo);
        if (conta.getSaldo() >= 0) {
            this.positivar(conta);
        }
    }

    @Override
    public void sacar(ContaBancaria conta, double valor) {
        throw new IllegalAccessError("Impossivel sacar. A conta ja se encontra negativada!");
    }

    @Override
    public String getEstadoAsString() {
        return NEGATIVO;
    }
}