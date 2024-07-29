package primeirasAulas;

import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Gi", 10);
        notas.put("Rickk", 5);
        notas.put("Thiago", 15);

        var notaD = notas.get("Gi");
        System.out.println(notaD);

        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " tirou: " + value);
        }

        // Trabalha com chave unica
    }
}
