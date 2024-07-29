package conta;

public class ContaBancaria {

    // Atributos - Variaveis
    private String numero;
    private String titular;
    private double saldo;

    // Contructor
    public ContaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Setters
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    // Getters

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Metodos - Ações

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depostio de R$ " + valor);
            System.out.println("Saldo atual de R$ " + saldo);
        } else {
            System.out.println("Valor do deposito invalido");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor);
            System.out.println("Saldo atual de R$ " + saldo);
        }
    }
}
