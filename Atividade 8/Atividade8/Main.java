package Atividade8;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Tad_vetor vetor = new Tad_vetor();
        Random rand = new Random();

        for (int i = 0; i < 1000; i++) {
            vetor.adiciona(rand.nextInt(10000));
        }

        long tempoInicio = System.nanoTime();
        vetor.bubbleSort();
        long tempoFinal = System.nanoTime();
        System.out.println("Tempo de execução do boobleSort " + (tempoFinal - tempoInicio) + " ns");

        tempoInicio = System.nanoTime();
        vetor.selectionSort();
        tempoFinal = System.nanoTime();
        System.out.println("Tempo de execução do selectionSort " + (tempoFinal - tempoInicio) + " ns");

        tempoInicio = System.nanoTime();
        vetor.insertionSort();
        tempoFinal = System.nanoTime();
        System.out.println("Tempo de execução do insertionSort " + (tempoFinal - tempoInicio) + " ns");
    }
}
