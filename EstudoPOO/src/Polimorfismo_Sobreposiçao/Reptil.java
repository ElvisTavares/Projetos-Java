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
public class Reptil extends Animal {

    private String corEscama;

    @Override
    public void locomover() {
    }

    @Override
    public void alimnetar() {
        System.out.println("Comendo");
    }

    @Override
    public void emitirSom() {
    }

}
