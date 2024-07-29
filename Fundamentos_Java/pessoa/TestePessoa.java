package pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("52112414");
        pessoa.setNome("Rickk");
        pessoa.setIdade(19);

        System.out.println(pessoa.imprimirDadosDaPessoa());

        Professor professor = new Professor();

        professor.setNome("Carfeio");
        professor.setIdade(100);
        professor.setCpf("66666666");
        professor.setSalario(10000);

        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();

        aluno.setCpf("123456789");
        aluno.setNome("Givs");
        aluno.setIdade(17);
        aluno.setMatricula("312312");

        System.out.println(aluno.imprimirDadosDaPessoa());
    }
}
