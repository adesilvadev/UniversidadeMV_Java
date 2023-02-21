package edu.java.aula5;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        String teste;

        if (entrada > 0){
            teste = "O numero informado e POSITIVO";

        } else if (entrada < 0) {
            teste = "O numero informado e NEGATIVO";

        } else {

            teste = "Informe um numero diferente de ZERO";
        }

        System.out.println(teste);
        sc.close();
    }
}
