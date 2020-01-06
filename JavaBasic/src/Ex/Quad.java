/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex;

/**
 *
 * @author Elvis
 */
public class Quad {

    public void quad(int x) {

        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= x - 1; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
