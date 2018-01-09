package br.com.alura.flyweight.depois.teste;

import java.util.Arrays;
import java.util.List;

import org.jfugue.player.Player;

import br.com.alura.flyweight.depois.fabrica.NotasMusicais;
import br.com.alura.flyweight.depois.interfaces.Nota;


/*
 * utilizando o padrao flyweight e factory.
 * Fabrica que cria as notas que serao utilizadas,
 * e o padrao flyweight que ao inves de ficar varios objetos iguais, so reutiliza
 * as instancias ja criadas
 */
public class Programa {

    public static void main(String[] args) {
        
        NotasMusicais notas = new NotasMusicais();
        
        List<Nota> musica = Arrays.asList(
                        notas.getNota("do"),
                        notas.getNota("re"),
                        notas.getNota("mi"),
                        notas.getNota("fa"),
                        notas.getNota("fa"),
                        notas.getNota("fa"),
                        
                        notas.getNota("do"),
                        notas.getNota("re"),
                        notas.getNota("do"),
                        notas.getNota("re"),
                        notas.getNota("re"),
                        notas.getNota("re"),
                        
                        notas.getNota("do"),
                        notas.getNota("sol"),
                        notas.getNota("fa"),
                        notas.getNota("mi"),
                        notas.getNota("mi"),
                        notas.getNota("mi"),
                        
                        notas.getNota("do"),
                        notas.getNota("re"),
                        notas.getNota("mi"),
                        notas.getNota("fa"),
                        notas.getNota("fa"),
                        notas.getNota("fa"));
        
        StringBuilder sb = new StringBuilder();
        musica.stream().forEach(n -> {
            sb.append(n.getSimbolo()).append(" ");
        });
        
        Player tocador = new Player();
        tocador.play(sb.toString());
    }
    
}