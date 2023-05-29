// Author Eduardo Vinicius de Oliveira
public class PrimeiraClasse {
    public static void main(String args[]) {
        Aluno aluno = new Aluno();
        Academico academico = new Academico();
        /**
         * Imprimindo o nome, endereço, idade e materias que o aluno irá cursar
         */
        aluno.nomeAluno("Eduardo");
        aluno.enderecoAluno("Rua Isolethe Augusta");
        aluno.idadeAluno(25);
        academico.materiasAluno("Lógica de programação, Algoritmo I, Matemática Computacional");
        System.out.println(aluno.getNome());
        System.out.println(aluno.getEndereco());
        System.out.println(aluno.getIdade());
        System.out.println(academico.getMaterias());

    }
}
