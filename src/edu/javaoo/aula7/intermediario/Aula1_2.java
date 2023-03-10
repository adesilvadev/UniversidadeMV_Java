package edu.javaoo.aula7.intermediario;

import edu.javaoo.aula7.entities.Produtos;

import java.util.Locale;
import java.util.Scanner;

public class Aula1_2 {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Produto produto = new Produto();
    System.out.println("Entre com as informações do produto: ");
    System.out.print ("Nome: ");
    produto.nome = sc.nextLine();
    System.out.print("Preço: ");
    produto.preco = sc.nextDouble();
    System.out.print("Quantidade: ");
    produto.quantidade = sc.nextInt();

    System.out.println();



    sc.close();
}
