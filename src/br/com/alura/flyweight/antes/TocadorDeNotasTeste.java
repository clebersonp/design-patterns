package br.com.alura.flyweight.antes;

import java.util.Arrays;
import java.util.List;

import org.jfugue.player.Player;

import br.com.alura.flyweight.antes.interfaces.Nota;
import br.com.alura.flyweight.antes.notas.Do;
import br.com.alura.flyweight.antes.notas.Fa;
import br.com.alura.flyweight.antes.notas.Mi;
import br.com.alura.flyweight.antes.notas.Re;
import br.com.alura.flyweight.antes.notas.Sol;

/*
 * Sao necessarios milhares de objetos iguais, com mesmo comportamento, para fazer uma determinada acao.
 * Ex. em todos os lugares que sao instaciados a nota Do, ela e a mesma que as outras, mas eu estou criando
 * varias notas Do. Esse e um problema pois a criacao de objetos faz com que ocupe muito espaco de memoria
 */

public class TocadorDeNotasTeste {

    public static void main(String[] args) {
        
        List<Nota> doReMiFa = Arrays.asList(
                        new Do(), new Re(), new Mi(), new Fa(), new Fa(), new Fa(),
                        new Do(), new Re(), new Do(), new Re(), new Re(), new Re(),
                        new Do(), new Sol(), new Fa(), new Mi(), new Mi(), new Mi(),
                        new Do(), new Re(), new Mi(), new Fa(), new Fa(), new Fa());
        
        StringBuilder sb = new StringBuilder();
        doReMiFa.stream().forEach(n -> {
            sb.append(n.getSimbolo()).append(" ");
        });
        
        Player player = new Player();
        player.play(sb.toString());
    }
}