/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_poo;

import java.util.Scanner;

/**
 *
 * @author Elvis
 */
public class Mercado {
    
    String funcionario;
    String cliente;
    String produtos;
    int prod;
    int totProd;
     
    public void comprarProd(String cliente, String produtos, int prod){
        this.cliente = cliente;
        this.produtos = produtos;
         totProd = prod +1;
         
        
    }
    
    public String statusComp(String cliente, String produtos, int totProd){
        this.cliente = cliente;
        this.produtos = produtos;
        this.totProd = totProd;
        return "Cliente: "+this.cliente+"Produto: "+this.produtos+"Total: "+this.totProd;
        
    }
    
    public void retirar(){
        totProd = totProd - 1;
    }
    
}
