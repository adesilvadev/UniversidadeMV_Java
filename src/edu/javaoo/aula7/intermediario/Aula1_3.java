package edu.javaoo.aula7.intermediario;

import edu.javaoo.aula7.entities.Calculadora;

import java.util.Scanner;

public class Aula1_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o Radius");
        double radius = sc.nextDouble();

        double c = Calculadora.circunferencia(radius);
        double v = Calculadora.volume(radius);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI volume: %.2f%n", Calculadora.PI);

        sc.close();
    }
}
