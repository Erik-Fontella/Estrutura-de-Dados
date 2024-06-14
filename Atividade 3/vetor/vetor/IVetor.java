package vetor;

public interface IVetor<T> {
    public void adiciona(T elemento);
    public int totalAlunos();
    public T contem(int indice);
    public boolean cheio();
    public boolean remove(T elemento);
}