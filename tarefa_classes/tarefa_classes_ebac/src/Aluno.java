public class Aluno {
    private String nome;
    private String endereco;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void nomeAluno(String nome){
        this.nome = nome;
    }

    public void enderecoAluno(String endereco){
        this.endereco = endereco;}

    public void idadeAluno(int idade){
        this.idade =idade;
    }
}