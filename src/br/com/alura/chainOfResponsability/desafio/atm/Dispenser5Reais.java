package br.com.alura.chainOfResponsability.desafio.atm;

public class Dispenser5Reais implements DispenserChain {

    private static final int CINCO_REAIS = 5;
    private DispenserChain proximo;

    @Override
    public void dispenser(final Moeda moeda) {
        if (moeda.getValor() >= CINCO_REAIS) {
            final int numeroCedulas = (int) moeda.getValor() / CINCO_REAIS;
            final double valorRemanescente = moeda.getValor() % CINCO_REAIS;
            System.out.println(String.format("Dispenser %d nota de %d Reais.", numeroCedulas, CINCO_REAIS));
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
