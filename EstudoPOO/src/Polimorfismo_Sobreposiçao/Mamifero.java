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
public class Mamifero extends Animal {

    private String corPelo;

    @Override
    public void locomover() {
        System.out.println("Andale");
    }

    @Override
    public void alimnetar() {
    }

    @Override
    public void emitirSom() {
    }

}
