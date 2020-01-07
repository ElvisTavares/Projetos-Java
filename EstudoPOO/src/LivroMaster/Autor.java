/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivroMaster;

import java.time.LocalDate;

/**
 *
 * @author Elvis
 */
public class Autor {
    
  
    private String nome;
    LocalDate dataNasc ;
    private int ano ;
    private int mes;
    private int dia;
    
      public Autor(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    
    
    
}
