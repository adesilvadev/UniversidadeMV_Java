package edu.java.aula5;

import java.util.Scanner;

public class Ex3_DiasDaSemana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        String dia;

        switch (valor){

            case 1:
                dia = "domingo";
                break;

            case 2:
                dia = "segunda";
                break;

            case 3:
                dia = "terca";
                break;

            case 4:
                dia = "quarta";
                break;

            case 5:
                dia = "quinta";
                break;

            case 6:
                dia = "sexta";
                break;

            case 7:
                dia = "sabado";
                break;

            default:
                dia = "Valor invalido!";
                break;
        }

        System.out.println("O dia da semana e: " + dia);

        sc.close();
    }
}
