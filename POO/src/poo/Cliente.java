/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Elvis
 */
public class Cliente {

    private String nome;
    private String cpf;
    private double din;
    private int horas;

    public Cliente(String cpf) {
        this.cpf = cpf;
    }

    public String trabalhar(int horas) {
        this.horas = horas;

        if (this.horas > 0) {
            return "Success";

        } else {
            return "Fail";
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
