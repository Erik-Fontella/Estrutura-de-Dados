package atv2;

public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 20, 8.5f);
    
        TAD_Vetor<Aluno> vetorAluno = new TAD_Vetor<>();


        vetorAluno.adicionar(aluno);
        vetorAluno.adicionar(new Aluno("Maria", 22, 9.0f));
        vetorAluno.adicionar(new Aluno("Pedro", 21, 7.5f));

        System.out.println("Elementos do vetor de strings:");
        for (int i = 0; i < vetorAluno.tamanho(); i++) {
            System.out.println("Nome: " + aluno.nome + ", Idade: " + aluno.idade + ", Nota: " + aluno.nota);
        }
    }
}