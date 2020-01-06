/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author Elvis
 */
public class Conta {

    protected String nome;
    protected int numConta;
    protected double saldo;

    public Conta() {
        setSaldo(400);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double saque) {
        double v;
        v = getSaldo() - saque;
        if (v <= 0) {
            System.out.println("Saldo insuficiente");
        } else {

            setSaldo(getSaldo() - saque);
            System.out.println("Saque OK");
        }
    }

    public void depositar() {

    }
}
