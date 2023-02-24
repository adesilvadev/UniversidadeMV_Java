package edu.java.aula6;

import java.util.Scanner;

public class While_Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        while (valor < 5) {

            System.out.println("Aqui:"+ " " + valor);
            break;
        }

        if (valor > 5) {
            System.out.println("O numero informado é maior que 5.");
            System.out.println("Fim do programa. Obrigado!");
        }

        sc.close();
    }
}
