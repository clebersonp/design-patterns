package br.com.alura.flyweight.depois.notas;

import br.com.alura.flyweight.depois.interfaces.Nota;

public class Si implements Nota {

    @Override
    public String getSimbolo() {
        return "B";
    }
}