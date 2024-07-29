package primeirasAulas;

import java.util.HashSet;
import java.util.Set;

public class ColecaoHashSet {
    public static void main(String[] args) {
        // Diferente do hash map, o hash set, tem apenas o valor
        // Não possuem index, ordenação não importa
        // Elementos sãoo unicos, diferente da lista, não permite valores duplicados

        Set<Integer> numeros = new HashSet<Integer>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);

        numeros.remove(10);

        System.out.println(numeros.contains(25));

        System.out.println("Tamanho: " + numeros.size());

        for (Integer elemento : numeros) {
            System.out.println(elemento);
        }
    }
}
