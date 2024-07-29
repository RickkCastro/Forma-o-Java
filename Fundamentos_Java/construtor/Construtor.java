package construtor;

public class Construtor {
    // Construtor, metodo especial de classe que é chamado ao instanciar a classe

    // Se não houver nenhum construtor, java cria um, sem parametros

    private int numero;

    public Construtor(int numero) {
        this.numero = numero;
        System.out.println(numero);
    }

    public Construtor(int numero, String text) {
        this.numero = numero;
        System.out.println(numero);
        System.out.println(text);
    }

}
