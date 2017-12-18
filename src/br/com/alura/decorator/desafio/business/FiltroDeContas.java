package br.com.alura.decorator.desafio.business;

import java.util.List;

import br.com.alura.decorator.desafio.model.Conta;

// Padrao strategy
public class FiltroDeContas {
    
    public List<Conta> filtrarContas(List<Conta> contas, Filtro filtro) {
        return filtro.filtrar(contas);
    }
}