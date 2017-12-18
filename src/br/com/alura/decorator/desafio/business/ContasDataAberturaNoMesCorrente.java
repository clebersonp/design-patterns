package br.com.alura.decorator.desafio.business;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.decorator.desafio.model.Conta;

public class ContasDataAberturaNoMesCorrente extends Filtro {

    public ContasDataAberturaNoMesCorrente() {
        super();
    }
    
    public ContasDataAberturaNoMesCorrente(Filtro proximoFiltro) {
        super(proximoFiltro);
    }
    
    @Override
    protected List<Conta> filtrar(List<Conta> contas) {
        if (contas != null && !contas.isEmpty()) {
            List<Conta> contasFiltradas = contas.stream()
                    .filter(c -> isMesAberturaIgualAoMesCorrente(c.getDataAbertura()))
                    .collect(Collectors.toList());
            return super.proximoFiltro(contasFiltradas);
        }
        return new ArrayList<>(contas);
    }
    
    private boolean isMesAberturaIgualAoMesCorrente(LocalDate dataAbertura) {
        LocalDate dataAtual = LocalDate.now();
        if (dataAbertura != null) {
            YearMonth anoMesAtual = YearMonth.from(dataAtual);
            YearMonth anoMesAbertura = YearMonth.from(dataAbertura);
            return anoMesAtual.equals(anoMesAbertura);
        }
        return false;
    }
}