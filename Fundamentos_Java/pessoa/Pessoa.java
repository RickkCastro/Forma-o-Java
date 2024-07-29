package pessoa;

public class Pessoa {
    // Nome, idade, cpf

    private String nome;
    private int idade;
    private String cpf;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    String imprimirDadosDaPessoa() {
        return ("Nome: " + nome + ", idade: " + idade + ", cpf: " + cpf);
    }
}
