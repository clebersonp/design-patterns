package br.com.alura.builder.depois.teste;

import java.time.LocalDate;

import br.com.alura.builder.depois.builder.ItemDaNotaBuilder;
import br.com.alura.builder.depois.builder.NotaFiscalBuilder;
import br.com.alura.builder.depois.model.ItemDaNota;
import br.com.alura.builder.depois.model.NotaFiscal;

public class TesteComBuilder {

    public static void main(String[] args) {
        
        ItemDaNota item = new ItemDaNotaBuilder()
                        .comItem("Meu Item")
                        .comValor(5000.0)
                        .constroi();
        
        NotaFiscal notaFiscal = new NotaFiscalBuilder()
                        .paraEmpresa("Minha razao social")
                        .comCNPJ("00.000.000/0000-00")
                        .comDataEmissaoEm(LocalDate.now())
                        .comDataCompetenciaEm(LocalDate.now().minusMonths(1L))
                        .comObservacoes("Minhas observacoes")
                        .comValorBruto(5000.00)
                        .comImpostos(250.0)
                        .comNovo(item)
                        .constroi();
        
        System.out.println("Criando objetos complexos com builder!");
        System.out.println(notaFiscal);
        
    }
}