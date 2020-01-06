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
public abstract class Animal {

    private int peso;
    private int idade;

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMenbros() {
        return menbros;
    }

    public void setMenbros(int menbros) {
        this.menbros = menbros;
    }
    private int menbros;

    public abstract void locomover();

    public abstract void alimnetar();

    public abstract void emitirSom();

}
