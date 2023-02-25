package edu.javaoo.aula7.intermediario;

import edu.javaoo.aula7.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Aula1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com a medida X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com a medida Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triagle X area: %.4f%n", areaX);
        System.out.printf("Triagle Y area: %.4f%n", areaY);

        if (areaX > areaY){

            System.out.println("Larger area: X");
        } else {
            System.out.println("Large area Y");
        }







        sc.close();
    }
}
