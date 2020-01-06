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
public class Principal {

    public static void main(String[] args) {
        Poupanca p1 = new Poupanca();

        p1.sacar(500);
//        p1.rendimento(5);
        p1.status();
    }
}
