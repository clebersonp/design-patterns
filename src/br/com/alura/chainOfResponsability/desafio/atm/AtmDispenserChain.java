package br.com.alura.chainOfResponsability.desafio.atm;

public class AtmDispenserChain {

    public void dispenser(final Moeda moeda) {
        final DispenserChain cinquenta = new Dispenser50Reais();
        final DispenserChain vinte = new Dispenser20Reais();
        final DispenserChain dez = new Dispenser10Reais();
        final DispenserChain cinco = new Dispenser5Reais();
        final DispenserChain dois = new Dispenser2Reais();
        final DispenserChain um = new Dispenser1Reais();
        final DispenserChain zero = new Dispenser0Reais();

        cinquenta.proximo(vinte);
        vinte.proximo(dez);
        dez.proximo(cinco);
        cinco.proximo(dois);
        dois.proximo(um);
        um.proximo(zero);

        cinquenta.dispenser(moeda);
    }

}
