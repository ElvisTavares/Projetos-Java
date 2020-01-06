/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo_Sobrecarga;

/**
 *
 * @author Elvis
 */
public class Lobo extends Mamifero {

    public void reagir(String frase) {
        System.out.println("Atento");
    }

    public void ragir(int hora) {
        if (hora <= 18) {
            System.out.println("Guarda");
        } else if (hora > 18) {
            System.out.println("Dormindo");
        }
    }

    public void reagir(boolean pessoa) {
        if (pessoa) {
            System.out.println("Rosnar");
        } else {
            System.out.println("Acuar");
        }
    }
}
