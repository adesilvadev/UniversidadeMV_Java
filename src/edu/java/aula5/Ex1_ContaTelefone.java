package edu.java.aula5;

import java.util.Locale;
import java.util.Scanner;

public class Ex1_ContaTelefone {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();

        double conta = 50.00;
        if (minutos > 100){

            conta += (minutos - 100) * 2.0;

        }

        System.out.printf("O valor da conta e R$ %.2f" , conta);

        sc.close();
    }
}
