/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivroMaster;

/**
 *
 * @author Elvis
 */
public class Capitulo {
    
   private String titulo;
   private String texto;
   
   public Capitulo(){
       
   }
   
   public Capitulo(String titulo, String texto){
       this.texto = texto;
       this.titulo = titulo;
   }
   
   public void setTitulo(String titulo){
       this.titulo = titulo;
   }
   public String getTitulo(){
       return titulo;
   }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
   
   
}
