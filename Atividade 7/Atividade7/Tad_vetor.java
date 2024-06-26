package Atividade7;

import java.util.Arrays;

public class Tad_vetor {
    private Object[] vetor;
    private int tamanho;
    private int capacidade;

    public Tad_vetor() {
        this.capacidade = 10;
        this.vetor = new Object[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(Object info) {
        if (tamanho == capacidade) {
            capacidade *= 2;
            Object[] novoVetor = new Object[capacidade];
            for (int i = 0; i < tamanho; i++) {
                novoVetor[i] = vetor[i];
            }
            vetor = novoVetor;
        }
        vetor[tamanho] = info;
        tamanho++;
    }

    public Object contem(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            return null;
        }
        return vetor[posicao];
    }

    public int tamanho() {
        return tamanho;
    }

    public int maximoRec(int inicio, int fim) {
        if (inicio == fim)
            return (Integer) vetor[inicio];
        else {
            int meio = (inicio + fim) / 2;
            int max1 = maximoRec(inicio, meio);
            int max2 = maximoRec(meio + 1, fim);
            return Math.max(max1, max2);
        }
    }
    public int maximoIterativo() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tamanho; i++) {
            max = Math.max(max, (Integer) vetor[i]);
        }
        return max;
    }

    public int buscaBinariaInterativa(int valor) {
        int inicio = 0;
        int fim = tamanho - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if ((Integer) vetor[meio] == valor) {   
                return meio;
            } else if ((Integer) vetor[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1; 
            }
        }
        return -1;
    }   

    public int buscaBinariaRecursiva(int alvo, int baixo, int alto) {
        if (baixo > alto) {
            return -1; // Alvo não encontrado
        }
        int meio = baixo + (alto - baixo) / 2;
        if ((Integer) vetor[meio] == alvo) {
            return meio;
        } else if ((Integer) vetor[meio] < alvo) {
            return buscaBinariaRecursiva(alvo, meio + 1, alto);
        } else {
            return buscaBinariaRecursiva(alvo, baixo, meio - 1);
        }
    }

    public void ordenaArray() {
        Arrays.sort(vetor, 0, tamanho);
    }
}
