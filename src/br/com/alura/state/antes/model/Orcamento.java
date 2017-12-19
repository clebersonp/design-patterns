package br.com.alura.state.antes.model;

public class Orcamento {

    private double valor;
    private int estadoAtual;
    private static final int EM_APROVACAO = 1;
    private static final int APROVADO = 2;
    private static final int REPROVADO = 3;
    private static final int FINALIZADO = 4;
    
    public Orcamento(double valor) {
        this.valor = valor;
        this.estadoAtual = EM_APROVACAO;
    }

    // a complexidade aumenta muito pois podem existir muitas condicoes e variacoes.
    // teria que ficar validando o estado atual do orcamento em todos os metodo que utilizam o estado
    // para tomar a decisao
    public void aplicarDescontoExtra() {
        if (this.estadoAtual == EM_APROVACAO) {
            this.valor -= (this.valor * 0.05); 
        } else if (this.estadoAtual == APROVADO) {
            this.valor -= (this.valor * 0.02);
        } else if (this.estadoAtual == REPROVADO) {
            throw new IllegalStateException("Orcamentos reprovados nao recebem descontos extras!");
        } else if (this.estadoAtual == FINALIZADO) {
            throw new IllegalStateException("Orcamentos finalizados nao recebem descontos extras!");
        }
    }

    // as validacoes se tornam complexas pois podem existir muitas possibilidades
    public void aprovar() {
        if (this.estadoAtual == EM_APROVACAO) {
            this.estadoAtual = APROVADO;
        }
    }
    
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstadoAtual() {
        return estadoAtual;
    }
    public void setEstadoAtual(int estadoAtual) {
        this.estadoAtual = estadoAtual;
    }
}