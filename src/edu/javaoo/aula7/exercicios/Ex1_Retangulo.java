package edu.javaoo.aula7.exercicios;

import edu.javaoo.aula7.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1_Retangulo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Informe a altura e a largura do retangulo:");
        retangulo.altura = sc.nextDouble();
        retangulo.largura = sc.nextDouble();

        System.out.printf("Area = %.2f%n ", retangulo.area());
        System.out.printf("Perimetro = %.2f%n ", retangulo.perimetro());
        System.out.printf("Diagonal = %.2f%n ", retangulo.diagoral());

        sc.close();


    }
}
