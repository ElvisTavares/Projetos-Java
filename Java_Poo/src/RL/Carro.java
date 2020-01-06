/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RL;

import javax.swing.JOptionPane;

/**
 *
 * @author Elvis
 */
public class Carro {
    public String marca;
   public boolean ligado;
   public int velocidade;
   public boolean freio = true;
   
   public void ligar(){
       if (this.ligado == false) {
           this.ligado = true;
           
//           System.out.println("Ligado");
            JOptionPane.showMessageDialog(null, "Carro ligado");
       }else{
           System.out.println("Desligado");
       }
   }
   
   public void acelerar(int velocidade){
       if (this.ligado && this.freio) {
           this.velocidade = velocidade;
           System.out.println(this.velocidade);
       }else{
           System.out.println("Carro desligado ou frio puxado");
       }
   }
}
