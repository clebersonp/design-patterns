package br.com.alura.decorator.desafio.business;

import java.util.List;

import br.com.alura.decorator.desafio.model.Conta;

public abstract class Filtro {

    private Filtro proximoFiltro;
    
    public Filtro() {
        this.proximoFiltro = null;
    }
    
    public Filtro(Filtro proximoFiltro) {
        this.proximoFiltro = proximoFiltro;
    }
    
    protected abstract List<Conta> filtrar(List<Conta> contas);
    protected List<Conta> proximoFiltro(List<Conta> contas) {
        if (proximoFiltro != null) {
            return proximoFiltro.filtrar(contas);
        }
        return contas;
    }
}