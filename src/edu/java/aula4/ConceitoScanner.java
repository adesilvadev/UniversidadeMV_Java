package edu.java.aula4;

import java.util.Scanner;

public class ConceitoScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();

        System.out.println("Voce digitou o valor:" + " " + x);

        sc.close();


    }
}
