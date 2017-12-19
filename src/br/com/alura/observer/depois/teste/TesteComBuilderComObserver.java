package br.com.alura.observer.depois.teste;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.observer.depois.builder.ItemDaNotaBuilder;
import br.com.alura.observer.depois.builder.NotaFiscalBuilder;
import br.com.alura.observer.depois.business.AcaoAposGerarNota;
import br.com.alura.observer.depois.business.EnviadorDeEmail;
import br.com.alura.observer.depois.business.EnviadorDeSms;
import br.com.alura.observer.depois.business.Impressora;
import br.com.alura.observer.depois.business.Multiplicador;
import br.com.alura.observer.depois.business.NotaFiscalDao;
import br.com.alura.observer.depois.model.ItemDaNota;
import br.com.alura.observer.depois.model.NotaFiscal;

public class TesteComBuilderComObserver {

    public static void main(String[] args) {
        
        ItemDaNota item = new ItemDaNotaBuilder()
                        .comItem("Meu Item")
                        .comValor(5000.0)
                        .constroi();
        
        /*
         * Criando e adicionando os Observer atraves do pattern Builder
         * Passando a lista de observers via construtor
         */
        List<AcaoAposGerarNota> acoesObservers = new ArrayList<>();
        acoesObservers.add(new EnviadorDeEmail());
        acoesObservers.add(new EnviadorDeSms());
        acoesObservers.add(new NotaFiscalDao());
        acoesObservers.add(new Impressora());
        acoesObservers.add(new Multiplicador(2.0));
        acoesObservers.add(new Multiplicador(5.0));
        acoesObservers.add(new Multiplicador(6.5));
        
        NotaFiscal notaFiscal = new NotaFiscalBuilder(acoesObservers)
                        .paraEmpresa("Minha razao social")
                        .comCNPJ("00.000.000/0000-00")
                        .comDataEmissaoEm(LocalDate.now())
                        .comDataCompetenciaEm(LocalDate.now().minusMonths(1L))
                        .comObservacoes("Minhas observacoes")
                        .comValorBruto(5000.00)
                        .comImpostos(250.0)
                        .comNovo(item)
                        .constroi();
    }
}