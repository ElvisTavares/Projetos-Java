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
public class NumerosEntre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Numero: ");
        int n = input.nextInt();
        
        int i = 1;
        while(i<=n){
            System.out.print(i+",");
            i++;
        }
    }
    
}
