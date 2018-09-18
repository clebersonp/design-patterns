package br.com.alura.chainOfResponsability.desafio.atm;

public class Dispenser10Reais implements DispenserChain {

    private static final int DEZ_REAIS = 10;
    private DispenserChain proximo;

    @Override
    public void dispenser(final Moeda moeda) {
        if (moeda.getValor() >= DEZ_REAIS) {
            final int numeroCedulas = (int) moeda.getValor() / DEZ_REAIS;
            final double valorRemanescente = moeda.getValor() % DEZ_REAIS;
            System.out.println(String.format("Dispenser %d nota de %d Reais.", numeroCedulas, DEZ_REAIS));
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
