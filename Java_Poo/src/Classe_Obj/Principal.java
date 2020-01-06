/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe_Obj;

import java.util.Scanner;

/**
 *
 * @author Elvis
 */
public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Caneta c1 = new Caneta();
        
        c1.cor = "Azul";
        
        c1.tampar();
        
        c1.rabiscar();
        
    }
}
