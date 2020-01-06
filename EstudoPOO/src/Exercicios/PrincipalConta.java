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
public class PrincipalConta {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Conta c1 = new Conta("Goku");
        Conta c2 = new Conta("Vegeta");

        System.out.println("Nome: " + c1.getName());
        System.out.println("Nome: " + c2.getName());

//        System.out.println("Nome inicial:" + c1.getName());
//
//        System.out.println("Entre com o nome: ");
//        String name = input.nextLine();
//        c1.setName(name);
//        System.out.println();
//
//        System.out.println("Nome:  " + c1.getName());
    }
}
