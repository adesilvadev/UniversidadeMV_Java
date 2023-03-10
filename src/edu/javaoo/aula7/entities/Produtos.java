package edu.javaoo.aula7.entities;

public class Produtos {

    public String nome;
    public double preco;
    public int quantidade;

    public double totalEstoque() {
        return preco * quantidade;
    }

    public void adicionarProdutos (int quantidade) {
        this.quantidade += quantidade;
    }

    public void  removeProdutos (int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome
                + ", $ "
                +String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades, Total: $ "
                +String.format("%.2f", totalEstoque());
    }
}
