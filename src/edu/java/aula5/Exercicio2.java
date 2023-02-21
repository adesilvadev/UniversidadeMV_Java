package edu.java.aula5;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroTestado = sc.nextInt();
        String resultadoTeste;


        if (numeroTestado % 2 == 0){

            resultadoTeste = " O numero informador e PAR";

        } else {

            resultadoTeste = " O numero informador e IMPAR";
        }

        System.out.println(resultadoTeste);

        sc.close();
    }
}
