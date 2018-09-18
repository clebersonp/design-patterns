package br.com.alura.chainOfResponsability.desafio.atm;

public class Dispenser20Reais implements DispenserChain {

    private static final int VINTE_REAIS = 20;
    private DispenserChain proximo;

    @Override
    public void dispenser(final Moeda moeda) {
        if (moeda.getValor() >= VINTE_REAIS) {
            final int numeroCedulas = (int) moeda.getValor() / VINTE_REAIS;
            final double valorRemanescente = moeda.getValor() % VINTE_REAIS;
            System.out.println(String.format("Dispenser %d nota de %d Reais.", numeroCedulas, VINTE_REAIS));
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
