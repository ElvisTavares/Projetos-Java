/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author Elvis
 */
public class Princ1 {

    public static void main(String[] args) {
        Conta1 c1 = new Conta1("Elvis", 40.00);
        Conta1 c2 = new Conta1("JoJo", -9.0);

        System.out.println("====================");
        System.out.println("Conta 1: " + c1.getName() + " - " + c1.getBalance());
        System.out.println("Conta 2: " + c2.getName() + " - " + c2.getBalance());

        System.out.println("====================");
        System.out.println();

        Scanner input = new Scanner(System.in);

        System.out.println("Entre com valor da conta 1: ");
        double v1 = input.nextDouble();
        c1.deposit(v1);

        System.out.println();

        System.out.println("Entre com valor da conta 2: ");
        double v2 = input.nextDouble();
        c2.deposit(v2);

        System.out.println();
        System.out.println("====================");
        System.out.println("Valor atualizado: ");

        System.out.println("Conta 1: " + c1.getName() + " - " + c1.getBalance());
        System.out.println("Conta 2: " + c2.getName() + " - " + c2.getBalance());
        System.out.println("====================");
    }
}
