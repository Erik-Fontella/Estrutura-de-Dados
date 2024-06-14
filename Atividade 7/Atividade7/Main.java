package Atividade7;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Tad_vetor vetor = new Tad_vetor();
        Random rand = new Random();

        for (int i = 0; i < 1000; i++) {
            vetor.adiciona(rand.nextInt(10000));
        }

        vetor.ordenaArray();
        int alvo = vetor.tamanho() - 1;

        long tempoInicio = System.nanoTime();
        vetor.buscaBinariaInterativa(alvo);
        long tempoFinal = System.nanoTime();
        System.out.println("Tempo de execução da busca binária: " + (tempoFinal - tempoInicio) + " ns");

        tempoInicio = System.nanoTime();
        vetor.buscaBinariaRecursiva(alvo, 0, vetor.tamanho() - 1);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo de execução da busca binária recursiva: " + (tempoFinal - tempoInicio) + " ns");
    }
}