package br.com.alura.builder.depois.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.builder.depois.model.ItemDaNota;
import br.com.alura.builder.depois.model.NotaFiscal;

/*
 * O design patter builder permite isolar toda complexidade de criar um objeto com muitos atributos
 * que muitas vezes sao opcionais.
 */

public class NotaFiscalBuilder {

    private static final double CINCO_POR_CENTO = 0.05;
    private String razaoSocial;
    private String cnpj;
    private String observacoes;
    private double valorBruto;
    private double impostos;
    private LocalDate dataEmissao;
    private LocalDate dataCompetencia;
    private List<ItemDaNota> itens = new ArrayList<>();
    
    public NotaFiscalBuilder() {
        this.dataEmissao = LocalDate.now();
    }
    
    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }
    
    public NotaFiscalBuilder comCNPJ(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }
    
    public NotaFiscalBuilder comObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }
    
    public NotaFiscalBuilder comValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
        return this;
    }
    
    public NotaFiscalBuilder comImpostos(double impostos) {
        this.impostos = impostos;
        return this;
    }
    
    public NotaFiscalBuilder comDataEmissaoEm(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }
    
    public NotaFiscalBuilder comDataCompetenciaEm(LocalDate dataCompetencia) {
        this.dataCompetencia = dataCompetencia;
        return this;
    }
    
    public NotaFiscalBuilder comNovo(ItemDaNota item) {
        this.itens.add(item);
        this.valorBruto += item.getValor();
        this.impostos += item.getValor() * CINCO_POR_CENTO;
        return this;
    }
    
    public NotaFiscal constroi() {
        NotaFiscal notaFiscal = new NotaFiscal(this.razaoSocial, this.cnpj, this.dataEmissao, this.dataCompetencia,
                        this.valorBruto, this.impostos, this.itens, observacoes);
        return notaFiscal;
    }
}