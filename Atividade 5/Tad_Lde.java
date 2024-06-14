
public class Tad_Lde implements Lista {
    private Noh inicio;
    private Noh fim;

    public Tad_Lde() {
        this.inicio = null;
        this.fim = null;
    }

    public void insereInicio(Object info) {
        Noh novo = new Noh(info);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProx(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }
    }

    public void insereFim(Object info) {
        Noh novo = new Noh(info);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnterior(fim);
            fim.setProx(novo);
            fim = novo;
        }
    }

    public boolean estahVazia() {
        return inicio == null;
    }

    public boolean remove(Object info) {
        Noh p = inicio;
        while (p != null && p.getInfo() != info) // busca
            p = p.getProx();
        if (p == null) // não achou, então não faz nada e retorna false
            return false;
        if (p == inicio) { // info estah no inicio
            inicio = p.getProx();
            if (inicio != null)
                inicio.setAnterior(null);
            else
                fim = null;
        } else if (p.getProx() == null) { // info estah no fim
            p.getAnterior().setProx(null);
            fim = p.getAnterior();
        } else { // info estah no meio
            p.getAnterior().setProx(p.getProx());
            p.getProx().setAnterior(p.getAnterior());
        }
        return true;
    }

    public int tamanho() {
        int cont = 0;
        for (Noh i = inicio; i != null; i = i.getProx())
            cont++;
        return cont;
    }

    public void imprimeLista() {
        Noh atual = inicio; // Supondo que você tenha uma referência ao início da lista
        while (atual != null) {
            System.out.println(atual.toString()); // Isso vai chamar o método toString() de Noh
            atual = atual.getProx(); // Move para o próximo nó
        }
    }

    public void imprimeListaInverso() {
        Noh atual = fim; // Supondo que você tenha uma referência ao fim da lista
        while (atual != null) {
            System.out.println(atual.toString()); // Isso vai chamar o método toString() de Noh
            atual = atual.getAnterior(); // Move para o nó anterior
        }
    }
}
