/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodo_ex1;

import java.security.SecureRandom;

/**
 *
 * @author Elvis
 */
public class randomico1 {

    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        for (int i = 1; i <= 20; i++) {
            int f = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d ", f);

            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
