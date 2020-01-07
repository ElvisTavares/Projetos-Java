/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivroMaster;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Elvis
 */
public class Testes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ano = input.nextInt();
        int mes = input.nextInt();
        int dia = input.nextInt();
        LocalDate data = LocalDate.of(ano,mes,dia);
        
        System.out.println(data);
    }
}
