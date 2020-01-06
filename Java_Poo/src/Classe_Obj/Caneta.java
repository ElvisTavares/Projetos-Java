/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe_Obj;

/**
 *
 * @author Elvis
 */
public class Caneta {
    String modelo;
    String cor;
    String tamanho;
    boolean tampada;
    
    public void tampar(){
        this.tampada = true;
    }
    
    
    public void destampar(){
          this.tampada = false;
    }
    
    public void rabiscar(){
        if (this.tampada == true) {
            System.out.println("Nao pode rasbiscar");
        }else{
            System.out.println("OK");
        }
    }
}
