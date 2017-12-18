package br.com.alura.decorator.desafio.business;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.decorator.desafio.model.Conta;

public class ContasSaldoMaior500MilReais extends Filtro {

    private static final double QUINHENTOS_MIL = 500.000;

    public ContasSaldoMaior500MilReais() {
        super();
    }
    
    public ContasSaldoMaior500MilReais(Filtro proximoFiltro) {
        super(proximoFiltro);
    }
    
    @Override
    protected List<Conta> filtrar(List<Conta> contas) {
        if (contas != null && !contas.isEmpty()) {
            List<Conta> contasFiltradas = contas.stream()
                    .filter(c -> c.getValor() > QUINHENTOS_MIL)
                    .collect(Collectors.toList());
            return super.proximoFiltro(contasFiltradas);
        }
        return new ArrayList<>(contas);
    }
}