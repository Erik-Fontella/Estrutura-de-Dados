package Atividade11;

public class Main {
    public static void inverterLista(TadFilaLista fila) {
        PilhaLista pilha = new PilhaLista();
        while (!fila.isEmpty()) {
            pilha.push(fila.remove());
        }
        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }
    }
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João", 20, 8.5f);
        Aluno a2 = new Aluno("Maria", 21, 9.0f);
        Aluno a3 = new Aluno("José", 22, 7.5f);
        Aluno a4 = new Aluno("Ana", 23, 6.5f);

        TadFilaLista lista = new TadFilaLista();
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);

        System.out.println("Fila original:");
        lista.print();

        inverterLista(lista);

        System.out.println("Fila invertida:");
        lista.print();

    }
}
