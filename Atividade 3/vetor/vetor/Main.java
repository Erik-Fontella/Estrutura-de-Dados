package vetor;

public class Main {

    public static void main(String[] args) {
        Aluno3 aluno = new Aluno3("João", 20, 8.5f);
    
        TAD_Vetor<Aluno3> vetorAluno = new TAD_Vetor<>();

        vetorAluno.adiciona(aluno);
        vetorAluno.adiciona(new Aluno3("Maria", 22, 9.0f));
        vetorAluno.adiciona(new Aluno3("Pedro", 21, 7.5f));

        System.out.println("Elementos do vetor de strings:");
        for (int i = 0; i < vetorAluno.totalAlunos(); i++) {
            Aluno3 alunoAtual = vetorAluno.contem(i);
            System.out.println("Nome: " + alunoAtual.nome + ", Idade: " + alunoAtual.idade + ", Nota: " + alunoAtual.nota);
        }

    }

}