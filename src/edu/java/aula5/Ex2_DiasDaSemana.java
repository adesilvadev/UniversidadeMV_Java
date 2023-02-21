package edu.java.aula5;

import java.util.Scanner;

public class Ex2_DiasDaSemana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        String dia;

        if (valor == 1){

            dia = "Domingo";
        } else if (valor == 2) {

            dia = "Segunda-feira";

        } else if (valor == 3) {

            dia = "Terca-feira";

        } else if (valor == 4) {

            dia = "Quarta-feira";

        } else if (valor == 5) {

            dia = "Quinta-feira";

        } else if (valor == 6) {

            dia = "Sexta-feira";

        } else if (valor == 7) {

            dia = "Sabado";

        } else {

            dia = "Valor invalido! (Informe um valor de 1 a 7).";
        }

        System.out.println(dia);


        sc.close();
    }
}
