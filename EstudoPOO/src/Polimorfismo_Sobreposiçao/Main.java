/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo_Sobreposiçao;

/**
 *
 * @author Elvis
 */
public class Main {

    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();

        m.setPeso(40);
        m.locomover();

    }
}
