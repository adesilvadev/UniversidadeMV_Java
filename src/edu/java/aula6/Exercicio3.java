package edu.java.aula6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // PESQUISA DE CONSUMO:
        // DIGITE 0 (ZERO) PARA INICIAR O PROGRAMA;
        // PARA PARTICIPAR: Digite: 1 - Gasolina | 2 - Alcool | 3 - Diesel.
        // DIGITE 4 PARA ENCERRAR O PROGRAMA;

        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        int opcao = sc.nextInt();

        while (opcao != 4){

            if (opcao == 0){

                System.out.println("PARTICIPE DA NOSSA PESQUISA!");
                System.out.println("Digite: 1 - Gasolina | 2 - Alcool | 3 - Diesel.");

            } else if (opcao == 1) {

                System.out.println("Você escolheu Gasolina.");
                System.out.println("Obrigado por participar");
                gasolina = gasolina + 1;
                System.out.println("  ");
                System.out.println("PARTICIPE DA NOSSA PESQUISA!");
                System.out.println("Digite: 1 - Gasolina | 2 - Alcool | 3 - Diesel.");

            } else if (opcao == 2) {
                System.out.println("Você escolheu Alcool.");
                System.out.println("Obrigado por participar");
                alcool = alcool + 1;
                System.out.println("  ");
                System.out.println("PARTICIPE DA NOSSA PESQUISA!");
                System.out.println("Digite: 1 - Gasolina | 2 - Alcool | 3 - Diesel.");

            } else if (opcao == 3) {
                System.out.println("Você escolheu Diesel.");
                System.out.println("Obrigado por participar");
                diesel = diesel + 1;
                System.out.println("  ");
                System.out.println("PARTICIPE DA NOSSA PESQUISA!");
                System.out.println("Digite: 1 - Gasolina | 2 - Alcool | 3 - Diesel.");
        }
            opcao = sc.nextInt();
        }
        System.out.println("RESULTADO DA PESQUISA!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Diesel: " + diesel);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Obrigado por participar!");

        sc.close();
        }


    }
