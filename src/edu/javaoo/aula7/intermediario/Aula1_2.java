package edu.javaoo.aula7.intermediario;

import edu.javaoo.aula7.entities.Produtos;

import java.util.Locale;
import java.util.Scanner;

public class Aula1_2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produtos produto = new Produtos();
        System.out.println("Entre com as informações do produto: ");
        System.out.print ("Nome: ");
        produto.nome = sc.nextLine();
        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        produto.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Data do produto: " + produto);

        System.out.println();
        System.out.println("Quantidade a ser adicionada: ");
        int quantidade = sc.nextInt();
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


