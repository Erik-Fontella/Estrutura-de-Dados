package Atividade11;

public class Aluno {

    String nome;
    int idade;
    float nota;

    public Aluno(String nome, int idade, float nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", idade=" + idade + ", nota=" + nota + '}';
    }

}
