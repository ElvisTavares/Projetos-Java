/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_poo;

/**
 *
 * @author Elvis
 */
public class PrincMercado {
    public static void main(String[] args) {
        
        Mercado cliente = new Mercado();
        
        cliente.comprarProd("Elvis","Batata", 5);
        cliente.statusComp("Elvis","Batata", 5);
        cliente.retirar();
        cliente.statusComp("Elvis","Batata", 5);
    }
}
