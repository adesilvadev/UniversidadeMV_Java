package edu.javaoo.aula7.intermediario;

import java.util.Locale;
import java.util.Scanner;

public class Aula3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidadeEntradas = sc.nextInt();
        double[] vetor = new double[quantidadeEntradas];

        for (int i=0; i<quantidadeEntradas; i++) {

            vetor[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i=0; i<quantidadeEntradas; i++){

            soma += vetor[i];
        }

        double media = soma / quantidadeEntradas;
        System.out.printf("Altura media: %.2f%n ", media);



        sc.close();
    }
}
