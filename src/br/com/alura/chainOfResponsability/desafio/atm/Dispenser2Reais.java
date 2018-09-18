package br.com.alura.chainOfResponsability.desafio.atm;

public class Dispenser2Reais implements DispenserChain {

    private static final int DOIS_REAIS = 2;
    private DispenserChain proximo;

    @Override
    public void dispenser(final Moeda moeda) {
        if (moeda.getValor() >= DOIS_REAIS) {
            final int numeroCedulas = (int) moeda.getValor() / DOIS_REAIS;
            final double valorRemanescente = moeda.getValor() % DOIS_REAIS;
            System.out.println(String.format("Dispenser %d nota de %d Reais.", numeroCedulas, DOIS_REAIS));
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
