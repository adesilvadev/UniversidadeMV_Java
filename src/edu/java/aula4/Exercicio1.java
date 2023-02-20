package edu.java.aula4;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        a = sc.nextInt();

        int b;
        b = sc.nextInt();

        int soma = a + b;
        System.out.println("A soma da Var A e B e igual a:" + " "+ soma);

        sc.close();
    }
}
