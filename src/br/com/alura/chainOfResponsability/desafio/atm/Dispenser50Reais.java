package br.com.alura.chainOfResponsability.desafio.atm;

public class Dispenser50Reais implements DispenserChain {

    private static final int CINQUENTA_REAIS = 50;
    private DispenserChain proximo;

    @Override
    public void dispenser(final Moeda moeda) {
        if (moeda.getValor() >= CINQUENTA_REAIS) {
            final int numeroCedulas = (int) moeda.getValor() / CINQUENTA_REAIS;
            final double valorRemanescente = moeda.getValor() % CINQUENTA_REAIS;
            System.out.println(String.format("Dispenser %d nota de %d Reais.", numeroCedulas, CINQUENTA_REAIS));
            this.proximo.dispenser(new Moeda(valorRemanescente));
        } else {
            this.proximo.dispenser(moeda);
        }
    }

    @Override
    public void proximo(final DispenserChain proximo) {
        this.proximo = proximo;
    }
}
