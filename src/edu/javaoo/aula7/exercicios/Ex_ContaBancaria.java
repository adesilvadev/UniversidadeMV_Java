package edu.javaoo.aula7.exercicios;

import edu.javaoo.aula7.entities.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Ex_ContaBancaria {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaBancaria contaBancaria;

        System.out.println("Informe o numero da Conta: ");
        int numero = sc.nextInt();
        System.out.println("Informe o Titular da Conta: ");
        sc.nextLine();
        String pessoa = sc.nextLine();

        System.out.print("Deseja fazer um deposito inicial (y/n)? ");
        char resposta = sc.next().charAt(0);

        if (resposta == 'y') {
            System.out.print("Efetue o deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            contaBancaria = new ContaBancaria(numero,pessoa,depositoInicial);
        }
        else {
            contaBancaria = new ContaBancaria(numero,pessoa);
        }

        System.out.println();
        System.out.println("Dados da conta");
        System.out.println(contaBancaria);

        System.out.println();
        System.out.println("Entre com o valor do deposito: ");
        double valorDeposito = sc.nextDouble();
        contaBancaria.deposito(valorDeposito);
        System.out.println("Dados da conta atualizado");
        System.out.println(contaBancaria);

        System.out.println();
        System.out.println("Entre com o valor do saque");
        double valorSaque = sc.nextDouble();
        contaBancaria.saque(valorSaque);
        System.out.println("Dados da conta atualizado");
        System.out.println(contaBancaria);

        sc.close();
    }
}
