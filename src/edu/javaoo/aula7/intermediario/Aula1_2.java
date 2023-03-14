package edu.javaoo.aula7.intermediario;

import edu.javaoo.aula7.entities.Produtos;

import java.util.Locale;
import java.util.Scanner;

public class Aula1_2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Entre com as informações do produto: ");
        System.out.print ("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();
        Produtos produto = new Produtos(nome, preco, quantidade);

        System.out.println();
        System.out.println("Data do produto: " + produto);

        System.out.println();
        System.out.println("Quantidade a ser adicionada: ");
        quantidade = sc.nextInt();
        produto.adicionarProdutos(quantidade);

        System.out.println();
        System.out.println("Produto atualizado: " + produto);

        System.out.println();
        System.out.println("Quantidade a ser removida: ");
        quantidade = sc.nextInt();
        produto.removeProdutos(quantidade);

        System.out.println();
        System.out.println("Produto Atualizado: " + produto);


        sc.close();
    }
    }


