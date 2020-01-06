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
public class Parcelas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Produto: ");
        String prod = input.nextLine();
        
         System.out.println("Preço: ");
        double prec = input.nextDouble();
        
        System.out.println("Opções de pagamento");
        System.out.println("-------------------");
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d x %.2f \n",i,prec/i);
        }
    }
}
