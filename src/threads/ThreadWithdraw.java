/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import onlinebank.Cuenta;

/**
 *
 * @author danx_
 */
public class ThreadWithdraw implements Runnable {
    //Attributes
    private Cuenta account;
    private double amount;

    //Methods

    public ThreadWithdraw(Cuenta account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.retirar(amount);
    }
}
