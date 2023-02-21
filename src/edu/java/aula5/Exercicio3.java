package edu.java.aula5;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int primeiroNumero = sc.nextInt();
        int segundoValor = sc.nextInt();

        if (primeiroNumero % segundoValor == 0 || segundoValor % primeiroNumero == 0) {

            System.out.println("Os valores sao MULTIPLOS!");
        } else {

            System.out.println("Os valores NAO sao MULTIPLOS!");

        }

        sc.close();
    }
}
