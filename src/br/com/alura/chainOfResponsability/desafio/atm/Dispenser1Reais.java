package br.com.alura.chainOfResponsability.desafio.atm;

public class Dispenser1Reais implements DispenserChain {

    private static final int UM_REAL = 1;
    private DispenserChain proximo;

    @Override
    public void dispenser(final Moeda moeda) {
        if (moeda.getValor() >= UM_REAL) {
            final int numeroCedulas = (int) moeda.getValor() / UM_REAL;
            final double valorRemanescente = moeda.getValor() % UM_REAL;
            System.out.println(String.format("Dispenser %d nota de %d Reais.", numeroCedulas, UM_REAL));
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