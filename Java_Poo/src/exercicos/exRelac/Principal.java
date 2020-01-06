/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicos.exRelac;

/**
 *
 * @author elvis
 */
public class Principal {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l =  new Livro[3];
        
        p[0] = new Pessoa("Elvis", 30, "M");
        p[1] = new Pessoa("Maria", 23, "F");
        
        l[0] = new Livro("Harry potter","JK", 400,p[0]);
        l[1] = new Livro("Harry potter","JK", 400,p[1]);
        l[2] = new Livro("Harry potter","JK", 400,p[0]);
        
        
        l[0].abrir();
        l[0].folhear(899);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
      
    }
}
