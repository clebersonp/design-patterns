package br.com.alura.flyweight.depois.fabrica;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.alura.flyweight.depois.interfaces.Nota;
import br.com.alura.flyweight.depois.notas.Do;
import br.com.alura.flyweight.depois.notas.Fa;
import br.com.alura.flyweight.depois.notas.La;
import br.com.alura.flyweight.depois.notas.Mi;
import br.com.alura.flyweight.depois.notas.Re;
import br.com.alura.flyweight.depois.notas.Si;
import br.com.alura.flyweight.depois.notas.Sol;

public class NotasMusicais {

    private static Map<String, Nota> notas = new HashMap<>();
    private static List<Class<? extends Nota>> clazzes;
    
    static {
        clazzes = Arrays.asList(Do.class, Re.class, Mi.class, Fa.class, Sol.class, La.class, Si.class);
    }
    
    public Nota getNota(String nota) {
        try {
            if (!notas.containsKey(nota)) {
                Class<? extends Nota> notaEncontrada = 
                                clazzes.stream()
                                    .filter(c -> c.getSimpleName().equalsIgnoreCase(nota))
                                    .findFirst()
                                    .orElse(null);
                
                if (notaEncontrada == null) {
                    throw new IllegalArgumentException(nota + ": Nota não encontrada!");
                }
                notas.put(nota, (Nota) notaEncontrada.newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return NotasMusicais.notas.get(nota);
    }
}