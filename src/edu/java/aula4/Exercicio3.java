package edu.java.aula4;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        a = sc.nextInt();

        int b;
        b = sc.nextInt();

        int c;
        c = sc.nextInt();

        int d;
        d = sc.nextInt();

        int conjunto1 = a*b;
        int conjunto2 = c*d;

        int diferenca = conjunto1 - conjunto2;
        System.out.println("O resultado do calculo da diferenca e igual a:"+ " " + diferenca);

        sc.close();

    }
}
