package br.com.alura.chainOfResponsability.desafio.atm;

public interface DispenserChain {
    void dispenser(Moeda moeda);
    void proximo(DispenserChain proximo);
}