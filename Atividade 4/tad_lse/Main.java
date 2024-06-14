package tad_lse;
public class Main {
    public static void main(String[] args) {
        LSE lista = new LSE();
        lista.insereInicio(10);
        lista.insereInicio(20);
        lista.insereInicio(new Aluno("João", 20, 8.5f));
        lista.insereInicio(30);
        lista.insereFim(new Aluno("Maria", 22, 9.0f));
        lista.insereFim("Sera mesmo o fim?");
        
        
        int pos = 0; // A posição do nó que você quer imprimir
        System.out.println("Elementos do tad_lse:");
        for (int i = 0; i < lista.tamanho(); i++) {
            System.out.println(lista.imprimeNoh(pos).getInfo());
            pos++;
        }
}
}
