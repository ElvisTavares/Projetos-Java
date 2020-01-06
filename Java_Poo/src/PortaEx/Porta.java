/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PortaEx;

/**
 *
 * @author elvis
 */
public class Porta implements InterfacePorta {
    private boolean status;
    private int senha;
    
    public Porta(){
        status = false;
        
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void setStatus(boolean status){
        this.status = status;
        
    }
    
    public int getSenha(){
        return this.senha;
    }
    
    public void setSenha(int senha){
        this.senha= senha;
    }
    
    
    @Override
    public void abrirPorta(){
        if (this.getSenha() == 44) {
            System.out.println("Porta aberta");
        }else{
            System.out.println("ACESSO NEGADO");
        }
    }
    
    @Override
    public void fecharPorta(){
        
    }
    
    @Override
    public void verificarSenha(){
        
    }
    
    
    
    
    
}
