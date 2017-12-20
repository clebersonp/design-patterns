package br.com.alura.observer.novoExemplo.teste;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import br.com.alura.observer.novoExemplo.builder.ItemDaNotaBuilder;
import br.com.alura.observer.novoExemplo.builder.NotaFiscalBuilder;
import br.com.alura.observer.novoExemplo.business.EmissorNotaFiscal;
import br.com.alura.observer.novoExemplo.business.EnviadorNotaFiscalPorEmail;
import br.com.alura.observer.novoExemplo.business.EnviadorNotaFiscalPorSms;
import br.com.alura.observer.novoExemplo.business.NotaFiscalDao;
import br.com.alura.observer.novoExemplo.model.ItemDaNota;
import br.com.alura.observer.novoExemplo.model.NotaFiscal;

public class TesteObserverComApiJava {
    
    public static void main(String[] args) {
        
        ItemDaNota itemDaNota = new ItemDaNotaBuilder()
            .comItem("Prestacao de servico de TI")
            .comValor(5000.0)
            .constroi();
        
        NotaFiscal notaFiscal = new NotaFiscalBuilder()
            .comCNPJ("00.000.000/0000-00")
            .paraEmpresa("Minha empresa")
            .comImpostos(430.0)
            .comValorBruto(5000.0)
            .comObservacoes("Servico de TI")
            .comDataEmissaoEm(LocalDate.now())
            .comDataCompetenciaEm(LocalDate.now().minusMonths(2L))
            .comNovo(itemDaNota)
            .constroi();
        
        // criando os observers
        List<Observer> observers = new ArrayList<>();
        observers.add(new EnviadorNotaFiscalPorSms());
        observers.add(new EnviadorNotaFiscalPorEmail());
        observers.add(new NotaFiscalDao());

        // passando os observers via construtor;
        EmissorNotaFiscal emissaoDaNota = new EmissorNotaFiscal(observers);
        emissaoDaNota.emitir(notaFiscal);
    }
    
}