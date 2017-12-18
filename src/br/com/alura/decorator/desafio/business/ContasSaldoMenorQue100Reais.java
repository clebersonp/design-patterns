package br.com.alura.decorator.desafio.business;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.decorator.desafio.model.Conta;

public class ContasSaldoMenorQue100Reais extends Filtro {

    public ContasSaldoMenorQue100Reais() {
        super();
    }
    
    public ContasSaldoMenorQue100Reais(Filtro proximoFiltro) {
        super(proximoFiltro);
    }
    
    @Override
    public List<Conta> filtrar(List<Conta> contas) {
        if (contas != null && !contas.isEmpty()) {
            List<Conta> contasFiltradas = contas.stream().filter(c -> c.getValor() < 100)
                            .collect(Collectors.toList());
            return super.proximoFiltro(contasFiltradas);
        }
        return new ArrayList<>(contas);
    }
}