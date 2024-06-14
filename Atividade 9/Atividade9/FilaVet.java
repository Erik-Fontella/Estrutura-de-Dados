package Atividade9;

public class FilaVet implements IFila{
    private Object[] vet;
    private int inicio;
    private int numElementos;

    public FilaVet(int tam) {
        vet = new Object[tam];
        inicio = 0;
        numElementos = 0;
    }

    public boolean add(Object info) {
        if (numElementos == vet.length) {
            System.out.println("Fila cheia");
            return false;
        }
        int fim = (inicio + numElementos) % vet.length;
        vet[fim] = info;
        numElementos++;
        return true;
    }

    public boolean remove() {
        if (this.isEmpty()) {
            System.out.println("Fila vazia");
            return false;
        }
        inicio = (inicio + 1) % vet.length;
        numElementos--;
        return true;
    }

    public boolean isEmpty() {
        return numElementos == 0;
    }

    public int size() {
        return numElementos;
    }

    public void print() {
        for (int i = 0; i < numElementos; i++) {
            System.out.println(vet[(inicio + i) % vet.length]);
        }
    }

        
}
