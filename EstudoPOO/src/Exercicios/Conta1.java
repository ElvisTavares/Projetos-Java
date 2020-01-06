/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

/**
 *
 * @author Elvis
 */
public class Conta1 {

    private String name;
    private double balance;

    public Conta1(String name, double balance) {
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }

    }

    public void deposit(double valor) {
        if (valor > 0.0) {
            balance = balance + valor;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
