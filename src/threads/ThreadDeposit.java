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
public class ThreadDeposit implements Runnable {
    //Attributes
    private Cuenta account;
    private double amount;

    //Methods
    public ThreadDeposit(Cuenta account, double amount) {
        this.amount = amount;
        this.account = account;
    }

    @Override
    public void run() {
        account.depositar(amount);
    }
}
