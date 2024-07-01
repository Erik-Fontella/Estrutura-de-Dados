package Atividade11;

public class Noh {
    private Object info;
    private Noh proximo;

    public Noh(Object info) {
        this.info = info;
        this.proximo = null;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Noh getProx() {
        return proximo;
    }

    public void setProx(Noh proximo) {
        this.proximo = proximo;
    }

    
}
