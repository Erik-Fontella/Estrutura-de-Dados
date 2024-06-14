package Atividade6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Tad_vetor vetor = new Tad_vetor(); 
        Random rand = new Random();
    
        
        for (int i = 0; i < 1000; i++) {
            vetor.adiciona(rand.nextInt(10000));
        }
    
        long startTime, endTime, durationRec, durationIter;
    
       
        startTime = System.nanoTime();
        int maxRec = vetor.maximoRec(0, vetor.totalAlunos() - 1);
        endTime = System.nanoTime();
        durationRec = (endTime - startTime);
    

        startTime = System.nanoTime();
        int maxIter = vetor.maximoIterativo();
        endTime = System.nanoTime();
        durationIter = (endTime - startTime);
    
        System.out.println("Maior elemento (Recursivo): " + maxRec + " - Tempo: " + durationRec + " ns");
        System.out.println("Maior elemento (Iterativo): " + maxIter + " - Tempo: " + durationIter + " ns");
    }
}