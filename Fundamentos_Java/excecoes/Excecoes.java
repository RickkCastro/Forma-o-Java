package excecoes;

import pessoa.Pessoa;

public class Excecoes {

    // Checked exceptions - Consegue lidar, consegue brever

    // Unchecked exceptions - So aparecem quando executar

    public static void main(String[] args) {

        // Checked exceptions
        try {
            validarNumero();
        } catch (Exception e) {
            System.out.println("Deu ruim");
            e.printStackTrace();
        }

        // Unchecked exceptions
        Pessoa p = null;
        p.getCpf();
    }

    public static void validarNumero() throws Exception {
        int number = 10;

        if (number < 100) {
            throw new Exception("Numero maior do que deveria");
        }
    }
}
