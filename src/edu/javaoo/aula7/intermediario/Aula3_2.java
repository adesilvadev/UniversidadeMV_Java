package edu.javaoo.aula7.intermediario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Aula3_2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        list.add("Ademilton");
        list.add("Priscila");
        list.add("Ignazio");
        list.add("Mirella");
        list.add(2,"Gustavo");

        System.out.println(list.size());
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-------------------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        sc.close();

        System.out.println("-------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
    }
}
