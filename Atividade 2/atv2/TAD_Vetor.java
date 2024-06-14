package atv2;
public class TAD_Vetor<T> {
    private Object[] alunos;
    private int tamanho;
    private static final int CAPACIDADE_PADRAO = 10;

    public TAD_Vetor() {
        this.alunos = new Object[CAPACIDADE_PADRAO];
        this.tamanho = 0;
    }

    public void adicionar(T elemento) {
        if (tamanho == alunos.length) {
            // Se o alunos estiver cheio, aumente sua capacidade
            aumentarCapacidade();
        }
        alunos[tamanho] = elemento;
        tamanho++;
    }

    @SuppressWarnings("unchecked")
    public T obter(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice fora dos limites.");
        }
        return (T) alunos[indice];
    }

    public int tamanho() {
        return tamanho;
    }

    private void aumentarCapacidade() {
        int novaCapacidade = alunos.length * 2;
        Object[] novoArray = new Object[novaCapacidade];
        System.arraycopy(alunos, 0, novoArray, 0, tamanho);
        alunos = novoArray;
    }
}