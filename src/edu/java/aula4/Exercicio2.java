package edu.java.aula4;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double pi = 3.14;

        double raio;
        raio = sc.nextDouble();

        double resultado = pi * (raio * raio);
        System.out.printf("%.4f", resultado);

        System.out.println();



        sc.close();


    }
}
