package primeirasAulas;

/*
 * public = tipo de acesso
 * class = tipo da classe
 * HelloWorld = Nome da classe
 */
public class HelloWorld {
    // Escopo da classe
    public static void main(String[] args) {
        /*
         * TIPOS DE DADOS:
         * Numeros (int, double, float, long)
         * Texto (String)
         * Booleanos (boolean)
         */

        int dadoDoTipoINT = 10;
        double dadoDoTipoDOUBLE = 555.5;
        float dadoDoTipoFLOAT = 5.5f;
        long dadoDoTipoLONG = 5555555555555555555L;
        String dadoDoTipoSTRING = "Hello World";

        int tamanhoTexto = dadoDoTipoSTRING.length();

        // if - else
        if (dadoDoTipoINT == 5) {
            System.out.println("O valor é igual a 5");
        } else if (dadoDoTipoINT == 10) {
            System.out.println("O valor é igual a 10");
        } else {
            System.out.println("O valor não é igual a 5, nem 10");
        }

        // Repetição
        int valorInicial = 0;
        while (valorInicial < 5) {
            valorInicial++;
            System.out.println(valorInicial);
        }

        for (int i = 0; i < valorInicial; i++) {
            System.out.println("O valor do i é: " + i);
        }

    }

}

// Fora do escopo da classe