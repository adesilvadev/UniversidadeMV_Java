package edu.java.aula6;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int primeiroNumero = sc.nextInt();
        int segundoNumero = sc.nextInt();

        while (primeiroNumero != 0 && segundoNumero != 0){

            if (primeiroNumero > 0 && segundoNumero > 0) {

                System.out.println("primeiro");
            } else if (primeiroNumero < 0 && segundoNumero > 0) {

                System.out.println("segundo");
            } else if (primeiroNumero > 0 && segundoNumero < 0) {

                System.out.println("terceiro");
            }

             else {

                System.out.println("quarto");
            }

             primeiroNumero = sc.nextInt();
             segundoNumero = sc.nextInt();
            }

        sc.close();
        }


        }

