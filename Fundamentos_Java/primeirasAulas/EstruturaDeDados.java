package primeirasAulas;

import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        // Lista
        List<String> nomes = new ArrayList<String>();

        nomes.add("Henrique");
        nomes.add("Giovanna");
        nomes.add("Thiago");
        nomes.add("Kato");

        System.out.println(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.forEach(nome -> System.out.println(nome));

        nomes.forEach(System.out::println);
    }
}
