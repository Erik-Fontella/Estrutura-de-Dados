package Atividade11;

public class PilhaLista implements IPilha{
    private Noh top;
    private int elementos;

    public PilhaLista() {
        top = null;
        elementos = 0;
    }

    public boolean push(Object info) {
        Noh novo = new Noh(info);
        novo.setProx(top);
        top = novo;
        elementos++;
        return true;
    }

    public Object pop() {
        if (this.isEmpty()){
            System.out.println("pilha vazia");
            return null;
        }
        Object info = top.getInfo();
        top = top.getProx();
        elementos--;
        return info;
    }

    public Object top() {
        if (this.isEmpty()){
            System.out.println("pilha vazia");
            return null;
        }
        return top.getInfo();
    }

    public boolean isEmpty() {
        return elementos == 0;
    }

    public int size() {
        return elementos;
    }

    public void print() {
        Noh aux = top;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }

    
}
