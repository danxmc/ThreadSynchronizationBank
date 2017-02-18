/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinebank;

/**
 *
 * @author danx_
 */
public class Cuenta {

    //Attributes
    private double balance = 0;

    //Methods
    public Cuenta(double balance) {
        this.balance = balance;
    }

    public double getSaldo() {
        return balance;
    }

    public synchronized void depositar(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("No se puede depositar");
        }
        this.balance += a;
        System.out.println("Deposito: " + a + "; en thread: "
                + Thread.currentThread().getId() + "; el balance es: " + balance);
    }

    public synchronized void retirar(double amount) {
        if (amount < 0 || amount > this.balance) {
            throw new IllegalArgumentException("No se puede retirar");
        }
        this.balance -= amount;
        System.out.println("Retirar: " + amount + "; en thread: "
                + Thread.currentThread().getId() + "; el balance es: " + balance);
    }
}
