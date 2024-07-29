package pessoa;

public class Aluno extends Pessoa {
    private String matricula;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    String imprimirDadosDaPessoa() {
        System.out.println(super.imprimirDadosDaPessoa());
        return "Você é um aluno";
    }
}
