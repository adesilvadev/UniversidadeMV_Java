package edu.java.aula4;

import java.util.Scanner;

public class FuncoesMatematicas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x;

        x = sc.nextDouble();
        x = Math.sqrt(x);

        System.out.println("O resultado da raiz quadrada e"+ " " + x);

        sc.close();

    }
}
