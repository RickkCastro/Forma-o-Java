package conta;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("0000", "Henrique", 200);

        conta1.setNumero("2525");
        conta1.setTitular("Rickk");

        System.out.println(conta1.getNumero());
        System.out.println(conta1.getTitular());

        conta1.depositar(2800);
        conta1.sacar(473.90);
    }
}
