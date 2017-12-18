package br.com.alura.decorator.desafio.teste;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.decorator.desafio.business.ContasDataAberturaNoMesCorrente;
import br.com.alura.decorator.desafio.business.ContasSaldoMaior500MilReais;
import br.com.alura.decorator.desafio.business.ContasSaldoMenorQue100Reais;
import br.com.alura.decorator.desafio.business.Filtro;
import br.com.alura.decorator.desafio.business.FiltroDeContas;
import br.com.alura.decorator.desafio.model.Conta;

public class TesteDesafioDecorator {

    public static void main(String[] args) {
        
        FiltroDeContas filtroDeContas = new FiltroDeContas();
        
        List<Conta> contas = new ArrayList<>();
        contas.add(new Conta("Cleberson", 10, LocalDate.now()));
        contas.add(new Conta("Felipe", 500.010, LocalDate.now()));
        contas.add(new Conta("Allan", 101, LocalDate.of(2015, Month.JULY, 16)));
        contas.add(new Conta("Julia", 150, LocalDate.now()));
        contas.add(new Conta("Anna", 150, LocalDate.now().plusDays(2L)));
        
        System.out.println("Antes do filtro: \n" + contas);
        
        Filtro filtroCombinado1 = new ContasSaldoMenorQue100Reais(
                                            new ContasDataAberturaNoMesCorrente());

        Filtro filtroCombinado2 = new ContasSaldoMaior500MilReais(
                        new ContasDataAberturaNoMesCorrente());

        Filtro filtroCombinado3 = new ContasDataAberturaNoMesCorrente();
        
        List<Conta> contasFiltradas1 = filtroDeContas.filtrarContas(contas, filtroCombinado1);
        List<Conta> contasFiltradas2 = filtroDeContas.filtrarContas(contas, filtroCombinado2);
        List<Conta> contasFiltradas3 = filtroDeContas.filtrarContas(contas, filtroCombinado3);
        
        System.out.println("\n Apos filtragem ContasSaldoMenorQue100Reais + ContasDataAberturaNoMesCorrente : \n" 
                        + contasFiltradas1 );
        
        System.out.println("\n Apos filtragem ContasSaldoMaior500MilReais + ContasDataAberturaNoMesCorrente : \n" 
                        + contasFiltradas2 );
        
        System.out.println("\n Apos filtragem ContasDataAberturaNoMesCorrente : \n" + contasFiltradas3 );
        
    }
}