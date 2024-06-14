package Atividade10;

public class TadListaFIla {
    private Noh inicio;
    private Noh fim;

    public TadListaFIla() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean add(Object info) {
        Noh novo = new Noh(info);
        if (isEmpty()) {
            inicio = novo;
        } else {
            fim.setProximo(novo);
        }
        fim = novo;
        return true;
    }

    public boolean remove(Object info) {
        if (isEmpty()) {
            return false;
        }
        inicio = inicio.getProximo();
        if (inicio == null) {
            fim = null;
        }
        return true;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public int size() {
        int cont = 0;
        Noh aux = inicio;
        while (aux != null) {
            cont++;
            aux = aux.getProximo();
        }
        return cont;
    }

    public void print() {
        Noh aux = inicio;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProximo();
        }
    }

    
}
