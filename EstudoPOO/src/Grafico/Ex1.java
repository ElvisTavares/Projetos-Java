/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

import javax.swing.JOptionPane;

/**
 *
 * @author Elvis
 */
public class Ex1 {

    public static void main(String[] args) {
        //Exemplo 1
//        JOptionPane.showMessageDialog(null, "Bem vindo");

        //Exemplo 2
        String nome = JOptionPane.showInputDialog("Qual seu none: ");

        String msg = String.format("Bem vindo , %s ... ", nome);

        JOptionPane.showMessageDialog(null, msg);

    }

}
