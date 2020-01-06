/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visibilidade;

/**
 *
 * @author Elvis
 */
public class Caneta {
    public int modelo;
    public String cor;
    private boolean tampada;
    
    public void rabiscar(){
        if (this.tampada == true) {
            System.out.println("Nao");
        }else{
            System.out.println("Sim");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
}
