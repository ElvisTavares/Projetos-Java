/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex;

import java.util.Scanner;

/**
 *
 * @author Elvis
 */
public class Executar {

    public static void main(String[] args) {
        n1 s = new n1();

        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        s.exibir(n1, n2);
    }

}
