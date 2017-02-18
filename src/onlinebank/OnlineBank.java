/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinebank;

import threads.ThreadDeposit;
import threads.ThreadWithdraw;

/**
 *
 * @author danx_
 */
public class OnlineBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta c0 = new Cuenta(100);
        System.out.println("Saldo inicial: " + c0.getSaldo());

        new Thread(new ThreadDeposit(c0, 30)).start();
        new Thread(new ThreadWithdraw(c0,20)).start();

        new Thread(new ThreadDeposit(c0, 100)).start();
        new Thread(new ThreadWithdraw(c0,50)).start();

        new Thread(new ThreadDeposit(c0, 30)).start();
        new Thread(new ThreadWithdraw(c0,30)).start();

        new Thread(new ThreadWithdraw(c0,10)).start();
        new Thread(new ThreadDeposit(c0,20)).start();

        new Thread(new ThreadDeposit(c0,100)).start();
        new Thread(new ThreadWithdraw(c0,50)).start();
    }
    
}
