/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodo_ex1;

/**
 *
 * @author Elvis
 */
public class Result {

    public static void main(String[] args) {
        int num = 2;
        int num1 = 5;
        int num2 = 9;

        int result = max(num, num1, num2);

        System.out.println("Valor Maximo: " + result);
    }

    public static int max(int x, int y, int z) {
        int maxV = x;

        if (y > maxV) {
            maxV = y;
        }

        if (z > maxV) {
            maxV = z;
        }

        return maxV;
    }
}
