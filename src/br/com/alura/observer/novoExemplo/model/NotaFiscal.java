package br.com.alura.observer.novoExemplo.model;

import java.time.LocalDate;
import java.util.List;

public class NotaFiscal {

    private String razaoSocial;
    private String cnpj;
    private LocalDate dataEmissao;
    private LocalDate dataCompetencia;
    private double valorBruto;
    private double impostos;
    private List<ItemDaNota> itens;
    private String observacoes;
    
    public NotaFiscal() {
    }
    
    public NotaFiscal(String razaoSocial, String cnpj, LocalDate dataEmissao, 
                    LocalDate dataCompetencia, double valorBruto, double impostos,
                    List<ItemDaNota> itens, String observacoes) {

        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataEmissao = dataEmissao;
        this.dataCompetencia = dataCompetencia;
        this.valorBruto = valorBruto;
        this.impostos = impostos;
        this.itens = itens;
        this.observacoes = observacoes;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public LocalDate getDataEmissao() {
        return dataEmissao;
    }
    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
    
    public LocalDate getDataCompetencia() {
        return dataCompetencia;
    }
    public void setDataCompetencia(LocalDate dataCompetencia) {
        this.dataCompetencia = dataCompetencia;
    }
    
    public double getValorBruto() {
        return valorBruto;
    }
    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }
    
    public double getImpostos() {
        return impostos;
    }
    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }
    
    public List<ItemDaNota> getItens() {
        return itens;
    }
    public void setItens(List<ItemDaNota> itens) {
        this.itens = itens;
    }
 
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "NotaFiscal [razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", dataEmissao=" + dataEmissao + ", dataCompetencia="
            + dataCompetencia + ", valorBruto=" + valorBruto + ", impostos=" + impostos + ", itens=" + itens + ", observacoes="
            + observacoes + "]";
    }
}