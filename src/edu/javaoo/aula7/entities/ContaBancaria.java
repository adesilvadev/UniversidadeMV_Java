package edu.javaoo.aula7.entities;

public class ContaBancaria {

    private int numero;
    private String pessoa;
    private double saldo;

    public ContaBancaria(int numero, String pessoa) {
        this.numero = numero;
        this.pessoa = pessoa;

    }

    public ContaBancaria(int numero, String pessoa, double deposotoInicial) {
        this.numero = numero;
        this.pessoa = pessoa;
        deposito(deposotoInicial);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public void saque(double valor){
        saldo -= valor - 5.0;
    }

    public String toString() {
        return "Conta "
                + numero
                + ", Cliente: "
                + pessoa
                + ", Saldo: $ "
                + String.format("%.2f", saldo);
    }
}
