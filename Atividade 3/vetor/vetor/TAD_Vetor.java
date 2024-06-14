package vetor;

public class TAD_Vetor<T> implements IVetor<T>{
    private Object[] alunos;
    private int totalAlunos;
    

    public TAD_Vetor() {
        this.alunos = new Object[10];
        this.totalAlunos = 0;
    }

    public void adiciona(T elemento) {
        this.garanteEspaco();
        alunos[totalAlunos] = elemento;
        totalAlunos++;
    }
       

    @SuppressWarnings("unchecked")
    public T contem(int indice) {
        if (indice < 0 || indice >= totalAlunos) {
            throw new IndexOutOfBoundsException("Índice fora dos limites.");
        }
        return (T) alunos[indice];
    }

    public int totalAlunos() {
        return totalAlunos;
    }

    public boolean cheio(){
        if (totalAlunos == this.alunos.length)
            return true;
        return false;

    }
    private void garanteEspaco() {
        if (this.cheio()){
            int novaCapacidade = alunos.length * 2;
            Object[] novoArray = new Object[novaCapacidade];
            System.arraycopy(alunos, 0, novoArray, 0, totalAlunos);
            alunos = novoArray;
        }
    }
    public boolean remove(T elemento) {
        int indice = -1;
        for (int i = 0; i < totalAlunos; i++) 
            if (elemento.equals(alunos[i])) {
                indice = i; 
                break;
            }
        if (indice != -1) {
            for (int i = indice; i < totalAlunos - 1; i++) 
                alunos[i] = alunos[i + 1];
                totalAlunos--;
                return true;  
        }
        return false;

    }
}