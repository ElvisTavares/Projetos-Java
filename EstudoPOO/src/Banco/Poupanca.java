/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author Elvis
 */
public class Poupanca extends Conta {

    private double limite;
    private int diaRend;

//    @Override
//    public void sacar(double saque) {
//        setSaldo(getSaldo() - saque);
//    }
    public void rendimento(int diaRend) {

        if (diaRend == 5) {
            setSaldo(getSaldo() + (getSaldo() * 0.01));
        }
    }

    public void status() {
        System.out.println("Saldo" + getSaldo());
    }

}
