public class Main {
    public static void main(String[] args) {
        Tad_Lde lista = new Tad_Lde();
        lista.insereInicio(1);
        lista.insereInicio(2);
        lista.insereInicio(3);
        lista.insereInicio(4);
        lista.insereInicio(5);
        lista.insereInicio(6);
        lista.insereInicio(7);
        lista.insereFim(8);
        lista.insereFim(9);
        lista.insereFim(10);

        lista.imprimeLista();
        lista.imprimeListaInverso();
    }
}
