/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relacionamento_5;

/**
 *
 * @author elvis
 */
public class Principal {
    public static void main(String[] args) {
//        Lutador l = new Lutador("Goku","Japonesa",80,1.78,80,6,0,1);
        
    Lutador l[] = new Lutador[6];
    
    l[0] = new Lutador("Goku","Japonesa",80,1.78,80,6,0,1);
    l[1] = new Lutador("Vegeta","Japonesa",84,1.79,79,6,4,1);
    l[2] = new Lutador("Rick","EUA",95,1.70,80,4,3,6);
    l[3] = new Lutador("Morty","EUA",15,1.45,40,0,9,1);
    l[4] = new Lutador("Mario","Fraça",50,1.20,40,5,3,1);
    l[5] = new Lutador("Luigi","França",45,1.22,34,2,4,2);
//    
//        l[0].apresentar();
//        System.out.println();
//        l[1].apresentar();
//        System.out.println();
//        l[2].apresentar();


    Luta UEC01 = new Luta();
    UEC01.marcarLuta(l[0], l[1]);
    UEC01.lutar();

    }
    
}
