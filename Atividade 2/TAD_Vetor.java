public class TAD_Vetor<T> {
    private Object[] array;
    private int tamanho;
    private static final int CAPACIDADE_PADRAO = 10;

    public TAD_Vetor() {
        this.array = new Object[CAPACIDADE_PADRAO];
        this.tamanho = 0;
    }

    public void adicionar(T elemento) {
        if (tamanho == array.length) {
            // Se o array estiver cheio, aumente sua capacidade
            aumentarCapacidade();
        }
        array[tamanho] = elemento;
        tamanho++;
    }

    @SuppressWarnings("unchecked")
    public T obter(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice fora dos limites.");
        }
        return (T) array[indice];
    }

    public int tamanho() {
        return tamanho;
    }

    private void aumentarCapacidade() {
        int novaCapacidade = array.length * 2;
        Object[] novoArray = new Object[novaCapacidade];
        System.arraycopy(array, 0, novoArray, 0, tamanho);
        array = novoArray;
    }
}