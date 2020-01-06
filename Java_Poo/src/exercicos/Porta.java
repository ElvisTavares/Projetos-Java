/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicos;

/**
 *
 * @author Elvis
 */
public class Porta {
    private boolean chave;
    private int andar;
    
    public Porta(){
        this.chave = false;
        this.andar = 0;
    }
    
    @Override
    public String toString(){
        return("Status da porta: "+chave+" Andar: "+andar);
    }
    
    public boolean getChave(){
        return this.chave;
    }
    
    
    public void setChave(boolean chave){
        this.chave = chave;
    }
    
    public int getAndar(){
        return this.andar;
    }
    
    public void setAndar(int andar){
        this.andar = andar;
    }
    
    
  public void abrir(){
      
  }
  
  public void status(){
      
  }
}
