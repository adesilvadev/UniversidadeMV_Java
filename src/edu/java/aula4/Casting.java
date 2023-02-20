package edu.java.aula4;

public class Casting {

    public static void main(String[] args) {

        int var1 = 20;
        int var2 = 6;

        double resultado = (double) var1/var2;
        System.out.println(resultado);


    }
}

// Conceito: Neste caso tenho 2 variáveis do tipo "Int" e preciso que o o resultado seja do tipo "double". Assim,
// atribui "double" ao resutado para forçar o tipo. Esse movimento se chama Casting.