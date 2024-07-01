package Atividade11;

public class LSE {
    private Noh inicio;

    public LSE() {
        this.inicio = null;
    }

    public void insereInicio(Object info) {
        Noh novo = new Noh(info);
        if (inicio == null)
            inicio = novo;
        else {
            novo.setProx(inicio);
            inicio = novo;
        }
    }

    public void insereFim(Object info) { 
        Noh novo = new Noh(info);
        if (inicio == null)
            inicio = novo;
        else {
            Noh ultimo = null;
            for (Noh i = inicio; i != null; i = i.getProx())
                ultimo = i;
            ultimo.setProx(novo);
        }
    }

    public boolean estahVazia() {
        return inicio == null;
    }

    public boolean remove(Object info) {
        Noh ant = null, p;
        p = inicio;
        while (p != null && p.getInfo() != info) {
            ant = p;
            p = p.getProx();
        }
        if (p == null) 
            return false;
        if (ant == null) 
            inicio = p.getProx();
        else
            ant.setProx(p.getProx());
        return true;
    }

    public int tamanho() {
        int cont = 0;
        for (Noh i = inicio; i != null; i = i.getProx())
            cont++;
        return cont;
    }

    public Noh imprimeNoh(int pos) {
        Noh p = inicio;
        for (int i = 0; i < pos; i++)
            p = p.getProx();
        return p;
    }
}
