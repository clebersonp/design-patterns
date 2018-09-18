package br.com.alura.chainOfResponsability.desafio.atm;

public class Dispenser0Reais implements DispenserChain {

    @Override
    public void dispenser(final Moeda moeda) {
    }

    @Override
    public void proximo(final DispenserChain proximo) {
    }
}
