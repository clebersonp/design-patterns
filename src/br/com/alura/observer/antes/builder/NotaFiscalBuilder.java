package br.com.alura.observer.antes.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.observer.antes.model.ItemDaNota;
import br.com.alura.observer.antes.model.NotaFiscal;

/*
 * Utilizando o design patter Builder e exemplo da nao utilizacao do Observer
 *
 * Nesse caso, que nao estamos usando o design Observer, o metodo que
 * cria a nota acaba aclopando muitas outras classe e aumenta sua responsabilidade,
 * pois alem de criar a nota tem que saber quais metodos tera que invocar para enviar a nota
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
    
    /*
     * A nao utilizacao do design patter Observer aumenta o aclopamento e responsabilidades
     */
    private void enviarPorEmail(NotaFiscal notaFiscal) {
        System.out.println("Enviando nota fiscal por email...");
    }
    
    private void enviarPorSMS(NotaFiscal notaFiscal) {
        System.out.println("Enviando nota fiscal por SMS...");
    }
    
    private void salvarNoBanco(NotaFiscal notaFiscal) {
        System.out.println("Salvando nota fiscal no banco...");
    }
    
    private void imprimir(NotaFiscal notaFiscal) {
        System.out.println("Imprimindo nota fiscal...");
    }
    /*
     * A nao utilizacao do design patter Observer aumenta o aclopamento e responsabilidades
     */
    
    public NotaFiscal constroi() {
        NotaFiscal notaFiscal = new NotaFiscal(this.razaoSocial, this.cnpj, this.dataEmissao, this.dataCompetencia,
                        this.valorBruto, this.impostos, this.itens, observacoes);
        
        /*
         * executar as acoes logo apos gerar a nota fiscal
         */
        this.enviarPorEmail(notaFiscal);
        this.enviarPorSMS(notaFiscal);
        this.salvarNoBanco(notaFiscal);
        this.imprimir(notaFiscal);
        /*
         * executar as acoes logo apos gerar a nota fiscal
         */
        
        return notaFiscal;
    }
}