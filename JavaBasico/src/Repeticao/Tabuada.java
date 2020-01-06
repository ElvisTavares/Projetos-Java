/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repeticao;

import java.util.Scanner;

/**
 *
 * @author elvis
 */
public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n;
        System.out.println("Informe um numero: ");
        n = input.nextInt();
//        
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i+"x"+n+" = "+i*n);
//        }

        
//        int i=1;
//        
//        while(i<=10){
//            System.out.println(i+"x"+n+" = "+i*n);
//            i = i + 1;
//        }
//        
        
        
        int i = 1;
        do {
            System.out.println(i+"x"+n+" = "+i*n);
            i++;
        }while(i<=10);
        
        
    }
    
}
