package br.com.alura.flyweight.antes.notas;

import br.com.alura.flyweight.antes.interfaces.Nota;

public class Fa implements Nota {

    @Override
    public String getSimbolo() {
        return "F";
    }
}