/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estHer;

/**
 *
 * @author Elvis
 */
public class Principal {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Laa";
        aluno.turma = "L";

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "kkfkfk";

        System.out.println("Pessoa: " + pessoa.falar());
        System.out.println("Aluno:" + aluno.falar());

        Pessoa x = new Aluno();
        x.nome = "locococococococ";
        System.out.println("x : " + x.falar());

    }
}
