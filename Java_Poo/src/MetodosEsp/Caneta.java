/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosEsp;

/**
 *
 * @author Elvis
 */
public class Caneta {
    public String modelo;
    public String ponta;
    public String cor;
    
    public Caneta(String m, String p, String c){
        this.setModelo(m);
        this.ponta = p;
        this.cor = c;
        
        
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    
    public void status(){
        System.out.println("Modelo:"+this.getModelo());
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Cor"+this.cor);
    }
}
