package br.com.alura.builder.antes.teste;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.builder.antes.model.ItemDaNota;
import br.com.alura.builder.antes.model.NotaFiscal;

public class TesteSemBuilder {

    public static void main(String[] args) {

        List<ItemDaNota> itens = new ArrayList<>();
        itens.add(new ItemDaNota("qualquer item", 5000.0));
        LocalDate hoje = LocalDate.now();
        LocalDate mesPassado = LocalDate.now().minusMonths(1L);
        String razaoSocial = "razao social qualquer";
        String cnpj = "00.000.000/0000-00";
        double valorBruto = 5000.0;
        double impostos = 500.0;
        String observacoes = "observacoes vao aqui";

        NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, hoje, mesPassado,
                        valorBruto, impostos, itens, observacoes);

        System.out.println("Nota fiscal criada sem o auxilio de builder");
        System.out.println(notaFiscal);
        
    }
}
