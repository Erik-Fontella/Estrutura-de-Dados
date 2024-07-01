package Atividade11;

public class TadFilaLista {
    private Noh inicio;
    private Noh fim;

    public TadFilaLista() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean add(Object info) {
        Noh novo = new Noh(info);
        if (isEmpty()) {
            inicio = novo;
        } else {
            fim.setProx(novo);
        }
        fim = novo;
        return true;
    }

    public Object remove() {
        if (!isEmpty()) {
            Object valor = inicio.getInfo();
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else
                inicio = inicio.getProx();
            return valor;
        }
        return false;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public int size() {
        int cont = 0;
        Noh aux = inicio;
        while (aux != null) {
            cont++;
            aux = aux.getProx();
        }
        return cont;
    }

    public void print() {
        Noh aux = inicio;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }

}
