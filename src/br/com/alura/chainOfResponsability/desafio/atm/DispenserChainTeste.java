package br.com.alura.chainOfResponsability.desafio.atm;

import java.util.Scanner;

public class DispenserChainTeste {

    public static void main(final String[] args) {

        final AtmDispenserChain atmDispenser = new AtmDispenserChain();

        final Scanner scanner = new Scanner(System.in);
        while (true) {
            double valor = 0.0;
            System.out.println("Digite o valor a sacar.");
            valor = scanner.nextDouble();
            atmDispenser.dispenser(new Moeda(valor));
        }
    }
}
